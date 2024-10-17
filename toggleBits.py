import math
def toggle(n):
    k=(1<<int(math.log2(n))+1)-1
    return n^k

def toggleAnother(n):
    b=bin(n)[2:]

    # replace '1' with '0' and '0' with '1'
    toggled_binary=''.join('1' if bit=='0' else '0' for bit in b)

    return int(toggled_binary,2)
n=10
print(toggle(n))
print(toggleAnother(n))

