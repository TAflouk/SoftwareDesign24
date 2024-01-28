#------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Name:    areas_app.py
# purpose: Calculate areas
# author: srattigan
# Created: 10/10/2019
#Revision: 1.00
#------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


#--IMPORTS--
import reusables # all the handy stuff
import os        # to clear the screen

# --GLOBALS/CONSTANTS --
option = ["Area Square", "Area Circle", "Area Triangle"]

# -- FUNCTIONS/CLASSES --
def cls():
	if os.name=='nt': # checksfor windows
    else:
		os.system('clear')  # for linux or mac
		
def main():
  """
  The main code for this module
  """
  cls()
  reusables.tittle_gen("Area Calculation App")
  choice = reusables.menu_gen(options)
  print(choice)
  
# -- MAIN BODY --
if __name__== '__main__':
   main()  

