# Description

Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."

For example, given citations = [3, 0, 6, 1, 5], which means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively. Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, his h-index is 3.

Note: If there are several possible values for h, the maximum one is taken as the h-index.

# Solution1

* 将给定数组按从小到大的顺序进行排序；
* 设数组长度为`len`，从后向前遍历数组，设当前遍历到的下标为`i`,令`h=len-i`,如果当前元素大于`h`,则把`hIndex`赋值为`h`；否则的话遍历结束（如果当前元素不满足这个条件，则前面的元素也都不满足这个条件了）；
* 返回`hIndex`。

# Solution2

* 设给定数组`citations`的长度为`len`,使用一个辅助数组`countArray`，长度为`len+1`，用来统计`citations`中每个元素出现的次数；
* 遍历`citations`，设当前遍历到的元素为`citations[i]`，如果`citations[i]`大于等于`len`，则`countArray[len]`加1，否则`countArray[citations[i]]`加1；
* 如果`countArray[len]`大于等于`len`，则返回`len`;
* 否则从下标`len-1`开始向前遍历`countArray`，令`countArray[i]= countArray[i] + countArray[i+1]`，并返回第一个满足`countArray[i]>=i`的下标`i`。
