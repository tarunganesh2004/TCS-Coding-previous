def fine(n,l,d,x):  # noqa: E741
    f=0
    if d%2==0:
        for i in l:
            if i%2!=0:
                f+=x
    
    return f
n=int(input())
list=[]
for _ in range(n):
    list.append(int(input()))
d=int(input())
x=int(input())
print(fine(n,list,d,x))