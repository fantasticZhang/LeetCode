# Description

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

# Solution1

* 定义一个容量为3的数组count，count[0]、count[1]、count[2]分别用来记录给定数组中red、white、blue的个数；
* 循环给定的数组，计算red、white、blue的个数；
* 循环count数组，并对给定数组进行重写，`0`、`1`、`2`分别有`count[0]`、`count[1]`、`count[2]`个。


# Solution2

相对于对快排的变形。遍历数组并交换元素，把所有的0从数组左边开始存放，把所有的2从数组左边开始存放，则遍历结束后所有的1也就在数组中间了。
