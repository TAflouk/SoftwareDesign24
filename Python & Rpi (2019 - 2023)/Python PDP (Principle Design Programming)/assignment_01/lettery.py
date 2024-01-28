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
    pass  # generates a list of all the balls in the drum


def get_ticket(num=NUM_DRAWN):
    pass  # gets a list of 5 chars from user


def do_draw(drum, balls=NUM_DRAWN):
    pass  # pulls 5 balls from drum into new list


def check_results(ticket, balls_picked):
    pass  # checks ticket against draw


def dramatic_print(statement, dots=6):
    print(statement, end=".")
    for dot in range(dots):
        time.sleep(0.75)
        print('', end=".")


def game():
    # create a drum from gen_drum()
    # create a ticket from get_ticket()
    # print the ticket
    # create a draw from do_draw(drum)
    dramatic_print("Drawing balls")  # little delay while balls come out
    # show numbers drawn
    # get number of matches
    print(f"\nOdds of winning with all numbers are {odds_dict[5]}:1")
    # show number of matches
    # calc the winnings if any
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
    main()
