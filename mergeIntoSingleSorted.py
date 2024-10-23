def merge(l1,l2):
    # l1.extend(l2)
    # l1.sort()
    # return l1

    m=len(l1)
    n=len(l2)
    l3=[]
    i,j=0,0
    while i<m and j<n:
        if l1[i]<l2[j]:
            l3.append(l1[i])
            i+=1
        else:
            l3.append(l2[j])
            j+=1

    while i<m:
        l3.append(l1[i])
        i+=1

    while j<n:
        l3.append(l2[j])
        j+=1

    return l3
n1=int(input())
l1=list(map(int,input().split()))
n2=int(input())
l2=list(map(int,input().split()))
print(merge(l1,l2))