# string exercises from Codingbat

def extra_end(s):
    """
    Given a string, return a new string made of 3 copies
    of the last 2 chars of the original string.
    The string length will be at least 2.
    extra_end('Hello') → 'lololo'
    extra_end('ab') → 'ababab'
    extra_end('Hi') → 'HiHiHi'

    Args:
        s ([type]): [description]
    Returns:
        str: three copies of the original
    """
    last_two = s[-2:]
    return last_two * 3


def first_half(s):
    """
    Given a string of even length, return the first half. 
    So the string "WooHoo" yields "Woo".

    first_half('WooHoo') → 'Woo'
    first_half('HelloThere') → 'Hello'
    first_half('abcdef') → 'abc'

    Args:
        s ([type]): [description]
    Returns:
        str: First half of str received
    """
    length = len(s)
    mid = length // 2
    return s[:mid]


def combo_string(a, b):
    """
    Given 2 strings, a and b, return a string of the form 
    short+long+short, with the shorter string on the outside 
    and the longer string on the inside. 
    The strings will not be the same length, but they may be empty (length 0).

    combo_string('Hello', 'hi') → 'hiHellohi'
    combo_string('hi', 'Hello') → 'hiHellohi'
    combo_string('aaa', 'b') → 'baaab'

    Args:
        a (str): a word or empty str
        b (str): a word or empty str
    Returns:
        str: a combination of str eceived
    """
    if len(a) < len(b):
        return a + b + a
    return b + a + b


def left2(s):
    """
    Given a string, return a "rotated left 2" version where
    the first 2 chars are moved to the end. 
    The string length will be at least 2.

    left2('Hello') → 'lloHe'
    left2('java') → 'vaja'
    left2('Hi') → 'Hi'

    Args:
        s ([type]): [description]
    Returns:
        str:
    """
    first_bit = s[:2]
    last_bit = s[2:]
    return last_bit + first_bit


if __name__ == "__main__":
    print("Hello")
