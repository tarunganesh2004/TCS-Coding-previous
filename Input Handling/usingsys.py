import sys

# # read entire input at once and split into a list
# data=sys.stdin.read().split()
# # print(data)

# n=int(data[0])

# arr=list(map(int,data[1:n+1]))
# print(arr)

# line by line input
s=sys.stdin.readline().strip()
n=int(sys.stdin.readline())
arr=list(map(int,sys.stdin.readline().split()))

print(s)
print(n)
print(arr)

# reading a 2d matrix
n,m=map(int,sys.stdin.readline().split())

matrix=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]
for row in matrix:
    print(" ".join(map(str,row)))