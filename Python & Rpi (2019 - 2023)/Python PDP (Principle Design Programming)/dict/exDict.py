#Write a function gen_sqrs(n) that takes a number n and then generates a dict of numbers from 1 to that number as keys, and the values for each will be the square of the key. 

#>>> gen_sqrs(3) 

#{1: 1, 2: 4, 3: 9} 
def gen_sqrs(n):
    square = {}
    for i in range(1,n+1):
        square[i]= i**2
    return square 

def gen_cube(n):
    cubic = {}
    for i in range(1,n+1):
        cubic[i]= i**3
    return cubic

#print(gen_cube(3))
#print(gen_sqrs(3))


def gen_exps(number,expon):
    a_dictionary = {}
    for i in range(1,number+1):
        a_dictionary[i] = i **expon
    return a_dictionary
#print(gen_exps(4,2))

def dict_gen(str_list, num_list):
    """Creates a dict given two lists
    Precondition: Assumes lists are of equal length
    Args:
        str_list (list of str): strs
        num_list (list of num): num
    Returns:
        dict: dict of str: num
    >>> dict_gen(['Ten', 'Twenty', 'Thirty'], [10, 20, 30])
    {'Ten': 10, 'Twenty': 20, 'Thirty': 30}
    """
    assert len(str_list) == len(num_list), "Lists must be same length"
    new_dict = {}  # makes empty dict
    for idx in range(len(str_list)):
        new_dict[str_list[idx]] = num_list[idx]
    return new_dict

word = 'brontosaurus'
d = dict()
for c in word:
    d[c] = d.get(c,0) + 1
#print(d)


def count_success(x):
    count = 0 
    for i in x:
        if i["success"]:
            count+=1
    return count
print(count_success([{'id': 1, 'success': True, 'name': 'Lary'}, {'id': 2, 'success': False, 'name': 'Rabi'}, {'id': 3, 'success': True, 'name': 'Alex'}]))