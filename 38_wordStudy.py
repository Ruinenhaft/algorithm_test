words = input()
upperWords = words.upper()
words_list = [[i for i in range(65, 91)] for j in range(2)]
for i in range(26):
    words_list[1][i] = 0;

for upperWord in upperWords:
    words_list[0].count(ord(upperWord))

for i in words_list:
    for j in i:
        print(j, end=" ")
    print()