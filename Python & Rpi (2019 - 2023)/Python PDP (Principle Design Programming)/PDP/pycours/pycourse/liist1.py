# extend list to another list

cars =["bmw","merced","honda","suzuki","nissan","ferrari"]

speed=[50,24,666,200,150,321]



# extend to join two lists together 
cars.extend(speed)



# append to add an item to the end of the list
cars.append("toyota")




# insert is a method to insert an item somewhere u want
cars.insert(4,"bugatti")






# .remove to remove an item

cars.remove("ferrari")


# .clear to clear everything from the list and keep the list
cars.clear() 
print(cars)

#.pop() to pop the last item 
cars.pop()



# .count("honda")
z=cars.count('honda')
print(z)


# to see where it is
print(cars.index('honda'))

# tartib to sort the letter from A-Z
cars.sort()

# to print from the end to the start
cars.reverse()


cars1=cars.copy()
print(cars1)
