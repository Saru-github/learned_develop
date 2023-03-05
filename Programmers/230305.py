# 2023년 3월 5일 일요일

# 120835 - 진료순서 정하기
# 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
# 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

def solution(emergency):
    return [sorted(emergency, reverse=True).index(x) + 1 for x in emergency]

# 120864 - 숨어있는 숫자의 덧셈 (2)
# 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
# my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

def solution(s):
    return "".join(sorted([x for x in s if s.count(x) == 1]))

# 120896 - 한 번만 등장한 문자
# 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
# 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

def solution(my_string):
    s = "".join(x if x.isdigit() else ' ' for x in my_string)
    return sum(int(i) for i in s.split())

# 120885 - 이진수 더하기
# 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

def solution(bin1, bin2):
    a, b = int(bin1, 2), int(bin2, 2)
    return bin(a+b)[2:]

# 120912 - 7의 개수
# 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

def solution(array):
    arr = "".join(map(str, array))
    sum = 0
    for x in arr:
        if int(x) == 7:
            sum += 1
    return sum
# return str(array).count('7')

print(solution([7, 77, 17]))



