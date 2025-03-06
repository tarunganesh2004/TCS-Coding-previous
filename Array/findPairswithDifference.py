from collections import Counter


def find(arr,d):
    c=0
    counter=Counter(arr)

    for i in arr:
        if i+d in counter:
            c+=1
        
        if i-d in counter:
            c+=1
    
    return c//2


arr=[1,5,3,4,2]
d=2
print(find(arr,d)) # 3