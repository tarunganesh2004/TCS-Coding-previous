from re import sub


def generate(s):
    subsequences=[]
    n=len(s)

    total=1<<n # 2^n

    for i in range(total):
        subsequence=[]

        for j in range(n):
            if i&(1<<j):
                subsequence.append(s[j])
        subsequences.append("".join(subsequence))

    return subsequences

s="abc"
print(generate(s))