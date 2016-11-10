def supply():
    print("Called supply()")
    return range(10)


def multiply_with_3(num):
    print("Called multiply_with_3({})".format(num))
    return num * 3


def is_even(num):
    print("Called filter_even({})".format(num))
    return num % 2 == 0

# list comprehension
#my_list = [multiply_with_3(x) for x in supply() if is_even(x)]

# generator
my_list = list((multiply_with_3(x) for x in supply() if is_even(x)))

# filter, map
#my_list = list(map(multiply_with_3, filter(is_even, supply())))


print(my_list)