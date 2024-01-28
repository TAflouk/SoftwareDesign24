# easy list exercises from Codingbat

def common_end(a, b):
    """Given 2 arrays of ints, a and b, return True
       if they have the same first element or they have
       the same last element.
       Both arrays will be length 1 or more.
    >>> common_end([1, 2, 3], [7, 3])
    True
    >>> common_end([1, 2, 3], [7, 3, 2])
    False
    >>>common_end([1, 2, 3], [1, 3])
    True

    Args:
        a (list of int): A list with at least one int
        b (list of int): [description]A list with at least one int

    Returns:
        bool: True if the lists share the same first or last element
    """
    return a[0] == b[0] or a[-1] == b[-1]


