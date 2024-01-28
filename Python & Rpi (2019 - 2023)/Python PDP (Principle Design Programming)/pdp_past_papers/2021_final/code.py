# Q2 c

# i), ii)

def to_milli(inches):
    '''
    (num) -> num
    Converts inches to mm
    >>> to_milli(1)
    25.4
    '''
    if not isinstance(inches, (int, float)):
        raise TypeError("Must be a number")
    if inches < 0:
        raise ValueError("Cannot be a negative number")
    return inches * 25.4  # millimeters

def to_milli_helper():
    '''
    (None) -> None
    Gets user input and displayss calcs
    '''
    val = input("Enter the value in inches: ")
    val = float(val)
    mm = to_milli(val)
    print(f"{val} inches is equal to {mm} millimeters")
    
# to_milli_helper()
    
    
# Q3 b

def num_collector():
    num_list = []
    while True:
        num = input("Enter a number: ")
        if num.lower() == 'q':
            return num_list
        try:
            num = float(num)
            num_list.append(num)
        except:
            print("Not a number")


def sacred_letters(word):
    counter = 0
    sacred_letters = 'abcdpqs'
    for ch in word:
        if ch in sacred_letters:
            counter += 1
    return counter

def can_make_11(numlist):
    for idx in range(len(numlist)-1):
        if numlist[idx] + numlist[idx + 1] == 11:
            return True
    return False

# x = can_make_11([5, 5, 6, 9, 22])
# print(x)

# Q4 b

def parking_fee(hours):
    if hours <= 2:
        fee = 3.5
    else:
        fee = 3.5 + (0.5 * hours)
    if fee > 10:
        fee = 10
    print(f"The fee is {fee}")
    

# Q4 c
books = {'1234B': ['Bugging', 'C Sheen', 2009],
         '4567F': ['Toys', 'M Smyth', 2014 ],
         'F234V': ['Antics', 'R. Anzo', 2018],
         '987GH': ['Victory', 'P Assat', 2019 ]
         }
    
books['P987K'] = ['Taytok', 'B Ekor', 2012]  # add new key val pair

books['F234V'][-1] = 2008  # change last val in list by accessing via key

print("Books starting with T")
for b in books:
    if books[b][0][0].upper() == 'T':
        print(books[b])
#print(books)
print("\nAuthors of Books printed after 2010")

for b in books:
    if books[b][-1] > 2010:
        print(books[b][1])
