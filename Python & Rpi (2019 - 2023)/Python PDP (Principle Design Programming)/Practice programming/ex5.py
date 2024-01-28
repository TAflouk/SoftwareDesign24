# ex 5 

#import random 

#rando = random.randint(0,100)

#line = "=" * 50
#print(line)
#print()
#print(rando)

def check_scores(grade):
    while True:
        if 0 < float(grade) <=60:
            return "F"
        elif 60 < float(grade) <=70:
            return "D"
        elif 70 < float(grade) <=80:
            return "C"
        elif 80< float(grade) <= 90:
            return "B"
        elif 90 < float(grade) <= 100:
            return "A"
        #else:
            #print("Outside valid grade range!")
            #break
print(check_scores(155))
#print(check_scores(155))
def simple_grader(grade):
    assert(grade>=0 and grade <=100)
    print("Outside valid grade range!")
