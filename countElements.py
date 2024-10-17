def count(nums):
    n=len(nums)
    c=0
    max=float('-inf')
    for i in range(n):
        if nums[i]>max:
            max=nums[i]
            c+=1
            
    return c

nums=[7,4,8,2,9]
print(count(nums))