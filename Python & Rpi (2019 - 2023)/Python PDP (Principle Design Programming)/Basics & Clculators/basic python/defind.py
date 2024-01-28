def wadge_calc (hours:float , rate:float):
    if hours > 39 :
        over_t = (hours - 39) * (rate) * (1.5)
        pay = over_t + (39 *rate)
        

    else:
        pay = rate * hours
    print(f"you will get paid {pay}")

def get_2():
    rate = input("enter rate")


#fuction for title 
def title(heading,sym):
    line = sym * 30
    print(line)
    print(f"\t{heading}")
    print(line)


#fuc to drwa a hill down of "#"
def countdown(count:int):
    #count = 10
    repeat = 1
    while count >= repeat:
        print(repeat * "#")
        repeat+=1
    

#title("hilldown","#")
countdown(10)

def hill_up(num:int):
    #insert = 10
    while num>0:
        print(num*"#")
        num-=1


#hill_up(10)



def hill_up2(num:int):
        """generates a hill of '#' symbol
    args:
        height (int): height of the hill
    """

        sym = "#"
        counter = 1
        while num>=0:
            print(num*" "+ sym * counter)
            counter+=1
            num-=1
#hill_up2(10)



def gen_square(num:int):
    """generates and returns a block of characters
    that look like a square
    returns:
    [str]: the generated block of chars
    """
    sym = '#'
    counter = 1
    block = ''
    while counter<=side:
        block +(side *sym)
        print() 

blk = gen_square(2)

print(blk)