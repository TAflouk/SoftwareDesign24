# @Author:srattigan
# @Date:2020-12-14 13:14:18
# @LastModifiedBy:srattigan
# @Last Modified time:2020-12-14 18:02:55
import random


# this sample list can be replaced with a function 
# later to read a file or files where the contents
# are categories
animals = ['chicken', 'dog', 'horse', 'goat']


def get_word(words):
    """Take a word from a list
    remove it from the list
    return the word

    Args:
        words (list of str): list of words from a category
    Returns:
        str: a random string
    """
    if len(words) < 1:
        print("No words to choose from!")
        word = None
    else:
        word = random.choice(words)
        words.remove(word)
    return word


