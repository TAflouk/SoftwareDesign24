class student:
    def __init__(self, name, age, grade):
        self.name = name 
        self.age = age
        self.grade = grade

    def get_grade(self):
        return self.grade

class Course:
    def __init__(self, name , max_students):
        self.name = name
        self.max_students = max_students
        self.students = []
    
    def add_student(self, studen):
        if len(self.students) < self.max_students:
            self.students.append(student)
            return True
        return False

    def get_average_grade(self):
        pass

#s1 = student("taha", 19, 12)
#s2 = student("kamal", 66, 33)
#s3 = student("talal", 34, 33)

#course = Course("Science",2)
#course.add_student(s1)
#course.add_student(s2)

for i in range():
    i+=1
    print(i)


#print(course.students[0].name)

