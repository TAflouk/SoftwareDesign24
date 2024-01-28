import time; import socket

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



data = client.recv(1)

print(type(data))
menu= data.decode("utf-8")

print(type(menu))
print(menu)


stringOfNums = ""

if(menu=="1"):
    numbers = [1,3,1,34,5,5,2,21]

    #stringOfNums = ""

    for n in numbers:
        stringOfNums += str(n)+" "

    print(" numbers are: ",stringOfNums)
elif(menu=="2"):
    stringOfNums="25"
    print(" number is: ",stringOfNums)
client.send(stringOfNums.encode())

time.sleep(1)
#client.close()
#server.close()
#serverObject.close()
