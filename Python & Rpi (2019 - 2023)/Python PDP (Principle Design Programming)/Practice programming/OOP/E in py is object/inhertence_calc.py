class calculator:
    def __init__(self,x,y):
        self.x = x
        self.y = y
        
    def Sum(self):
        return self.x + self.y
    
    def product(self):
        return self.x * self.y
    
class scientific(calculator):
    def Power(self):
        return self.x ,self.y
    
s=scientific(2,3)
print(s.Power())

#or

s=calculator(3,17)
print(s.product())
                            