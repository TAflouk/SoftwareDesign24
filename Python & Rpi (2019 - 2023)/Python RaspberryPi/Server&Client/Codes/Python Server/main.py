# @Authors: William, Daniel, TAflouk
# @Date:2022-11-25 13:10:00
# @LastModifiedBy: TAflouk
# @Last Modified time:2022-11-29 18:10:00

# --- IMPORTS --- 
import time; import socket
from Sensor import Sensor
from time import sleep
import random as r

# --- FUNC() ---
def get_avrg(array):
    # This Func() is to get average of a list
    # it has one parameter  list of numbers int/float as an arg
    # returns a number 
    total = 0
    for i in range(len(array)):
        total += array[i]
    return (total/len(array))

def convert_to_str(array):
    # This Func() is to convert a list to a sting 
    # it has one parameter  list of numbers int/float as an arg
    # returns a string of numbers 
    new_str = ""
    for i in range(len(array)):
        new_str += str(array[i])+ " "
    return new_str

# -- MAIN -- 
def main():
    serverObject = socket.socket() #creating our server
    server = socket.gethostname() #for testing purposes
    print(server) #name of computer...
    port = 2005
    # Use ipconfig (Windows) or ifconfig(Linux) to find the IP address
    # Change the IP address to that of your computer. 
    serverObject.bind(("192.168.1.101", port))# setting up server
    print("waiting for connection....")
    serverObject.listen(5)
    client,addr = serverObject.accept()
    print("Got a connection from " + str(addr))
    data = client.recv(1) # get the data from the client 
    print(type(data))
    menu= data.decode("utf-8") # convert that from Binary Code into English letter 
    #print(type(menu)) # print the type to test  what the user enter Note: for testing 
    #print(menu) #print that values to test
    stringOfNums = "" # initializ n empty string 
    list_of_temp = [] # initializ n empty lists
    list_of_humi = [] 
    for i in range(10): # get 10 values from the Sensor class 
        list_of_temp.append(Sensor("temperature").get_temperature()) # append them to the lists
        list_of_humi.append(Sensor("temperature").get_humidity())
    if menu == "1": # check what is the user input 
        val1  = min(list_of_humi) # store the values into a vars
        stringOfNums += str(val1)+" " # add the values to the string  as str
    # repeat the previous step
    elif menu == "2" :
        val2 = get_avrg(list_of_humi)
        stringOfNums += str(val2)+" "
        
    elif menu == "3" :
        val3 = max(list_of_humi)
        stringOfNums += str(val3) +" "
        
    elif menu == "4" :
        val4 = min(list_of_temp)
        stringOfNums += str(val4) +" "
        
    elif menu == "5" :
        val5 = (get_avrg(list_of_temp))
        stringOfNums += str(val5)+" "
        
    elif menu == "6" :
        val6 = max(list_of_temp)
        stringOfNums += str(val6)+" "
        
    elif menu == "7" :
        stringOfNums = convert_to_str(list_of_humi)
        
    elif(menu=="8"):
        stringOfNums = convert_to_str(list_of_temp)
        
    print(" number is: ",stringOfNums) #print the string to test
    client.send(stringOfNums.encode()) # send that string to the client 
    sleep(.5) # sleep for a sec
    client.close() # close  client 
    server.close() # Close Server 
    serverObject.close() #  close the object


if __name__ == "__main__":
    main()
    #print("Testing")
    #print(Sensor("temperature"))
    #e = get_avrg([3,3,3])
    #f = convert_to_str([3,3,3])
    #print(f)
    #s = Sensor("temperature")
    #print(s)
