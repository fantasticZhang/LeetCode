# Description

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:

* You must do this in-place without making a copy of the array.
* Minimize the total number of operations.

# Solution

解决思路是在遍历数组的同时移动非零元素，向前移动的位置即为当前数组中0的个数，这样遍历结束后便得到了符合要求的数组。

* 令`count`为当前数组中0的个数；
* 遍历数组，设当前元素为`nums[i]`，如果为0，则`count++`;如果不为0且`count`大于0，则令`nums[i-count]=nums[i]`，`nums[i]=0`；
* 遍历结束，即得到符合要求的数组。
