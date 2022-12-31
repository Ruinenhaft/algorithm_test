import sys

number = int(sys.stdin.readline())
count = 0
new_number = number
while True:
    number1 = new_number // 10 + new_number % 10
    if number1 > 9:
        number1 = number1 % 10
    number10 = (new_number % 10)*10
    new_number = number10 + number1
    count += 1
    if number == new_number:
        break;
print(count)

