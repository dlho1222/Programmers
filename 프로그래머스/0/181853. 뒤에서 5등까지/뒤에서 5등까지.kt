class Solution {
        fun solution(num_list: IntArray): IntArray =
            num_list.sorted().subList(0,5).toIntArray()
    }