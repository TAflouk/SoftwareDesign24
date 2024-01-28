#      Methods & Attributes
#
#
#  Methods :
#
# 1- is a python function that do some thing
#
# 2- a callable attribute defind in the class
#
# 3- every method is attribute but not every attribute is a method
#
#
# attribute :
#
# any object value
#
class Student:
    def __init__ (self ,name , age):
        self.name = name
        self.age = age
        self.balance = 0
        self.credit = 50
    
    def __repr__(self):
        return f"{self.name}:{self.age}"
    
    def __str__(self):
        return self.name
    
s=student()
s.name("ataha")
        
# we can change the value from the the screen by (s.)       for ex: s.credit = 100  ==> s.credit will be 100 but not inside the pr  