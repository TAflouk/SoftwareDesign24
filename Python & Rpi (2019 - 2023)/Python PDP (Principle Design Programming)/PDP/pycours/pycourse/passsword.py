# what we need to check
password ="nour"
word=""
count =0
limit=3
out = False

#while loop to count the limit of the trying  with Booleang 
while word!=password and not (out):
    if count<limit:
        word=input("entert the password:")
        count+=1
    else:
        out=True
# here we print out of try if the pass was wrong more than the limit
if out:
   print("out of try")
# to print correct if it is right word
else:
  print("correct")
  
  
       

        
    
    