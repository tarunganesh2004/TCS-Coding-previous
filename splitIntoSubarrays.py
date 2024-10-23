def canSplit(l):
    n=len(l)

    if sum(l)%2!=0:
        return False
    
    target=sum(l)//2

    running_sum=0
    for i in range(n):
        running_sum+=l[i]
        if running_sum==target:
            return True
        
    return False

l=[1,2,3,4,5,5]
print(canSplit(l))

def canSplitForK(l,k):
    total_sum=sum(l)

    if total_sum%k!=0:
        return False
    
    target_sum=total_sum//k
    running_sum=0
    subarrays_found=0
    for num in l:
        running_sum+=num
        if running_sum==target_sum:
            subarrays_found+=1
            running_sum=0

        if subarrays_found==k:
            return True
    return False

print(canSplitForK(l,2))