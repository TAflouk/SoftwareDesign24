from time import sleep
import socket as s
from Sensor import Sensor
import handy

#from sense_emu import SenseHat

#from sense_emu import SenseHat


server_obj = s.socket()
server = s.gethostname()
delay_per_scnd  = 1
print(server)

def dramatic_print(statment, dots=6):
    print(statment, end=".")
    for dot in range(dots):
        sleep(.75)
        print("", end=".")

def main():
    port = 2003
    list_of_data = []
    
#     server_obj.bind(("192.168.1.10", port))
# 
#     server_obj.listen(5)
#     print("Server Listen is ON now.")
#     client,addr = server_obj.accept()
    while True:
        menu = ["Temperautre", "Humidity", "Quit"]
        print(handy.title_gen("Sensor App"))
        print(f"")
        choice = handy.menu_gen(menu)
        #data = "humidity "+ str(humi) +" temperature " + str(temp)

        print(choice)
        if choice == 2:
            print("\nGood Bye!")
            break
        #dramatic_print("loading")
        for i in range(10):
            #sleep(delay_per_scnd)
            
            list_of_data.append(Sensor().get_humidity())
            if len(list_of_data) %10 == 0 :
                print("sending data...")
                print(list_of_data)
                list_of_val = []
                total = 0
                for i in range(10):
                    list_of_data.append(list_of_data[i])
                    total += list_of_data[i]
                
                list_of_val.append(str(min(list_of_data)))
                list_of_val.append(str(total/len(list_of_data)))
                list_of_val.append(str(max(list_of_data)))
                print(list_of_val)
                ask_to_send = input("Would you like to send the data now (Y/N)?: ").lower()
                if ask_to_send == "y":
                    print("sent")
                    #client.send(list_of_val.encode())
                    break
                #sleep(1)

    #     client.close()
    #     server_obj.close()


if __name__ == "__main__":
    #print("Testing.")
    #get_weather_data("temperature")
    main()
    #dramatic_print("loading")
    #get_my_values([1,5,8,3,5,12,43,6,7,8])