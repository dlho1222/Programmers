import kotlin.math.abs
class Solution {
        fun solution(a: Int, b: Int, c: Int, d: Int): Int {
            var answer = 0
            val dice = listOf(a, b, c, d)
            answer = when {
                dice.toSet().size == 1 -> 1111 * dice.first()
                dice.groupBy { it }.filter { it.value.size == 3 }
                    .isNotEmpty() -> (10 * dice.groupBy { it }.filter { it.value.size == 3 }.keys.first() + dice.groupBy { it }.filter { it.value.size == 1 }.keys.first()) * (10 * dice.groupBy { it }.filter { it.value.size == 3 }.keys.first() + dice.groupBy { it }.filter { it.value.size == 1 }.keys.first())
                dice.toSet().size == 2 -> (dice.minOf { it } + dice.maxOf { it }) * (abs(dice.minOf { it } - dice.maxOf { it }))
                dice.toSet().size == 4 -> dice.minOf { it }
                else -> dice.groupBy { it }.values.filter { it.size == 1 }.flatten()
                    .minOrNull()!! * dice.groupBy { it }.values.filter { it.size == 1 }.flatten()
                    .maxOrNull()!!
            }
            return answer
        }
    }