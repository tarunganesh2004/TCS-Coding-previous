def grade(a,b,c):
    if a>50 and b>60 and c>100:
        return 10
    elif a>50 and b>60:
        return 9
    elif b>60 and c>100:
        return 8
    elif a>50 and c>100:
        return 7
    
    elif a>50 or b>60 or c>100:
        return 6
    else:
        return 5

a,b,c=map(int,input().split())
# a- hurl, b-spin, c-speed
print(grade(a,b,c))