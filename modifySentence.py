def convert(s):
    words=s.split()

    captialized_words=[c(word) for word in words]
    return ' '.join(captialized_words)

def c(word):
    return word[0].upper()+word[1:].lower().,
s=input()
print(convert(s))