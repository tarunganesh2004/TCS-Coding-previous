# x=2.00000

# n=10
# print(x**n) # 1024.0
# r=x**n
# print(f"{r:.5f}") # 1024.0

x=input("")
n=int(input())

r=float(x)**n

decimal_places=len(x.split('.')[-1]) if '.' in x else 0

formated=f"{r:.{decimal_places}f}"

print(formated)