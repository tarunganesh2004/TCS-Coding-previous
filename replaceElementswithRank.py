def replace(a):
    sorted=a.copy()
    sorted.sort()
    n=len(sorted)


    rank_map={}
    rank=1

    for i in range(n):
        if sorted[i] not in rank_map:
            rank_map[sorted[i]]=rank
            rank+=1

    res=[rank_map[num] for num in a]
    return res

a=[10, 8, 15, 12, 6, 20, 1]
print(replace(a))  # Output: [4, 3, 6, 5, 2, 7, 1]