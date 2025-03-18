# check if a number is palindrome or not

def is_palindrome(n):
    return str(n) == str(n)[::-1]

# other
def is_pal(n):
    def reverse(num):
        k=[]
        while num>0:
            digit = num%10
            k.append(digit)
            num = num//10
        return int("".join(map(str,k)))
    
    return n == reverse(n)

print(is_palindrome(12321))
print(is_palindrome(12345))
print(is_pal(12321))