import random

user_action = input("Pick a number between 1-10: ")
options = (range(1,10))
computer = random.choice(options)
print(f"\nOutcome: {computer} \n")
