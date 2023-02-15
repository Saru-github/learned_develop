# 2023년 2월 11일 토요일

# 6061 - 비트단위로 OR 하여 출력하기
a,b = input().split()
print((int(a) | int(b)))

# 6062 - 비트단위로 XOR 하여 출력하기
a,b = input().split()
print((int(a) ^ int(b)))

# 6063 - 정수 2개 입력받아 큰 값 출력하기
a, b = input().split()
print(a if (int(a) > int(b)) else b)

# 6064 - 정수 3개 입력받아 가장 작은 값 출력하기
a, b, c = input().split()
print((a if int(a) < int(b) else b) if ((int(a) if int(a) < int(b) else int(b)) < int(c)) else c)


# 6065 - 정수 3개 입력받아 짝수만 출력하기
a, b, c = input().split()
if int(a) % 2 == 0:
    print(a)
if int(b) % 2 == 0:
    print(b)
if int(c) % 2 == 0:
    print(c)

# 6066 - 정수 3개 입력받아 짝/홀 출력하기
a, b, c = input().split()
if int(a) % 2 == 0:
    print('even')
else:
    print('odd')
if int(b) % 2 == 0:
    print('even')
else:
    print('odd')
if int(c) % 2 == 0:
    print('even')
else:
    print('odd')

# 6067 - 정수 1개 입력받아 분류하기
a = int(input())
if a < 0:
    if a % 2 == 0:
        print('A')
    else:
        print('B')
else:
    if a % 2 == 0:
        print('C')
    else:
        print('D')

# 6068 - 점수 입력받아 평가 출력하기
a = int(input())
if a >= 90:
    print('A')
elif a >= 70:
    print('B')
elif a >= 40:
    print('C')
else:
    print('D')

# 6069 - 평가 입력받아 다르게 출력하기
a = input()
if a == 'A':
    print('best!!!')
elif a == 'B':
    print('good!!')
elif a == 'C':
    print('run!')
elif a == 'D':
    print('slowly~')
else :
    print('what?')

# 6070 - 월 입력받아 계절 출력하기
a = int(input())
if 3 <= a & a <= 5:
    print('spring')
elif 6 <= a & a <= 8:
    print('summer')
elif 9 <= a & a <= 11:
    print('fall')
else:
    print('winter')