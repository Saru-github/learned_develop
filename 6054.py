
# 6054

# 입력
# 2개의 정수가 공백을 두고 입력된다.
#
# 출력
# 둘 다 True 일 경우에만 True 를 출력하고, 그 외의 경우에는 False 를 출력한다.

a,b = input().split()
print(bool(int(a) and int(b)))