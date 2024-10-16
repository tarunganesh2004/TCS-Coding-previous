def searchMatrix(m,x):
    r=len(m)
    c=len(m[0])

    i,j=0,c-1

    while i<r and j>=0:
        if m[i][j]==x:
            return (i,j)
        elif m[i][j]>x:
            j-=1
        else:
            i+=1

    return (-1,-1)

r=int(input())
c=int(input())
m=[]
for _ in range(r):
    row=list(map(int,input().split()))
    m.append(row)
x=int(input())

print(searchMatrix(m,x))