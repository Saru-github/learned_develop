# 2023년 2월 22일 수요일

# 120851 - 숨어있는 숫자의 덧셈 (1)
# 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

def solution(my_string):
    sum = 0
    for x in my_string:
        if x.isdigit() == True:
            sum += int(x)
    return sum

# 120908 - 문자열안에 문자열
# 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

def solution(str1, str2):
    return 1 if str2 in str1 else 2

# 120849 - 모음 제거
# 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
# 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

def solution(my_string):
    return "".join([i for i in my_string if not(i in "aeiou")])

# 120837 - 개미군단
# 개미 군단이 사냥을 나가려고 합니다.
# 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
# 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
# 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
# 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
# 사냥감의 체력 hp가 매개변수로 주어질 때,
# 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.

def solution(hp):
    return hp // 5 + (hp % 5 // 3) + ((hp % 5) % 3)

# 120909 - 제곱수 판별하기
# 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
# 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

def solution(n):
    x = 1
    while(n > x):
        if x * x == n:
            return 1
        if x * x > n:
            return 2
        x += 1

# print(solution(976))
