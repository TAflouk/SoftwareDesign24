w_list = [
    "ant",
    "chair",
    "cog",
    "cod"
]

def list_to_dict(array):
    """takes a list of words, and org by char

    Args:
        array (list of str): [description]
    Returns:
        [dict]: dict of char:list of str
    """
    my_dict = {}
    for word in array:
        if word[0] not in my_dict[0]:
            my_dict[word[0]] = [word]
        else:
            word.append(my_dict[word])

    return my_dict
        
new_d = list_to_dict(w_list)
print(new_d)

