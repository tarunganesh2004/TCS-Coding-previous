def trailingzeros(n):
    c=0
    while n>0:
        n=n//5
        c+=n
    return c

n=5
print(trailingzeros(n))