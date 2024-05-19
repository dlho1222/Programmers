import java.math.BigDecimal
import java.math.BigInteger
class Solution {
        fun solution(balls: Int, share: Int): Int {
            var answer = 0
            answer = (factorial(balls) / (factorial(balls - share) * factorial(share))).toInt()
            return answer
        }

        fun factorial(num: Int): BigDecimal {
            var result = BigInteger.ONE
            for (i in 1..num) {
                result = result.multiply(BigInteger.valueOf(i.toLong()))
            }
            return result.toBigDecimal()
        }
    }