class Solution {
        fun solution(rank: IntArray, attendance: BooleanArray): Int {
            var answer: Int = 0
            var attend = intArrayOf()
            var attendRank = intArrayOf()
            var att = intArrayOf()
            for (i in rank.indices) {
                if (attendance[i]) {
                    attend += rank[i]
                }
            }
            attendRank += attend.sorted().take(3)
            for (i in attendRank.indices) {
                att += rank.indexOf(attendRank[i])
            }
            att.forEachIndexed { index, i -> answer += if (index == 0) i * 10000 else if (index == 1) i * 100 else i }
            return answer
        }
    }