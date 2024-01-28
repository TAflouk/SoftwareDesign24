from flask import Flask, render_template
from sense_hat import SenseHat

# --- global ---

app = Flask(__name__)

sense = SenseHat()

@app.route('/')




    

def index():
    celcius = round(sense.get_temperature(),1)
    fahrenheit = round(1.8 *celcius + 32, 1)
    humidity  = round(sense.get_humidity())
    pressure = round(sense.get_pressure())
    return render_template('weather.html', celcius = celcius,fahrenheit=fahrenheit,humidity=humidity,pressure=pressure)

if __name__=='__main__':
    app.run(debug=True,host="0.0.0.0",port='5001')

