


def ord_print(s):
    """
    Process a str to print the ordinal values of each char
    Args:
        s (str): any string with any characters
    >>> ord_print('a')
    97
    >>> ord_print("hello")
    104
    101
    108
    108
    111
    """
    # iterate through the string
    # for each char you land on
    # print the ordinal value
    for ch in s:
        print(ord(ch))

print(ord_print("taha"))


            