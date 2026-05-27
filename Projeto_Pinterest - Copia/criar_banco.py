'''from fakepinterest import database,app
from datetime import datetime


print("Entrou no Script!")

with app.app_context():
    print("Entrou no app_context")
    database.create_all()
    print("Create_all foi executado")

print("Finalizou!")
'''
# criar_banco.py
from fakepinterest import app, database 
from fakepinterest.models import Usuario, Foto     

# Cria todas as tabelas definidas nos models
with app.app_context():
    database.create_all()
    print("Banco e tabelas criados com sucesso!")

