def spiral(m):
    # res=[]
    # while m:
    #     res+=m.pop(0)
    #     m=list(zip(*m))[::-1]
    # return res

    res=[]
    if not m:
        return res
    top,bottom,left,right=0,len(m)-1,0,len(m[0])-1

    while top<=bottom and left<=right:
        for i in range(left,right+1):
            res.append(m[top][i])
        top+=1

        for i in range(top,bottom+1):
            res.append(m[i][right])
        right-=1

        if top<=bottom:
            for i in range(right,left-1,-1):
                res.append(m[bottom][i])
            bottom-=1

        if left<=right:
            for i in range(bottom,top-1,-1):
                res.append(m[i][left])
            left+=1

    return res


m=[[1,2,3],[4,5,6],[7,8,9]]
print(spiral(m)) # Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]