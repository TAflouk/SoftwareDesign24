# class person
class person:
    def __init__(self,full_name:str,gender:str,age:float,height:float,weight:float):
        """Emulate a person
        """
        self.full_name = full_name
        self.gender = gender
        self.age = age
        self.height = height
        self.weight = weight


#Note:a function that return ==> the male and female expentacy
    def life_expetancy(self):
        return f"the life expentancy in Ireland for Male is 79.9 and for Female is 83.4"

#Note: a function that calculate the BMI and it returns a float data type 
    def bmi(self):
        return self.weight/self.height**2

    def cat_if(self):

        if 19<self.weight<24:
            return f"19-24,9"
        elif 25<self.weight<29:
            return f"25-29,9" 
        elif 30 < self.weight<34:
            return f"30-34,9"
        else:
            if 35 < self.weight < 39:
                return f"35-39, 9"






#Note:a func to return the str 
    def bmi_catagory(self):
        return f"a person who{self.full_name} and {self.gender} and {self.age} years old and {self.height} Cm and {self.weight} Km "




#Note:helper function
    def get_helper(n,g,a,h,w):
        n = input("Enter name: ")
        n = str(n)
        g =  input("enter gender: ")
        g = str(g)
        a = input("enter age: ")
        a = float(a)
        h = input("enter height: ")
        h = float(h)
        w = input("enter weight: ")
        w = float(w)
        p = (n,g,a,h,w)
        return p

    def make_people(num_people):
        pass
        
    def main():
        people = []

        # until input not y
        # call person_helper
        # add each person to the people list
        #ask quit?
        # use a for loop to print each person in the people list

if __name__ == "__main__":
    main()


#person1 =person("fred","M",33,175,75)
#print(person1)
#print(person1.bmi_catagory())
#print(person1.cat_if())