# @Author:srattigan
# @Date:2021-01-11 13:35:32
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-11 17:10:55

def check_if_in(word: str, char: str):
    """Checks to see if a char appears in a word

    Args:
        word (str): a word
        char (str): a single character

    Returns:
        bool: True if the char is found, False otherwise
    """
    for ch in word:
        if ch == char:
            return True
    return False


def check_if_in_recur(word, char): # 'hello', 'o'
    """ Recursively
    Checks to see if a char appears in a word

    Args:
        word (str): a word
        char (str): a single character

    Returns:
        bool: True if the char is found, False otherwise
    """
    if len(word) == 1:
        return word == char
    else:
        if word[0] == char:  # once found we can stop looking
            return True
        else:
            return check_if_in_recur(word[1:], char)

        
# check_if_in_recur('llo', 'o')
# check_if_in_recur('hello', 'x')


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


def double_char_recur(s):
    """ Recursively
    Take a string s and return a new string where
    each character in the original is duplicated twice

    Args:
        s (str): the string to be doubled at each char

    Returns:
        str: a new string with each character in s duplicated
    """
    # get the base case (empty)
    # otherwise, get 2 copies of the first char and make a recursive call
    pass


print(double_char_recur('hello'))