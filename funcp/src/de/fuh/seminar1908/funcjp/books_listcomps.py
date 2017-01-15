fruits = ["Banana", "Apple", "Melon"]


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

# Buecherverarbeitung mit List Comprehension
def get_python_book_titles(books):
    return [b.title for b in books if "Python" in b.title]

print(get_python_book_titles(books))

## Set & Dict Comprehension
# Set Comprehension
chars = {char.lower() for string in fruits for char in string}
print(chars)

# Dict Comprehension
book_dict = {(b.title, b) for b in books}
print(book_dict)