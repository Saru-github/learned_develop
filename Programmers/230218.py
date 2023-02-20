# 2023년 2월 17일 금요일

# 120826 - 특정 문자 제거하기
# 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

def solution(my_string, letter):
    return my_string.replace(letter, "")

# 12085 - 배열 원소의 길이
# 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.

def solution(strlist):
    answer = []
    for x in strlist:
        answer.append(len(x))
    return answer

    # return [len(str) for str in strlist]

# 120822 - 문자열 뒤집기
# 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

def solution(my_string):
    return my_string[::-1]

# 120889 - 삼각형의 완성조건(1)
# 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
# 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다. 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
# 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.

def solution(sides):
    sides.sort()
    x, y, z = sides[0], sides[1], sides[2]
    if x + y > z:
        return 1
    else:
        return 2

    # return 1 if max(sides) < (sum(sides) - max(sides)) else 2

# 120847 - 최대값 만들기
# 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

def solution(numbers):
    numbers.sort(reverse=True)
    return numbers[0] * numbers[1]

# 120818 - 옷가게 할인 받기
# 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
# 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.

def solution(price):
    if price < 100000:
        return int(price)
    elif price >= 100000 and price < 300000:
        return int(price * 0.95)
    elif price >= 300000 and  price < 500000:
        return int(price * 0.9)
    elif price >= 500000:
        return int(price * 0.8)

    # discount_rates = {500000: 0.8, 300000: 0.9, 100000: 0.95, 0: 1}
    # for discount_price, discount_rate in discount_rates.items():
    #     if price >= discount_price:
    #         return int(price * discount_rate)

# 120819 - 아이스 아메리카노
# 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
# 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
# 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

def solution(money):
    return [money // 5500, money % 5500]

# 120809 - 배열 두 배 만들기
# 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.

def solution(numbers):
    return [x * 2 for x in numbers]

# 120825 - 문자 반복 출력하기
# 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

def solution(my_string, n):
    answer = ""
    for x in my_string:
        answer += x * n
    return answer

# 120836 - 순서쌍의 개수
# 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
# 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.

def solution(n):
    count = 0
    for x in range(1, n+1):
        if n % x ==0:
            count += 1
    return count

# 120833 - 배열 자르기
# 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
# numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

def solution(numbers, num1, num2):
    return numbers[num1: num2+1]

# 120903 - 배열의 유사도
# 두 배열이 얼마나 유사한지 확인해보려고 합니다.
# 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.

def solution(s1, s2):
    answer = 0
    for i in s1:
        for j in s2:
            if i == j: answer += 1
    return answer

    # return len(set(s1)&set(s2));

# 120813 - 짝수는 싫어요
# 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

def solution(n):
    return [x for x in range(n + 1) if x % 2]

# 120898 - 편지
# 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다.
# 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며,
# 편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.

def solution(message):
    return len(message)*2

# 120906 - 자릿수 더하기
# 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

def solution(n):
    return sum(int(x) for x in str(n))

# print(solution(1234))


