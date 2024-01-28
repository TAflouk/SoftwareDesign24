from random import randint

iNewNumber = 0
iLottery=[]
iMyNumbers = []
iRrightNumbers = 0


while(len(iLottery) < 5):
    iNewNumber = randint(1,50)
    if (iNewNumber not in iLottery):
        iLottery.append(iNewNumber)
    

while(len(iMyNumbers) < 5):
    iNewNumber = input("please write number between 1-50:")
    if(iNewNumber not in iMyNumbers and (iNewNumber <= 50 or iNewNumber > 0)):
        iLottery.appened(iNewNumber)
    

for number in iLottery:
    for myNumber in iMyNumbers:
        if(number == myNumber):
            iRightNumbers +=1

print ("you have " + str(iRightNumber) + "right numbers!")
print ("the lottery numbers were:")
print (iLottery)
