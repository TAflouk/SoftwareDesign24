# @Author:srattigan
# @Date:2021-02-03 11:48:27
# @LastModifiedBy:srattigan
# @Last Modified time:2021-02-03 12:10:16

# Pass strs and funcs as args

def shout(txt):
    """changes the arg to all uppercase and returns

    Args:
        txt (str): any string

    Returns:
        [str]: a uppercased str
    """
    return txt.upper()

def whisper(txt):
    """changes the arg to all lowercase and returns

    Args:
        txt (str): any string

    Returns:
        [str]: a lowercased str
    """
    return txt.lower()

def reverse_it(txt):
    """Takes a str and reverses it char by char (using a loop)

    Args:
        txt (str): any str
    Returns:
        [str]: a reversed str
    """
    new_str = ''
    str_len = len(txt)             # 5
    start_idx = str_len -1         # 4 for 'Hello'
    for counter in range(str_len): # [0, 1, 2, 3, 4]
        new_str += txt[start_idx - counter]
    return new_str

    

def process_text(txt, func):
    """Takes a str and processes it with the func supplied

    Args:
        txt (str): any str
        func (function): a text processor
    """
    new_text = func(txt)
    print(new_text)


def print_info(f):
    print(f.__name__)
    print(f.__doc__)


if __name__ == "__main__":
    process_text("Hello", reverse_it)
    # print_info(shout)
    # print_info(reverse_it)
