from time import sleep
import socket as s
from Sensor import Sensor


#from sense_emu import SenseHat


server_obj = s.socket()
server = s.gethostname()
delay_per_scnd  = 1
#print(server)


def dramatic_print(statement, dots=6):
    """Func that generates a dramatic dots design to show the user like (loading ...)

    Args:
        statement (str): string 
        dots (int, optional): int in a variable with set value (6). Defaults to 6.
    """
    print(statement, end=".")
    for dot in range(dots):
        sleep(0.75)
        print('', end=".")
    


def main():
    port = 2005
    list_of_temp = []
    list_of_humi = []
    server_obj.bind(("192.168.1.4", port))
    
    server_obj.listen(5)
    dramatic_print("Getting the server ready")
    print()
    print("Everything is ready now.")
    client,addr = server_obj.accept()

    #data = "humidity "+ str(humi) +" temperature " + str(temp)
    for i in range(10):
        #sleep(delay_per_scnd)
        humidity_sensor = Sensor("humidity")
        temp_sensor = Sensor("temperature")
        list_of_humi.append(str(humidity_sensor.get_humidity()))

        list_of_temp.append(str(temp_sensor.get_temperature()))
        
        if len(list_of_humi) %10 == 0 and len(list_of_temp) % 10 == 0:
            print("sending data...")
            #print(list_of_temp)
            #print(list_of_humi)
            humi_str = ""
            temp_str = ""
            for i in range(10):
                humi_str +=  " "+list_of_humi[i]
                temp_str += " "+list_of_temp[i]
            #for each_item in list_of_humi:
                #humi_str += each_item + ","
                #temp_str += i + " "
            
            client.send(humi_str.encode())
            client.send(temp_str.encode())
            #sleep(1)
    client.close()
    server_obj.close()
    
if __name__ == "__main__":
    #print("Testing.")
    #get_weather_data("temperature")
    main()
    #for i in range(10):
    #   print(i)
    #s = Sensor("temperature")
    #print(s)