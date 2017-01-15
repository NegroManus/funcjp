fruits = ["Banana", "Apple", "Melon"]

def len_then_natural(s):
    return (len(s), s)

print(sorted(fruits))
print(sorted(fruits, reverse=True))
print(sorted(fruits, key=len, reverse=True))
print(sorted(fruits, key=len_then_natural))

### short ##
fruits = ["Banana", "Apple", "Melon"]
print(sorted(fruits, key=len))