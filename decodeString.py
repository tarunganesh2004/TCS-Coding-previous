def decode_string(s):
    st=[]
    cur_num=0
    cur_str=""
    
    for c in s:
        if c.isdigit():
            cur_num=cur_num*10+int(c)
        elif c=='[':
            st.append((cur_num,cur_str))
            cur_num=0
            cur_str=""
        elif c==']':
            num,prev_str=st.pop()
            cur_str=prev_str+num*cur_str
        else:
            cur_str+=c
    return cur_str


s="3[a3[b]1[ab]]"
print(decode_string(s))