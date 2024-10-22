s,r=map(int,input().split())
rock=list(map(int,input().split()))

r1=[list(map(int,input().split())) for _ in range(r)]

c=[]

for k in r1:
    c1=sum(1 for s1 in rock if k[0]<=s1<=k[1])
    c.append(c1)

print(" ".join(map(str,c)))
