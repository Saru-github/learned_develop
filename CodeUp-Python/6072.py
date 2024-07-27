
# 6072

# 입력
# 정수 1개가 입력된다.
# (1 ~ 100)

# 출력
# 1만큼씩 줄이면서 한 줄에 1개씩 카운트다운 수를 출력한다.


a = int(input())
while True:
    print(a)
    a -= 1
    if a == 0:
        break
