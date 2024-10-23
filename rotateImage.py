def rotate(m):
    n=len(m)

    for i in range(n):
        for j in range(i,n):
            m[i][j],m[j][i]=m[j][i],m[i][j]
    
    for i in range(n):
        m[i].reverse()

    return m

m=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]
print(rotate(m)) # Output: [[7, 4, 1], [8, 5, 2], [9, 6, 3]]