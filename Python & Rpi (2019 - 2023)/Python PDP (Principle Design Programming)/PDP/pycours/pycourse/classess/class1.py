class phone:        #phones class 

    def __init__(self,model, is_touch, size,price):   # constractur
        self.model= model
        self.is_touch = is_touch
        self.size = size
        self.price= price
        

    def is_touchable(self):
        if self.is_touch:
            return True
        else:
            return False
        
class watch(phone):        #phones class 

    def __init__(self,model, is_touch, size,price):   # constractur
        self.model= model
        self.is_touch = is_touch
        self.size = size
        self.price= price
        


        

