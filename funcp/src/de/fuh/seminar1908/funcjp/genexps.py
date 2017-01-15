fruits = ["Banana", "Apple", "Melon"]

first_len5 = next((s for s in fruits if len(s) == 5), None)
print("Erster String mit der Laenge 5:", first_len5)

all_len5 = all(s for s in fruits if len(s) == 5)
print("Alle Strings haben die Laenge 5:", all_len5)

len5_sorted = sorted(s for s in fruits if len(s) == 5)
print("Strings mit der Laenge 5 (alphabetisch sortiert):", len5_sorted)
