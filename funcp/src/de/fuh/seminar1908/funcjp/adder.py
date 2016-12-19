# Beispiel 1
def add(a, b):
    return a + b

print(add(0, 1))  # 1
print(add(0, 1))  # 1

# Beispiel 2


class Adder:
    value = 0

    def add(self, num):
        self.value += num
        return self.value

my_adder = Adder()
print(my_adder.add(1))  # 1
print(my_adder.add(1))  # 2
