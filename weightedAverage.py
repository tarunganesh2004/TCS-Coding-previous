

n=int(input())
scores=[]
weights=[]

for _ in range(n):
    score,weight=map(float,input().split())
    scores.append(score)
    weights.append(weight)

total_weight=sum(weights)
weighted_sum=0
for i in range(n):
    weighted_sum+=scores[i]*weights[i]

weighted_average=weighted_sum/total_weight
print("%.2f" %weighted_average)
