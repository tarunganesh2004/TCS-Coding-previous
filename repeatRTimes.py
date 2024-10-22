def sumD(n):
    return sum(int(i) for i in str(n))

def single_digit_sum(n,r):
    if r==0:
        return 0
    
    digit_sum=sumD(n)

    total=digit_sum*r

    return sumD(total)
n=int(input())
r=int(input())
print(single_digit_sum(n,r))

def another_way(n,r):
    digit_sum=0

    while n>0:
        d=n%10
        digit_sum+=d
        n//=10

    t=digit_sum*r

    res=0

    while t>0:
        d=t%10
        res+=d
        t//=10

    return res

print(another_way(n,r))