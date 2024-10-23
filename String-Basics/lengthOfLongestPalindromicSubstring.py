def longest(s):
    n=len(s)
    if n==0:
        return 0
    
    # dp[i][j] will be 'true' if the string from index i to j is a palindrome.
    dp=[[False]*n for _ in range(n)]
    max_length=1

    for i in range(n):
        dp[i][i]=True

    start=0 # start index of the longest palindromic substring

    # check for sub-string of length 2.
    for i in range(n-1):
        if s[i]==s[i+1]:
            dp[i][i+1]=True
            start=i
            max_length=2

    # Check for lengths greater than 2. k is length of substring
    for length in range(3,n+1):
        for i in range(n-length+1):
            j=i+length-1

            if s[i]==s[j] and dp[i+1][j-1]:
                dp[i][j]=True
                if length>max_length:
                    start=i
                    max_length=length

    return s[start:start+max_length],max_length
s="babad"
print(longest(s))