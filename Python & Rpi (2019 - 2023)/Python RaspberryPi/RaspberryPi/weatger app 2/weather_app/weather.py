from flask import Flask, render_template
from get_data import*
    
# --- global ---
app = Flask(__name__)
@app.route('/')


    
def index():
    celcius = get_weather_data('temperature.celcius')
    fahrenheit = get_weather_data('temperature.fahrenheit')    
    humidity = get_weather_data('humidity')
    pressure = get_weather_data('pressure')
    return render_template('weather.html', celcius = celcius,fahrenheit=fahrenheit,humidity=humidity,pressure=pressure)

if __name__=='__main__':
    app.run(debug=True,host="0.0.0.0", port="5080")

