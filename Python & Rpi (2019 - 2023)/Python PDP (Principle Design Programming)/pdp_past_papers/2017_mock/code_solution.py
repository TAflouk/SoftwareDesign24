# 2017 paper

# Q2 c

def to_kelvin(deg_f):
    '''
    (num) -> num
    Converts degrees Fahrenheit to degree Kelvin
    >>> to_kelvin(212.0)
    373.15
    '''
    return (deg_f + 459.67) * (5 / 9)

# print(to_kelvin(212.0))


def kelvin_helper():
    '''
    (None) -> None
    Simple helper to get user input and show info
    '''
    deg_f = input("Enter the temperature in degrees Fahrenheit: ")
    deg_f = float(deg_f)
    deg_k = to_kelvin(deg_f)
    print(f"{deg_f} degrees Fahrenheit is equal to {deg_k} Kelvin.")
    

# Q3b

def make_shop_list():
    shopping = []
    while True:
        item = input("Enter an item: ")
        if item == "":
            break
        shopping.append(item)
    return shopping

# Q3c
def text_processor(s):
    non_native = 'jkqvwxyz'
    for char in s:
        if char.lower() in non_native:
            print(f"{char} is not Gaelic")
        elif char.isnumeric():
            print(f"{char} is standard")
        else:
            print(f"{char} is valid native Irish")

print(text_processor("Jimi34 went to the Park to see the Zebra!"))

# Q3d
def num_chk(numlist):
    result = []
    for num in numlist:
        if num % 3 == 0 and num % 5 == 0:
            result.append(True)
        else:
            result.append(False)
    return result

def num_chk(numlist):
    result = []
    for num in numlist:
        result.append(num % 3 == 0 and num % 5 == 0)
    return result

# Q4 b, c
def str_to_num(s):
    try:
        return float(s)
    except:
        print("Invalid")
        

student_scores = {
    "Harry Potter": [88, 94, 62.5, 79, 87, 98],
    "Peter Baelish": [92, 91, 88.5, 89, 90.2, 91],
    "Enda Kenny": [22, 30, 14, 8, 11, 17.2],
    "Penny Hofstadter": [65.5, 72, 84, 76, 69, 81]
    }

student_scores["Rachel Riley"] = [98, 94.7, 100, 99, 99, 97]

print(student_scores)

del student_scores["Harry Potter"]

print(student_scores)

for student in student_scores:
    print(student, sum(student_scores[student]))