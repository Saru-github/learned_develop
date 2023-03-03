# 2023년 3월 2일 목요일

# 12939 - 최댓값과 최솟값
# 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
# str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
# 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

def solution(s):
    arr = list(map(int, s.split(" ")))
    return str(min(arr)) + " " + str(max(arr))

# 12951 - JadenCase 문자열 만들기
# JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
# 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
# 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

def solution(s):
    answer = ''
    arr = list(s.split(" "))
    for x in arr:
        count = 0
        for j in x:
            if count == 0 and j.isalpha() == True:
                answer += j.upper()
            else:
                answer += j.lower()
            count += 1
        answer += " "
    return answer.rstrip()

# 12909 - 올바른 괄호
# 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
# "()()" 또는 "(())()" 는 올바른 괄호입니다.
# ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
# '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

def solution(s):
    stack = []
    for x in s:
        if c=='(':
            stack.append(c)
        elif not stack or stack.pop()!='(':
            return False
    return False if stack else True

print(solution("3people unFollowed me"))


