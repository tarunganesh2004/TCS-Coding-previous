n=5
def inverse_star(n):
    for i in range(n,0,-1):
        print(" "*(n-i),end=" ")

        for j in range(1,i+1):
            print("*",end=" ")
        print()


def inverse_num(n):
    for i in range(n,0,-1):
        print(" "*(n-i),end=" ")

        for j in range(1,i+1):
            print(j,end=" ")
        print()


def inverse_char(n):
    x='A'
    for i in range(n,0,-1):
        print(" "*(n-i),end=" ")

        for j in range(1,i+1):
            print(x,end=" ")
            x=chr(ord(x)+1)
        x='A'
        print()

print(inverse_num(n))

print(inverse_star(n))
print(inverse_char(n))