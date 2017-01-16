fruits = ["Banana", "Apple", "Melon"]
fruits.sort(key=lambda s: (len(s), s))
print(fruits)