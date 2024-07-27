
# 6082

# 입력
# 30 보다 작은 정수 1개가 입력된다.
# (1 ~ 29)

# 출력
# 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
# 3 또는 6 또는 9가 포함 되어있는 수인 경우, 그 수 대신 영문 대문자 X 를 출력한다.


a = int(input())
for x in range(1,a+1):
    if x % 10 == 3 or x % 10 == 6 or x % 10 == 9:
        print('X', end=' ')
    else:
        print(x, end=' ')