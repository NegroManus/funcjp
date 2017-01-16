# Set Comprehensions
fruits = ["Banana", "Melon", "Apple"]

chars = {char.lower() for string in fruits for char in string}
print(chars)

sorted_chars = sorted({char.lower() for string in fruits
                       for char in string})
print(sorted_chars)