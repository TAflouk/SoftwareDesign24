# DICTIONARY
# 1 accessing values
# 2 updating values
# 3 delete dict elements
# 4 delete a dictionary

d= {'1':'key','2':'value'}
# type class dict
d['1']
d['2']  # to print the value


# how to update values

d[1]='lucas' #in this case we added a new key and value to a dict


# but to update a new value to a dict we do it like this

d['1']= 'peter'  # it removes the value of key 1 and put a new value to it

#and we can delete elements from a dict or delete all the dict or even clear it for ex:


del d[1]  # to delete the key and the value


d.clear() # to clear the dict but it will keep it empty {}

del d # it deletes all the dictionary by del 