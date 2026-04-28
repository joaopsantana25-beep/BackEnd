#Criar a estrutura do banco de dados
from fakepinterest import database, app, login_manager
from datetime import datetime
from flask_login import UserMixin

@login_manager.user_loader
def load_user(id_usuario):
    return Usuario.query.get(int(id_usuario))

#Criar classe Usuário
class Usuario(database.Model):
    id = database.Column(database.Iteger, primary_key=True)
    username = database.Column(database.String(80), nullable=False)
    email = database.Column(database.String(80), nullable=False, unique=True)
    senha = database.Column(database.String(80), nullable=False)
    fotos = database.Column("Foto", backref="usuario", nullable=False)

#Criar classe Foto
class Foto(database.Model):
    id = database.Column(database.Iteger, primary_key=True)
    imagem = database.Column(database.String(80), default="default.png")
    data_criacao = database.Column(database.Date, default=datetime.utcnow())
    id_usuario = database.Column(database.Integer, database.ForeignKey("usuario.id"), nullable=False)