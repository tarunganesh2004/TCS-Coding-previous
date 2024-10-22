def revow(s):
    v='aeiou'
    r=''
    for i in s:
        if i in v:
            r+='%'
        else:
            r+=i
    return r

def recons(s):
    v='aeiou'
    r=''
    for i in s:
        if i not in v:
            r+='#'
        else:
            r+=i
    return r

def convert(s):
    return s.upper()


# Ensure that input of each word will not exceed more than 5 characters
w1=input().strip()[:15]
w2=input().strip()[:15]
w3=input().strip()[:15]

w1m=revow(w1)
w2m=recons(w2)
w3m=convert(w3)
r=w1m+w2m+w3m
print(r)
