# @Author: TAflouk
# @Date:2022-10-27 10:30:40
# @LastModifiedBy:TAflouk
# @Last Modified time:2022-10-28 11:33:20
# NOTE: this file is to decorate the app to make it looks better

# --IMPORTS--
import doctest
import string

# --FINCTIONS--
def title_gen(title, decorator= "*", line_len=60):
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
    >>> title_gen("My Game", "~", 50)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                         My Game
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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
    to_title = spaces* " "
    spaces_len =str(to_title)
    title = str(title)
    return f"{line}\n{spaces_len}{title}{spaces_len}\n{line}"


def get_int(prompt="Enter Number: "):
    """a function that loops until the user enters a valid int
    Args:
        prompt (str): the prompt to be displayed. Defaults to "Enter Number: "
    Returns:
        int: any integer entered by the user
    """
    num = input(prompt)
    try:
        num = int(num)
        return num
    except ValueError:
        print("That was not an integer!")
    # if the user enters an int, return the int
    # otherwise the code will loop again.


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
    while (1):
        try:
            prompt = float(prompt)
            return prompt
        except:
            print("enters any valid number")


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
    count = 0
    counter = 1
    while count < len(options):
        print(counter, options[count])
        count +=1
        counter +=1
    pick = input("Enter a menu selection: ")
    pick = int(pick)
    if pick > len(options):
        print("Enter a valid num!")
    else:
        pick -= 1
    return pick


if __name__ == "__main__":
    my_num = get_int()
    print(my_num)
    print("Test1")
    print(title_gen("My Program"))