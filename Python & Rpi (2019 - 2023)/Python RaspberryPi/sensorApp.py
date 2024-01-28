from sense_emu import SenseHat
import time

# global
s = SenseHat()
text_colour = []

# functions 
def get_humidity():
    return return round(s.get_humidity(),1)
    
def  get_temperature():
    return round(s.get_temperature(),1)

def get_status():
    global text_colour
    humidity = get_humidity()
    if humidity > 65:
        text_colour = [255, 0, 0]
        return "Oppressive"
    if 55 < humidity < 65:
        text_colour = [0, 255, 0]
        return "Sticky"
    if humidity < 55:
        text_colour = [0, 0, 255]
        return "Dry"

def get_status2():
    global text_colour
    temp = get_temperature()
    if temp > 22:
        text_colour = [255, 0, 0]
        return "Too hot"
    if 15 < temp < 22:
        text_colour = [0, 255, 0]
        return "Comfy"
    if temp < 14:
        text_colour = [0, 0, 255]
        return "Cold"


def main():
    global text_colour
    user_input = input("do you want to collect temperature or humidity: ").lower()
    list_of_items = []
    counter = 0
    if user_input == "temperature":
        #print(get_temperature())
        while True:
            counter+=1
            print(get_temperature())
            list_of_items.append(get_temperature())
            s.show_message(f"{get_status()}", text_colour)
            #print(f"{get_status()} colors : ", text_colour)
            time.sleep(5)
            if counter % 10 == 0:
                print()
                print(list_of_items)
                print()
        
    elif user_input == "humidity":
        while True:
            counter+=1
            print(get_humidity())
            list_of_items.append(get_humidity())
            s.show_message(f"{get_status2()}", text_colour)
            #print(f"{get_status()} colors: ", text_colour)
            time.sleep(5)
            if counter % 10 == 0:
                print()
                print(list_of_items)
                print()
        
if __name__ == "__main__":
    main()