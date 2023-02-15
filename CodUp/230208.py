
#2023년 2월 8일 수

# 6021 - 각 문자를 한 줄에 한 문자씩 줄을 바꿔 출력한다.
a=input()
for x in a :
    print(x)

# 6022 - 년도(YY) 월(MM) 일(DD)을 공백으로 구분해 한 줄로 출력한다.
s = input()
print(s[0:2], s[2:4], s[4:6], sep=' ')

# 6023 - 분만 출력한다.
h,m,s = input().split(":");
print(m)

# 6024 - 입력된 2개의 단어를 순서대로 붙여 출력한다.
a,b = input().split()
print(a+b)

# 6025 - 두 정수의 합을 출력한다.
a,b = input().split()
print(int(a)+int(b))

# 6026 - 두 실수의 합을 출력한다.
a = input()
b = input()
print(float(a)+float(b))

# 6027 - 16진수(소문자) 형태로 출력한다.
a = input()
print('%x'%int(a))

# 6028 - 16진수(대문자) 형태로 출력한다.
a = input()
print('%X'%int(a))


# 6029 - 16진 정수 입력받아 8진수로 출력하기
a = input()
print('%o'%int(a,16))

# 6030 - 영문자 1개 입력받아 10진수로 변환하기
a = ord(input())
print(a)

# 6031 - 정수 입력받아 유니코드 문자로 변환하기
a = chr(int(input()))
print(a)