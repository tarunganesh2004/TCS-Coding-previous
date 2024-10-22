from functools import cmp_to_key
def largest(l):
    l.sort(key=lambda x:str(x) , reverse=True)
    return ''.join(map(str,l))

def smallest(l):
    l.sort(key=lambda x:str(x))
    return ''.join(map(str,l))

def compare(x,y):
    if x+y>y+x:
        return -1 # x should come before y
    elif x+y<y+x:
        return 1 # y should come before x
    else:
        return 0
def largest_comparator(l):
    str_nums=list(map(str,l))

    str_nums.sort(key=cmp_to_key(compare))

    return ''.join(str_nums)

nums=[10,2]
nums1=[3,30,34,5,9]
print(largest(nums)) # 210
print(largest(nums1)) # 9534330


# for smallest number
def compareSmallest(x,y):
    if x+y<y+x:
        return -1
    elif x+y>y+x:
        return 1
    else:
        return 0
    
def smallest_comparator(l):
    str_nums=list(map(str,l))
    str_nums.sort(key=cmp_to_key(compareSmallest))
    return ''.join(str_nums)

nums=[3,30,34,5,9]
print(smallest(nums))
print(smallest_comparator(nums)) # 102