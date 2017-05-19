# Description

Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:

    Input: [3, 2, 1]

    Output: 1

    Explanation: The third maximum is 1.

Example 2:

    Input: [1, 2]

    Output: 2

    Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:

    Input: [2, 2, 3, 1]

    Output: 1

    Explanation: Note that the third maximum here means the third maximum distinct number.

Both numbers with value 2 are both considered as second maximum.

# Solution 1

对数组进行了三次遍历，第一次遍历求出最大值，第二次遍历求出次大的，第三次遍历求出第三大的，比较三个数，返回符合要求的结果。

# Solution 2

只对数组进行了一次遍历，比较当前元素和`max`、`second`、`third`的大小，然后分不同情况进行处理，在遍历结束后便得到了符合要求的结果。
