def pascal(n):
    t=[]

    for i in range(n):
        r=[1]*(i+1)

        for j in range(1,i):
            r[j]=t[i-1][j-1]+t[i-1][j]

        t.append(r)

    for i in t:
        print(" "*(n-len(i)),end=" ")
        print(' '.join(map(str,i)))


n=5
pascal(n)