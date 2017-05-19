# Description

Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:

    Input: [1,4,3,2]

    Output: 4

Explanation: n is 2, and the maximum sum of pairs is 4.

Note:

* n is a positive integer, which is in the range of [1, 10000].
* All the integers in the array will be in the range of [-10000, 10000].

# Solution

* 对数组按从小到大的顺序进行排序；
* 将数组第1、3、5、7...个元素进行求和，即得到满足题目要求的结果。

# 算法解析

1. 假设在每一对(ai,bi)中, bi >= ai；
2. 令 Sm = min(a1, b1) + min(a2, b2) + ... + min(an, bn)，则最大的Sm即为本题的答案。 在上一条件下 Sm = a1 + a2 + ... + an；
3. 令 Sa = a1 + b1 + a2 + b2 + ... + an + bn， 对于给定的输入，Sa的值是常量；
4. 令 di = |ai - bi|. 在条件1下, di = bi - ai。令 Sd = d1 + d2 + ... + dn；
5. 则 Sa = a1 + a1 + d1 + a2 + a2 + d2 + ... + an + an + di = 2Sm + Sd => Sm = (Sa - Sd) / 2。在给定输入下，Sa是常量，则当Sd最小时Sm最大；
6. 因此，该问题转化为了对于一个给定数组，使得di（即每一对之间的距离）的和最小。 显然，对数组进行排序后，相邻元素之间的距离最小。
