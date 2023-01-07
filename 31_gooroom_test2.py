# 
n, k = map(int, input().split())
call_list = [0 for i in range(k)]
cop_list = [0 for i in range(k)]

for i in range(k):
    s, e = map(int, input().split())
    call_list[i] = s
    cop_list[i] = e

print(call_list)
print(cop_list)

check_list = [0 for i in range(n)]
for i in range(k):
    check_list[cop_list[i]-1] += 1

print(check_list)
cop_count = 0;
for i in range(n):
    if (check_list[i] // 2) <= 2:
        cop_count += check_list[i]//2
print(cop_count)