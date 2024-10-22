def generate(s):
    substrings=[]

    n=len(s)
    for i in range(n):
        for j in range(i+1,n+1):
            substrings.append(s[i:j])

    return substrings

s="abc"
print(generate(s))