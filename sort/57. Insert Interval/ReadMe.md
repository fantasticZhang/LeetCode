# Description

Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:

Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

Example 2:

Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

# Solution1

遍历`intervals`，并根据要插入的`newInterval`和当前遍历到的`intervals`的元素的关系分四种情况处理。代码正确，但时间效率非常低。


# Solution2

借助了一个辅助空间`result`，对Solution1进行了改进，时间效率大幅提高。

遍历`intervals`，把所有在`newInterval`之前的元素都放到`result`中;把所有与`newInterval`重合的元素合并到`newInterval`,之后把`newInterval`放到`result`中;最后把`intervals`中剩余的元素都放到`result`中。
