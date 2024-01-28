def menu_gen(options):
    """Pretty print a list of options, prompting the user to select one.
    The user must select a valid option, otherwise it will print a message
    "Invalid Option selected- try again!"
    When a valid option is selected, the function returns
    the index of the option.
    Each of the options are presented indented by one tab and numbered
    Args:
        options (list of str): A list of options to be printed
    Returns:
        int: the index of the option chosen by the user
    >>> menu_gen(['cat', 'rat', 'bat', 'dog'])
        1.   Cat
        2.   Rat
        3.   Bat
        4.   Dog
    Enter your selection by number: 1
    # return value is 0
    >>> menu_gen(['cat', 'rat', 'bat', 'dog'])
        1.   Cat
        2.   Rat
        3.   Bat
        4.   Dog
    Enter your selection by number: 4
    # return value is 3
    >>> menu_gen(['cat', 'rat', 'bat', 'dog'])
        1.   Cat
        2.   Rat
        3.   Bat
        4.   Dog
    Enter your selection by number: Cat
    # Shows invalid message
    >>> menu_gen(['cat', 'rat', 'bat', 'dog'])
        1.   Cat
        2.   Rat
        3.   Bat
        4.   Dog
    Enter your selection by number: 99.0
    # Show message that num must be in menu
    """
    # inside a while loop:
    # print each item in the list, with the first item preceded by the
    # number 1, with each menu item numbered after this.
    # ask the user to enter a menu selection
    # they must pick a valid number from 1 to len of list
    # if they enter a valid option, return that number -1 to indicate the index
    # if they enter an invalid option, print "Invalid option" and
    # allow them to enter another number.
 

    #li = ["cat","dog","lapin","rabit"]
    count = 0 

    for i in options:
        count+=1
        print(count , i)

    num = input("enter a valid num:")
    num = int(num)
    if num > len(options):
        print(f"enter a valid num!")
    else:
        num -=1
        return num

#print(menu_gen(["asdadasdads","adsda","wdadwa",2]))

