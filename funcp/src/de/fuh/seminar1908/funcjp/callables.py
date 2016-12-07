import time

class myclass:
    def mymethod(self):
        pass

class mycallable:
    def __call__(self):
        pass

def myfunc():
    pass
        
def mygenfunc():
    for x in range(0, 3):
        yield x
        
mylambda = lambda x: x;

print('Built-in function: ', abs)
print('Built-in function from another module: ', time.clock)

print('User-defined function: ', myfunc)
print('Lambda function: ', mylambda)

print('Generator function: ', mygenfunc)
print('Generator object: ', mygenfunc())

print('Built-in class', dict)
print('Built-in method', dict.get)
print('Built-in method of object', dict().get)

print('Class: ', myclass)
print('Class instance: ', myclass())
print('Method: ', myclass.mymethod)
print('Method of object: ', myclass().mymethod)

print('Callable class: ', mycallable)
print('Callable class instance: ', mycallable())
print('Callable special call method: ', mycallable.__call__)
print('Callable special call method of object: ', mycallable().__call__)

