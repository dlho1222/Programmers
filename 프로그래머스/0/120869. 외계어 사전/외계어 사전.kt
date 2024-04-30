class Solution {
        fun solution(spell: Array<String>, dic: Array<String>): Int {
            var answer: Int = 2
            val sortedSpell = spell.sorted().joinToString("")
            val sortedDic = dic.map { it.split("").sorted().joinToString("") }
            for (i in sortedDic.indices) {
                if (sortedSpell == sortedDic[i]) {
                    answer = 1
                    break
                }
            }
            return answer
        }
    }