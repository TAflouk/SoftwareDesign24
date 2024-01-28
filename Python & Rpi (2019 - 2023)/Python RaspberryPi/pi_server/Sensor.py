# @Authors: 
# @Date:2022-00-00 00:00:00
# @LastModifiedBy:
# @Last Modified time:2022-00-00 00:00:00

# -- IMPORTS --
#from sense_emu import SenseHat
import random as r
# -- GLOBAL -- 
#s = SenseHat()


# -- FUNCTIONS -- 
def  get_weather_data(name):
#     name.lower()
#     temp = round(s.get_temperature(),1)
#     celcius = round(s.get_temperature(),1)
#     fahrenheit = round(1.8 *celcius + 32, 1)
#     humidity = round(s.get_humidity(),1)
#     pressure = round(s.get_pressure(),1)
    if name == "temperature":
        return r.randint(5,35)#temp
    elif name == 'celcius':
        return r.randint(0,60)#celcius
    elif name == 'fahrenheit':
        return fahrenheit
    elif name == 'humidity':
        return r.randint(20,90)#humidity
    elif name == 'pressure':
        return r.randint(20,69) #pressure
    
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
        return f"Room:{self.sensor_name}\nType of sensor:{self.data}"
        
    def __str__(self):
        return f"Room:{self.sensor_name}\nType of sensor:{self.data}"
    
    def get_temperature(self):
        return self.data
    
    def get_humidity(self):
        return self.data
        
    def get_name(self):
        return self.sensor_name
    
    def get_data(self):
        return self.data

if __name__ == "__main__":
    print("Test")
    s1 = Sensor("temperature") 
    print(s1)
    #print(s1.get_sensor_name())
    print(s1.get_temperature())