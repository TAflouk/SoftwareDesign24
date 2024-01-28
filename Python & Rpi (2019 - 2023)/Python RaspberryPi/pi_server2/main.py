from time import sleep
import socket as s
from Sensor import Sensor
#from sense_emu import SenseHat

#from sense_emu import SenseHat


server_obj = s.socket()
server = s.gethostname()
delay_per_scnd  = 1
print(server)

    


def main():
    port = 2003
    list_of_temp = []
    list_of_humi = []
#     server_obj.bind(("192.168.1.10", port))
# 
#     server_obj.listen(5)
#     print("Server Listen is ON now.")
#     client,addr = server_obj.accept()

    #data = "humidity "+ str(humi) +" temperature " + str(temp)
    for i in range(10):
        #sleep(delay_per_scnd)
        list_of_humi.append(str(Sensor("humidity").get_humidity()))

        list_of_temp.append(str(Sensor("temperature").get_temperature()))
        
        if len(list_of_humi) %10 == 0 and len(list_of_temp) % 10 == 0:
            print("sending data...")
            print(list_of_temp)
            print(list_of_humi)
            humi_str = ""
            temp_str = ""
            for i in range(9):
                humi_str +=  " "+list_of_humi[i]
                temp_str += " "+list_of_temp[i]
            print(humi_str)
            print(temp_str)
            #client.send(humi_str.encode())
            #client.send(temp_str.encode())
            #sleep(1)
#     client.close()
#     server_obj.close()
    
if __name__ == "__main__":
    #print("Testing.")
    #get_weather_data("temperature")
    main()
    #get_my_values([1,5,8,3,5,12,43,6,7,8])