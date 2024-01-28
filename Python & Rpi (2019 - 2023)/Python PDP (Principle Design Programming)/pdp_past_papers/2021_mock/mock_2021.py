
# Q1.a.i
a = [1, 2, 3]


def func1(arr):
    # c = 2 / 0
    if len(arr) > 0:
        arr.pop()


# the list will be mutated
func1(a)
print(a)

x = 3  # this value is not mutated


def func2(n):
    a = 1
    b = 2
    n = n * 2


func2(x)
print(x)
# when you pass by value, a copy of the obj is sent
# when you pass by reference, a ref to the actua object is sent

# Q2


def torus_area(big_r, small_r):
    """
    (num, num) -> num
    Calculates the area of a torus
    >>> torus_are(10.2, 2)
    805.3597191288916
    """
    import math
    return 4 * big_r * small_r * math.pi ** 2


def get_torus_details():
    """
    (None) -> None
    Helper fucntion for the torus shape
    """
    big = input("Enter the large radius: ")
    big = float(big)
    sml = input("Enter the small radius: ")
    sml = float(sml)
    area = torus_area(big, sml)
    print(f"A torus with large rad {big} and small rad {sml} has an area {area}.")

# get_torus_details()

# Q3b


def shopping():
    while True:
        cart = []
        item = input("Enter an item: ")
        if item == "":
            break
        cart.append(item)
    return cart


# Q3c
def eng_to_shinobi(eng):
    eng = eng.lower()
    shinobi = ''
    for char in eng:
        if char == 'k':
            shinobi += 'c'
        elif char in 'vwy':
            shinobi += 'b'
        elif char in 'xz':
            shinobi += 's'
        else:
            shinobi += char
    return shinobi

# s = eng_to_shinobi('Killing the zebra, Laylav wept')
# print(s)

# Q3.d


def odd_even_count(arr):
    # if len(arr) % 2 == 1:
    #     return False
    odds = 0
    evens = 0
    for num in arr:
        if num % 2 == 0:
            evens += 1
        else:
            odds += 1
    return odds == evens


# Q4b
def str_to_num(s):
    '''
    (str) -> num
    Converts to num from str
    '''
    try:
        num = float(s)
        return num
    except:
        print("Invalid")


# Q4c

cars = {
    '1234B': ["VW", "Polo", 2009],
    '4567F': ["Toyota", "Corolla", 2014],
    'F234V': ["Audi", "Royale", 2018],
    '987GH': ["VW", "Passat", 2019]
}

cars['P987K'] = ["VW", "Passat", 2019]

cars['F234V'][-1] = 2008
#print(cars)

print("\nVW Cars")
for car in cars:
    if cars[car][0] == "VW":
        print(f"Car chassis {car} has values {cars[car]}")

print("\nOlder Cars")
for car in cars:
    if cars[car][-1] < 2016:
        print(f"Car chassis {car} has values {cars[car]}")
