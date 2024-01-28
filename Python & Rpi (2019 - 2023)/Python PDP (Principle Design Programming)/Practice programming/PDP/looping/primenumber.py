for num in range(1,20):
    for i in range(2,num):
        if num%i == 0 :
            j = num/i
            print('%d equal %d * %d' %(num , i ,j ))
            break
        else:
            print(num ,'is a prime number')