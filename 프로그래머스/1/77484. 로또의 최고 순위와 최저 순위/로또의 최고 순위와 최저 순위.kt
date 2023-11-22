class Solution {
        fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
            var answer: IntArray = intArrayOf()
            var highRank = 0
            var lowRank = 0
            highRank = win_nums.filter { it in lottos }.size + lottos.filter { it == 0 }.size
            lowRank = win_nums.filter { it in lottos }.size
            when (highRank) {
                6 -> answer += 1
                5 -> answer += 2
                4 -> answer += 3
                3 -> answer += 4
                2 -> answer += 5
                else -> answer += 6
            }
            when(lowRank){
                6 -> answer += 1
                5 -> answer += 2
                4 -> answer += 3
                3 -> answer += 4
                2 -> answer += 5
                else -> answer += 6
            }
            
            return answer
        }
    }