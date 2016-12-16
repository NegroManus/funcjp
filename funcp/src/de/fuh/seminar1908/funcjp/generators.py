def my_genfn():
    for i in range(10):
        yield i

my_gen = my_genfn()

my_gen_exp = (i for i in range(10))

print(range(10))
print(my_genfn)
print(my_gen)
print(my_gen_exp)