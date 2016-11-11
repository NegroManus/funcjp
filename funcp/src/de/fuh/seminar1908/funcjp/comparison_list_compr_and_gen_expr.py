import time
from random import randint

source = [randint(0, 1000) for x in range(1000000)]


#

start = time.clock()


def my_gen():
    for x in source:
        yield x + 1

result = 0
for n in my_gen():
    result += n
start = time.clock()

duration = time.clock() - start
print("iterated {} in {} seconds".format("my_gen", duration))

#

start = time.clock()

my_list = [x + 1 for x in source]

result = 0
for n in my_list:
    result += n

duration = time.clock() - start
print("iterated {} in {} seconds".format("my_list", duration))

#

start = time.clock()

my_iter = (x + 1 for x in source)

result = 0
for n in my_iter:
    result += n

duration = time.clock() - start
print("iterated {} in {} seconds".format("my_iter", duration))
