import random

def number_guessing_game():
    # Generate random number between 1 and 100
    secret_number = random.randint(1, 100)
    attempts = 0
    guess = 0

    print("Welcome to the Number Guessing Game!")
    print("I have chosen a number between 1 and 100.")
    print("Can you guess what it is?")

    # Keep asking until the correct number is guessed
    while guess != secret_number:
        try:
            guess = int(input("Enter your guess: "))
            attempts += 1

            if guess < secret_number:
                print("Too low! Try again.")
            elif guess > secret_number:
                print("Too high! Try again.")
            else:
                print(f"🎉 Congratulations! You guessed the number {secret_number} in {attempts} attempts.")
        except ValueError:
            print("Please enter a valid number!")

# Run the game
number_guessing_game()
# upskillcampus
