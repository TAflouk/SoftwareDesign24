# ----------------------
# ---- File Handling ---
# ----------------------
#----------------------------------------------------------

my_file = open("score.txt", "r")

#print(my_file)  # Data Object

def info_file():
    # To Get the information of the file 
    print(my_file.name)
    print(my_file.mode)
    print(my_file.encoding)

    print("===================")

def read_file():
    #print(my_file.read())  # this is to read the whole file
    print(my_file.readline())

    print(my_file.readline(100))  # this method to read a line
    print(my_file.readlines()) # this will return the lines in the dict to list

    print(type(my_file.readlines())) # type list

for line in my_file:
    print(line)
    if line.startswith("02"):
        break # if statment to break the loop when we need to "controle it"

my_file.close() # we always close the file after we done the work





