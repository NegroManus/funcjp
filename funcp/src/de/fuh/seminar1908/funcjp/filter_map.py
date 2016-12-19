import collections.abc


def get_input():
    print("Called get_input()")
    return range(10)


def multiply_with_3(num):
    print("Called multiply_with_3({})".format(num))
    return num * 3


def is_even(num):
    print("Called filter_even({})".format(num))
    return num % 2 == 0

# list
print("-- List")
my_list = []
for x in get_input():
    if is_even(x):
        my_list.append(multiply_with_3(x))

print(my_list)
for e in my_list:
    print(e)

# list comprehension
print("-- List Comprehension")
my_list_compr = [multiply_with_3(x) for x in get_input() if is_even(x)]
print(my_list_compr)
for e in my_list_compr:
    print(e)

# generator expression
print("-- Generator Expression")
my_gen_exp = (multiply_with_3(x) for x in get_input() if is_even(x))
print(my_gen_exp)
for e in my_gen_exp:
    print(e)

# generator
print("-- Generator")

list.append(object)


def gen():
    for x in get_input():
        if is_even(x):
            yield multiply_with_3(x)

my_gen = gen()
print(my_gen)
for e in my_gen:
    print(e)

# filter() and map() functions
print("-- filter() and map() Functions")
my_iter = map(multiply_with_3, filter(is_even, get_input()))
print(my_iter)
for e in my_iter:
    print(e)
