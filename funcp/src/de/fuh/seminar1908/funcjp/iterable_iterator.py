# Iterable
class MyList:
    def __init__(self, data):
        self.data = data
        
    def __iter__(self):
        return MyListIterator(self.data)
    
# Iterator
class MyListIterator:
    def __init__(self, data):
        self.data = data
        self.index = 0
        
    def __next__(self):
        if(len(self.data) > self.index):
            elem = self.data[self.index]
            self.index += 1
            return elem
        else:
            raise StopIteration()

    
    def __iter__(self):
        return self
    
mylist = MyList([1,2,3])

print("Iterator mit wiederholten Aufrufen von next() durchlaufen:")
it = iter(mylist)
print(next(it))
print(next(it))
print(next(it))
# Wirft StopIteration
# print(next(it))

print("Iterable mit For-Schleife durchlaufen:")
for i in mylist:
    print(i)
    
print("Iterator mit For-Schleife durchlaufen:")
it = iter(mylist)
for i in it:
    print(i)
    
print("Iterator als tuple materialisieren:")
it = iter(mylist)
t = tuple(it)
print(t)

print("Iterable Unpacking:")
x, y, z = iter(mylist)
print(f"x={x}, y={y}, z={z}")