class Solution {
        fun solution(players: Array<String>, callings: Array<String>): Array<String> {

            val nameToIndex = mutableMapOf<String, Int>()
            val indexToName = players.copyOf()

            players.forEachIndexed { index, player ->
                nameToIndex[player] = index
            }

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