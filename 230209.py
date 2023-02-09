
#2023년 2월 8일 수

# 6032 - 정수 1개 입력받아 부호 바꾸기
a=int(input())
print(-a)

# 6033 - 문자 1개 입력받아 다음 문자 출력하기
s = ord(input())
print(chr(s+1))

# 6034 - 정수 2개 입력받아 차 계산하기
a, b = input().split()
print(int(a)-int(b))

# 6035 - 실수 2개 입력받아 곱 계산하기
a,b = input().split()
print(float(a)*float(b))

# 6036 - 단어 여러 번 출력하기
a,b = input().split()
print(a*int(b))

# 6037 - 문장 여러 번 출력하기
a = input();
b = input();
print(int(a)*b)

# 6038 - 정수 2개 입력받아 거듭제곱 계산하기
a,b = input().split()
print(int(a)**int(b))

# 6039 - 실수 2개 입력받아 거듭제곱 계산하기
a,b = input().split()
print(float(a)**float(b))

# 6040 - 정수 2개 입력받아 나눈 몫 계산하기
a,b = input().split()
print(int(a)//int(b))

# 6041 - 정수 2개 입력받아 나눈 나머지 계산하기
a,b = input().split()
print(int(a)%int(b))

# 6042 - 실수 1개 입력받아 소숫점이하 자리 변환하기
a = input()
print(format(float(a), ".2f"))

# 6043 - 실수 2개 입력받아 나눈 결과 계산하기
a,b = input().split()
print(format(float(a)/float(b), ".4f"))

# 6044 - 정수 2개 입력받아 자동 계산하기
a,b = input().split()
print(int(a)+int(b))
print(int(a)-int(b))
print(int(a)*int(b))
print(int(a)//int(b))
print(int(a)%int(b))
print(format(int(a)/int(b), ".2f"))

# 6045 - 정수 3개 입력받아 합과 평균 출력하기
a, b, c = input().split()
sum = int(a) + int(b) + int(c)
print(sum, format(sum/3, ".2f"))

# 6046 - 정수 1개 입력받아 2배 곱해 출력하기
a = input()
print(int(a)<<1)

# 6047 - 2의 거듭제곱 배로 곱해 출력하기
a,b = input().split()
print(int(a)<<int(b))

# 6048 - 정수 2개 입력받아 비교하기1
a,b = input().split()
print(int(a)<int(b))

# 6049 - 정수 2개 입력받아 비교하기2
a,b = input().split()
print(int(a)==int(b))

# 6050 - 정수 2개 입력받아 비교하기3
a,b = input().split()
print(int(a)<=int(b))