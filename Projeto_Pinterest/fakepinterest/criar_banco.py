from fakepinterest import database,app
from datetime import datetime
from fakepinterest.models import Usuario,Foto

print("Entrou no Script!")

with app.app_context():
    print("Entrou no app_context")
    database.create_all()
    print("Create_all foi executado")

print("Finalizou!")
