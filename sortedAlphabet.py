def sorted_after(s):
    r=""
    r1=0
    for c in s:
        if c.isalpha():
            r+=c
        else:
            k=int(c)
            r1+=k
    r=sorted(r)
    r.append(str(r1))
    return "".join(r)
s="AC2BEW3"
s1 = "Z2X5C1V4BN123"
print(sorted_after(s1))