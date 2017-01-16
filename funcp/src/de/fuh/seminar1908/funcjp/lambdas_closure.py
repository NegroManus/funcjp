# Adder-Fabrik mit innerer Funktion
def make_adder(x):
    def adder(y):
        return x + y
    return adder

# Multiplier-Fabrik mit Lambda-Ausdruck
def make_multiplier(x):
    return lambda y: x * y

add10 = make_adder(10)
print("10 + 5 =", add10(5))

mult_by_2 = make_multiplier(2)
print("2 * 10 =", mult_by_2(10))