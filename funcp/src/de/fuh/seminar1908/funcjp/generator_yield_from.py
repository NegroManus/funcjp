def chain(*iterables):
    for it in iterables:
       yield from it
       
nums = list(chain([1,2,3], [4,5,6]))
print(nums)