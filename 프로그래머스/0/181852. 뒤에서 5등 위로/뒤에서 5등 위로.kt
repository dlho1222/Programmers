class Solution {
        fun solution(num_list: IntArray): IntArray =
            num_list.sorted().slice(5..num_list.lastIndex).toIntArray()
    }