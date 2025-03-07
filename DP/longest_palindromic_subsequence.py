# Longest Palindromic Subsequence

s="bbbab"

def longest_palindromic_subsequence(s):
    def helper(i,j):
        if i==j:
            return 1
        if i>j:
            return 0
        if s[i]==s[j]:
            return 2+helper(i+1,j-1)
        else:
            return max(helper(i+1,j),helper(i,j-1))
    return helper(0,len(s)-1) # recursive

# memoization
def lps_memo(s,i,j,memo):
    if i==j:
        return 1
    if i>j:
        return 0
    if (i,j) in memo:
        return memo[(i,j)]
    if s[i]==s[j]:
        memo[(i,j)]=2+lps_memo(s,i+1,j-1,memo)
    else:
        memo[(i,j)]=max(lps_memo(s,i+1,j,memo),lps_memo(s,i,j-1,memo))
    return memo[(i,j)]

# bottom-up
def lps_bottom_up(s):
    n=len(s)
    dp=[[0]*n for _ in range(n)]
    for i in range(n):
        dp[i][i]=1
    for i in range(n-1,-1,-1):
        for j in range(i+1,n):
            if s[i]==s[j]:
                dp[i][j]=2+dp[i+1][j-1]
            else:
                dp[i][j]=max(dp[i+1][j],dp[i][j-1])
    return dp[0][n-1]

print(longest_palindromic_subsequence(s)) # 4
print(lps_memo(s,0,len(s)-1,{})) # 4
print(lps_bottom_up(s)) # 4