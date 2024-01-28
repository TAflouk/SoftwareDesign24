# string exercises 1-2 with decisions

def checkends(s):
    """
    This function takes in a string s and returns
    True if the first character in s is the same
    as the last character in s.
    It returns False otherwise

    Args:
        s (str): a string to be checked

    Returns:
        bool: True is first char ==  last char
    """
    return s[0] == s[-1]


def catdog(s):
    """
    Return True if the string "cat" and "dog"
    appear the same number of times in the given string
    
    cat_dog('catdog') → True
    cat_dog('catcat') → False
    cat_dog('1cat1cadodog') → True

    Args:
        s (str): str for processing

    Returns:
        bool: True if 'cat' and 'dog' appear the same
              number of times as substrings in the string
    """
    cat_count = 0
    dog_count = 0
    return cat_count == dog_count


def count_code(s):
    """
    Return the number of times that the string "code"
    appears anywhere in the given string, except we'll
    accept any letter for the 'd', so
    "cope" and "cooe" and "coxe" count.
    count_code('aaacodebbb') → 1
    count_code('codexxcode') → 2
    count_code('cozexxcope') → 2

    Args:
        s (str): a string to be processed

    Returns:
        int: the num of occurences of co*e where
             * is a wildcard
    """
    # use a while loop to iterate up to 4 chars from
    # the end of the string s.
    # Using this starting digit, check if:
    # the char we are 'on' is a 'c', and if so:
    # is the one at index "now" + 1 an 'o' and the one
    #            at index "now" + 3 an 'e'?
    pass


def end_other(a, b):
    """
    Given two strings, return True if either
    of the strings appears at the very end of
    the other string, ignoring case.

    end_other('Hiabc', 'abc') → True
    end_other('AbC', 'HiaBc') → True
    end_other('abc', 'abXabc') → True

    Args:
        a (str): a word
        b (str): a word

    Returns:
        bool: True if one str is a substring of the other
              at the end of the other str
    """
    # start with finding which str is longer
    # ignore case
    # use the hint to see how to use the endswith() method
    # that's it done!
    return


def xyz_there(s):
    """
    Return True if the given string contains an appearance
    of "xyz" where the xyz is not directly preceeded
    by a period (.). So "xxyz" counts but "x.xyz" does not.
    xyz_there('abcxyz') → True
    xyz_there('abc.xyz') → False
    xyz_there('xyz.abc') → True

    Args:
        s (str): a string for proccessing

    Returns:
        bool: an indicator as to whether the substring 'xyz'
        is there not preceded by a dot/period
    """
    # The way I approached this is:
    # If I use a while loop, how far must I travel through the str?
    # at what index relative to len do I stop?
    # while inside the chars I travel through
    # check if the char I'm on AND the next two chars (a slice)
    # are equal to xyz.
    # it may need a nested if and/or compound expression
    # to add the check after this for a dot before xyz
    # if found at any point, return True- terminating the func call
    # if you finish the while loop, and have not found a match,
    # just return False.
    pass
