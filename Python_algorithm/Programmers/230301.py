# 2023년 3월 1일 수요일

# 120844 - 배열 회전시키기
# 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
# 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

def solution(numbers, direction):
    return numbers[:-1] + [numbers[-1]] if direction == "right" else [numbers[0]] + numbers[1:]# 120844 - 배열 회전시키기

# 120895 - 인덱스 바꾸기
# 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
# my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

def solution(my_string, num1, num2):
    s = list(my_string)
    s[num1], s[num2] = s[num2], s[num1]
    return ''.join(s)

# 120815 - 피자 나눠 먹기 (2)
# 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
# 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
# n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

def solution(n):
    answer = 1
    while 6 * answer % n :
        answer += 1
    return answer

# 120834 - 외계행성의 나이
# 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
# 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
# a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
# 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.

def solution(n):
    return "".join([chr(int(x)+97) for x in str(n)])

# 120897 - 약수 구하기
# 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

def solution(n):
    return [x for x in range(1, n+1) if n % x == 0]

# 120891 - 369 게임
# 머쓱이는 친구들과 369게임을 하고 있습니다.
# 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
# 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.

def solution(order):
    answer = 0
    for i in str(order):
        if i == '3' or i == '6' or i == '9':
            answer += 1
    return answer

# 120904 - 숫자 찾기
# 정수 num과 k가 매개변수로 주어질 때,
# num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

def solution(num, k):
    return str(num).find(str(k)) + 1 if str(k) in str(num) else -1

# 120911 - 문자열 정렬하기 (2)
# 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
# my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

def solution(my_string):
    return "".join(sorted(my_string.lower()))

# 120846 - 합성수 찾기
# 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
# 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

def solution(n):
    answer = 0
    for i in range(4, n + 1):
        for j in range(2, int(i ** 0.5) + 1):
            if i % j == 0:
                answer += 1
                break
    return answer

# 120888 - 중복된 문자 제거
# 문자열 my_string이 매개변수로 주어집니다.
# my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

def solution(my_string):
    answer = []
    strArr = list(my_string)
    for x in my_string:
        if x not in answer:
            answer.append(x)
    return "".join(answer)

# 120838 - 모스부호
# 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
# 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
# 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

def solution(letter):
    morse = {
        '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
        '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
        '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
        '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
        '-.--':'y','--..':'z'
    }
    print(morse['.-'])
    return "".join([morse[x] for x in letter.split(' ')])

# 120886 - A로 B 만들기
# 문자열 before와 after가 매개변수로 주어질 때,
# before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

def solution(before, after):
    return 1 if sorted(before) == sorted(after) else 0

# 120848 - 팩토리얼
# i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
# 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
# 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.

def solution(n):
    answer = 1
    sum = 1
    while sum <= n:
        answer += 1
        sum *= answer
    return answer-1

# 120842 - 2차원으로 만들기
# 정수 배열 num_list와 정수 n이 매개변수로 주어집니다.
# num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
# num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
# 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.

def solution(num_list, n):
    answer = []
    for i in range(0, len(num_list), n):
        answer.append(num_list[i:i+n])
    return answer

# 120890 - 가까운 수
# 정수 배열 array와 정수 n이 매개변수로 주어질 때,
# array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

def solution(array, n):
    array.sort()
    arr = [abs(x-n) for x in array]
    return(array[arr.index(min(arr))])

# 120887 - k의 개수
# 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
# 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.


def solution(i, j, k):
    answer = sum([ str(i).count(str(k)) for i in range(i, j+1)])
    return answer

print(solution(10, 50, 10))



