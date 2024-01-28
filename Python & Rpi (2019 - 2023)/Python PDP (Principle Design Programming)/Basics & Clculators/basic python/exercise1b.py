


print("\tClassic Foobar")
#FooBar 
num = input("\tEnter a number to count to:")
num = int(num)

count = 1
#count = str(count)

while num >= count:
        
    if count % 5 ==0 and count % 3 == 0:
        print(str(count) +" FooBar")
    elif count % 5 == 0:
        print(str(count) +" Foo")
    elif count % 3 == 0:
        print(str(count) +" Bar")
    else:
        print(count)
    count+=1
        