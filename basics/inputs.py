# lines=[]
# while True:
#     line=int(input())
#     if line==-1:
#         break
#     lines.append(line)

# print(lines)

# matrix

# r=int(input())
# c=int(input())

# m=[]
# for i in range(r):
#     row=list(map(int,input().split()))
#     m.append(row)

# print(m)

n=int(input())
l=list(map(int,input().split()))

length=len(l)

if length==0:
    print("Empty list")

elif int(length**0.5)**2 !=length:
    print("Not a square matrix")
else:
    size=int(length**0.5)
    m=[]
    for i in range(size):
        row=l[i*size:(i+1)*size]
        m.append(row)

    print(m)
    
# print(m)

