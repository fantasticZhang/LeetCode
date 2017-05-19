# Description

Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

    Input:
    [4,3,2,7,8,2,3,1]

    Output:
    [5,6]

# Solution 1

* 设输入数组为`nums`,使用辅助数组`tmp`,长度为`nums.length+1`，初始状态所有元素都是零。
* 遍历`nums`，设当前遍历到的元素为`nums[i]`，则令`tmp[nums[i]]++`;
* 遍历`tmp`，设当前元素为`tmp[i]`，如果`tmp[i]`为零，则把`i`加入结果中。

但该方法使用了辅助数组，不满足题目要求。

# Solution 2

* 设输入数组为`nums`，把该数组本身当做辅助数组；
* 遍历`nums`，设当前遍历到的元素为`nums[i]`，则其对应的索引`index`是`Math.abs(nums[i])-1`,如果`nums[index]`大于零，则令`nums[index]=-nums[index]`；
* 完成上一步后，再遍历`num是`，设当前元素为`nums[i]`，如果`nums[i]`大于零，则把`i+1`加入结果中。
