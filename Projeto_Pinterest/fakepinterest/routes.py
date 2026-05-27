'''from flask import render_template,url_for,redirect
from fakepinterest import app,database,bcrypt
from fakepinterest.models import Usuario,Foto
from flask_login import login_required
from fakepinterest.forms import LoginForm,FormCriarConta


@app.route('/',methods=["GET","POST"])
def homepage():
    formLogin = LoginForm()
    return render_template("homepage.html",form=formLogin)


@app.route("/criarconta",methods=["GET","POST"])
def criarconta():
    formCriarConta = FormCriarConta()

    if formCriarConta.validate_on_submit():
        senha = bcrypt.generate_password_hash(formCriarConta.senha.data).decode('utf-8')
        usuario = Usuario(username = formCriarConta.username.data, senha = senha, email=formCriarConta.email.data)
        database.session.add(usuario)
        database.session.commit()
        return redirect(url_for('homepage'))
    return render_template("criarconta.html",form=formCriarConta)




@app.route('/perfil/<usuario>')
def perfil(usuario):
    return render_template("perfil.html",usuario=usuario)
'''
# fakepinterest/routes.py

from flask import render_template, url_for, redirect
from flask_login import login_required, login_user,logout_user,current_user
from fakepinterest import app, database, bcrypt
from fakepinterest.models import Usuario, Foto
from fakepinterest.forms import LoginForm, FormCriarConta,FormFoto
from werkzeug.utils import secure_filename
import os.path

@app.route('/', methods=['GET', 'POST'])
def homepage():
    formLogin = LoginForm()

    if formLogin.validate_on_submit():
        usuario = Usuario.query.filter_by(email=formLogin.email.data).first()

        if usuario and bcrypt.check_password_hash(usuario.senha,formLogin.senha.data):
            login_user(usuario)  
            return redirect(url_for('perfil', usuario=usuario.username))
        
        return redirect(url_for('perfil',usuario=usuario.username))
    return render_template("homepage.html", form=formLogin)


@app.route('/criarconta', methods=['GET', 'POST'])
def criarconta():
    formCriarConta = FormCriarConta()

    if formCriarConta.validate_on_submit():
        senha = bcrypt.generate_password_hash(formCriarConta.senha.data).decode('utf-8')
        usuario = Usuario(username=formCriarConta.username.data, senha=senha, email=formCriarConta.email.data)
        database.session.add(usuario)
        database.session.commit()
        login_user(usuario, remember=True)
        return redirect(url_for('perfil',usuario=usuario.username))

    return render_template("criarconta.html", form=formCriarConta)


@app.route('/perfil/<usuario>',methods=["GET","POST"])
@login_required
def perfil(usuario):

    user = Usuario.query.filter_by(username=usuario).first()
    form_foto = FormFoto()

    if form_foto.validate_on_submit():
        arquivo = form_foto.foto.data
        nome_seguro = secure_filename(arquivo.filename)
        
        caminho=os.path.join(os.path.abspath(os.path.dirname(__file__)),
                             app.config["UPLOAD_FOLDER"], nome_seguro)
        arquivo.save(caminho)

        foto=Foto(imagem=caminho,id_usuario = user.id_usuario)

        database.session.add(foto)
        database.session.commit()

    return render_template("perfil.html",usuario=usuario,form=form_foto)

    '''
    Ignorar essa parte por enquanto
    if int(id_usuario) == int(current_user.id):
        return render_template("perfil.html", id_usuario = current_user.username)
    
    else:
        usario = Usuario.query.get(int(id_usuario))
        return render_template("perfil", id_usuario=usario)
    '''



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
                           fotos = fotos, usuario = current_user)