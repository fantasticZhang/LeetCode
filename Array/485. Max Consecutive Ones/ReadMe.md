# Description

Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:

    Input: [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s.
        The maximum number of consecutive 1s is 3.

Note:

* The input array will only contain 0 and 1.
* The length of input array is a positive integer and will not exceed 10,000

# Solution

* 使用`maxNum`记录最大的连续1的个数，`tmpNum`记录当前连续1的个数；
* 遍历数组，如果当前元素为1，则`tmpNum++`;如果当前元素为0，则比较`tmpNum`和`maxNum`,并令`maxNum`为大的那个，然后令`tmpNum`为0；
* 遍历结束后再次比较`tmpNum`和`maxNum`,并令`maxNum`为大的那个，之后返回`maxNum`。
