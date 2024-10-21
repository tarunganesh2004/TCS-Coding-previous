# program that adds up the largest row sum and largest column sum of a matrix.

def largestSum(mat):
    r=len(mat)
    c=len(mat[0])
    max_row_sum=float('-inf')
    max_col_sum=float('-inf')

    for i in range(r):
        row_sum=0
        for j in range(c):
            row_sum+=mat[i][j]
        max_row_sum=max(max_row_sum,row_sum)
    
    for i in range(c):
        col_sum=0
        for j in range(r):
            col_sum+=mat[j][i]
        max_col_sum=max(max_col_sum,col_sum)

    return max_row_sum+max_col_sum

m=int(input())
n=int(input())

mat = []
for i in range(m):
    mat.append(list(map(int, input().split())))
print(largestSum(mat))