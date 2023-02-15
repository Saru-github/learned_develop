# 2023년 2월 13일 월요일

# 6091 - 함께 문제 푸는 날
a, b, c = map(int, input().split())
day = 1
while day % a != 0 or day % b != 0 or day % c != 0:
    day += 1
print(day)

# 6092 - 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
n = int(input())
a = list(map(int,input().split()))
d = []
for i in range(24):
    d.append(0)
for i in range(n):
    d[a[i]] += 1
for i in range(1, 24):
    print(d[i], end=' ')

# 6093 - 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.
n = int(input())
a = list(map(int,input().split()))
ans = []
for x in range(n):
    ans.append(a.pop())

for i in ans:
    print(i, end=' ')

# 6094 - 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
a, b, c, d = map(int, input().split())
print(round(a*b*c*d/8/1024/1024, 1), "MB")

# 6094 - 출석을 부른 번호 중에 가장 빠른 번호를 출력한다.
n = int(input())
a = list(map(int,input().split()))
a.sort()
print(a[0])

# 6095 - 바둑판에 흰 돌 놓기
arr = []
for i in range(20) :
    arr.append([])
    for j in range(20) :
        arr[i].append(0)
n = int(input())
for i in range(n):
    x, y = map(int, input().split())
    arr[x][y] = 1

for i in range(1,20):
    for j in range(1, 20):
        print(arr[i][j], end=' ')
    print()

# 6096 - 바둑알 십자 뒤집기
pan = []
for i in range(20):
    pan.append([])
    for j in range(20):
        pan[i].append(0)
for i in range(19):
    a = input().split()
    for j in range(19):
        pan[i+1][j+1] = int(a[j])
n = int(input())

for i in range(n):
    x, y = input().split()
    x = int(x)
    y = int(y)
    for j in range(1, 20):
        if pan[j][y] == 0:
            pan[j][y] = 1
        else :
            pan[j][y] = 0

        if pan[x][j] == 0:
            pan[x][j] = 1
        else :
            pan[x][j] = 0

for i in range(1, 20):
    for j in range(1, 20):
        print(pan[i][j], end=' ')
    print()
