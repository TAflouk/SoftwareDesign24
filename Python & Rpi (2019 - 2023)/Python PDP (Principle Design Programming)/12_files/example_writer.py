# @Author:srattigan
# @Date:2021-01-11 13:05:03
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-11 17:58:56

import json

SCOREFILE = 'scores.json'

mdict = {999: ["Nathan"],
         777: ["Peter", "Paul"],
         555: ["Fred"],
         434: ["Ted", "Fred", "Zed"],
         212: ["Ger"]
         }


def dict_to_file(d, f):
    """
    (dict of int: list of str, file) -> None
    Write a dict to a file in JSON format
    """
    pass


def file_to_dict(file):
    """
    (file) -> dict of int: list of str
    Parse a JSON file to a dict of type
    int: list of str
    """
    pass


dict_to_file(mdict, "scores.json")
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
new_scores = {}
for k in data:
    new_scores[int(k)] = data[k]

print(new_scores)  # keys are ints in this one!
new_scores[22] = ["Kim", "Lo"]

# write to file
with open(SCOREFILE, 'w') as outfile:
    json.dump(new_scores, outfile)
    print("File written")
