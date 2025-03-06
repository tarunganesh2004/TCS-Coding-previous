def equilibrium(a):

    n=len(a)
    left_sum=0
    right_sum=sum(a)

    for i in range(n):
        right_sum-=a[i]

        if left_sum==right_sum:
            return i
        
        left_sum+=a[i]

    return -1

a=[-7, 1, 5, 2, -4, 3, 0]
a1=[1,2,3,4]
print(equilibrium(a))  # Output: 3