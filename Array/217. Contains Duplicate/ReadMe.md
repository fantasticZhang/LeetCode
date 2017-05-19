# Description

Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

# Solution1

借助Map结构进行求解。

* 遍历数组，并放入Map中。其中key是元素的值，value是该元素出现的次数；
* 遍历Map，设当前元素是`entry`，如果`entry`的value大于等于2则返回true。

# Solution2

借助一个Boolean数组，将给定数组映射到这个Boolean数组，如果某个元素出现了，则其对应的Boolean数组的元素置为`true`，这样在遍历数组的同时检测其对应的Boolean元素就知道之前有没有相同的元素出现过了。

* 首先求出数组中的最大值`max`和最小值`min`；
* 令Boolean数组`flags`的长度是`max-min+1`；
* 遍历给定数组，设当前元素为`num`，则如果`flags[num-min]`为`true`，表明该元素出现过，所以返回`true`；否则令`flags[num-min]=true`。
