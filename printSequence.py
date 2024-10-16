def printseq(n):

    l=[0]*n

    p2=1
    p3=1

    for i in range(n):
        if isPrime(i+1):
            l[i]=p2
            p2*=2
        elif isPerfectSquare(i+1):
            l[i]=p3
            p3*=3
        else:
            l[i]=l[i-1]+l[i-2]

    return l

def isPrime(n):
    if n==1:
        return False
    
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False
    
    return True


def isPerfectSquare(n):
    x=n**0.5
    return x==int(x)

n=15
print(printseq(n))
        