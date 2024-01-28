# generate a lot of people

from person import person
import random

# You will have to use
# random.randrange for age and weight
# random.choice for a name from the list, and a gender
# random.random to add a floating point val to weight
# for height, set the upper and lower bounds


fullnames = ["Fred Flint",
             "Mary Jones",
             "Bill Clint",
             "Bob Bullcraft",
             "Kim Karwashian",
             "Ernest Olde",
             "Eddie Socket",
             "Jim Jockstrap",
             "Annette Curtain",
             "Icy Weiner",
             "Mia Aaz"]
# make a second list for the genders. Assume there are 2 ;)
genders = ["Male","Female"]



genders = ["Male","Female"]

def make_people(num_people):
    people = []
    for idx in range(num_people):
        # set vars for each of the attributes needed to create a Person
        # using the notes above:
        # fullname
        fullname = random.choice(fullnames)
        # gender
        gender = random.choice(genders)
        # age
        age = random.randrange(20,50)
        # height
        height = random.randrange(160,205)
        # weight use randrange(int) + random(float)
        weight = random.randrange(10) + random.random()
        p = person(fullname, gender, age, height, weight)  # plug in all the values 
        people.append(p)  # fix the bug here
    return people


def main():
    num = input("Enter how many people you want to make: ")
    num = int(num)
    slaves = make_people(num)
    print(f"We have {len(slaves)} slaves")
    for s in slaves:
        print(f"\t{s}")

if __name__ == "__main__":
    main()