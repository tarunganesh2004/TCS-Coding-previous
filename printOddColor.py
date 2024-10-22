# from collections import Counter
# def oddColor(ball):
#     color_count=Counter(ball)
#     odd_color=[]
#     for color in color_count:
#         if color_count[color]%2==1:
#             odd_color.append(color)
#     return odd_color

def oddColor(ball):
    count=[0]*26

    for char in ball:
        if 'a'<=char<='z':
            count[ord(char)-ord('a')]+=1
        elif 'A'<=char<='Z':
            count[ord(char)-ord('A')]+=1

    odd=None
    for i in range(26):
        if count[i]%2!=0:
            odd=chr(i+ord('a')) # store the first odd count character
            break
    if odd is not None:
        print(odd)
    else:
        print("All colors are even")
n=int(input())
ball=list(map(str,input().strip().split()))[:n]

# l=oddColor(ball)
# print(' '.join(map(str,l)))
oddColor(ball)