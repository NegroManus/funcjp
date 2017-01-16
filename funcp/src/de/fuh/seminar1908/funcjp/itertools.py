class Book:
    title = None
    authors = []
    year = None
    
    def __repr__(self):
        return f"Book({self.title})"


j8_in_action = Book()
j8_in_action.title = "Java 8 in Action"
j8_in_action.authors = ["Raoul-Gabriel Urma", "Mario Fusco",
                        "Alan Mycroft"]
j8_in_action.year = 2014

j8_lambdas = Book()
j8_lambdas.title = "Java 8 Lambdas"
j8_lambdas.authors = ["Richard Warburton"]
j8_lambdas.year = 2014

fluent_python = Book()
fluent_python.title = "Fluent Python"
fluent_python.authors = ["Luciano Ramalho"]
fluent_python.year = 2016

books = [j8_in_action, j8_lambdas, fluent_python]

import operator, itertools

counter = itertools.count(step=2)
print("counter:")
print(next(counter))
print(next(counter))
print(next(counter))

chained = itertools.chain([1, 2, 3], (4, 5, 6))
print("chained:")
print(list(chained))

sliced = itertools.islice([1, 2, 3, 4, 5, 6], 0, 4, 2)
print("sliced:")
print(list(sliced))

it1, it2 = itertools.tee(x * 2 for x in [1, 2, 3])
print("it1, it2:")
print(list(it1))
print(list(it2))

products = itertools.starmap(operator.mul, ((1, 2), (3, 4)))
print("products:")
print(list(products))

smaller_than_4 = lambda n: n < 4

nums_smaller_than_4 = itertools.takewhile(smaller_than_4, [1, 2, 3, 4, 5])
print("nums_smaller_than_4:")
print(list(nums_smaller_than_4))

nums_greater_equal_4 = itertools.dropwhile(smaller_than_4, [1, 2, 3, 4, 5])
print("nums_greater_equal_4:")
print(list(nums_greater_equal_4))

grouped_by_year = itertools.groupby(books, operator.attrgetter("year"))
print("grouped_by_year:")
for group in grouped_by_year:
    print(group[0],"=>", list(group[1]))