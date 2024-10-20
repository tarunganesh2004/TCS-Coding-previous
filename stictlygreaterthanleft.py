def countGreater(l):
    c=1
    max=l[0]
    for i in range(1,len(l)):
        if l[i]>max:
            c+=1
            max=l[i]
    return c
l=[2,4,5,6,8]
l1=[3,3,3,3,3,3]
print(countGreater(l1))