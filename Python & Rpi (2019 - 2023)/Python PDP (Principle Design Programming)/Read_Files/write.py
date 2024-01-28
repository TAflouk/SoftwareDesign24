# @Author:srattigan
# @Date:2021-01-11 13:05:03
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-11 17:58:56

import json


SCOREFILE = 'scores.json'

mdict = {999: ["Mary"],
         777: ["Peter", "Paul"],
         555: ["Fred"],
         434: ["Ted", "Fred", "Zed"],
         212: ["Ger"]
         }



def dict_to_file(d,f):
    with open(d, "w") as outfile:
        json.dump(f ,outfile)       
    new_scores = {} 
    for k in outfile:
        new_scores[int(k)] = mdict[k]
    return new_scores

dict_to_file('stuff.txt', mdict)




def dict_file(f):
    pass




#print(dict_file(SCOREFILE))


# convert the following code into functions:
#  - one to open a file and convert contents to dict with int keys
#    - takes one arg- a file
#  - one to write a dict to a file
#    - takes 2 args- a dict and a file (destination)



# write to file
with open(SCOREFILE, 'w') as outfile:
    json.dump(mdict, outfile)

# now read it back again
with open(SCOREFILE) as json_file:
    data = json.load(json_file)
    
#print(type(data))  # already a dict
#print(data)  # note keys are str


    
#print(new_scores)  # keys are ints in this one!
#new_scores[22] = ["Kim", "Lo"]

# write to file
#with open(SCOREFILE, 'w') as outfile:
#    json.dump(new_scores, outfile)