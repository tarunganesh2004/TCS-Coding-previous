def gcd(a,b):
    while b!=0:
        a,b=b,a%b
    return a

def gcdInRange(a):
    res=a[0]
    for i in range(1,len(a)):
        res=gcd(res,a[i])
    return res

print(gcd(10,15))
a=[2,4,6,8,16]
print(gcdInRange(a))
