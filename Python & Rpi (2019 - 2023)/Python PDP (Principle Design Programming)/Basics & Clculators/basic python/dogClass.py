class Dog:

    def __init__(self):
        pass


    def add_on(self,x):
        return x + 1

    def bark(self):
        print("bark")

d = Dog() # we take aa object from the main class then we call the method 
d.bark() # this to call the bark method 


print(d.add_on(5))  # this is to print the value of the add_on method
