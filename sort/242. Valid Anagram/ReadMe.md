# Description

Given two strings s and t, write a function to determine if t is an anagram of s.

For example：

    s = "anagram", t = "nagaram", return true.
    s = "rat", t = "car", return false.

# Solution

* 将字符串`s`和`t`分别转化成字符数组`s1`和`s2`；
* 分别对`s1`和`s2`按从大到小的顺序进行排序；
* 将排序好的`s1`和`s2`再转化成字符串，并分别赋值给`s`和`t`；
* 如果`s`和`t`相同，则说明满足要求，返回`true`；否则返回`false`。
