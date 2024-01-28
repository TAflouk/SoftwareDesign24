# These functions include some from Strings-2 on CondingBat


def double_char1(s):  # do NOT use a ref like str for a variable!
    """Take a string s and return a new string where
    each character in the original is duplicated twice

    Args:
        s (str): the string to be doubled at each char

    Returns:
        str: a new string with each character duplicated
    """
    new_str = ''  # build the new string onto this
    counter = 0   # start at index 0
    limit = len(s)  # finish at index len - 1

    while counter < limit:  # up to the last char
        new_str += s[counter] * 2  # add two of each char to the new str
        counter += 1  # increment the counter to move to next index
    return new_str


def double_char2(s):  # do NOT use a ref like str for a variable!
    """Take a string s and return a new string where
    each character in the original is duplicated twice

    Args:
        s (str): the string to be doubled at each char

    Returns:
        str: a new string with each character in s duplicated
    """
    new_str = ''  # build the new string onto this
    for char in s:
        new_str += char * 2  # add two of each char to the new str
    return new_str


if __name__ == "__main__":  # comment out any lines below you don't want to run
    t1 = double_char1('Hi-There')  # → 'HHii--TThheerree'
    print(t1)
    t2 = double_char2('Hi-There')  # → 'HHii--TThheerree'
    print(t2)
