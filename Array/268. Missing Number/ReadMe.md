# Description

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example：

    Given nums = [0, 1, 3] return 2.

Note:

Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

# Solution

设数组长度为`n`，则一个没有丢失数字的完整数组的值应该是`0,1,2,3,...n`，而给定的缺少的数组所缺失的值也应该是`0,1,2,3,...n`其中的一个。利用这个特点，有两种解决思路：

* 求和并求差：令`count=0+1+2+...+n=n*(n+1)/2`，`sum`为给定数组所有元素的和，则`count-sum`的结果即为缺失的数字。代码见Solution2.java、Solution3java；
* 异或思想：设两个数`a`、`b`，则`a^b^b = a`，这意味着具有相同数字的两个xor操作将消除数字并显示原始数字。所以，`0^1^...^n^nums[0]^...^nums[n-1]`，最后的结果变是缺失的数字（未缺失的数字都将消除）。代码见Solution1.java。
