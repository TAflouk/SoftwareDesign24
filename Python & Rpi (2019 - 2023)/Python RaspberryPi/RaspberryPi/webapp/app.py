from sense_hat import SenseHat
from flask import Flask, render_template


sense = SenseHat()
temp = sense.get_temperature()

def get_me_something(data):
    if data == "temp":
        return sense.get_temperature()
    elif data == "pressure":
        return sense.get_pressure()
    elif data == "humidity":
        return sense.get_humidity()
    
app = Flask(__name__)
@app.route('/')
def index():
    return render_template('index.html')

@app.route('/hello/<name>')
def hello(name):
    return render_template('page.html', name=name)




if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port =5003)
  