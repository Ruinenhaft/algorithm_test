word = input()
lst = []
for i in range(97, 123):
    if chr(i) in word:
        words = chr(i)
        b = word.index(words)
        lst.append(b)
    else:
        lst.append(-1)

for j in lst:
    print(j, end=" ")