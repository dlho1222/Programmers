class Solution {
        fun solution(numbers: IntArray): IntArray {
            var answer: IntArray = IntArray(numbers.size) { -1 }
            val stack = ArrayDeque<Int>()
            for (i in numbers.indices) {
                while (stack.isNotEmpty() && numbers[i] > numbers[stack.last()]) {
                    answer[stack.removeLast()] = numbers[i]
                }
                stack.addLast(i)
            }
            return answer
        }
    }