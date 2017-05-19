# Description

Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:

    Input: [3, 1, 4, 1, 5], k = 2
    Output: 2

Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).

Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:

    Input:[1, 2, 3, 4, 5], k = 1
    Output: 4

Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:

    Input: [1, 3, 1, 5, 4], k = 0
    Output: 1

Explanation: There is one 0-diff pair in the array, (1, 1).

Note:

* The pairs (i, j) and (j, i) count as the same pair.
* The length of the array won't exceed 10,000.
* All the integers in the given input belong to the range: [-1e7, 1e7].
* Subscribe to see which companies asked this question.

# Solution1

暴力求解法。

* 对数组按从小到大的顺序进行排序；
* 遍历数组，统计满足要求的对（pairs）。

由于在遍历的过程中对很多不满足要求的情况进行行了判断，从而省去了许多无用的循环，因此该方法的时间效率还是比较高的（见图片）。

# Solution2

借助Map结构进行求解。

* 遍历数组，并放入Map中。其中key是元素的值，value是该元素出现的次数；
* 遍历Map，设当前元素是`entry`，如果`k`是0，则如果`entry`的value大于等于2，总数加1；如果`k`大于0，则如果Map中包含key是`entry.key+k`的元素，总数加1。
