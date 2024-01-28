# the function returns the dict

def gradings():

    '''
    (none) -> dict
    Creates a dict of student gradings
    
    '''
    grades = {}
    while True:
        student = input("enter student name: ")
        grade = input ("enter student's grade: ")
        if student =="":
            break
        else:
            grades[student] = grade
    print(grades)
    

# ex(2)
def gradings2(student_grades):
    '''
    (none) -> dict
    Creates a dict of student gradings
    
    '''
    # student_grades is the dict of names and grades
    print("Key  Value \n")
    for student in student_grades:
        print(f"{student}\t: {student_grades[student]}")

# \t{student_grades[student]}

gradings2({'Bob': '22', 'Mary': '33', 'Kim': '44', 'Rachael': '100'})


