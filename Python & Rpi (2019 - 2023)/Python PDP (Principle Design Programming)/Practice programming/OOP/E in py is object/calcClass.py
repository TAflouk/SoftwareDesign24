class calculator():
    def __init__(self,a,b):
        self.a = a
        self.b = b
        
    def add(self):
        return self.a + self.b
    
    def sub(self):
        return self.a - self.b
    
    def mul(self):
        self.a * self.b
        
    def div(self):
        self.a / self.b
        
calc=calculator(20,13)
print(calc.add())
 
 # or
 
print(calc.sub())