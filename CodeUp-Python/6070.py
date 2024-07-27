
# 6070

# 입력
# 월을 의미하는 1개의 정수가 입력된다.(1 ~ 12)
#
# 출력
# 계절 이름을 출력한다.


month = int(input())
if month // 3 == 1:
    print('spring')
elif month // 3 == 2:
    print('summer')
elif month // 3 == 3:
    print('fall')
else:
    print('winter')
