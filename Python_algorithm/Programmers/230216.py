# 2023년 2월 16일 목요일

# 120807 - 숫자 비교하기
# 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

def solution(num1, num2):
    if num1 == num2:
        return(1)
    else:
        return(-1)

# 120802 - 두 수의 합
# 정수 num1과 num2가 주어질 때, num1에서 num2를 더한 값을 return하도록 soltuion 함수를 완성해주세요.

def solution(num1, num2):
    answer = num1 + num2
    return answer

# 120803 - 두 수의 차
# 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.

def solution(num1, num2):
    answer = num1 - num2
    return answer

# 120804 - 두 수의 곱
# 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

def solution(num1, num2):
    answer = num1 * num2
    return answer

# 120805 - 몫 구하기
# 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.

def solution(num1, num2):
    answer = num1 // num2
    return answer

# 120810 - 나머지 구하기
# 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

def solution(num1, num2):
    answer = num1 % num2
    return answer

# 120805 - 몫 구하기
# 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.

def solution(num1, num2):
    answer = num1 // num2
    return answer

# 120820 - 나이출력
# 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
# 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.

def solution(age):
    answer = 2022 - age + 1
    return answer

# 120829 - 각도기
# 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
# 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.

def solution(angle):
    if 0 <= angle and angle < 90: return 1
    elif angle == 90: return 2
    elif 90 <= angle and angle < 180: return 3
    else : return 4

# 120806 - 두 수의 나눗셈
# 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

def solution(num1, num2):
    answer = int((num1 / num2) * 1000)
    return answer

# 120817 - 배열의 평균값
# 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

def solution(numbers):
    answer = 0
    for i in numbers:
        answer += i
    return round(answer / len(numbers), 1)

# 120831 - 짝수의 합
# 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

def solution(n):
    answer = 0
    for i in range(1,n+1):
        if i % 2 == 0:
            answer += i;
    return answer
# return sum([i for i in range(2, n + 1, 2)])

# 120831 - 양꼬치
# 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
# 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
# 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.

def solution(n, k):
    answer = (12000*n)+(2000*k)
    if n >= 10 and k >= (n // 10) :
        service = (n // 10) * 2000
        answer = answer - service
    return answer

# 120821 - 배열 뒤집기
# 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

def solution(num_list):
    num_list.reverse()
    return num_list

# 120814 - 피잔 나눠 먹기(1)
# 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
# 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

def solution(n):
    if n <= 7:
        return 1
    elif n % 7 == 0:
        return n / 7
    else:
        return n // 7 + 1

#   return (n - 1) // 7 + 1

# print(solution(15))