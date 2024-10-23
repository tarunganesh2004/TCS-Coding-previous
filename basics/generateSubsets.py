def generate(nums,index=0,cur=[]):
    if index==len(nums):
        print(cur)
        return
    
    generate(nums,index+1,cur)
    generate(nums,index+1,cur+[nums[index]])

def another_way(nums):
    subsets=[[]]
    for num in nums:
        new_subsets=[cur+[num] for cur in subsets]
        subsets.extend(new_subsets)

    return subsets
nums=[1,2,3]
generate(nums)
print(another_way(nums))