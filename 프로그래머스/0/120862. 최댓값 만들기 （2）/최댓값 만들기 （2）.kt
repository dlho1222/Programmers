class Solution {
        fun solution(numbers: IntArray): Int {
            var answer: Int = 0
            var sortedNumbers = numbers.sorted()
            answer = maxOf(
                sortedNumbers[0] * sortedNumbers[1],
                sortedNumbers[sortedNumbers.lastIndex - 1] * sortedNumbers.last()
            )
            return answer
        }
    }