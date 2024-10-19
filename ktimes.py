def ktimes(arr,k):
    f={}
    for n in arr:
        if n in f:
            f[n]+=1
        else:
            f[n]=1
    r=[n for n in f if f[n]==k]
    return r

n=int(input())
arr=list(map(int,input().split()))
k=int(input())
# print(ktimes(arr,k))
r=ktimes(arr,k)
for i in r:
    print(i,end=' ')