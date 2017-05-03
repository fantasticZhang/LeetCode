# Description

Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....

Example:

1. Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6].
2. Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].

# Solution

* 复制`nums`到`tmp`；
* 对`tmp`按从大到小的顺序进行排序；
* 分别从`tmp`中间的元素和最后一个元素开始向前，每次轮流复制一个元素到`nums`,复制完毕后就得到了目标数组。
