
import string 

def learners():
    counter = 1
    learner_dict = {}
    while True:
        learner = input("Enter the name of the learner (Q to Quit): ")
        if learner.upper() == "Q":
            break
        learner_dict[counter] = learner
        counter += 1
    print(learner_dict)
    return learner_dict
#learners()


#name_learners = "taha" , "shhw", "ywyweyy"
#count = 0 

    
    
# Function name: letter_count

# Takes a str and returns a dict of char:count

# So each letter (case insensitive) is counted

# >>> letter_count("hello")

# {'h': 1, 'e': 1, 'l': 2, 'o': 1}

def letter_count(words):
    dict_of_letters = {}
    
    for letter in string.ascii_lowercase:
        dict_of_letters[letter] = 0
        
    for letter in words:
        if letter.isalpha():
            dict_of_letters[letter.lower()] +=1
            
    return dict_of_letters

#print(letter_count("taha aflouk"))
class Fraction:
    """Simulates a Fraction class
    """
    def __init__(self, frac):
        fracrep = frac.split('/')
        try:
            self.numerator = int(fracrep[0])
            self.denominator = int(fracrep[1])
        except TypeError:
            raise TypeError("must enter fraction")

        
    def __add__(self, other):
        bottom = self.denominator * other.denominator + other.numerator * self.denominator
        top = self.numerator * other.denominator + other.numerator * self.denominator
        rep = f"{top} / {bottom}"
        return Fraction(rep)
        
#f2 = Fraction('1/2')
#print(f2)

ss = 34 #9

n = 9
zero = 0
count = 1

for i in range(2,n+1):
    total = zero + count
    zero = count
    count = total

print(total)