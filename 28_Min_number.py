a, b = map(int, input().split())
tmp_list = list(map(int, input().split()))
for i in range(a):
    if tmp_list[i] < b:
        print(tmp_list[i], "", end='')