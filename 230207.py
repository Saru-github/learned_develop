#2023년 2월 7일 화요일

# 6007 - "C:\Download\'hello'.py" 을 출력한다
print('"C:\\Download\\\'hello\'.py"');

# 6008 - print("Hello\nWorld") 을 출력한다
print('print("Hello\\nWorld")')

# 6009 - 입력된 문자를 그대로 출력한다.
x = input();
print(x);

# 6010 - 입력된 수를 정수로 변환하여 출력한다.
x = input();
print(int(x));

# 6011 - 입력된 수를 실수로 변환하여 출력한다.
x = float(input());
print(x);

# 6012 - 입력된 두 정수를 줄을 바꿔 출력한다.
x = int(input());
y = int(input());
print(x);
print(y);

# 6013 - 순서를 바꿔 한 줄에 한 문자씩 출력한다.
x = input();
y = input();
print(y);
print(x);

# 6014 - 입력받은 실수를 줄을 바꿔 3번 출력한다.
a=input()
print(a)
print(a)
print(a)

# 6015 - 입력된 두 정수를 줄을 바꿔 출력한다.
a,b=input().split()
print(a)
print(b)

# 6016 - 2개의 문자를 순서를 바꿔 한 줄로 출력한다.
a, b = input().split()
print(b, a)

# 6017 - 공백을 두고 3번 출력한다.
a=input()
print(a, a, a)

# 6018 - 입력받은 시간 형식과 똑같이 "시:분" 형태로 출력한다.
s=input()   # a, b = input().split(':')
print(s)    # print(a, b, sep=':')

# 6019 - 대시(마이너스 기호)를 구분기호로 사용해서 일-월-연도로 바꿔 출력한다.
y,m,d = input().split('.')
print(d, m, y, sep='-')

# 6020 - '-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.
a,b = input().split('-')     # a, b = input().split('-')
print(a+b)                   # print(a,b,sep='')