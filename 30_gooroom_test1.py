import sys
# nxn 범위에서 좌표값을 덮는 최소 넓이 구하기
n = int(sys.stdin.readline())
tmp_list = [[0 for col in range(n)] for row in range(n)]
tmp_count = []
tmp_result = 0

for col in range(n):
    tmp_list[col] = list(map(int,input().split()))

for i in range(n):
    for j in range(n):
        print(tmp_list[i][j], end="")
        if tmp_list[i][j] == 1:
            tmp_count.append([i+1,j+1])
    print()


x= 0
y= 0
tmp_x_list = []
tmp_y_list = []
print(tmp_count)
for i in range(len(tmp_count)):
    tmp_x_list.append(tmp_count[i][0])
    tmp_y_list.append(tmp_count[i][1])

print(tmp_x_list)
print(tmp_y_list)


x = max(tmp_x_list) - min(tmp_x_list) + 1
y = max(tmp_y_list) - min(tmp_y_list) + 1
print(x*y)



