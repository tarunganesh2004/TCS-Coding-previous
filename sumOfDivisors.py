def sum(n):
    if n==1:
        return 1
    s=0

    for i in range(1,int(n**0.5)+1):
        if n%i==0:
            s+=i
            if i!=n//i:
                s+=n//i
    return s

n=10
print(sum(n))