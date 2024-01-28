class Hobbit:
    def __init__(self,colour,age,name):
        """Constructor is the first metod that run in the program and we put the attributes in it 

        Args:
            colour ([type]): [description]
            age ([type]): [description]
            name ([type]): [description]
        """
        self.colour = (255, 100, 20)
        self.age = 99
        self.name = "Bibo"


class Triangle:
    def __init__(self,side_1,side_2,side_3):
        """[summary]

        Args:
            side_1 ([type]): [description]
            side_2 ([type]): [description]
            side_3 ([type]): [description]
        """
        try:
            side_1 = float(side_1)
            side_2 = float(side_2)
            side_3 = float(side_3)
        except:
            raise "cannot convert that "
        
        self.side_1 = side_1
        self.side_2 = side_2
        self.side_3 = side_3
        
    def __repr__(self):
        return f"{self.side_1}  {self.side_2}  {self.side_3}"

class Student:
    def __init__(self,stu_name):
        self.name = stu_name
        self.grades = {}
        
    def inventory_dict(self,key,value):
        self.key = key 
        self.value = value
    
    def show_grades(self,grades):
        for i in grades:
            print(i)

class Player:
    def __init__(self,name,lives,scores,img,y,x):
        self.scores = 0
        self.lives = 3
        self.img = "images/player.png"
        self.name = "Player_1"
        self.x = 100
        self.y = 100 
        
        
t = Triangle(2,3,4)
print(t)