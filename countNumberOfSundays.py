def find_day(d):
    w=["mon","tue","wed","thu","fri","sat","sun"]
    try:
        return w.index(d)
    except ValueError:
        return -1

def count(start_day,num_days):
    start_day_idx=find_day(start_day)
    if start_day_idx==-1:
        return 0
    
    remaining_days=num_days
    num_occurences=0

    days_until_next_occurence=(7-start_day_idx)%7

    if days_until_next_occurence<=remaining_days:
        num_occurences+=1
        remaining_days-=days_until_next_occurence

    num_occurences+=remaining_days//7

    return num_occurences

s=input()
days=int(input())
print(count(s,days))