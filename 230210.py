# 2023년 2월 10일 금요일

# 6051 - 정수 2개 입력받아 비교하기4
a,b = input().split()
print(a != b)

# 6052 - 정수 입력받아 참 거짓 평가하기
a = int(input())
print(a != int(0))

# 6053 - 참 거짓 바꾸기
a = bool(int(input()))
print(not a)

# 6054 - 둘 다 참일 경우만 참 출력하기
a,b = input().split()
print(bool(int(a)) | bool(int(b)))

# 6055 - 하나라도 참이면 참 출력하기
a,b = input().split()
print(bool(int(a)) | bool(int(b)))

# 6056 - 참/거짓이 서로 다를 때에만 참 출력하기
a,b = input().split()
a = bool(int(a))
b = bool(int(b))
print((a and (not b)) or ((not a) and b))

# 6057 - 참/거짓이 서로 같을 때에만 참 출력하기
a,b = input().split()
a = bool(int(a))
b = bool(int(b))
print(a == b)

# 6058 - 둘 다 거짓일 경우만 참 출력하기
a,b = input().split()
a = bool(int(a))
b = bool(int(b))
print(not(a or b))

# 6059 - 비트단위로 NOT 하여 출력하기
a = int(input())
print(~a)

# 6060 - 비트단위로 AND 하여 출력하기
a,b = input().split()
print((int(a) & int(b)))