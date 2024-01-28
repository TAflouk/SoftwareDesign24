# @Author:srattigan
# @Date:2021-01-07 11:12:16
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-07 12:11:16


class Fraction:
    """Simulates a Fraction class
    """
    def __init__(self, frac):
        """Constructor for Fraction class
        Args:
            frac (str): str rep of a fraction
        """
        fracrep = frac.split('/')
        try:
            self.numerator = int(fracrep[0])
            self.denominator = int(fracrep[1])
        except TypeError:
            raise TypeError("Must use valid format of fraction")

    def __repr__(self):
        return f"{self.numerator}/{self.denominator}"

    def __float__(self):  # 1/2
        return self.numerator / self.denominator
        
    def __invert__(self):  # ~
        temp = f"{self.denominator}/{self.numerator}"
        return Fraction(temp)

    def gcd(self):
        pass
    
    def reduce(self):
        common = gcd(self.numerator, self.denominator)
        self.numerator /= common
        self.denominator /= common

    def __add__(self, other):
        """Overload the "+" operator for use with Fractions
        Args:
            other (Fraction): Another instance of Fraction
        """
        bottom = self.denominator * other.denominator
        top = self.numerator * other.denominator + other.numerator * self.denominator
        rep = f"{top}/{bottom}"
        return Fraction(rep)
    

    def __sub__(self, other):
        """Overload the "+" operator for use with Fractions
        Args:
            other (Fraction): Another instance of Fraction
        """
        bottom = self.denominator * other.denominator
        top = self.numerator * other.denominator - other.numerator * self.denominator
        rep = f"{top}/{bottom}"
        return Fraction(rep)
    
    
    def __mul__(self, other):
        top = self.denominator * other.denominator
        bottom = self.numerator * self.numerator
        rep = f"{top} / {bottom}"
        return Fraction(rep)


    def __truediv__(self, other):
        second = ~other
        return self * second

x = Fraction('25/79')
y = Fraction('33/117')
#print(y - x)
# f1 = Fraction(1, 2)  # for 1/2
# f2 = Fraction('1/2')  # for 1/2
# f1 = Fraction('1/4')
# f3 = f1 + f2  # 6/8
# print(f3)
# f4 = f2 - f1  # 2/8
# print(f4)
# print(float(f2))
# print(f1.__float__())
# print(~f3)

NUM_BALLS = 26
def gen_drum(num=NUM_BALLS):
    """create a list and split that to two lists

    Args:
        num (int, optional): a global variable with default value 5. Defaults to NUM_BALLS.

    Returns:
        list : new lists
    """
    # Create a new list and divid the len to 2 halfs and add them together 

    main_list = list(string.ascii_uppercase)
    divided_len_list = len(main_list) // 2
    first_half_list = main_list[divided_len_list:]
    second_half_list = main_list[0:divided_len_list]
    added_list = first_half_list + second_half_list 
    return added_list