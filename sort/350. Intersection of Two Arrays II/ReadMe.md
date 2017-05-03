# Description

Given two arrays, write a function to compute their intersection.

Example:

    Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:

* Each element in the result should appear as many times as it shows in both arrays.
* The result can be in any order.

# Solution

* 分别将`nums1`和`nums2`按从小到大的顺序进行排序；
* 同时遍历`nums1`和`nums2`，并将满足要求（两个数组中都存在）的元素放到结果数组中。
