fruits = ["Banana", "Melon", "Apple"]

# Intermediate Operations
starting_with_A = list(filter(lambda s: s.startswith("A"), fruits))
print("Mit A beginnend:", starting_with_A)

small_letters = list(map(str.lower, fruits))
print("Kleinbuchstaben:", small_letters)

counted_fruits = list(enumerate(fruits))
print("Durchgezählt:", counted_fruits)

reversed_fruits = list(reversed(fruits))
print("Umgekehrte Reihenfolge:", reversed_fruits)

who_likes_what = list(zip(["Max", "Moritz", "Donald"], fruits))
print("Wer mag was:")
for name, fruit in who_likes_what:
    print(f"{name} likes {fruit}")