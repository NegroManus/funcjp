def counter(maximum):
    i = 0
    while i < maximum:
        val = (yield i)
        # If value provided, change counter
        if val is not None:
            i = val
        else:
            i += 1
            
it = counter(10)  
print(next(it))  
print(next(it))
print(it.send(8))  
print(next(it))
# Wirft StopIteration  
#print(next(it))