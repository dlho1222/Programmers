class Solution {
        fun solution(numbers: IntArray, direction: String): IntArray {
            when (direction) {
                "right" -> {
                    for (i in numbers.size - 1 downTo 1) {
                        val temp = numbers[i]
                        numbers[i] = numbers[i - 1]
                        numbers[i - 1] = temp
                    }
                }

                else -> {
                    for (i in 0 until numbers.size - 1) {
                        val temp = numbers[i]
                        numbers[i] = numbers[i + 1]
                        numbers[i + 1] = temp
                    }
                }
            }
            return numbers
        }
    }