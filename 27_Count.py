import sys
count = 0
count_num = int(sys.stdin.readline())
tmp_list = [0 for i in range(count_num)]
tmp_list = list(map(int, input().split()))

select_num = int(sys.stdin.readline())
for i in range(count_num):
    if tmp_list[i] == select_num:
        count += 1

print(count)