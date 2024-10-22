def kthLargest(n,k):

    if n==1:
        return 1
    f=[]

    for i in range(1,n+1):
        if n%i==0:
            f.append(i)
    
    if k>len(f):
        return 1
    return f[-k]

n=30
k=9
print(kthLargest(n,k))
    
# def kthLargestOptimized(n,k):
#     if n==1:
#         return 1
    
#     lower_factors=[]
#     upper_factors=[]

#     for i in range(1, int(n**0.5)+1):
#         if n%i==0:
#             lower_factors.append(i)
#             if i!=n//i:
#                 upper_factors.append(n//i)

#     f=lower_factors+upper_factors[::-1]
#     if k>len(f):
#         return None
#     return f[-k]

def another_way(n,k):
    c=0
    for i in range(n,0,-1):
        if n%i==0:
            c+=1
            if c==k:
                return i
    return 1

print(another_way(n,k))