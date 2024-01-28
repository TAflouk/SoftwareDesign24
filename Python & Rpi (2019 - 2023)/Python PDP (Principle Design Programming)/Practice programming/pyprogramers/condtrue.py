# while (condition is True):
#     do stuff
def hello_func():
    x = "a"
    counter = 0
    while x !="q":
		print("hello")
		x = input("Enter somthing:  ")
		counter = counter + 1
	print("\nFinished first loop\n")
	print(f"\nThere were {counter} entries\n")

def hello_func2():
		while True:
		     print("Hello")
			 x = input("Enter something: ")
			 if x =="q":
				print("Condition was True")
				break
def countdown(val=10):
    """
	(none)->none
Counts down from 10 to 0, and then prints "Blastoff"
	"""
	
	#val = 10
	while True:
		print(val)
		val -= 1 # val = val -1
		if val == -1:
			break
	print("Blast off")
countdown(5)	

