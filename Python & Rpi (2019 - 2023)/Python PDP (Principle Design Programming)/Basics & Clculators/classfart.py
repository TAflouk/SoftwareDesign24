
#fart class but i have missed somthing in the spectral method    the rgb 
class Fart:
    def __init__(self,duration,pungency):
        self.duration = duration
        self.pungency = pungency
        self.color = (255,0,100)
        #self.r = (255,0,0)
        #self.g = (0, 255, 0)
        #self.b = (0, 0 ,255)

# NOTE: effect(): METHOD TO --> (calculated as duration x pungency x 100)

    def effect(self):
        return self.duration*self.pungency*100

# NOTE: set_color(): METHOD --> TO SET COLOR 

    def set_color(self,color):
        self.color = color
        

# NOTE: get color():  METHOD -->  TO GET THE COLOR  we dont need this one but just for the crak 

    def get_color(self):
        return self.color

# NOTE:spectral_effect():   METHOD TO CALCULATE --> (r * pungency + g * pungency + b * pungency) i did not get this method correctly  rgb !!!?

    def spectral(self):
        return self.pungency * self.color[0] + self.color[1] * self.pungency + self.color[2] * self.pungency

# NOTE: __str__():   METHOD -->  to print the duration and the pungency

    def __str__(self):
        return f"the nstantiate a fart  with duration of {self.duration} and the pugency of fart {self.pungency}"

# test code to print the 

f1 = Fart(3,0.478)
print(f1)
print(f1.effect())
#print(f1.get_color())
print(f1.spectral())