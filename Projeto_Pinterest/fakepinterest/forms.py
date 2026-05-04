from flask_wtf import FlaskForm
from wtforms import StringField, PasswordField, SubmitField, ValidationError
from wtforms.validators import DataRequired, Email, EqualTo, Length
from fakepinterest.models import Usuario

class LoginForm(FlaskForm):
    email = StringField('Email',validators=[DataRequired(),Email()])
    senha = PasswordField('',validators=[DataRequired(),Length(min=6,max=20)])
    botao_confirmar = SubmitField('Fazer Login')

class FormCriarConta(FlaskForm):
    email=StringField('Email', validators=[DataRequired(),Email()])
    username = StringField('Username', validators=[DataRequired()])
    senha = PasswordField('Password',validators=[DataRequired(),Length(min=6,max=20)])
    confirmacao_senha = PasswordField('Confirm Password', validators=[DataRequired(),EqualTo('senha')])
    botao_confirmar = SubmitField( 'Criar Login')

    def validate_email(self,email):
        usuario = Usuario.query.filter_by(email=email.data).first()
        if usuario:
            raise ValidationError("E-mail já cadastrado, faça login para continuar")
        
    