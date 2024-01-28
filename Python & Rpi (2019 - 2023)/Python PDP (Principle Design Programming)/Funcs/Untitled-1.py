# @Author:Taha Aflouk
# @Date:2020-12-17 11:08:57
# @LastModifiedBy:xxx
# @Last Modified time:2020-11-30 11:12:00
# PDP lettery game


# ---- imports ----
#import handy
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
    drum = list(string.ascii_uppercase)
    drum.sort()
    return drum

# get ticket func to generate a ticket based on the global variable
def get_ticket(num=NUM_DRAWN):
    """a fuction that generate a num letters in a list 

    Args:
        num: int, (optional): a constant variable . Defaults to NUM_DRAWN.

    Returns:
        list (str): returns a list of letters that user pickes
    """
    balls_picked = []
    count = 0
    while count < NUM_DRAWN:
        char = input("Enter a Char: ").upper()
        if len(char)< 2 and char.isalpha() and char not in balls_picked:
            balls_picked.append(char)
            count+=1
        elif char in balls_picked:
            print(f"{char} already picked ;P")
        elif len(char)>1:
            print("Only one char please !")
        else:
            print("Enter a letter please !")

            
    balls_picked.sort()
   
    return balls_picked


def do_draw(drum, balls=NUM_DRAWN):
    """A Func to generate a num of random letters

    Args:
        drum: List: A list of alphabet english letters
        balls: int, (optional): a constant var . Defaults to NUM_DRAWN.

    Returns:
        list: list of number of letters depeneds on the constant value in NUM_DRAWN
    """
    drum = gen_drum()
    random_balls = []
    while len(random_balls)<5:
        rand_letter  =random.choice(drum)
        drum.remove(rand_letter)
        random_balls.append(rand_letter)
        random_balls.sort()
        return random_balls


def check_results(ticket, balls_picked):
    """A Func that compare two lists of letters check the results

    Args:
        ticket list of str: list of letters
        balls_picked list of str: list of letters

    Returns:
        int: returns the number of the matches chars between the two list
    """
    count = 0
    for ball in ticket :
        if ball in ticket:
            if ball in balls_picked:
                count+=1
            return count


def dramatic_print(statement, dots=6):
    print(statement, end=".")
    for dot in range(dots):
        time.sleep(0.75)
        print('', end=".")


def game():
    drum1 = gen_drum()# create a drum from gen_drum()
    tick1 =get_ticket()# create a ticket from get_ticket()
    print(tick1)# print the ticket
    draw = do_draw(drum1)# create a draw from do_draw(drum)
    dramatic_print("Drawing balls")  # little delay while balls come out
    print("\n",do_draw(drum1))# show numbers drawn
    check  = check_results(tick1,draw)# get number of matches
    print(f"\nOdds of winning with all numbers are {odds_dict[5]}:1")
    print(check)# show number of matches
    for i in check:
        pass # calc the winnings if any
    # returned value is added to cash


def main():
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
 #    main()
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


#drum.sort()
#return drum
    
