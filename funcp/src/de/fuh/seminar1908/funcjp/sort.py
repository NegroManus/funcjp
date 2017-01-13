fruits = ['Melon', 'Apple', 'Banana']

def len_then_natural(s):
    return (len(s), s)

print(sorted(fruits))
print(sorted(fruits, reverse=True))
print(sorted(fruits, key=len, reverse=True))
print(sorted(fruits, key=len_then_natural))

### short ##
fruits = ['Melon', 'Apple', 'Banana']
print(sorted(fruits, key=len))