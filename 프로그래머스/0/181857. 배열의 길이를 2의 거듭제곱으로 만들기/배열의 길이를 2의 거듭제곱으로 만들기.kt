import kotlin.math.pow
class Solution {
        fun solution(arr: IntArray): IntArray {
            var answer: IntArray = intArrayOf()
            var n = 0
            for (i in arr.indices){
                if(2.0.pow(i) >= arr.size) {
                    n = i
                    break
                }
            }
            arr.forEach {
                answer+= it
            }
            for (i in arr.indices) {
                if (2.0.pow(n).toInt() == answer.size) break else answer += 0
            }
            return answer
        }
    }