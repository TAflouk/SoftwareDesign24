# @Author:Taha Aflouk
# @Date:2020-12-17 11:08:57
# @LastModifiedBy:xxx
# @Last Modified time:2020-23-12 02:24:00
# PDP lettery game

# ---- imports ----
import handy
import doctest
import random
import string
import time

# ---- constants ----
NUM_BALLS = 26
NUM_DRAWN = 5

# odds from https://www.thelotterynigeria.com/lottery-calculator
odds_dict = {5: 65780,
             4: 626,
             3: 31,
             2: 5,
             1: 2,
             0: 0
             }

# ---- functions ----


def gen_drum(num=NUM_BALLS):
    """create a list and split that to two lists

    Args:
        num (int, optional): a global variable with default value 5. Defaults to NUM_BALLS.

    Returns:
        list : new lists
    """
    # Create a new list and divid the len to 2 halfs and add them together 

    main_list = list(string.ascii_uppercase)
    divided_len_list = len(main_list) // 2
    first_half_list = main_list[divided_len_list:]
    second_half_list = main_list[0:divided_len_list]
    added_list = first_half_list + second_half_list 
    return added_list

# get ticket func to generate a ticket based on the global variable
def get_ticket(num=NUM_DRAWN):
    """a fuction that generate a (number) of letters in a list 

    Args:
        num: int, (optional): a constant variable . Defaults to NUM_DRAWN.

    Returns:
        list (str): returns a new list of letters that user pickes
    """
    #a while loop to get a random letter from the user and append that to a new list
    balls_picked = []
    count = 0
    while count < num:
        picked_char = input("Enter a Char: ").upper()
        if len(picked_char)< 2 and picked_char.isalpha() and picked_char not in balls_picked:
            balls_picked.append(picked_char)
            count+=1
        elif picked_char in balls_picked:
            print(f"{picked_char} Already Picked !")
        elif len(picked_char)>1:
            print("Only one char!")
        else:
            print("Enter a single letter !")          
    balls_picked.sort()  
    return balls_picked


def do_draw(drum, balls=NUM_DRAWN):
    """A Func to generate a number(5) of random letters

    Args:
        drum: List: A list of alphabet english letters
        balls: int, (optional): a constant var . Defaults to NUM_DRAWN.

    Returns:
        list: list of number of letters depeneding on the constant value in NUM_DRAWN
    """
    # generate 5 different random letters from the gen_drum() and remove them from the gen_drum()
    drum = gen_drum()
    balls_picked = []
    while len(balls_picked) < balls:
        random_char = random.choice(drum)
        drum.remove(random_char)
        balls_picked.append(random_char)
    balls_picked.sort()
    return balls_picked


def check_results(ticket, balls_picked):
    """A Func that compare two lists of letters check the results

    Args:
        ticket list of str: list of letters
        balls_picked list of str: list of letters

    Returns:
        int: returns the number of the matches chars between the two list
    """
    # check the two list if any matches and return how many balls matched (int)
    counter = 0
    for char in ticket :
        if char in ticket:
            if char in balls_picked:
                counter += 1
    return counter


def dramatic_print(statement, dots=6):
    """Func that generateS a dramatic dots design to show the user like (loading ...)

    Args:
        statement (str): string 
        dots (int, optional): int in a variable with set value (6). Defaults to 6.
    """
    print(statement, end=".")
    for dot in range(dots):
        time.sleep(0.75)
        print('', end=".")


def game():
    """A function to print the functions (to run the game) 
    """
    total_winning = 0
    drum = gen_drum()
    ticket = get_ticket()
    print(ticket)
    draw  = do_draw(drum)
    dramatic_print("Drawing balls")
    check_total_results  = check_results(ticket,draw)
    print(f"\nThe balls drawn are: {draw}")
    print(f"\nOdds of winning with all numbers are {odds_dict[5]}:1")
    print(f"\nYou got {check_total_results} matches")

# calc the winnings if any
    if check_total_results >= 3:
        calculation = odds_dict[check_total_results] / 2
        total_winning += calculation
        print(f"Congrats You Won {calculation} €")

    elif check_total_results <= 2:
        total_winning -= 1
        print("\nNo win- it's cost you a Euro")

    input("\nPress Any Key To Continue")
    return total_winning  # returned value is added to cash


def main():
    """design a menu , title ,cash 
    """
    cash = 100
    while True:
        menu = ["Play LetterLotto", "Quit"]
        print(handy.title_gen("The National Lettery"))
        print(f"{' ' * 40} Cash: € {cash}\n")
        choice = handy.menu_gen(menu)
        if choice == 0:
            cash += game()
        if choice == 1:
            print("\tGoodbye! Press any key to quit.")
            input()
            break


# main body
if __name__ == '__main__':
     main()
    # print("Testing Drum generator")
    # drum = gen_drum()
    # print(drum)
    # print(gen_drum(10))
    # print(gen_drum(20))

    # print("Testing get tickect")
    # tick = get_ticket()
    # print(get_ticket(3))
    # print(get_ticket(7))

    # print("Testing do_draw")
    # result = do_draw(drum)
    # print(result)
    # print(drum)
