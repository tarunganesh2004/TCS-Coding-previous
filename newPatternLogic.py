# 6,28,66,120,190,276

n=int(input())
a=0
b=3
for i in range(1,n+1):
    for j in range(1,i+1):
        a+=2
        if i==1:
            b=3
        else:
            b+=4

        term=a*b

        print(f"{term:05d}",end=" ")
    print()