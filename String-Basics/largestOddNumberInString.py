def largest(num):
    for i in range(len(num-1),-1,-1):
        if int(num[i])%2!=0:
            return num[:i+1]

num="52"
print(largest(num))