def tribonacci(n):
    if n<1:
        return 0
    f=0
    s=0
    t=1

    print(f,end=" ")
    if n>1:
        print(s,end=" ")
    if n>2:
        print(t,end=" ")

    for i in range(3,n):
        sum=f+s+t
        print(sum,end=" ")
        f=s
        s=t
        t=sum
    

n=10
tribonacci(n)