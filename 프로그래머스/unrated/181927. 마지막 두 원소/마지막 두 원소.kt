 class Solution {
        fun solution(num_list: IntArray): IntArray {
            var answer: IntArray = intArrayOf()
            var last = num_list[num_list.lastIndex]
            var priLast = num_list[num_list.lastIndex - 1]
            var list = num_list.toMutableList()
            if (last > priLast) list.add(last - priLast) else list.add(last * 2)
            answer = list.toTypedArray().toIntArray()
            return answer
        }
    }