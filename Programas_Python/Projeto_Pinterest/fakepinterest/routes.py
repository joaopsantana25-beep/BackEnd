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
from fakepinterest import app, database, bcrypt
from fakepinterest.models import Usuario, Foto
from fakepinterest.forms import LoginForm, FormCriarConta
from flask_login import login_required

@app.route('/', methods=['GET', 'POST'])
def homepage():
    formLogin = LoginForm()
    return render_template("homepage.html", form=formLogin)


@app.route('/criarconta', methods=['GET', 'POST'])
def criarconta():
    formCriarConta = FormCriarConta()

    if formCriarConta.validate_on_submit():
        senha = bcrypt.generate_password_hash(formCriarConta.senha.data).decode('utf-8')
        usuario = Usuario(username=formCriarConta.username.data, senha=senha, email=formCriarConta.email.data)
        database.session.add(usuario)
        database.session.commit()
        return redirect(url_for('homepage'))

    return render_template("criarconta.html", form=formCriarConta)


@app.route('/perfil/<usuario>')
def perfil(usuario):
    return render_template("perfil.html", usuario=usuario)