words = ["Hello", "world"]

lowercase_words = filter(str.islower, words)
lowercase_words = (w for w in words if w.islower())
print("Worte aus nur Kleinbuchstaben:")
for w in lowercase_words:
    print(w)
    
lengths = map(len, words)
lengths = (len(w) for w in words)
print("Laengen:")
for l in lengths:
    print(l)