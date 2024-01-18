class Solution {
        fun solution(num_list: IntArray): Int {
            var even = 0
            var odd = 0
            even =num_list.filterIndexed { index, _ -> index % 2 == 0 }.sum()
            odd = num_list.filterIndexed { index, _ -> index % 2 != 0 }.sum()
            return maxOf(even,odd)
        }
    }