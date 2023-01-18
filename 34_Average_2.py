import sys

testCase = int(sys.stdin.readline())
for i in range(testCase):
        students_score = list(map(int, sys.stdin.readline().split()))
        student = students_score[0]
        scores = students_score[1:]
        avg = sum(scores)/student
        count = 0
        for score in scores:
                if score > avg:
                        count+=1
        resultAvg = count/student * 100
        print("{:.3f}".format(resultAvg)+"%")

