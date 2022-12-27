total_money = int(input())
things_number = int(input())
result = 0
for i in range(things_number):
    a,b = map(int, input().split())
    result += a*b

if(total_money == result):
    print("Yes")
else:
    print("No")