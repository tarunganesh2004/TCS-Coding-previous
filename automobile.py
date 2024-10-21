# TCS PYQ
"""
An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:



1st data, Total number of vehicle (two-wheeler + four-wheeler) = V
2nd data, Total number of wheels = W


The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
"""
v=int(input())
w=int(input())


# TW+FW=V
# 2*TW+4*FW=W
# TW=(4*V-W)/2
x=0
if w<=2 or w%2!=0 or v>w:
    print("INVALID INPUT")
else:
    x=(4*v-w)//2
    print(f"TW = {x} FW = {v-x}")