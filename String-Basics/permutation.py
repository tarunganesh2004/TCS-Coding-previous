import itertools

def string_per(s):
    per=set(itertools.permutations(s))

    sor=sorted([''.join(i) for i in per])
    return sor

print(string_per('abc'))