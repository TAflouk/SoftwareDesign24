#------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Name:    areas_app.py
# purpose: Calculate areas
# author: srattigan
# Created: 10/10/2019
#Revision: 1.00
#----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



# -- IMPORT --
import reusables # all the handy stuff
import os        # to clear the screen

# --GLOBALS/CONSTANTS --
option = ["Area Square",
		"Area Circle",
		"Area Triangle",
		"Area Ellipse"]


# -- FUNCTION/CLASSES --
def cls():
	if os.name=='nt':  #checks for windows
		os.system('cls')
	else:
		 os.system('clear')  # for linux or mac   
		 
def main():
	"""
	The main code for this module 
	"""
	cls()
	reusables.tittle_gen("Area calculation app")
	choice = reusables.menu_gen(option)
	if choice == 0:
		print(areas.square_helper())
	elif choice == 1:
		print(areas.circle_helper())
	elif choice == 2:
		print(areas.triangle_helper())
	elif choice == 3:
		print(areas.ellipse_helper())
	else:
		print("Not implemented yet")

# --MAIN BODY --
if __name__ == '__name__':
	while True :
		main()
		go_again = input("znEnter Q to quit or any other key to continue: ")
			break
		
  		 
		