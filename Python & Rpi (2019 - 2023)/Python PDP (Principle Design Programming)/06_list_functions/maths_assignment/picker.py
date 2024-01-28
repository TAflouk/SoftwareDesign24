import random
import time

learners = ["Alan",
            "Taha",
            "Marina",
            "Thanga",
            "Nathan"]
random.shuffle(learners)

algorithms = ["bubble", "insertion", "selection", "bubble", "selection"]

for learner in learners:
    algo_random = random.choice(algorithms)
    print(f"{learner} gets {algo_random}")
    time.sleep(1)
