
#Ex3:
a= [1,2,3,4,5]
#b = [4,6,7,8,3]
#for i in a:
    #for e in b:
        #if i == e :
            #a.remove(i)
            #return a+b

list1 = ["cat","dog","horse","jaguar","giraph"]
count = 0
#for count in list1:
    #count+=1
    #print(count)

def get_num(prompt="Enter Number: "):
    """a function that loops until the user enters a valid number
    Args:
        prompt (str): the prompt to be displayed. Defaults to "Enter Number: "
    Returns:
        float: any number in float form, entered by the user
    """
    # use a try/except inside a loop.
    # if the user enters any valid number, convert to float and return
    # otherwise the code will loop again.
    while True:
        num = input(prompt)
        try:
            num = float(num)
            return num
        except:
            return f"please try again with a num !!"
            
#print(get_num())


def menu_gen(options):
    """Pretty print a list if options, prompting the user to select one.
    The user must select a valid option, otherwise it will print a message
    "Invalid Option selected- try again!"
    When a valid option is selected, the function returns
    the index of the option.
    Each of the options are presented indented by one tab and numbered
    Args:
        options (list of str): A ist of options to be printed
    Returns:
        int: the index of the option chosen by the user
    """
    # inside a while loop:
    # print each item in the list, with the first item preceded by the
    # number 1, with each menu item numbered after this.
    # ask the user to enter a menu selction
    # they must pick a valid number from 1 to len of list
    # if they enter a valid option, return that number -1 to indicate the index
    # if they enter an invalid option, print "Invalid option" and
    # allow them to enter another number.
    #count = 0
    list1 = ["cat","dog","horse","jaguar","giraph"]
    cou = 0
    lentgh = len(list1)
    for count in list1:
        cou+=1
        print(f"{cou}   {count}")
    options = input(f"enter 1 and {lentgh} : ")
    for index , i in enumerate(list1):
        if i== index:
            return i
        #print( i )
#print(menu_gen(2))
    


#print(menu_gen(["cat","dog","horse","jaguar","giraph"]))

#swed =["cat","dog","horse","jaguar","giraph"] 
#a2 = len(swed)
#print(a2)
#foud = 3
#count = 0
#for count in range(foud):
#    print(count)
#while count<len(swed):
#    count+=1
#    print(count)

#def checkends(letter):
#    return letter[0]==letter[-1]

#print(checkends("ssadsassa"))

def ord_print(s):
    """function convert the string to ORD numbers

    Args:
        s (str): it takes str and it returns the ord nums
        returns:int
    """
    count = 0
    while count<len(s):
        count +=1
        print(count)
  
def two_chr(s):
    pass


count = 0 
list1 = ["cat","dog","horse","jaguar","giraph"]
for index , i in enumerate(list1):
    count+=1
    print(count, i)
    num = ("enter a num from the item: ")

    #print( i )

