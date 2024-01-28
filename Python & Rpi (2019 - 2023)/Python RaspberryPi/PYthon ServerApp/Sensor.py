from sense_emu import SenseHat


sense = SenseHat()

def  get_weather_data(name):
    name.lower()
    temp = round(sense.get_temperature(),1)
    celcius = round(sense.get_temperature(),1)
    fahrenheit = round(1.8 *celcius + 32, 1)
    humidity = round(sense.get_humidity(),1)
    pressure = round(sense.get_pressure(),1)
    print(temp)
    print(name)
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
        """Constructor to create instaces from the senosr object

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
