
def contigous_subarray(l):
    n=len(l)
    max_sum_so_far=float('-inf')
    max_sum_ending_here=0
    start=0
    end=0
    temp_start=0

    for i in range(n):
        max_sum_ending_here+=l[i]
        if max_sum_so_far < max_sum_ending_here:
            max_sum_so_far=max_sum_ending_here
            start=temp_start
            end=i
        if max_sum_ending_here<0:
            max_sum_ending_here=0
            temp_start=i+1

    max_subarray=l[start:end+1]

    return max_sum_so_far, max_subarray,len(max_subarray)

n = int(input())
l = list(map(int, input().split()))
print(contigous_subarray(l))