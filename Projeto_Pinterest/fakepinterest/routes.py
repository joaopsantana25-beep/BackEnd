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
from flask_login import login_required, login_user,current_user
from fakepinterest import app, database, bcrypt
from fakepinterest.models import Usuario, Foto
from fakepinterest.forms import LoginForm, FormCriarConta


@app.route('/', methods=['GET', 'POST'])
def homepage():
    formLogin = LoginForm()

    if formLogin.validate_on_submit():
        usuario = Usuario.query.filter_by(email=formLogin.email.data).first()

        if usuario and bcrypt.check_password_hash(usuario.senha,formLogin.senha.data):
            login_user(usuario)  
        
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


@app.route('/perfil/<usuario>')
def perfil(usuario):

    return render_template("perfil.html",usuario=usuario)

    '''
    Ignorar essa parte por enquanto
    if int(id_usuario) == int(current_user.id):
        return render_template("perfil.html", id_usuario = current_user.username)
    
    else:
        usario = Usuario.query.get(int(id_usuario))
        return render_template("perfil", id_usuario=usario)
    '''