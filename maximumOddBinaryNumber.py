def maxOddBinary(s):
    c_1=s.count('1')

    if c_1==0:
        return ""
    
    res= '1'*(c_1-1) +'0'*(len(s)-c_1)+'1'
    return res

    return res
s="100110"
print(maxOddBinary(s))