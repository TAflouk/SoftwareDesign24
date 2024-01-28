# ------------------------------------------------------------------------------
# Name:        reusables.py
# Purpose:     Store of useful re-usable code
# Author:      srattigan
# Created:     27/09/2019
# Revision:    1.00
# ------------------------------------------------------------------------------

# -- IMPORTS --


# -- GLOBALS/CONSTANTS --


# -- FUNCTIONS/CLASSES --

def get_int(prompt="Enter number: "):
	'''
	(str) -> int
	Prompts for a number and returns a valid int.
	Code will loop until a valid int is entered by the user.
	This function takes an optional str argument as a prompt.
	'''
	while True:
		num = input(prompt)  # use a try/except here
		try:
			num = int(num)
			return num
		except:
			print("Invalid number! Please try again")


def get_float(prompt="Enter number: "):
	'''
	(str) -> float
	Prompts for a number and returns a valid float
	Code will loop until a valid num is entered by the user.
	This function takes an optional str argument as a prompt.
	'''
	while True:
		num = input(prompt)  # use a try/except here
		try:
			num = float(num)
			return num
		except:
			print("Invalid number")			


def title_gen(title):
	'''
	(str) -> None
	Generates a title for a program centering it with decor
	'''
	spaces = (80 - len(title)) // 2
	print("*" * 80)
	print(" " * spaces + title)
	print("*" * 80)
	print()
	
	
def menu_gen(menu_items, prompt="Enter Selection"):
	"""
	(list of str, str) -> int
	Takes a list of menu items and returns the index
	of the chosen item. Takes an optional prompt.
	"""
	counter = 1
	for item in menu_items:
		print(f"\t{counter}: {item}")
		counter += 1
	sel = get_int(f"{prompt}: ")
	return sel - 1

def main():
	"""
	The main code for this module
	"""
	all_options = ["Option A", "Option B", "Option C"]
	opt = menu_gen(all_options)
	print(all_options[opt])


# -- MAIN BODY --

if __name__ == '__main__':
	# print("I am in the reusables file")
	main()
