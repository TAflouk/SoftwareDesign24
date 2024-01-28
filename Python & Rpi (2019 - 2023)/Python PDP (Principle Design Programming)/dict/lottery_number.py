import random 

def generator_numbers():
    random_number = random.randint(0,9)
    return random_number

def generator_lottery_numbers(number_of_lottery):
    lottery_numbers = []

    for current_lottery_index in range(number_of_lottery):
        random_number = generator_numbers()
        lottery_numbers.append(random_number)

    return lottery_numbers

def print_lottery_numbers(lottery_numbers):
    for current_lottery_index in range(len(lottery_numbers)):
        if current_lottery_index == len(lottery_numbers)-1:
            print(lottery_numbers[current_lottery_index], end= ". ")
        else:
            print(lottery_numbers[current_lottery_index], end= ", ")


def main():
    number_of_lottery = 7
    lottery_numbers = []

    lottery_numbers = generator_lottery_numbers(number_of_lottery)

    print("The", number_of_lottery,\
        "lottery numbers for today are:")

    print_lottery_numbers(lottery_numbers)

main()