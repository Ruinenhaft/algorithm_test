input_words = input()
split_word = input_words.lstrip().rstrip().split(" ")
if split_word[0] == '':
    print('0')
else:
    print(len(split_word))