#criar a estrutura do banco de dados

from fakepinterest import database,login_manager
from datetime import datetime
from flask_login import UserMixin
from sqlalchemy.orm import relationship

@login_manager.user_loader
def load_user(id_usuario):
    return Usuario.query.get(int(id_usuario))

class Usuario(UserMixin,database.Model):
    id_usuario=database.Column(database.Integer, primary_key=True)
    username=database.Column(database.String(80), nullable = False)
    email=database.Column(database.String(80),nullable=False, unique=True)
    senha=database.Column(database.String(80), nullable=False)
    fotos= database.relationship("Foto",backref="usuario",lazy=True)

class Foto(database.Model):
    id_foto=database.Column(database.Integer, primary_key=True)
    imagem = database.Column(database.String(80),default = "default.png")
    data_criacao = database.Column(database.Date, default = datetime.utcnow)
    id_usuario = database.Column(database.Integer, database.ForeignKey("usuario.id_usuario"), nullable = False)
