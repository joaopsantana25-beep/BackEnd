from flask_login import FlaskForm
from wtforms import StringField, PasswordField, SubmitField
from wtforms.validators import DataRequired, Length, Email, EqualTo, ValidationError

class LoginForn(FlaskForm):
    email = StringField('Email', validators=[DataRequired(), Email()])
    senha = PasswordField('', validators=[DataRequired(), Length(min=6, max=20)])
    botao_confimar = SubmitField('Fazer Login')

class FormCriarConta(FlaskForm):
    email = StringField('Email', validators=[DataRequired(), Email()])
    username = StringField('Username', validators=[DataRequired()])
    senha = PasswordField('', validators=[DataRequired(), Length(min=6, max=20)])
    confirmacao_senha = PasswordField('', validators=[DataRequired(), EqualTo('senha')])
    botao_confimar = SubmitField('Criar Login')


def validate_email(self, email):
    usuario = usuario.query.filter_by(email=email.data).first()
    if usuario:
        return ValidationError("E-mail já cadastrado, faça login para continuar")