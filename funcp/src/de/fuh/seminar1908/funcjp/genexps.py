fruits = ["Banana", "Melon", "Apple"]

first_len_5 = next((s for s in fruits if len(s) == 5), None)
print("Erster String mit der Länge 5:", first_len_5)

all_len_5 = all(s for s in fruits if len(s) == 5)
print("Alle Strings haben die Länge 5:", all_len_5)

len_5_sorted = sorted(s for s in fruits if len(s) == 5)
print("Strings mit der Länge 5 (alphabetisch sortiert):", len_5_sorted)
