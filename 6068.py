
# 6068

# 입력
# 정수(0 ~ 100) 1개가 입력된다.
#
# 출력
# 평가 결과를 출력한다.
# 점수 범위 : 평가
# 90 ~ 100 : A
# 70 ~   89 : B
# 40 ~   69 : C
# 0 ~   39 : D

a = int(input())

if a <= 100 and a >= 90:
    print('A')
elif a >= 70:
    print('B')
elif a >= 40:
    print('C')
else:
    print('D')