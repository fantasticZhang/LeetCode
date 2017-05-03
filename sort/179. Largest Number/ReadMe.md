# Description

Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

# Solution

* 将给定数组转化为字符串数组`divide`；
* 对`divide`进行排序：设`s1`、`s2`是待排序的两个字符串，若`s1+s2`大于`s2+s1`，则将`s1`排到`s2`前面；
* 遍历排序好的`divide`，并把每个字符串相加，遍历完毕后即得到目标数组。
