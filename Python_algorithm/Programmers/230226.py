# 2023년 2월 26일 일요일

# 120823 - 중앙값 구하기
# 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
# 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

n = int(input())
for i in range(1, n+1):
    print('*'*i)

# 120905 - n의 배수 고르기
# 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

def solution(n, numlist):
    return [x for x in numlist if x % n == 0]

# 120845 - 주사위의 개수
# 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다.
# 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때,
# 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.

def solution(box, n):
    return (box[0] // n) * (box[1] //n) * (box[2] // n)

# 120862 - 최댓값 만들기(2)
# 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

def solution(numbers):
    numbers.sort()
    return max((numbers[0]*numbers[1]), (numbers[-1]*numbers[-2]))

# 120899 - 가장 큰 수 찾기
# 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

def solution(numbers):
    answer = []
    return [max(numbers), numbers.index(max(numbers))]

# print(solution([1, 8, 3]))
