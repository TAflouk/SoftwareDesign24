# Ex 5

# print("Enter grades and Q to quit\n") 

# while True: 
#     grade = input("Enter grade: ") 
#     if grade.upper() == "Q": 
#         break 
#     elif grade xxx:  # outside bounds 
#         print("Outside valid grade range!") 
#     else: 
#         print(simple_grader(grade)) 

def simple_grader(score):
    """Convert a score to a letter grade

    Args:
        score (num) numerical grade

    Returns:
        str: a letter grade
    """
    assert(score >= 0 and score <= 100), "score outside range"
    if score < 60:
        return 'F'
    elif score < 70:
        return 'D'
    elif score < 80:
        return 'C'
    elif score < 90:
        return 'B'
    else:
        return 'A'


def grader_helper():
    """Gets user input
    Validates input to be a number in the correct range
    Once valid data entered, call the simple_grader to get the letter grade

    Returns:
        str: a letter grade
    """
    while True:
        score = input("Enter number grade:  ")
        try:
            score = float(score)
            if score >= 0 and score <= 100:
                return simple_grader(score)
            else:
                print("Outside range of valid scores")
        except:
            print("Score entered must be a number")

def get_grades():
    bucket = []
    while True:
        grade = grader_helper()
        bucket.append(grade)
        again = input("Enter Y to go again, any other key to quit: ")
        if again.lower() != 'y':
            break
    # bucket has grades as letters if they were entered
    # use a loop to print each one out, one at a time


learners = ["Liam Luther",
            "Mary Butters",
            "Jim Beam"]
subjects = {"Maths": 0,
            "English": 0,
            "IT Skills": 0
            }

learner_grades = {}
# with this set of data, we could populate a new dict with
# learner names as the key, and the value would be another
# dict with subject and score.
# That would require the use of a for loop

# To iterate through the dict and then set the score
# person per subject, would use a nested for loop.