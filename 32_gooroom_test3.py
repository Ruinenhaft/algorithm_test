import sys


list_number = [1,2,3]
number = int(sys.stdin.readline())
for i in range(3, number):
    if (i+1)%2 == 0:
        list_number.append(list_number[i-1]+(i+1))
    else:
        list_number.append(i-1)

print(list_number[number-1])