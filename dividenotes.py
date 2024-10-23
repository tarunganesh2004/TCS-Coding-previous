n=int(input())
notes={
    500:0,
    100:0,
    50:0,
    20:0,
    10:0,
    5:0,
    2:0,
    1:0
}

for note in notes.keys():
    if n>=note:
        notes[note]=n//note
        n-=notes[note]*note

for note,count in notes.items():
    print(f"{note} = {count}")