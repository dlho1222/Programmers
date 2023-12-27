import kotlin.math.max
class Solution {
        fun solution(a: Int, b: Int): Int {
            var answer: Int = 0
            var ab = "$a$b"
            answer = max(ab.toInt(),2 * a * b)
            return answer
        }
    }