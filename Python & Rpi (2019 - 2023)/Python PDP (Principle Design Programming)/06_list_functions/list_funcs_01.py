# @Author:xxx
# @Date:2020-11-30 11:08:57
# @LastModifiedBy:srattigan
# @Last Modified time:2021-02-03 20:29:35
# list exercises not from Codingbat

# imports here
import doctest
import random

# global variables


# functions definitions
def add_list(a, b):
    """Add two lists together and sorts them

    Args:
        a (list): List of objects
        b (list): List of objects

    >>> add_list([1, 2, 3], [6, 5, 4])
    [1, 2, 3, 4, 5, 6]
    >>> add_list([3], [9, 2, 4])
    [2, 3, 4, 9]
    >>> add_list(['a', 'c', 'x'], ['b', 'f', 'z'])
    ['a', 'b', 'c', 'f', 'x', 'z']
    """
    new = a + b
    new.sort()
    return new


def sub_list(a, b):
    """ takes as arguments two lists and returns a new list
    equal to the longer of the two lists, with any elements
    that are in the shorter list removed

    Args:
        a (list): List of objects
        b (list): List of objects

    Returns:
        list: the longer list without duplicates
        of elements in the shorter list
    >>> sub_list([1, 2, 3], [2])
    [1, 3]
    >>> sub_list([3], [3, 2, 7])
    [2, 7]
    >>> sub_list(['a', 'c', 'x', 'Bob'], ['b', 'c', 'Bob'])
    ['a', 'x']
    """
    if len(b) > len(a):
        b, a = a, b  # from chapter 10 on tuples
    # a is now the longer list
    new_l = []
    for elem in a:
        if elem not in b:
            new_l.append(elem)
    return new_l


def idx_adder(a, b):
    """Adds the strs in each list together into a new list

    Precondition: Each list is the same length
    Args:
        a (list): List of objects
        b (list): List of objects

    Returns:
        list: creates a new list where the str
        elems of each list received are concatentated
        by index into the new list
    >>> idx_adder(["M", "na", "i", "Ke"],  ["y", "me", "s", "lly"])
    ['My', 'name', 'is', 'Kelly']
    """
    new_l = []
    num_iter = len(a)
    for idx in range(num_iter):
        new_l.append(a[idx]+b[idx])
    return new_l


def rem_13(a):
    """List processor

    Args:
        a (list): removes the number 13 from the list
    Returns:
        list: the original list is returned
    >>> rem_13([8, 13, 55, 42, 12, 13, 99, 13])
    [8, 55, 42, 12, 99]
    """
    while 13 in a:
        a.remove(13)
    return a


def add_special(a, b):
    """adds lists by sequential index

    Args:
        a (list): a list of obj
        b (list): a list of obj
    >>> add_special(["Hello ", "take "], ["Dear", "Sir"])
    ['Hello Dear', 'Hello Sir', 'take Dear', 'take Sir']
    """
    # very like idx_adder so have a go!
    pass


def guess_animal(words=["pig", "cat", "dog", "mouse", "rat"]):

    pick = random.choice(words)
    guessed = []
    print(f"The choices are {words}")
    while True:
        user = input("Guess one of the animals: ")
        user = user.lower()
        if user == pick:
            print("That's it!")
            break
        else:
            guessed.append(user)
            print("No!")
        print(f"\nYou've already guessed {guessed}")
        print(f"You've guessed {len(guessed)} times")


# main prog body

guess_animal()

if __name__ == "__main__":
    # doctest.testmod(verbose=True)
    pass
