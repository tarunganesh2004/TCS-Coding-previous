def set_zeros(m):
    r=len(m)
    c=len(m[0]) if r>0 else 0

    zero_rows=set()
    zero_cols=set()

    for i in range(r):
        for j in range(c):
            if m[i][j]==0:
                zero_rows.add(i)
                zero_cols.add(j)
    
    
    for row in zero_rows:
        for j in range(c):
            m[row][j]=0

    for col in zero_cols:
        for i in range(r):
            m[i][col]=0

    return m


m=[
    [1,1,1],
    [1,0,1],
    [1,1,1]
]
print(set_zeros(m))