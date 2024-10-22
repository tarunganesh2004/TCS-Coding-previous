def is_prime(n):
    if n<=1:
        return False
    if n<=3:
        return True
    if n%2==0 or n%3==0:
        return False
    i=5
    while i*i<=n:
        if n%i==0 or n%(i+2)==0:
            return False
        i+=6
    return True

def generate_primes(n):
    p=[]
    for i in range(2,n+1):
        if is_prime(i):
            p.append(i)
    return p

def count_consecutive(n):
    primes=generate_primes(n)
    count=0

    for p in primes:
        if p>=5:
            sum_of_primes=0
            for j in primes:
                sum_of_primes+=j
                if sum_of_primes>p:
                    break

                if sum_of_primes==p:
                    count+=1
                    break
 
    return count
n=20 # 2
print(count_consecutive(n))