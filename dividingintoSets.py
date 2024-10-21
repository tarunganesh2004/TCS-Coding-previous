"""
bbbaaababa -> Value of str

3    -> Value of L

Output:

3   -> Maximum number of a’s

Explanation:

From the input given above.

Dividing the string into sets of 3 characters each

Set 1: {b,b,b}

Set 2: {a,a,a}

Set 3: {b,a,b}

Set 4: {a} -> leftover characters also as taken as another set

Among all the sets, Set 2 has more number of a’s. The number of a’s in set 2 is 3.

Hence, the output is 3.
"""

def max_a(s,k):
    n=len(s)
    max_val=0
    count=0

    for i in range(n):
        if i%k==0:
            max_val=max(max_val,count)
            count=0
        
        if s[i]=='a':
            count+=1

    if count>max_val:
        max_val=count

    return max_val
s=input()
k=int(input())
print(max_a(s,k))