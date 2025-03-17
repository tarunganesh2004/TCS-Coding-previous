# 0-1 knapsack problem

p=[1,2,5,6]
w=[2,3,4,5]
cap=8

# recursion
def brute_force(p,w,cap):
    def helper(p,w,n,cap):
        if n==0 or cap==0:
            return 0
        
        
        # include
        if w[n-1]<=cap:
            include=p[n-1]+helper(p,w,n-1,cap-w[n-1])
        else:
            include=0

        # exclude
        exclude=helper(p,w,n-1,cap)

        return max(include,exclude)
    
    return helper(p,w,len(p),cap)

# using lru_cache
def knapsack(p,w,cap):
    from functools import lru_cache
    p=tuple(p)
    w=tuple(w)
    
    @lru_cache(None)
    def helper(n,cap):
        if n==0 or cap==0:
            return 0
        
        # include
        if w[n-1]<=cap:
            include=p[n-1]+helper(n-1,cap-w[n-1])
        else:
            include=0

        # exclude
        exclude=helper(n-1,cap)

        return max(include,exclude)
    
    return helper(len(p),cap)

# memoization
def knapsackMemo(p,w,cap):
    memo={}
    def helper(n,cap):
        if n==0 or cap==0:
            return 0
        
        if (n,cap) in memo:
            return memo[(n,cap)]
        
        # include
        if w[n-1]<=cap:
            include=p[n-1]+helper(n-1,cap-w[n-1])
        else:
            include=0

        # exclude
        exclude=helper(n-1,cap)

        memo[(n,cap)]=max(include,exclude)
        return memo[(n,cap)]
    
    return helper(len(p),cap)


# dp
def knapsackDp(p,w,cap):
    dp=[[0]*(cap+1) for _ in range(len(p)+1)]
    for i in range(1,len(p)+1):
        for j in range(1,cap+1):
            if w[i-1]<=j:
                dp[i][j]=max(p[i-1]+dp[i-1][j-w[i-1]],dp[i-1][j])
            else:
                dp[i][j]=dp[i-1][j]
    return dp[-1][-1]

print(brute_force(p,w,cap))
print(knapsack(p,w,cap))
print(knapsackMemo(p,w,cap))
print(knapsackDp(p,w,cap))