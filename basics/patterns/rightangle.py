n=3
def p(n):
    k=1
    x='a'
    for i in range(0,n):
        for j in range(0,i+1):
            print(x,end=" ")
            # k=k+1
            x=chr(ord(x)+1)

        print("\r")

def inverse(n):
    x='a'
    for i in range(n,0,-1):
        for j in range(0,i):
            print(x,end=" ")
            x=chr(ord(x)+1)
        print("\r")
p(n)
inverse(n)