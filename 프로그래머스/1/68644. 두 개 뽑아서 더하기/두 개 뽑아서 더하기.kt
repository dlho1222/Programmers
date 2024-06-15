class Solution {
        fun solution(numbers: IntArray): IntArray =
            numbers.indices.flatMap { j -> (j + 1 until numbers.size).map { i -> numbers[i] + numbers[j] } }
                .toSet().sorted().toIntArray()
    }