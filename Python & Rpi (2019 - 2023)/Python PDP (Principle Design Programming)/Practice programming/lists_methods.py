list1 = ["history", "maths", "phisics", "compSci"]

#  print(len(list1))     # lentght of the list
#  print(list1[3])       # <-- indexes
#  print(list1[-1])      #<--  -1 is the last index in the list 
#  print(list1[0:2])     #<--   to print the values in list from 0 index to the third indesx bout not including the last index 
#  print(list1[2:])      #<--  to print the value in a list that give us from index to the end or opposite

# method for lists
list2 = ["business" , "education"] 


list1.append("art")           #<--  this method to append the value the end of the list 
list1.insert(0 , "gaming")    #<--  this insert finction to inser the value by choosing the index 

#   list1.insert(0 , list2)       #<--we caa also insert a list to anotheer by choosing the index 

# or we can extend a list to another list with one argument like belwo

list1.extend(list2)       #this method to extend 2 list into one and that finc takes one argument

list1.remove("business")  # this func to remove acertain value from a list 

list2.pop()       #<-- this func to delete the last value in the list 

list1.reverse()  # <-- this finc to reverse the list values  ex 1,2,3,4  ==> 4,3,2,1

list1.sort()   #,-- this finc to sort the list by alphbet like ABCDEF if this format 


list4 = ["cat","dog","parrot","elephent"]
nums = [1,2,3,4,5,6,7]

list4.sort(reverse=True) # <-- this function to sort the alphabet fom Z to A
nums.sort(reverse=True)  # <-- this fonction to sort the list from bigger num  to smaller num

sorted(list4) #<-- to sort the lst

print(min(nums))  # <-- min() finc that returns the minimum value in the list
print(max(nums))  # <-- max() finc that returns the maximum value in the list
print(sum(nums))  # <-- to return the sum of the values in the list 

print("art" in list4) # to check is a value inside in the list 
#print(list4) 
#print(list1)

new_l = ["taha", "kamel" , "peter","ann"]

for i in new_l: # <-- this loop to iterate each value in the list and print the value 
    print(i)