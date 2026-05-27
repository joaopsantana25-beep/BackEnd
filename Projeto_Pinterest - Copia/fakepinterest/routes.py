from fakepinterest import app, database, bcrypt
from fakepinterest.models import Usuario, Foto
from flask_login import login_required, login_user, logout_user,current_user
from fakepinterest.forms import FormLogin, FormCriarConta, FormFoto
from werkzeug.utils  import secure_filename
import os.path
from sqlalchemy import desc
from flask import render_template, url_for, redirect, flash, request
#criação da homepage
@app.route("/", methods=["GET", "POST"])
def homepage():
    form_login = FormLogin()

    if form_login.validate_on_submit():
        # Busca o usuário no banco de dados pelo e-mail preenchido no formulário
        usuario = Usuario.query.filter_by(email=form_login.email.data).first()

        # Verifica se o usuário existe e se a senha criptografada coincide
        if usuario and bcrypt.check_password_hash(usuario.senha, form_login.senha.data):
            login_user(usuario)
            return redirect(url_for("perfil", id_usuario=usuario.id))

    return render_template("homepage.html", form=form_login)

#criação de criar conta
@app.route("/criarconta", methods=["GET", "POST"])
def criar_conta():
    form_criarconta = FormCriarConta()
    if form_criarconta.validate_on_submit():
        senha = bcrypt.generate_password_hash(form_criarconta.senha.data)
        usuario = Usuario(username=form_criarconta.username.data,
                          senha=senha, email=form_criarconta.email.data)
        database.session.add(usuario)
        database.session.commit()
        login_user(usuario, remember=True)
        return redirect(url_for("perfil", id_usuario=usuario.id))
    return render_template("criarconta.html", form=form_criarconta)


@app.route("/perfil/<id_usuario>", methods=["GET", "POST"])
@login_required
def perfil(id_usuario):
    if int(id_usuario) == int(current_user.id):
        form_foto = FormFoto()  # Certifique-se que o nome da classe está igual ao forms.py
        if form_foto.validate_on_submit():
            arquivo = form_foto.foto.data  # Corrigido para form_foto
            nome_seguro = secure_filename(arquivo.filename)

            caminho = os.path.join(os.path.abspath(os.path.dirname(__file__)),
                                   app.config['UPLOAD_FOLDER'], nome_seguro)

            arquivo.save(caminho)  # Corrigido para objeto.save()

            foto = Foto(imagem=nome_seguro, id_usuario=current_user.id)
            database.session.add(foto)
            database.session.commit()

        return render_template("perfil.html", usuario=current_user, form=form_foto)
    else:
        usuario = Usuario.query.get(int(id_usuario))
        return render_template("perfil.html", usuario=usuario, form=None)

#criação de Logout
@app.route("/logout")
@login_required
def logout():
    logout_user()
    return redirect(url_for("homepage"))

@app.route("/feed")
@login_required
def feed():
    fotos = Foto.query.order_by(Foto.data_criacao.desc()).all()
    return render_template("feed.html",
                           fotos=fotos, usuario=current_user)