def count(l,k):
    n=len(l)

    c=0
    for i in range(n):
        for j in range(i+1,n):
            if l[i]-l[j]==k or l[j]-l[i]==k:
                c+=1

    return c
n,k=map(int,input().split())
l=list(map(int,input().split()))
print(count(l,k))