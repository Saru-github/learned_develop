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

# 120852 - 소인수분해
# 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
# 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다.
# 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

def solution(n):
    answer = []
    d = 2
    while d <= n:
        if n % d == 0:
            n /= d
            if d not in answer:
                answer.append(d)
        else:
            d += 1
    return answer

# 120843 - 공 던지기
# 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
# 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
# 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
# k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.

def solution(numbers, k):
    return numbers[2 * (k - 1) % len(numbers)]

# 120894 - 영어가 싫어요
# 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
# 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

def solution(numbers):
    numArr = {'zero' : 0, 'one':1, 'two':2, 'three' : 3, 'four':4,
                 'five':5,'six' : 6, 'seven' : 7, 'eight':8,'nine':9}
    for x, y in numArr.items():
        numbers = numbers.replace(x, str(y))
    return int(numbers)

print(solution("onetwothreefourfivesixseveneightnine"))



