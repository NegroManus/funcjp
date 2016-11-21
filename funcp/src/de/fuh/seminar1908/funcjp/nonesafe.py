from collections.abc import Callable

class NullAware(Callable):
    def __init__(self, some_func):
            self.some_func = some_func
    def __call__(self, arg):
            return None if arg is None else self.some_func(arg)

# print(int(None))

nonesafe_int = NullAware(int)
print(nonesafe_int(None))

def nonesafe(fn):
    def ns(value):
        return None if value is None else fn(value)
    return ns

nonesafe_int = nonesafe(int)
print(nonesafe_int(None)) 