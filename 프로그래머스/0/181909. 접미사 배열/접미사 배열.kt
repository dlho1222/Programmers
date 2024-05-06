class Solution {
        fun solution(my_string: String): Array<String> {
            val answer: MutableList<String> = mutableListOf()
            for (i in my_string.indices) {
                answer.add(my_string.substring(i, my_string.length))
            }
            return answer.sorted().toTypedArray()
        }
    }