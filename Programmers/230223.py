# 2023년 2월 23일 목요일

# 120811 - 중앙값 구하기
# 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
# 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

def solution(array):
    return sorted(array)[len(array) // 2]

# 120910 - 세균 증식
# 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
# 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

def solution(n, t):
    return n*(2**t)

# 120892 - 암호 해독
# 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
# 암호화된 문자열 cipher를 주고받습니다. 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
# 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.

def solution(cipher, code):
    answer = ""
    for x in range(code-1, len(cipher), int(code)):
        answer += cipher[x]
    return answer

# 120850 - 문자열 정렬하기 (1)
# 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

def solution(my_string):
    answer = []
    for x in my_string:
        if x.isalpha() == False:
            answer.append(int(x))
    answer.sort()
    return answer

# return sorted([int(c) for c in my_string if c.isdigit()])

# 120839 - 가위 바위 보
# 가위는 2 바위는 0 보는 5로 표현합니다.
# 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
# rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.


def solution(rsp):
    answer = ""
    for x in rsp:
        if x == "0":
            answer += "5"
        elif x == "2":
            answer += "0"
        else:
            answer += "2"
    return answer

#   d = {'0':'5','2':'0','5':'2'}
#   return ''.join(d[i] for i in rsp)

# print(solution("2"))
