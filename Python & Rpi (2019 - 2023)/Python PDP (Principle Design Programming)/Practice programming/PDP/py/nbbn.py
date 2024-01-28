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
    
