from sense_emu import SenseHat

s = SenseHat()

def  get_weather_data(name):
    celcius = round(s.get_temperature(),1)
    fahrenheit = round(1.8 *celcius + 32, 1)
    if name == 'temperature.celcius':
        return celcius
    elif name == 'temperature.fahrenheit':
        return fahrenheit
    elif name == 'humidity':
        return round(s.get_humidity(),1)
    elif name == 'pressure':
        return round(s.get_pressure(),1)
    
