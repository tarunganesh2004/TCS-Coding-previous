# Subset Sum

arr=[3, 34, 4, 12, 5, 2]
sum=9

# recursion
def brute_force(arr,sum):
    def helper(arr,cur_idx,sum):
        if sum==0:
            return True
        if sum<0 or cur_idx==0:
            return False
        
        # include
        include=helper(arr,cur_idx-1,sum-arr[cur_idx-1])
        # exclude
        exclude=helper(arr,cur_idx-1,sum)

        return include or exclude
    
    return helper(arr,len(arr),sum)

# using lru_cache
def subsetSum(arr,sum):
    from functools import lru_cache
    arr=tuple(arr)
    
    @lru_cache(None)
    def helper(cur_idx,remaining_sum):
        if remaining_sum==0:
            return True
        if remaining_sum<0 or cur_idx==0:
            return False
        
        # include
        include=helper(cur_idx-1,remaining_sum-arr[cur_idx-1])
        # exclude
        exclude=helper(cur_idx-1,remaining_sum)
        
        return include or exclude
    
    return helper(len(arr),sum)

# memoization
def subsetSumMemo(arr,sum,memo={}):
    if sum==0:
        return True
    if sum<0:
        return False
    
    if sum in memo:
        return memo[sum]
    
    # include
    include=False
    for i in range(len(arr)):
        if sum>=arr[i]:
            include=include or subsetSumMemo(arr[:i]+arr[i+1:],sum-arr[i],memo)
    
    memo[sum]=include
    return memo[sum]

# dp
def subsetSumDp(arr,sum):
    dp=[[False]*(sum+1) for _ in range(len(arr)+1)]
    for i in range(len(arr)+1):
        dp[i][0]=True
    
    for i in range(1,len(arr)+1):
        for j in range(1,sum+1):
            if j<arr[i-1]:
                dp[i][j]=dp[i-1][j]
            else:
                dp[i][j]=dp[i-1][j] or dp[i-1][j-arr[i-1]]
    
    return dp[-1][-1]

print(subsetSum(arr,sum))  # True
print(subsetSumMemo(arr,sum))  # True
print(subsetSumDp(arr,sum))  # True
print(brute_force(arr,sum))  # True