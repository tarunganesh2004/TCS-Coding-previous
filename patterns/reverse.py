n=3
char=chr(ord('a')+(n*(n+1))//2-1) # 'f'
c=chr(ord('a')+n-1) # 'c'
for i in range(n,0,-1):
    for j in range(0,i):
        print(char,end=" ")
        char=chr(ord(char)-1)
    print("\r")