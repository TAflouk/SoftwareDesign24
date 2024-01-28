# Q2c

def miles_to_km(miles):
    '''
	(num)->num
	Converts miles to kilometers
	>>> miles_to_km(40)
	64.0
	'''
	km = miles * 8 / 5
	return km


def miles_km_helper():
   '''
   (None)->None
   Gets user input and prints out the miles and km values
   '''
   miles = input('Enter the distance in Miles: ')
   miles = float(miles)
   km = miles_to_km(miles)
   print(f"\n{miles} miles is equal to {km} kilometers")
   
   
# Q3b
def to_do():
    '''
	(None)->list of str
	'''
    my_list = []
	while True:
	    task = input("Enter a task: ")
		if len(task) == 0:
		    break
	    my_list.append(task)
	return my_list


# Q3c
def list_processor(words):
    '''
	(list of str)->int
	Processes a list of strings
	>>> list_processor(['Car', 'Dinner', 'Study', 'Read'])
	18
	'''
	total = 0
	for word in words:
	    num_chars = len(char)
		total += num_chars
		if num_chars % 2 == 0:
		    odd_or_even = "even"
		else:
		    odd_or_even = "odd"
	    print(f"{word} has {num_chars}: {odd_or_even}")
	return total


# Q3d
my_tasks = todo()
count = list_processor(my_tasks)
print(count)
# print(list_processor(to_do()))  # 1 liner


# Q4b

import random

def lotto_picker():
    '''
	(None)->list of int
	Generates a list of unique numbers
	'''
    tube = []
	# user input
	max_ball = input("Enter highest ball num: ")
	max_ball = int(max_ball)
	
	num_nums = input("Enter how many numbers you want: ")
	num_nums = int(num_nums)
	while len(tube) < num_nums:
	    new_ball = random.randrange(num_nums+1)
		if new_ball not in tube:
		    tube.append(new_ball)
	return tube


# Q4c
def get_num(prompt="Enter Number: "):
    '''
	'''
	while True:
	    num = input(prompt)
		try:
		    num = int(num)
			return num
		except:
		    print("Please enter a valid number")

	
def lotto_picker_plus():
    '''
	(None)->list of int
	Generates a list of unique numbers
	'''
    tube = []
	# user input
	max_ball = get_num("Enter highest ball num: ")
	num_nums = get_num("Enter how many numbers you want: ")
	while len(tube) < num_nums:
	    new_ball = random.randrange(num_nums+1)
		if new_ball not in tube:
		    tube.append(new_ball)
	return tube

# Q4d
users = {'bkelly': ['dog@fish', 32, False],
         'pbaelish': ['smallfinger', 46, True],
		 'ekenny': ['snake', 92, False],
		 'gbyrne': ['latelate', 104, False]
}

users['rriley'] = ['jimmycarr', 26, True]

users['gbyrne'][1] = 94

for user in users:
    print(user, users[user])

