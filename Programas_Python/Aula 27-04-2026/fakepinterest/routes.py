from flask import Flask, render_template, url_for
from fakepinterest import app
from flask_login import login_required

@app.route('/')
def homepage():
    return render_template('homepage.html', form=FormLogin)

@app.route('/perfil/<usuario>')
def perfil(usuario):
    return render_template('perfil.html', usuario=usuario)

@app.route('/criarconta', methods=["GET", "POST"])
def criarconta():
    fromcriarconta = FormCriarConta()
    return render_template('criarconta.html', form=fromcriarconta)

'''if __name__ == '__main__':
    app.run(debug=True)'''
