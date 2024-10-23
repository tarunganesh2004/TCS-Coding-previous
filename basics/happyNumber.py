def happy(n):
    s=set()

    while n!=1:
        if n not in s:
            s.add(n)
        else:
            return False
        
        sum=0
        while n>0:
            sum+=(n%10)*(n%10)
            n=n//10
        
        n=sum

    return True

n=19

print(happy(n))