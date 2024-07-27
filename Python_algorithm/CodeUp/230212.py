# 2023년 2월 12일 일요일

# 6071 - 0 입력될 때까지 무한 출력하기
a = 1
while a != 0:
    a = int(input())
    if a != 0:
        print(a)

# 6072 - 정수 1개 입력받아 카운트다운 출력하기1
a = int(input())
while a != 0:
    print(a)
    a = a - 1

# 6073 - 1만큼씩 줄이면서 카운트다운 수가 0이 될 때까지 한 줄에 1개씩 출력한다.
a = int(input())
a = a - 1
while a >= 0:
    print(a)
    a = a - 1

# 6074 - a부터 입력한 문자까지 순서대로 공백을 두고 한 줄로 출력한다.
x = ord(input())
a = ord('a')
while x >= a:
    print(chr(a), end=' ')
    a += 1

# 6075 - 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
a = int(input())
x = 0
while a >= x:
    print(x)
    x += 1

# 6076 - 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다2.
a = int(input())
for i in range(a+1):
    print(a)

# 6077 - 1부터 그 수까지 짝수만 합해 출력한다.
a = int(input())
count = 0
for i in range(a+1):
    if i % 2 == 0:
        count += i
print(count)

# 6078 - 영문 소문자 'q'가 입력될 때까지 입력한 문자를 계속 출력한다.
a = ''
while a != 'q':
    a = input()
    print(a)

# 6079 - 1부터 계속 더해 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
a = int(input())
sum = 0
x = 0
while sum < a:
    sum += x
    if sum >= a:
        print(x)
    else:
        x += 1

# 6080 - 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다. 첫 번째 수는 n, 두 번째 수는 m으로 고정해 1부터 오름차순 순서로 출력하도록 한다.
a, b = input().split()
a = int(a)
b = int(b)
for i in range(1, a+1):
    for j in range(1, b+1):
        print(i, j)

# 6081 - 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다.
a = int(input(), 16)
for i in range(1, 16):
    print('%X'%a, '*%X'%i, '=%X'%(a*i), sep='')

# 6082 - 3 6 9 게임의 왕이 되자
a = int(input())
for x in range(1, a+1):
    if x % 10 == 3 or x % 10 == 6 or x % 10 == 9:
        print('X', end=' ')
    else:
        print(x, end=' ')

# 6083 - 빛 섞어 색 만들기
a, b, c = map(int, input().split())
count = 0
for i in range(a):
    for j in range(b):
        for k in range(c):
            print(i, j, k)
            count += 1
print(count)

# 6084 - 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
a, b, c, d = map(int, input().split())
print(round(a*b*c*d/8/1024/1024, 1), "MB")

# 6085 - 그림 파일 저장용량 계산하기
a, b, c = map(int, input().split())
print("{:.2f}".format(round(a*b*c/8/1024/1024, 2)), "MB")

# 6086 - 1부터 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우, 그때까지의 합을 출력
a = int(input())
sum = 0
num = 1
while sum <= a:
    sum += num
    if sum >= a:
        print(sum)
        break
    else:
        num+=1

# 6087 - 3의 배수는 통과
a = int(input())
for i in range(1, a+1):
    if i % 3 == 0:
        continue
    print(i)

# 6088 - n번째 수를 출력한다.
a, b, c = map(int, input().split())
sum = a
for i in range(1, c):
    sum += b
print(sum)

# 6089 - n번째 수를 출력한다.
a, b, c = map(int, input().split())
sum = a
for i in range(1, c):
    sum *= b
print(sum)

# 6090 - n번째 수를 출력한다.
a, b, c, d = map(int, input().split())
sum = a
for i in range(1, d):
    sum = sum * b + c
print(sum)
