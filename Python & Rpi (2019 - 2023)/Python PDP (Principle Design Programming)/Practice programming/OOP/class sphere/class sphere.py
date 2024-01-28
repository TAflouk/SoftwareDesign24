class Sphere:
    '''
    represents a sphere
    '''
    def __init__(self, rad):
        '''
        (num)-> sphere
        constructor for class Sphere
        '''
        self.radius = rad
        
        
    def __str__(self):
        '''
        (Sphere)->str
        '''
        
        return "test"
    
    def volume(self):
        
        v = self.rad
        v = 4/3 * 3.14 ** 3
        
        pass
if __name__ == "__main__":
    x = Sphere(10)
print(x)      