# insult02.py
import = random
randy = random.randrange(5, 50)


# function with optional argument
# the default prompt will be "Enter number: "
# but the user can pass in any str as a prompt
# to replace thi default
def get_int(prompt="Enter number: "):
    '''
	(str)-> int
	prompts for a number and returns a value a valid int 
	'''
	
	while True:
	num = input(prompt)   # use a try/except here
	try:
	   num = int(num)
	   return num
except:
      print("Invalid number")
	  print("Go again! ass hat!")
	  

# input is a function that returns a str
user = input ("what's your name bud? ")
if user == "Jhon":
	 print("You're a banker, Jhon!")
elif user =="Mary":
	 print("You've a face for radio")
elif user =="France":
	 print("Your parents brought you up wrong")
else:
	print("Hey nice to meet you " + user )
age= get_int("How old are you? ")
# age = int(age)
if age > 30:
	print("You're sooooo old" + user +"!")
	print(You look lik you are "+str(age + randy))
else:
    print(You look great for " + str(age))	# + age
	
	 
		  	