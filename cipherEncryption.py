def encrypt(s,k):
    s1=""
    for char in s:
        if 'A'<=char<='Z':
            idx=ord(char)-ord('A')
            idx=(idx+k)%26
            s1+=chr(ord('A')+idx)
        elif 'a'<=char<='z':
            idx=ord(char)-ord('a')
            idx=(idx+k)%26
            s1+=chr(ord('a')+idx)
        elif '0'<=char<='9':
            idx=ord(char)-ord('0')
            idx=(idx+k)%10
            s1+=chr(ord('0')+idx)
    return s1

s="AdyZ89"
k=2
print(encrypt(s,k))