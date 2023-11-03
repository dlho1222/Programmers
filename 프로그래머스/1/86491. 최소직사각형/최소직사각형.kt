class Solution {
        fun solution(sizes: Array<IntArray>): Int {
            var answer: Int = 0
            var width = 0
            var height = 0
            for (s in sizes) {
                width = maxOf(width,s[0],s[1])
                height = maxOf(height,if(s[0]>s[1]) s[1] else s[0])
            }
            answer = width * height
            return answer
        }
    }