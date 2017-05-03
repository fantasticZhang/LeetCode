# Description

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

  Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

# Solution

借助`HashMap`完成算法。遍历`nums`数组，设当前遍历到的元素为`nums[i]`，则查找`HashMap`中是否包含key`target-nums[i]`,如果包含则返回`[i,HashMap.get(target-nums[i])]`;如果不包含则把当前元素放入`HashMap`,其中key为`nums[i]`，value为`i`,并继续遍历`nums`。
