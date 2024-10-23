def matrix(m,n,k):
    res=[]
    for i in range(1,m+1):
        for j in range(1,n+1):
            res.append(i*j)
    res.sort()
    print(res[k-1])


m=2
n=3
k=6

matrix(m,n,k) # kth smallest element in 3x3 matrix is 5