def generate(nums,index=0,cur=[]):
    if index==len(nums):
        print(cur)
        return
    
    generate(nums,index+1,cur)
    generate(nums,index+1,cur+[nums[index]])

nums=[1,2,3]
generate(nums)