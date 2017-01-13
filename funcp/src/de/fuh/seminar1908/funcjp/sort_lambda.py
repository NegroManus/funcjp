fruits = ['Melon', 'Apple', 'Banana']
print(sorted(fruits, key=lambda s: (len(s), s)))