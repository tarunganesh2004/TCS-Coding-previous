# Evaluate post fix Expression

arr=['2','1','+','3','*']

def evaluatePostFixExpression(arr):
    st=[]
    for i in arr:
        if i in "+-*/":
            a=st.pop()
            b=st.pop()
            if i=="+":
                st.append(int(b)+int(a))
            elif i=="-":
                st.append(int(b)-int(a))
            elif i=="*":
                st.append(int(b)*int(a))
            elif i=="/":
                st.append(int(b)/int(a))
        else:
            st.append(i)

    return st.pop()

print(evaluatePostFixExpression(arr))