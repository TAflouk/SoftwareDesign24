# emty dictionary

my_dict ={}

# dictionary withh integer keys
my_dict ={1: 'apple' , 2: 'ball'}

#dictionary with mixed keys
my_dict = {'name': 'Jhon', 'favicon': 'mouse.ico' , 1:[2,4,3]}
#print(my_dic['name'])
my_dict["student"] = 6418548
# using dic()
# my_dic = dict ({1:'apple',2:'ball'})
for entry in my_dict:
        print(entry , my_dict[entry])
        
my_dict["not so bad student"] = "patryk"

for entry in my_dict:
    print(entry , my_dict[entry])
        
# write code to check if a key is in a dict or not- print "Found" or "not found"
term= "Mary" #will be found easily if the term is a key
if term in my_dict:
        print("found" , term)
else:
        print("not found : ", term)
        
        
#if term is a value, must iterate through entire dict

print("\nLooking for a value rather than a key")
for key in my_dict:
    if my_dict[key] == term:
        print(f"found{term}")
    else:
        print("not found")
