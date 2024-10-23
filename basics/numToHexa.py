
n=int(input())
# try:
#     num=int(n)
#     print(hex(num)) # works only for positive integers

# except ValueError:
#     print("Invalid Input")

# def int_to_hex(n):
#     if n<0:
#         n += 2**32 # convert to 2's complement

#     if n==0:
#         return 0
    
#     hex_chars="0123456789abcdef"
#     hex_str=''

#     while n>0:
#         r=n%10
#         hex_str=hex_chars[r]+hex_str
#         n//=16

#     return hex_str

def int_to_hex(num):
    if num==0:
        return '0'
    
    mp='0123456789abcdef'

    ans=''
    for i in range(8):
        n=num&15 # means num& 1111b
        c=mp[n]
        ans=c+ans
        num=num>>4

    return ans.lstrip('0')

print(int_to_hex(n))