class animal(object):
    def __init__(self,name):
        self.name = name
        
    def eat(self ,food):
        print("{} is eating {}".format(self.name,food))
        
class dog(animal):
    def fetch(self ,thing):
        print("{} fetched{}".format(self,name,thing))
        
class cat(animal):
    def cat_eat(self,eat):
        print("{}  eats  {}".format(self.name, eat))

s= animal("fdf")
s.eat("shit")


k=cat("sse")
k.cat_eat("shit")