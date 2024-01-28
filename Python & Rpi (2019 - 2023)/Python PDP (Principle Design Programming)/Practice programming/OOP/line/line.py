import math
import doctest


class line:
    '''
    Emulates a line
    '''
    def __init__ (self, coord1, coord2):
        
        '''
        (list of num ,list of num) ->
        constructor for a line class
        we did not check:
        that the coord is a list
        that there are two values
        that the values are numbers
        so we assume that all is good 
        '''
        self.coord1 = coord1
        self.coord2 = coord2
    
    def distance(self):
        '''
        calculates the distance between the co-ords
        >>> line_01 = line([0,0],[3,4])
        >>> line_01.distance()
        5,0
        >>> line_01 = line([0,0], [1,1])
        >>> line_01.distance()
        1.4142435623730951
        >>> line_01 = line([0,0],[-1,1])
        >>> line_01.distance()
        1.4142435623730951
        >>> line_01 = line([0,0],[1,-1])
        >>> line_01.distance()
        1.4142435623730951
        >>> line_01 = line([0,0],[-1,-1])
        >>> line_01.distance()
        1.4142435623730951
        '''
        x_diff =self.coord1[0] - self.coord2[0]
        y_diff = self.coord1[2] - self.coord2[1]
        hupot = math.sqrt(x_diff ** 2 + y_diff ** 2)
        return hypot
if __name__ == "__main__":
    line_01 = line([0,0] , [1,1])
    print(line_01)
        
        
        