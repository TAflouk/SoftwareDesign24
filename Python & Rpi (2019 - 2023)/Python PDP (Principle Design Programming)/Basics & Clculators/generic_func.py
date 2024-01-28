# @Author:xxx
# @Date:2020-11-30 01:14:54
# @LastModifiedBy:xxx
# @Last Modified time:2020-11-30 01:14:54

import doctest


def title_gen(title, decorator="*", line_len=60):
    """generates a title for a cli application.
    The title text is centred inside two lines composed of
    a decorator character
    Args:
        title (str): the title to be displayed
        decorator (str, optional): A char used as a line. Defaults to "*".
        line_len (int, optional): line length. Defaults to 60.
    Returns:
        str: a multiline string
    
    >>> title_gen("My Program")
    ************************************************************
                             My Program
    ************************************************************
    """
    line = ""  # the decorator times line_len
    spaces = 0  # an integer to indicate how many spaces before title
    #title_bar = ""
    # the title bar will be one line with a next line char
    # + spaces + title and another next line char
    # + another line
    # Note that num spaces is line-len minus the length of the title, div by 2
    # also note that the spaces MUST be an integer
    line = decorator * line_len
    new = len(title)

    
 
    spaces = (line_len - new)//2
    to_title= spaces* " "

    return line+"\n"+str(to_title)+str(title)+str(to_title)+"\n"+line
    

print(title_gen("hello",decorator="-",line_len=38)) 
#print(title_gen("hello",decorator="-",line_len=50))



def get_int(prompt="Enter Number: "):
    """a function that loops until the user enters a valid int
    Args:
        prompt (str): the prompt to be displayed. Defaults to "Enter Number: "
    Returns:
        int: an integer entered by the user
    """
    # use a try/except inside a loop.
    # if the user enters an int, return the int
    # otherwise the code will loop again.
    
    
    while True:
        num = input(prompt)
        try:
            num = int(num)
            return num
        except:
            return f"enter int num please!"
            #num = input(prompt)
        
#get_int()



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
    count = 0
    