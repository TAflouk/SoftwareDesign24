# @Author:TAflouk
# @Date:2021-02-20 16:30:00
# @LastModifiedBy:TAflouk
# @Last Modified time:2021-03-02 1:30:00

# --- IMPORTS ---
import doctest
import string as s
import random as r
import time as t
import game_utils as gu


# --CONSTANTS/GLOBALS--

ROUND_TIME = 40

opts = [
    "Five (5) Letters",
    "Eight (8) Letters",
    "Eleven (11) Letters",
    "Show Rules",
    "Return To Main Menu"
    ]


scoring = {
    1:1,
    2:2
}
num_letters = {
    5: [3, 2],
    8: [4, 4],
    11: [6, 5]
    }


# --CUSTOM FUNCTIONS/CLASSES--


# --- HELPER FUNCTIONS ---
#  --- RULES  ---
def show_rules():
    """Function to print rules of the game
    """
    print("--- RULES ---")
    print("Select how mant random letters you want")
    print("Guess as many words as you can using the letters you get")
    print("Each valid word is counted;")
    print("\t\tat the end of 2 minutes you get points")
    print("All words must be in the English dictionary to be valid ")
    print("The smallest valid word is two characters")
    print("For 8 letters, a multiplier of 2 x score is applied")
    print("For 5 letters, a multiplier of 5 x score is applied")
    input("Press Enter to continue...")

# --- CREATE LETTERS ---
def generate_letters(key):
    """Function to generate 2 lists of English letters and make a random list from them and it fills in a dict

    Args:
        key (int): [key to access dictionary]

    Returns:
        [list]: [list of random english letters]
    """
    global scoring
    rand_letters = []
    consonants = []
    vowels = list("aeuio")
    all_letters = s.ascii_lowercase
    for element in all_letters:
        if element not in vowels:
            consonants.append(element)
    c_letters = num_letters[key][0]
    v_letters = num_letters[key][-1]
    for i in range(c_letters):
        rand_letters.append(r.choice(consonants))
    for e in range(v_letters):
        rand_letters.append(r.choice(vowels))
    r.shuffle(rand_letters)
    for each_num in range(3,30):
        scoring[each_num] = each_num + 2
    return rand_letters

# --- DECORATION TO SAPERATE LETTERS ---
def prettify(letter_list, sep=" - "):
    """ Function that design letters

    Args:
        letter_list (list): [list of letters]
        sep (str, optional): [symbol to separate the elements in the list]. Defaults to " - ".
        >>> prettify(['p', 'e', 't', 'o', 'r', 'l', 'i', 'g'])
        'p - e - t - o - r - l - i - g'

    Returns:
        [str]: [str]
    """
    new_word = ""
    for each_element in letter_list:
        new_word += each_element + sep
    return new_word[:-2]

# --- CHECK WORDS ---
def is_valid(word, letters):
    """Function to check if words availbale in English dictionary and if the letters in word are in the letters
    
    Args:
        word ([str]): [word]
        letters ([str]): [letters]

    Returns:
        [Bool]: [TRUE, FALSE]
    """
    if len(word) < 2:
        return False
    if not gu.check_word_exists(word):
        return False
    # now we know its 2 or more, and exists
    # 'cara'  [c, t, r, a, g, w, h]
    for i in word:
        if i not in letters:
            return False
        elif word.count(i) > letters.count(i):
            return False
    return True

# -- TIMER ---
def time_passed(start_time):
    """Function to calculate the time 

    Args:
        start_time (Float): [num]

    Returns:
        [int]: [num]
    """
    total = int(start_time - t.time() )
    return total

# --- BOGGLETTE ---
def bogglette(num):
    """Function for the main logic of the game

    Args:
        num (int): [user choice]

    Returns:
        [int]: [score from player]
    """
    word_box = []
    if num == 0:
        num_letter = 5  # 2 vowels 3 consonants
    elif num == 1:
        num_letter = 8
    elif num == 2:
        num_letter = 11
    my_letters = generate_letters(num_letter)
    time_now = t.time()
    print()
    d_letters = prettify(my_letters)
    print(f"\t\tYour letters are: {d_letters}")
    print()
    print("Enter as many word as you can")
    print("Hit the Enter key after each word.")
    print("Good luck and type fast!")
    while time_passed(time_now) + ROUND_TIME >= 0:
        print()
        time_left = int(time_passed(time_now) + ROUND_TIME)
        print(f"Game will end in {time_left} seconds")
        print(f"Letters: {d_letters}")
        print(f"Words box: {word_box}")
        user_word = input("Enter word: ")
        if not is_valid(user_word,my_letters):
            print("Cannot make that word")
            print(f"{user_word} word  does not exist")
        elif user_word in word_box:
            print("Cannot make that word")
            print(f"{user_word} is in {word_box} ")
        else:
            word_box.append(user_word)
            print(f"{user_word} Added")
    print("Time up!!")

    total = 0
    for each_wrd in word_box:
        print(f"\t\t-{each_wrd}")

    input("Press Enter to see the scores: ")
    print("Your Scoring as follows:")
    for each_word in word_box:
        scr = scoring[len(each_word)]
        total += scr
        print(f"\t\t{scr} points for {each_word}")

    letter_len = len(my_letters)
    if letter_len == 5:
        multiplier = 2
    elif letter_len == 8:
        multiplier = 5
    else:
        multiplier = 1
    print(f"The multiplier for using {letter_len} Letters is {multiplier}")
    final_score = total * multiplier
    print(f"{total} x {multiplier} = {final_score}")
    gu.ask_user_save('bogglette', final_score)
    input("press enter to continue...")
    return final_score 

# --- MAIN ---
def main(points=31):
    """Function to run the main game (menu)

    Args:
        points (int, optional): [points for players]. Defaults to 31.

    Returns:
        : [description]
    """
    m = gu.Menu("Bogglette", opts)
    m.points = points
    while True:
        choice = m.display()
        input(f"you picked {m.options[choice]}")
        if choice == 4:
            input("Press Enter to continue to main menu...")
            return m.points
        elif choice == 3:
            show_rules()
        elif choice in range(3):
            m.points += bogglette(choice)
        else:
            print("Something unexpected happened")
            input("Press enter to continue")

if __name__ == "__main__":
    main()