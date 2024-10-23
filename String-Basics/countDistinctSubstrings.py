from numpy import char


def count_distinct(s):
    n=len(s)
    left=0
    char_count={}
    total_substrings=0

    for right in range(n):
        char_count[s[right]]=char_count.get(s[right],0)+1

        while char_count[s[right]]>1:
            char_count[s[left]]-=1
            if char_count[s[left]]==0:
                del char_count[s[left]]
            left+=1

        total_substrings+=right-left+1
    
    return total_substrings

s="aba"
print(count_distinct(s))

def count_distinct_with_k(s,k):
    return at_most_k_distinct(s,k)-at_most_k_distinct(s,k-1)

def at_most_k_distinct(s,k):
    left=0
    char_count={}

    total_substrings=0

    for right in range(len(s)):
        char_count[s[right]]=char_count.get(s[right],0)+1

        while len(char_count)>k:
            char_count[s[left]]-=1
            if char_count[s[left]]==0:
                del char_count[s[left]]
            left+=1
        
        total_substrings+=right-left+1
    
    return total_substrings

s1="aba"
k=2
print(count_distinct_with_k(s1,k))
