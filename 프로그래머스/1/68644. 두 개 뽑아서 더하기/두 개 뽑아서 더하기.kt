class Solution {
        fun solution(numbers: IntArray): IntArray =
            numbers.indices.flatMap { i -> (i + 1 until numbers.size).map { j -> numbers[i] + numbers[j] } }
                .toSortedSet().toIntArray()
    }