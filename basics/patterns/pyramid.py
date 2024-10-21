# n = 5
# x = chr(ord("a") + n - 1)  # Starting character based on n

# for i in range(n):
#     # Print spaces for left padding
#     print(" " * (n - i - 1), end=" ")
#     # Print the characters
#     # print((x + " ") * (2 * i + 1))
#     print(' '.join([x]*(2*i+1)))
#     x = chr(ord(x) - 1)  # Move to the previous character for the next row


n=6
x=65
for i in range(0,n):
    print(" "*(n-i-1),end=" ")

    for j in range(0,i+1):
        print(chr(x),end=" ")
        x+=1
    x=65
    print("\r")

def printnum(n):
    for i in range(1,n+1):
        print(" "*(n-i),end=" ")
        for j in range(1,i+1):
            print(j,end=" ")

        print("\r")

printnum(5)

def printnormal(n):
    for i in range(1,n+1):
        print(" "*(n-i),end=" ")
        for j in range(1,i+1):
            print("*",end=" ")
        print("\r")
printnormal(5)
