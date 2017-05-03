# Description

Given a collection of intervals, merge all overlapping intervals.

For example,

* Given [1,3],[2,6],[8,10],[15,18],
* return [1,6],[8,10],[15,18].

# Solution1

* 根据起点的大小对intervals进行排序；
* 迭代intervals，对于当前的interval，比较它的终点和后面的每个interval（设为next）的起点，如果重叠则更新当前interval的end为两者中最大的那个，并把next删除。
* 在迭代过程中会对intervals进行动态的操作，因此空间复杂度`O(1)`，时间复杂度最坏`O(n*n)`。

# Solution2

是对Solution1的改进，时间复杂度`O(n*logn)`，空间复杂度`O(n)`。
