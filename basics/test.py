# # from collections import Counter

# # l=[1, 2,3,4, 5,6,1 ,2 ,3 ,2 ,3 ,4,1,1,1,1,4]
# # c=Counter(l)

# # for i in c:
# #     print(f"Value {i} has {c[i]} occurence(s)")

# # convert number to binary
# # n=10
# # s=bin(n)[2:]
# # print(s)

# # # convert number to hexadecimal
# # n=17
# # s=hex(n)[2:]
# # print(s)

# import decimal

# # convert binary to decimal
# s='10101'
# n=int(s,2)
# print(n)

# print(ord('a'))

# from itertools import permutations,combinations,product
# l=[1,2,3]
# p=list(permutations(l,2))
# print(p)

# c=list(combinations(l,2))
# print(c)

# p=list(product(l,repeat=2))
# print(p)


# from collections import Counter,defaultdict

# c=Counter("hello")
# print(c)

# dd=defaultdict(int)
# dd['a']+=1
# print(dd)

# import heapq

# heap=[]
# heapq.heappush(heap,10)
# heapq.heappush(heap,20)
# heapq.heappush(heap,5)

# print(heapq.heappop(heap))
# print(heapq.nlargest(2,heap)) # [20,10]

# import math
# print(math.gcd(15,5))
# print(math.lcm(15,5))
# print(math.factorial(5))