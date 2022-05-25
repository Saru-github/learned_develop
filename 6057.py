
# 6057

# 입력
# 2개의 정수가 공백을 두고 입력된다.

# 출력
# 두 값의 True / False 값이 서로 같을 경우만 True 를 출력하고, 그 외의 경우에는 False 를 출력한다.


a,b = input().split()
a = bool(int(a))
b = bool(int(b))

if a == b:
    print('True')
else:
    print('False')