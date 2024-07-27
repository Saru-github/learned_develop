# 2023년 2월 15일 수요일

# 6097 - 설탕과자 뽑기

# 0을 채워 판을 리셋
h, w = map(int, input().split())
m = [[0 for col in range(w)] for row in range(h)]
# 막대의 갯수를 받음
n = int(input())
for i in range(n) :
    l, d, x, y = map(int, input().split())
    # 막대의 길이
    for j in range(l) :
        # 막대의 방향
        if d == 0 :
            m[x-1][y-1+j] = 1
        else :
            m[x-1+j][y-1] = 1

for i in range(h) :
    for j in range(w) :
        print(m[i][j], end = ' ')
    print()

# 6098 - 성실한 개미

# 10x10 판에 0,1,2 입력받은 값 정의
array = []
for i in range(10):
    array.append(list(map(int, input().split())))
x, y = 1, 1

# 1,1 에서 시작하여 좌표이동값 하나씩 더했을때 1이아니라면 이동하며 0일때 9로 바꾸고, 2일때 빠져나옴
while True:
    if (array[x][y] == 0):
        array[x][y] = 9
    elif (array[x][y] == 2):
        array[x][y] = 9
        break

    if ((array[x][y+1] == 1 and array[x+1][y] == 1)):
        break

    if (array[x][y+1] != 1):
        y = y + 1
    elif (array[x+1][y] != 1):
        x = x + 1

for i in range(10):
    for j in range(10):
        print(array[i][j], end=' ')
    print()