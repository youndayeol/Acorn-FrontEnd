'''
Created on 2023. 8. 16.

@author: D
'''
#리스트(배열)
a = [1, 2, 3]
b = [2, 3, 4]
c = [0, 0, 0]
c[0] = a[0] + b[0]
c[1] = a[1] + b[1]
c[2] = a[2] + b[2]
print(c)

#내장함수 출력(내장함수)
print(max(a))
print(min(a))
#리스트 더하기
print(a + b)

#변수선언
intType = 6
floatType = 6.5
stringType = "Y"
booleanType = False

# 데이터 타입 출력
print(type(intType))
print(type(floatType))
print(type(stringType))
print(type(booleanType))

# 강제 타입 캐스팅
print((int)(floatType))

# bool 체크
intType1 = 0;
print((bool)(intType1))
intType2 = 0;
print((bool)(intType2))
floatType1 = 1.5;
floatType2 = 0.0;
stringType1 = "aAQA"
stringType2 = ""