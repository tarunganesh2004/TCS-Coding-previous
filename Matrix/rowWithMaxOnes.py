def max_rows(m):
    r=len(m)
    c=len(m[0]) if r>0 else 0
    max_row=-1
    row=0
    col=c-1

    while row<r and col>=0:
        if m[row][col]==1:
            max_row=row
            col-=1
        else:
            row+=1
        
    return max_row

m = [[0, 0, 0, 1], [0, 1, 1, 1], [1, 1, 1, 1], [0, 0, 0, 0]]
print(max_rows(m))