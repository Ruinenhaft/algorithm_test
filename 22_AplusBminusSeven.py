import sys

test_case_num = int(sys.stdin.readline())
for i in range(test_case_num):
    a, b = map(int, sys.stdin.readline().split())
    print("Case {0}#: {1}".format(i+1, a+b))