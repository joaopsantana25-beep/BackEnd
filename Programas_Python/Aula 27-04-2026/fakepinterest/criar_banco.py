from flask import databaase, app

with app.app_context():
    databaase.create_all()