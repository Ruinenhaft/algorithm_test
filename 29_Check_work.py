student_list = [0 for i in range(31)]
for i in range(1, 29):
    student_number = int(input())
    student_list[student_number] = 1

for i in range(1, 31):
    if student_list[i] == 0:
        print(i)


