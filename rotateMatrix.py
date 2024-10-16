def rotate_matrix(m):
    n=len(m)

    # transpose the matrix
    for i in range(n):
        for j in range(i+1,n):
            m[i][j],m[j][i]=m[j][i],m[i][j]

    # reverse the rows
    for i in range(n):
        m[i].reverse()

    return m

n=int(input())
m=[]
for _ in range(n):
    r=list(map(int,input().split()))
    m.append(r)

rotate_matrix(m)
for r in m:
    print(" ".join(map(str,r)))