def makeAdder(x):
    return lambda y: x + y

add10To = makeAdder(10)
print(add10To(5))  # 15
print(add10To(2))  # 12

add2To = makeAdder(2)
print(add2To(5))  # 7
print(add2To(2))  # 4