def solution(arr, divisor):
    answer = []
    for i in arr:
        if(i % divisor == 0):
            answer.append(i)

    if not answer:
        answer.append(-1)
        return answer
    else:
        return sorted(answer)

arr = [3,2,6]
print(solution(arr, 10))
