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