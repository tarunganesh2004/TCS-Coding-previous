s="97.80"

def isEven(s):
    s=s.rstrip("0")
    s=s.rstrip('.')
    n=int(s[-1])

    return n & 1==0

print(isEven(s))