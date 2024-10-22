def longest(s1,s2):

    m,n=len(s1),len(s2)

    max_len=0
    end_idx=0

    dp=[[0]*(n+1) for _ in range(m+1)]

    for i in range(1,m+1):
        for j in range(1,n+1):
            if s1[i-1]==s2[j-1]:
                dp[i][j]=dp[i-1][j-1]+1
                if dp[i][j]>max_len:
                    max_len=dp[i][j]
                    end_idx=i
    
    return s1[end_idx-max_len:end_idx]

s1="abcdxyz"
s2="xyzabcd"
print(longest(s1,s2)) # "abcd"