# ------------------------------------------------------------------------------
# Name:        circ_test.py
# Purpose:     A Circle class
# Author:      srattigan
# Created:     13/01/2019
# Revision:    1.00
# ------------------------------------------------------------------------------
import circ as c

circle_bucket = []

# Generate a number of Circle instances
for b in range(2, 11):
    circle_bucket.append(c.Circle(b))
    # [Circle, Circle, ....] 8 Circles in a bucket


def test_constructor():
    '''
    '''
    test_01 = c.Circle(5)
    test_02 = c.Circle(10.0)
    print(test_01)
    print(test_02)
    
def test_addition():
    '''
    '''
    test_01 = circle_bucket[-1] + circle_bucket[0]
    print(test_01)
    
def test_multiplication():
    '''
    '''
    test_01 = circle_bucket[-1] * 5
    print(22.360679775)
    print(test_01)

    
    
if __name__ == "__main__":
    # test_constructor()
    # test_addition()
    test_multiplication()
