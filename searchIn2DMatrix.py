def search_matrix(m,t):
    if not m:
        return False
    
    r,c=len(m),len(m[0])
    l,r=0,r*c-1

    while l<=r:
        mid=(l+r)//2
        mid_value=m[mid//c][mid%c]

        if mid_value==t:
            return True
        elif mid_value<t:
            l=mid+1
        else:
            r=mid-1

    return False
        
    
matrix = [[1, 3, 5], [7, 10, 11], [12, 14, 16]]

target = 10

print(search_matrix(matrix,target)) # True