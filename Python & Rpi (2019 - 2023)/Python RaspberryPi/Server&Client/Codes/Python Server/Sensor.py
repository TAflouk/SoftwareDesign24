# @Authors: William, Daniel, TAflouk
# @Date:2022-11-29 18:30:00
# @LastModifiedBy: TAflouk
# @Last Modified time:2022-00-00 00:00:00

# -- IMPORTS --
from sense_emu import SenseHat
import random as r

# -- GLOBAL -- 
s = SenseHat()


# -- FUNC() -- 
def  get_weather_data(name):
    # This Func() is to get data from the sense hat
    # it has one parameter  str as an arg
    # returns a number
    name.lower()
    temp = round(s.get_temperature(),1)
    celcius = round(s.get_temperature(),1)
    fahrenheit = round(1.8 *celcius + 32, 1)
    humidity = round(s.get_humidity(),1)
    pressure = round(s.get_pressure(),1)
    if name == "temperature":
        return temp
    elif name == 'celcius':
        return celcius
    elif name == 'fahrenheit':
        return fahrenheit
    elif name == 'humidity':
        return rhumidity
    elif name == 'pressure':
        return pressure
    
# -- CLASSES --
class Sensor(object):
    sensor_counter = 0
    def __init__(self, sensor_name):
        self.sensor_name = sensor_name
        self.sensor_name.lower()
        if self.sensor_name == "temperature":
            self.data = get_weather_data("temperature")
        else:
            self.data = get_weather_data("humidity")
        Sensor.sensor_counter += 1
        
    def __repr__(self):
        return f"Type of Sensor:{self.sensor_name}\nData:{self.data}"
        
    def __str__(self):
        return f"Type of Sensor:{self.sensor_name}\nData:{self.data}"
    
    def get_temperature(self):
        return self.data
    
    def get_humidity(self):
        return self.data
        
    def get_name(self):
        return self.sensor_name
    
    def get_data(self):
        return self.data

if __name__ == "__main__":
    print("Testing.")
    s1 = Sensor("temperature") 
    print(s1)
    #print(s1.get_sensor_name())
    print(s1.get_temperature())