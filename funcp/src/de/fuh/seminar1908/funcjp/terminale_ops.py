def len_is_5(s):
    return len(s) == 5

fruits = ["Banana", "Apple", "Melon"]

all_length5 = all(map(len_is_5, fruits))
print("Alle Strings haben die Laenge 5:", all_length5)

any_length5 = any(map(len_is_5, fruits))
print("Min. ein String hat die Laenge 5:", any_length5)

no_length5 = not any(map(len_is_5, fruits))
print("Kein String hat die Laenge 5:", no_length5)

count = len(fruits)
print("Anzahl Strings:", count)

# Anzahl mit len bestimmen
count_length5 = len(list(filter(len_is_5, fruits)))
print("Anzahl String mit der Laenge 5:", count_length5)

# Anzahl mit sum bestimmen
count_length5 = sum(map(lambda s: 1 if len_is_5(s) else 0, fruits))
print("Anzahl String mit der Laenge 5:", count_length5)

first_str = min(fruits)
print("Erster String nach alphabetischer Sortierung:", first_str)

longest_str = max(fruits, key=len)
print("Laengster String:", longest_str)

sorted_by_len = sorted(fruits, key=len)
print("Nach Laenge sortiert:", sorted_by_len)

