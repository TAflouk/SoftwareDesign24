from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
    return "Hello People"
@app.route("/h1")
def crack():
    return "Helldasdo People"

@app.route("/s2")
def crack_head():
    return "crack head"


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port =5003)