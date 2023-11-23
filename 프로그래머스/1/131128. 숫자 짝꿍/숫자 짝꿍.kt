import kotlin.math.min
class Solution {
        fun solution(X: String, Y: String): String {
            var answer: String = ""
            for (digit in (9 downTo 0).toList().map { it.toString() }) {
                answer += digit.repeat(    //조건에 맞는 숫자를 카운트해서 answer에 반복해서 추가
                    min(
                        X.count { it.toString() == digit },
                        Y.count { it.toString() == digit })
                )

            }
            if(answer.toList().isEmpty()) answer = "-1"
            if(answer.toList().distinct() == listOf('0') ) answer = "0"  //answer.toList().distinct()는 '[0]' 이 아니라 ['0']를 반환
            
            return answer
        }
    }