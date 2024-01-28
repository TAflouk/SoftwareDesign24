import dog_class

class d1(Dog):
    def __init__(self,name, age , wheight , height ):
        super().__init__(name, age , wheight , height)

#d1 = Dog("pitbull",2 ,30,40)
#print(d1)
#print(d1.dog_years())

bucket = []

for d in range(10):
    d1 = Dog (random.randrange("pitbull", 12 ,33 ,34))
    bucket.append(d1)
for d in bucket:
    print(f"\n{d1}")
    print(f"age is {d.dog_years()}")
    print(f"height in inches is{d.height_inches}")
    print(f"wheight in pounds is {d.weight_in_lbs}")


