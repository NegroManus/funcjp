import functools, operator

faculty_10 = functools.reduce(operator.mul, range(1, 11))
print(faculty_10)

add10 = functools.partial(operator.add, 10)
print("10 + 5 =", add10(5))