# # input [1,2,3,4,5]
# arr=list(map(int,input().strip("[]").split(",")))
# print(arr)

# # input 1 2 3 4 5
# arr=list(map(int,input().split()))
# print(arr)

# # input 1,2,3,4,5
# arr=list(map(int,input().split(",")))
# print(arr)


# # ['A','B','C','D','E']
# arr=input().strip("[]").replace("'","").split(",")
# print(arr)

# # input A B C D E
# arr=input().split() # split input by spaces
# print(arr)

# # matrix
# # input [[1,2,3],[4,5,6],[7,8,9]]
# matrix=[list(map(int,row.strip("[]").split(","))) for row in input().strip("[]").split("],")]
# print(matrix)

# # input 1 2 3 4 5 6 7 8 9
# matrix=[list(map(int,input().split()) for i in range(3))]
# print(matrix)

# n=int(input())
# m=[]
# for _ in range(n):
#     arr=list(map(int,input().split()))
#     m.append(arr)
# # print(m)
# for row in m:
#     print(" ".join(map(str,row)))


# single character input
# input A
c=input()[0]
print(c)

# take multiple characters as input

chars=list(input().strip())
print(chars)