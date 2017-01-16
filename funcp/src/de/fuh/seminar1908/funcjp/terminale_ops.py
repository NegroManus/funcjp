def len_is_5(s):
    return len(s) == 5

fruits = ["Banana", "Melon", "Apple"]

all_len_5 = all(map(len_is_5, fruits))
print("Alle Strings haben die Länge 5:", all_len_5)

any_len_5 = any(map(len_is_5, fruits))
print("Min. ein String hat die Länge 5:", any_len_5)

no_len_5 = not any(map(len_is_5, fruits))
print("Kein String hat die Länge 5:", no_len_5)

count = len(fruits)
print("Anzahl Strings:", count)

# Anzahl mit len bestimmen
count_len_5 = len(list(filter(len_is_5, fruits)))
print("Anzahl String mit der Länge 5:", count_len_5)

# Anzahl mit sum bestimmen
count_len_5 = sum(map(lambda s: 1 if len_is_5(s) else 0, fruits))
print("Anzahl String mit der Länge 5:", count_len_5)

first_str = min(fruits)
print("Erster String nach alphabetischer Sortierung:", first_str)

longest_str = max(fruits, key=len)
print("Längster String:", longest_str)

sorted_by_len = sorted(fruits, key=len)
print("Nach Länge sortiert:", sorted_by_len)
