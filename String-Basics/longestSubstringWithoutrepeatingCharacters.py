def longest_substring(s):
    if len(s)==0:
        return 0
    if len(s)==1:
        return 1
    
    left=0
    seen={}
    max_len=0
    for right in range(len(s)):
        if s[right] in seen:
            left=max(left,seen[s[right]]+1)
        seen[s[right]]=right
        max_len=max(max_len,right-left+1)
    return max_len

s="abcabcbb"
print(longest_substring(s)) # 3