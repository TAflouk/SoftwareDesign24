# generate simple shapes such as square and rectangle
# using text characters, in this case '#'

def gen_square(side: int):
    """Generates and returns a block of characters
    that look like a square

    Args:
        side (int): number of blocks wide and high

    Returns:
        [str]: the generated block of chars
    """
    sym = '# '
    counter = 1
    block = ''
    while counter <= side:
        block = block + (side * sym) + "\n"
        counter += 1
    return block[:-1]


blk = gen_square(2)
print(blk)
# # 
# #

def gen_rect(width, height):
    """Generates and returns a block like a rectangle
    where the width is 'width' blocks wide
    and the height is 'height' blocks high

    Args:
        width (int): the width of the rectangle
        height (int): the height of the rectangle
    """
    pass
