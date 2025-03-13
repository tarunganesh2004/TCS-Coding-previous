# input [1,2,3,4,5]
arr=list(map(int,input().strip("[]").split(",")))
print(arr)

# input 1 2 3 4 5
arr=list(map(int,input().split()))
print(arr)

# input 1,2,3,4,5
arr=list(map(int,input().split(",")))
print(arr)


# ['A','B','C','D','E']
arr=input().strip("[]").replace("'","").split(",")
print(arr)

# input A B C D E
arr=input().split() # split input by spaces
print(arr)