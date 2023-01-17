import sys

num = int(sys.stdin.readline())
num_list = [0 for i in range(num-1)]
num_list = list(map(int, sys.stdin.readline().split()))
maxScore = max(num_list)
for i in range(len(num_list)):
    num_list[i] = num_list[i]/maxScore*100
avg = sum(num_list)/num
print(avg)
