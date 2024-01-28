# @Author: TAflouk
# @Date:2022-10-27 10:30:40
# @LastModifiedBy:TAflouk
# @Last Modified time:2022-10-28 11:33:20

import handy
from settings import *
from Sensor import *
from time import sleep as sleep
import doctest


# -- FUNCTIONS --
def pop_items(array):
    """Func to delete all items in a list
       and it does not return anything

    Args:
        array (list): list of objects 
    """
    for i in range(len(array)):
        array.pop()


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

 
def generate_sentence(current_data, type_of_data):
    """Func to generate a sentence with a list of colours
       and store them in a list after checking the data from
       the sensor and always it is going to have at least 2 
       elements in it a str and list of ints
    Args:
        current_data (str): a number (float/int) data from the sensor
        type_of_data (str): the name of the sensor (temperature/humidity)
    Returns:
        list: list of objects
    >>> generate_sentence(27, "temperature")
        ["Too hot", [255, 0, 0]]
    >>> generate_sentence(17, "temperature")
        ["Comfy", [0, 255, 0]]
    >>> generate_sentence(13, "temperature")
        ["Cold", [0, 0, 255]]
    # if we use humidity we still get the same do the same idea but now on humidity                                     
    >>> generate_sentence(70, "humidity")     
        ["Oppressive", [255, 0, 0]]
    >>> generate_sentence(60, "humidity")     
        ["Sticky", [0, 255, 0]]
    >>> generate_sentence(50, "humidity")     
        ["Dry", [0, 0, 255]]                          
    """
    data = []
    #green = [0, 255, 0]
    #blue = [0, 0, 255]
    pop_items(data)
    if type_of_data == "temperature":
        if current_data > 22:
            data.append("Too hot")
            data.append(red)
        if 15 < current_data < 22:
            data.append("Comfy")
            data.append(green)
        if current_data < 14:
            data.append("Cold")
            data.append(blue) 
    if type_of_data == "humidity":
        if current_data > 65:
            data.append("Oppressive")
            data.append(red)
        if 55 < current_data < 65:
            data.append("Sticky")
            data.append(green)
        if current_data < 55:
            data.append("Dry")
            data.append(blue)
    return data

def main():
    list_of_data = [] # list to store all the data we collect
    global time_delay, flag # global vars they are in the settings file to make the programe easy to maintaine
    while True: # here the program starts runing 
        menu = ["Temperature","Humidity", "Quit"] # this is the menu
        print(handy.title_gen("SENSOR APP")) # here is the app title
        print(f"{' ' * 40} Location:{country.title()}\n")
        choice = handy.menu_gen(menu) # store the choice in a var to check if the they enter humidity or temp
        #print()
        print(f"\nYou have entered:\n\t\t{menu[choice].upper()} from the options.")
        print()
        if flag == False: # if the flag is false then we ask the user if they want to delete the elements from the list
            delete_element = input("Do you want to delete the last 10 records from the list(Y/N):").lower() # get input from the user 
            print()
            if delete_element == "y": # if the answer is "y" then we run pop_intems function on the list
                flag = True
        if choice == 0: # if user choose 0 then the picked temp so it is like a list start count from zero
            dramatic_print("Loading") # printing dramatic things like loading....
            print()
            while True:
                s1 = Sensor('temperature') # creating an obj from the Sensor class
                print()
                #print(s1) # testing the obj
                temperature = s1.get_temperature() # store the temperature from the obj in a var to make the work easier to read
                name = s1.get_name() # do the same thing but now we store the name of the sensor
                print(temperature) # print them to test
                #print(name)
                list_of_data.append(temperature) # add the temperature to the list above
                wrd = generate_sentence(temperature ,name)[0] # now we create a var called wrd to store that msg we generate in the generate_sentence() func
                colour = generate_sentence(temperature, name)[1] # do the same thing agian but now we store the colour as a list
                #print(generate_sentence(temperature, name)) # test that
                s.show_message(wrd, text_colour = colour) # display that wrd we already created with a color represent the temperature
                if len(list_of_data) % 10 == 0 : # checking if the list filld up with 10 numbers that we already read 
                    print(f"The last 10 records are:\n\t\t\t{list_of_data}") # print everything in the list 
                    print() # print empty line to see them clearly 
                    if flag == True: # here if Flag which in the setting file is TRUE then we delete everything in the list using a func called pop_items()
                        pop_items(list_of_data)
                        print("after clearing the list" , list_of_data) # print it ito make sure all good
                sleep(time_delay) # delay to stop for a while
        if choice == 1: # here we repeat the same thing what we did in the previous if statment but now on humidity
            dramatic_print("Loading")
            while True:
                s1 = Sensor('humidity')
                print()
                print(s1)
                print(s1.get_humidity())
                wrd = generate_sentence(s1.get_humidity(), s1.get_name())[0]
                colour = generate_sentence(s1.get_humidity(), s1.get_name())[1]
                print(wrd)
                print(colour)
                s.show_message(wrd, text_colour = colour)
                list_of_data.append(s1.get_humidity())
                if len(list_of_data) % 10 == 0 :
                    print(f"The last 10 records are:\n\t\t\t{list_of_data}")
                    print()
                    if Flag == True:
                        pop_items(list_of_data)
                        print("after clearing the list" , list_of_data)
                sleep(time_delay)
        if choice == 2: # if user picked quit then we exit the program and we print a msg saying good bye
            print("\tGoodbye! Press any key to quit.")
            input()
            break
        input("enter")
       
if __name__ == "__main__":
    #doctest.testmod()
    #print('testing functions here....')
    #g1 = generate_sentence(56, "humidity")
    #dramatic_print("Loading", 8)
    #print(g1)
    #print("List before clearing it.")
    #print(red)
    #pop_items(red)
    #print("List is clear now.")
    #print(red)
    main()