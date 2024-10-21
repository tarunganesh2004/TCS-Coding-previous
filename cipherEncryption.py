def encrypt(s,k):
    if k==0:
        return "INVALID INPUT"
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
        else:
            s1+=char
    return s1

s="AdyZ89"
s1="All the best"
k1=1
print(encrypt(s1,k1))
k=2
print(encrypt(s,k))
s3="sample"
k3=0
print(encrypt(s3,k3))