# 2023년 2월 17일 금요일

# 120583 - 중복된 숫자 개수
# 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

def solution(array, n):
    answer = 0
    for x in array:
        if x == n:
            answer += 1
    return answer

# 120841 - 점의 위치 구하기
# 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.

def solution(dot):
    x, y = map(int, (dot[0], dot[1]))
    if x > 0 and y > 0: return 1
    elif x < 0 and y > 0: return 2
    elif x < 0 and y < 0: return 3
    elif x > 0 and y < 0: return 4
    else: return 0

# 120816 - 피자 나눠 먹기 (3)
# 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
# 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
# n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

def solution(slice, n):
    if n % slice == 0:
        return n // slice
    else:
        return n // slice + 1

# 120824 - 짝수 홀수 개수
# 정수가 담긴 리스트 num_list가 주어질 때, 
# num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

def solution(num_list):
    answer = [0, 0]
    for x in num_list:
        if x % 2 == 0:
            answer[0] += 1
        else:
            answer[1] += 1

        # answer[n%2]+=1
    return answer

# 120585 - 머쓱이보다 키 큰 사람
# 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
# 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
# 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.

def solution(array, height):
    count = 0
    for x in array:
        if height < x : count += 1
    return count

# array = [149, 180, 192, 170]
# print(solution(array, 167))