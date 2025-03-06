def countSubArrays(nums,sum):
    c=0
    cur_sum=0
    m={0:1}

    for i in range(len(nums)):
        cur_sum+=nums[i]

        if (cur_sum-sum) in m:
            c+=m[cur_sum-sum]

        if cur_sum in m:
            m[cur_sum]+=1
        else:
            m[cur_sum]=1
    
    return c

def prefixSum(nums,target):
    sumMap={}
    curSum=0
    for i in range(len(nums)):
        curSum+=nums[i]
        if curSum==target:
            print(nums[:i+1])
        if curSum-target in sumMap:
            startIndex=sumMap[curSum-target]+1
            print(nums[startIndex:i])
        sumMap[curSum]=i

nums=[3, 4, -7, 1, 3, 3, 1, 4]
sum=7
print(countSubArrays(nums,sum))
prefixSum(nums,sum)