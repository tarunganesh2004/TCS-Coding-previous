def reverse(num):
    k=[]
    while num>0:
        digit = num%10
        k.append(digit)
        num = num//10
    print("".join(map(str,k)))
    
reverse(1234)