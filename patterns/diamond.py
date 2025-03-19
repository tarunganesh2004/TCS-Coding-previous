n=5

def diamond_normal(n):
    # normal pyramid
    for i in range(1,n+1):
        print(" "*(n-i),end=" ")

        for j in range(1,i+1):
            print("*",end=" ")
        print()

    # inverse pyramid
    for i in range(n-1,0,-1):
        print(" "*(n-i),end=" ")

        for j in range(1,i+1):
            print("*",end=" ")
        print()

def diamond_num(n):
    # normal pyramid
    for i in range(1,n+1):
        print(" "*(n-i),end=" ")

        for j in range(1,i+1):
            print(j,end=" ")
        print()

    # inverse pyramid
    for i in range(n-1,0,-1):
        print(" "*(n-i),end=" ")

        for j in range(1,i+1):
            print(j,end=" ")
        print()

def diamond_char(n):
    x='A'
    # normal pyramid
    for i in range(1,n+1):
        print(" "*(n-i),end=" ")

        for j in range(1,i+1):
            print(x,end=" ")
            x=chr(ord(x)+1)
        x='A'
        print()
    
    # inverse pyramid
    for i in range(n-1,0,-1):
        print(" "*(n-i),end=" ")

        for j in range(1,i+1):
            print(x,end=" ")
            x=chr(ord(x)+1)
        x='A'
        print()



print(diamond_normal(n))
print(diamond_num(n))
print(diamond_char(n))