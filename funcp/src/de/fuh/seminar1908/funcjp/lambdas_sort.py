fruits = ["Banana", "Melon", "Apple"]
fruits.sort(key=lambda s: (len(s), s))
print(fruits)