from timeit import timeit

def microbenchmark(label, statement):
    stp = "strings = ('1', '-4', '1000000', '-123123', '-0.1', '0.1e32', '0.1e-32', 'Infinity', 'nan')"
    samples = 10000
    result = timeit(stmt=statement, setup=stp, number=samples)
    print(label, ": ", result)

microbenchmark("listcomp", "[float(s) for s in strings]")
microbenchmark("map+func", "list(map(float, strings))")
microbenchmark("gen expr", "list(float(s) for s in strings)")
microbenchmark("map+lamb", "list(map(lambda x: float(x), strings))")
