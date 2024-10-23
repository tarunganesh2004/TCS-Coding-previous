from collections import Counter

def sort_characters_by_frequency(s):
    c=Counter(s)

    sorted_c=sorted(c.items(),key=lambda item:(-item[1],item[0]))

    res=''.join(char*count for char,count in sorted_c)

    return res

s="tree"
print(sort_characters_by_frequency(s))