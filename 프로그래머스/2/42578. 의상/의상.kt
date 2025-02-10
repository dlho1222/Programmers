class Solution {
        fun solution(clothes: Array<Array<String>>): Int {
            var answer = 1
            val clothesMap = mutableMapOf<String, Int>()
            for (type in clothes) {
                clothesMap[type[1]] = clothesMap.getOrDefault(type[1], 0) + 1
            }
            clothesMap.forEach {
                answer *= (it.value + 1)
            }
            
            return answer -1 
        }
    }