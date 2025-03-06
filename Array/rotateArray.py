def rotatetorightbyk(arr,k):
    n=len(arr)
    k%=n
    arr[:]=arr[n-k:]+arr[:n-k]
    return arr

def rotatetoleft(arr,k):
    n=len(arr)
    k%=n
    arr[:]=arr[k:]+arr[:k]
    return arr

arr=[1,2,3,4,5,6,7]
k=3
print(rotatetorightbyk(arr,k))
arr=[1,2,3,4,5,6,7]
k=3
print(rotatetoleft(arr,k))