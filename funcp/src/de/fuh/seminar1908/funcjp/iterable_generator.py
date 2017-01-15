# Iterable
class MyList:
    def __init__(self, data):
        self.data = data
    
    # Generator-Funktion
    def __iter__(self):
        for i in self.data:
            yield i
    
    
mylist = MyList([1,2,3])

print("Iterable mit For-Schleife durchlaufen:")
for i in mylist:
    print(i)
    
fruits = ["Banana", "Apple", "Melon"]