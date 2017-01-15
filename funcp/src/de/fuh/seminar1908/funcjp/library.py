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