
# 6077

# 입력
# 정수 1개가 입력된다.
# (0 ~ 100)

# 출력
# 1부터 그 수까지 짝수만 합해 출력한다.


a = int(input())
sum = 0
for x in range(a+1):
    if x % 2 == 0:
        sum += x
print(sum)