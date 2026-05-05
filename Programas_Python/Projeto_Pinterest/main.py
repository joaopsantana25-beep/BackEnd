'''from flask import Flask, render_template, url_for
from fakepinterest import app


if __name__ == '__main__':
    app.run(debug=True)
    '''
# main.py

from fakepinterest import app  # imports routes e models via __init__.py

if __name__ == '__main__':
    app.run(debug=True)