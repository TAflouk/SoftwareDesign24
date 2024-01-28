# @Authors: TAflouk
# @Date:2022-10-27 10:30:40
# @LastModifiedBy:TAflouk
# @Last Modified time:2022-10-28 11:33:20

# -- IMPORTS --
from sense_emu import SenseHat
import doctest
from settings import *

# -- GLOBAL -- 
s = SenseHat()


# -- FUNCTIONS -- 
def  get_weather_data(name):
    """A function that reads the data from the sense hat it returns temperature
    in fahrenheit or celcius also humidity and pressure that is depending on 
    the parameter.
    it is using some other functions to read the data from the sense hat like:
    get_temperature(), get_pressure() etc...

    Args:
        name (str): the type is string and that gives few options to makes it reusable

    Returns:
        float: it returns an float after it reads the data from the sense hat
    >>> get_weather_data("temperature")
        28
        # return number 28
    >>> get_weather_data("humidity")
        56
        # return number 56
    >>> get_weather_data("temperature")
        28
        # return number 28
    >>> get_weather_data("celcius")
        56
        # return number 56
    """
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
        return humidity
    elif name == 'pressure':
        return pressure
    
# -- CLASSES --
class Sensor(object):
    sensor_counter = 0
    def __init__(self, sensor_name):
        """Constructor to create objs from the senosr class

        Args:
            sensor_name (str): the name of the sensor so
            it will be one of these two options temp or humidity
        """
        self.sensor_name = sensor_name
        self.sensor_name.lower()
        if self.sensor_name == "temperature":
            self.data = get_weather_data("temperature")
        else:
            self.data = get_weather_data("humidity")
        Sensor.sensor_counter += 1
        
    def __repr__(self):
        """This method is called when repr() function is invoked on the object.

        Returns:
            str: This method returns the object representation in string format
        """
        return f"Room:{self.sensor_name}\nType of sensor:{self.data}"
        
    def __str__(self):
        """This method is called when print() or str() function is invoked on an object.

        Returns:
            str: This method returns the string representation of the object
        """
        return f"Room:{self.sensor_name}\nType of sensor:{self.data}"
    
    def get_temperature(self):
        """This method to return the temperature
           after we call get_weather_data() func
           in the constructor to get the current temp

        Returns:
            float: returns a number from the sense hat
        """
        return self.data
    
    def get_humidity(self):
        """Method get the humidity after we call
           get_weather_data() in the constructor
        Returns:
            float: returns float (humidity)
        """
        return self.data
        
    def get_name(self):
        """get name from the class to check if it is
           a humidity sensor or temp

        Returns:
            str: returns the name of the sensor
        """
        return self.sensor_name

if __name__ == "__main__":
    print("Test")
    s1 = Sensor("temperature") 
    print(s1)
    #print(s1.get_sensor_name())
    print(s1.get_temperature())