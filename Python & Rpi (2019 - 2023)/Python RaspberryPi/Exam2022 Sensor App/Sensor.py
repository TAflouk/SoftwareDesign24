# Author: TAflouk
# Date:13-10-22

#  -- IMPORTS -- 
from random import randint as r


# -- CLASSES -- 
class Sensor(object):
    
    sensor_count = 0
    
    def __init__(self, room, type_of_sensor):
        self.room = room
        self.value = 0
        self.type_of_sensor = type_of_sensor
        if type_of_sensor == "humidity":
            self.value = r(5,25)
        else:
            self.value = r(45,65)
        Sensor.sensor_count += 1
        
    def getRoom(self):
        return self.room
    
    def getTypeOfSensor(self):
        return self.type_of_sensor
    
    def getValue(self):
        return self.value
    
    def __str__(self):
        return f"Room: {self.room}\nType: {self.type_of_sensor}\nValue: {self.value}"
    
if __name__=="__main__":
    print("This is the Sensor class")
    #s1=Sensor("sdasd","humidity")
    #print(s1)
            
        
    