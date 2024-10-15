def countDistinct(n):
    c=0

    if n%2==0:
        c+=1
        while n%2==0:
            n//=2
    
    for i in range(3,int(n**0.5)+1,2):
        if n%i==0:
            c+=1
            while n%i==0:
                n//=i

    if n>2:
        c+=1

    return c

s=30
print(countDistinct(s))