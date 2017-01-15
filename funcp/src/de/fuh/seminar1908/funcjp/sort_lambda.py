fruits = ["Banana", "Apple", "Melon"]
print(sorted(fruits, key=lambda s: (len(s), s)))