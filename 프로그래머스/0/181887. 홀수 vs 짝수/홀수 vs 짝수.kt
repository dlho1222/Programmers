class Solution {
        fun solution(num_list: IntArray) =
            maxOf(num_list.filterIndexed { index, _ -> index % 2 == 0 }.sum(),
                num_list.filterIndexed { index, _ -> index % 2 != 0 }.sum()
            )
    }