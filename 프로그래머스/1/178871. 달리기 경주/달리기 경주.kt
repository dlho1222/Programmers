class Solution {
        fun solution(players: Array<String>, callings: Array<String>): Array<String> {

            val playersMap = players.withIndex().associate { it.value to it.index }.toMutableMap()
            callings.forEach { callingName ->
                val currentRank = playersMap[callingName]!!
                if (currentRank > 0) {
                    val previousRank = currentRank - 1
                    val previousPlayer = players[previousRank]
                    players[previousRank] = callingName
                    players[currentRank] = previousPlayer

                    playersMap[callingName] = previousRank
                    playersMap[previousPlayer] = currentRank
                }
            }

            return players
        }
    }