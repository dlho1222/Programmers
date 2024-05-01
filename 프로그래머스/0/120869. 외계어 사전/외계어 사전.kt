class Solution {
        fun solution(spell: Array<String>, dic: Array<String>): Int {
            var result = 2
            var sortedSpell = spell.sorted().joinToString("")
            var sortedDic = dic.map { it.split("").sorted().joinToString("") }
            for (i in sortedDic.indices) {
                if (sortedDic.contains(sortedSpell)) {
                    result = 1
                    break
                }
            }
            return result
        }
    }