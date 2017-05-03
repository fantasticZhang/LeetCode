# Description

Given an unsorted array, find the maximum difference between the successive elements in its sorted form.

Try to solve it in linear time/space.

Return 0 if the array contains less than 2 elements.

You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.

# Solution

* 设总共`N`个数，最大的数为`max`，最小的数为`min`，则排序后相邻两个数之间的最大距离不小于`(max-min)/(N-1)`；
* 设`gap = (max-min)/(N-1)`，将`N-2`个数(除去`min`和`max`）放到`N-1`个桶中，第`k`个桶中数的范围是`(min+(k-1)*gap,min+k*gap]`；
* 记录每个桶的最小数和最大数即可；
* 设相邻两个数之间的最大距离为`maxGap`。对于每一个桶，‘当前桶的最小数-上一个桶的最大数’得到的值就是`maxGap`的一个候选值，遍历所有桶，求`max`（当前桶的最小数-上一个桶的最大数）。
