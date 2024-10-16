def pushZeros(a):
    n=len(a)
    count=0

    for i in range(n):
        if a[i]!=0:
            a[count]=a[i]
            count+=1

    while count<n:
        a[count]=0
        count+=1
            
    return a

a=[0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9]
pushZeros(a)
for i in a:
    print(i,end=" ")  # Output: 1 9 8 4 2 7 6 9 0 0 0 0 0