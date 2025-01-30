 class Solution {
        fun solution(players: Array<String>, callings: Array<String>): Array<String> {

            val nameToIndex = players.withIndex().associate { it.value to it.index }.toMutableMap()
            val indexToName = players.copyOf()

            callings.forEach { callingName ->
                val currentRank = nameToIndex[callingName]!!
                if (currentRank > 0) {
                    val previousRank = currentRank - 1
                    val previousPlayer = indexToName[previousRank]

                    indexToName[previousRank] = callingName
                    indexToName[currentRank] = previousPlayer

                    nameToIndex[callingName] = previousRank
                    nameToIndex[previousPlayer] = currentRank
                }
            }

            return indexToName
        }
    }