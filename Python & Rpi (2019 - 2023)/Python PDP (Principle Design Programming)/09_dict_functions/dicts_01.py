# @Author:srattigan
# @Date:2020-12-10 13:38:59
# @LastModifiedBy:srattigan
# @Last Modified time:2020-12-14 12:19:08
import doctest


def dict_gen(str_list, num_list):
    """Creates a dict given two lists
    Precondition: Assumes lists are of equal length

    Args:
        str_list (list of str): strs
        num_list (list of num): num

    Returns:
        dict: dict of str: num
    >>> dict_gen(['Ten', 'Twenty', 'Thirty'], [10, 20, 30])
    {'Ten': 10, 'Twenty': 20, 'Thirty': 30}
    """
    assert len(str_list) == len(num_list), "Lists must be same length"
    new_dict = {}  # makes empty dict
    for idx in range(len(str_list)):
        new_dict[str_list[idx]] = num_list[idx]
    return new_dict


def dict_merge(d1, d2):
    """Merge two dictionaries

    Args:
        d1 (dict): dict
        d2 (dict): dict
    Returns:
        dict: a merged form of the two received
    >>> dic1 = {'Ten': 10, 'Twenty': 20, 'Thirty': 30}
    >>> dic2 = {'Thirty': 30, 'Forty': 40, 'Fifty': 50}
    >>> dict_merge(dic1, dic2)
    {'Ten': 10, 'Twenty': 20, 'Thirty': 30, 'Forty': 40, 'Fifty': 50}
    """
    assert type(d1) == dict and type(d2) == dict, "Must be dict args"
    new_d = {}
    all_dicts = [d1, d2]
    for each_d in all_dicts:
        for entry in each_d:
            new_d[entry] = each_d[entry]
    return new_d


def find_val(a_dict, subject):
    """Search a nested dict structure for a subject and
    return the associated grade.

    Args:
        a_dict (dict of dict): a multi-nested dict
        subject (str): a subject for which the grade will be retrieved
    Returns:
        int: Score for the subject searched for
    """
    pass


def letter_count(words):
    """Parse a str and build a dict counting the total number
    of times each character is found in the str
    This function counts all chars, i.e. letters, numbers and special
    Args:
        words (str): a string of characters
    Returns:
        dict: a dict of str:int
    >>> letter_count("Hello?~")
    {'h': 1, 'e': 1, 'l': 2, 'o': 1, '?': 1, '~': 1}
    """
    char_count = {}
    for letter in words:
        if letter.lower() in char_count:
            char_count[letter.lower()] += 1
        else:
            char_count[letter.lower()] = 1
    return char_count


def letter_count2(words):
    """Parse a str and build a dict counting the total number
    of times each character is found in the str
    This function ONLY counts alphabetical chars
    Args:
        words (str): a string of characters
    Returns:
        dict: a dict of str:int
    """
    import string
    char_count = {}
    for char in string.ascii_lowercase:
        char_count[char] = 0
    for char in words:
        if char.isalpha():
            char_count[char.lower()] += 1
    return char_count


def learners():
    counter = 1
    learner_dict = {}
    while True:
        learner = input("Enter the name of the learner (Q to Quit): ")
        if learner.upper() == "Q":
            break
        learner_dict[counter] = learner
        counter += 1
    return learner_dict


if __name__ == "__main__":
    print("\t---Simple DocTests---")
    doctest.testmod(verbose=True)

    print("\n\t---Assertion Tests---")
    x = dict_gen(['Ten', 'Twenty', 'Thirty', 'ExtraExtra'], [10, 20, 30])
    x = dict_merge(22, "Fred")
