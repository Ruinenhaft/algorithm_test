from collections import defaultdict

words = input()
max_words = []
words_dict = defaultdict(lambda: 1)
# 일반 dictionary는 미리 삽입하지 않은 key를 호출할때 error발생
# setdefault를 활용하면 호출과 동시에 선언도 가능하지만 매번 수행해야함.
# defaultdict 기본값을 지정한 dictionary, defaultdict(초기화값) 형태로 사용가능

words = words.upper()# 하단에서 하나하나 적용하지말고 일괄 대문자로 적용.
for word in words:
    if word in words_dict:# word값이 words_dict dictionary내에 존재하는지 확인
        words_dict[word] += 1
    else:
        words_dict[word]


print(max(words_dict.values()))# 최대값 확인가능 체크

[max_words.append(k) for k, v in words_dict.items() if max(words_dict.values()) == v]# 조건문으로 값이 가장큰 key값을 찾아 출력
print(max_words)
if len(max_words) == 1:#가장 많이 사용된 알파벳이 1개일때는 알파벳 출력, 2개 이상일때는 ? 출력
    print(max_words[0])
else:
    print("?")