def kthLargest(n,k):

    if n==1:
        return 1
    f=[]

    for i in range(1,n+1):
        if n%i==0:
            f.append(i)
    
    if k>len(f):
        return None
    return f[-k]

n=10
k=2
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