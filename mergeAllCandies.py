import heapq
def min_time(candies):
    heapq.heapify(candies)
    total_time=0

    while len(candies)>1:
        first=heapq.heappop(candies)
        second=heapq.heappop(candies)

        merge_time=first+second
        total_time+=merge_time

        heapq.heappush(candies,merge_time)

    return total_time


t=int(input())
for _ in range(t):
    n=int(input())
    candies=list(map(int,input().split()))
    # candies.sort()
    # print(sum(candies[::2]))
    r=min_time(candies)
    print(r)