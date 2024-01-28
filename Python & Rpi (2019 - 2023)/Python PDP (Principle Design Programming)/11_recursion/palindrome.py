# @Author:srattigan
# @Date:2021-01-10 22:17:32
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-10 22:17:32

# there are many ways to write such a function- here are a few

def is_palindrome0(s: str):
    """checks if a str is the same backwards as frontwards

    Args:
        s (str): [a string

    Returns:
        bool: describes if the str is a palindrome or not
    """
    return s == s[::-1]  # compare with reverse


def is_palindrome1(s: str):
    """checks if a str is the same backwards as frontwards

    Args:
        s (str): [a string

    Returns:
        bool: describes if the str is a palindrome or not

    >>> is_palindrome1('abba')
    True
    >>> is_palindrome1('abcba')
    True
    >>> is_palindrome1('abcdba')
    False
    """
    first = s[0:len(s) // 2]   #  ab
    # if len is uneven, we have to move the point at which we slice
    second = s[len(s) // 2 :]  # cba
    second = second[::-1]
    return first == second


def is_palindrome_recur(s: str):  #  a bad example
    if len(s) == 1 or len(s) == 0:
        return True
    elif len(s) == 2:
        return s[0] == s[1]
    else:
        return s[0] == s[-1] and is_palindrome_recur(s[1:-1])


def is_palindrome_recur2(s: str):  # good example
    if len(s) == 0:
        return True
    elif s[0] != s[-1]:  # if mismatch, quit as it is not palin
        return False
    else:  # otherwise continue heding towards the center of the str
        return is_palindrome_recur2(s[1:-1])
