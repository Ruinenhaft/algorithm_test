a, b = input().split()

a_1 = a[::-1]
b_1 = b[::-1]
if int(a_1) > int(b_1) :
    print(a_1)
else:
    print(b_1)