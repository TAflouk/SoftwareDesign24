
#class for student to get the name and the makrs and see the avareg
class student():
    def __init__(self,name):
        self.name = name
        self.marks = []
        print("welcom {} in our school".format(name))
        
        
#this  method to append the marks to the list     
    def addmarks(self,mark):
        self.marks.append(mark)
        
        
# this method to get the avg of the marks
    def getavg(self):
        return sum(self.marks)/len(self.marks)
        
# take obj from the class and give it parameter
s = student("taha")

s.addmarks(1)
s.addmarks(20)
s.addmarks(30)
s.addmarks(40)
print(s.marks)

print(s.getavg())
