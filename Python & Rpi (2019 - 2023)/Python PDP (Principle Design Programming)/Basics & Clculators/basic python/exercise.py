#guess a num game 
import random
num = random.randint(1,100)


print("hey i am thinking of a random num between 1-100")
counter = 10
repeat = 1

while repeat <= counter:
    print("--Attempt "+str(repeat))
    guess = input("guess what number i am thinking of: ")
    guess = int(guess)
    repeat+=1

    if num > guess:
        print("too low!")   
    elif num < guess:
        print("too high!")
    elif guess == num:
        print("you win..!")
        break         
print("\nAw, you ran out of tries. the number was  " +str(num))
