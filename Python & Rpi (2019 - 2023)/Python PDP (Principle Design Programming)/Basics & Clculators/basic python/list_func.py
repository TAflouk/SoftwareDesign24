import doctest


def add_list(a,b):
    """[Add two lists together and sort them]

    Args:
        a (list): list of object
        b (list): list of object
    """
    new = a+b
    new.sort()
    return new


if __name__ == "__main__":
    new.doctest.testmod(verbose=True)
