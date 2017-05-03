# Description

Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

* Example 1:

  Input:
      s = "abpcplea", d = ["ale","apple","monkey","plea"]

  Output:
      "apple"    

* Example 2:

  Input:
      s = "abpcplea", d = ["a","b","c"]

  Output:
      "a"

# Solution

遍历`d`，对其中的每个字符串与`s`进行比较，借助`indexOf`和`substring`方法考察当前遍历到的字符串是否满足要求，如果满足要求则记下该字符串，遍历结束后返回满足要求的且字典排序小的字符串。
