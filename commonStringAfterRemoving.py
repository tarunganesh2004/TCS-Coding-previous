"""
tiger ->Input string A

ti ->Input string B

output:

ger ->output string C

Explanation:

After removing “t” and “I” from “tiger”. We are left with “ger”. So the answer is “ger”.
"""

def commonStringAfterRemoving(s1,s2):

    # for i in s2:
    #     s1=s1.replace(i," ")
    # return s1.replace(" ","")
    s1=s1.lower()
    s2=s2.lower()

    c=''.join(char for char in s1 if char not in s2)
    return c



s1=input()
s2=input()
print(commonStringAfterRemoving(s1,s2))