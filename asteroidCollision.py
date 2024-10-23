def asteroidCollision(a):
    s=[]
    for i in a:
        while s and i<0 and s[-1]:
            # collision occurs
            if abs(i)>abs(s[-1]):
                s.pop()
                continue
            elif abs(i)==abs(s[-1]):
                s.pop()
            break
        else:
            s.append(i)

    return s


a=[5,10,-5]
print(asteroidCollision(a)) # Output: [5, 10]