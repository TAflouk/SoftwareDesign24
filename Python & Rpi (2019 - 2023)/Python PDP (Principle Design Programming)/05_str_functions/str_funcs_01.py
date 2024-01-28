
def check_if_in(word: str, char: str):
    """Checks to see if a char appears in a word

    Args:
        word (str): a word
        char (str): a single character

    Returns:
        bool: True if the char is found, False otherwise
    """
    return char in word


print(check_if_in("Banana", "a"))  # True
print(check_if_in("Banana", "x"))  # False

# -- CODINGBAT BASIC EXERCISES (String 1) --


def make_tags_1(tag, word):
    """Generate a tag and wrap the word in that tag

    Args:
        tag (str): a html tag
        word (str): text to get wrapped in a tag

    Returns:
        str: a word wrapped in a tag
    """
    start = "<" + tag + ">"
    end = "</" + tag + ">"
    tag = start + word + end
    return tag


def make_tags_2(tag, word):
    """Generate a tag and wrap the word in that tag
    This version uses an f-string rather than
    string concatentation used in the previous version
    CodingBat does NOT support f-string!

    Args:
        tag (str): a html tag
        word (str): text to get wrapped in a tag

    Returns:
        str: a word wrapped in a tag
    """
    return f"<{tag}>{word}</{tag}>"


print(make_tags_2("p", "Big fat cat"))
