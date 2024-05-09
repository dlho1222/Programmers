class Solution {
        fun solution(keyinput: Array<String>, board: IntArray): IntArray {
            val answer = IntArray(2) { 0 }
            val maxRL = board[0] / 2
            val maxUD = board[1] / 2
            for (i in keyinput.indices) {
                when (keyinput[i]) {
                    "left" -> {
                        if (answer[0] <= -maxRL) continue
                        answer[0] -= 1
                    }

                    "right" -> {
                        if (answer[0] >= maxRL) continue
                        answer[0] += 1
                    }

                    "down" -> {
                        if (answer[1] <= -maxUD) continue
                        answer[1] -= 1
                    }

                    "up" -> {
                        if (answer[1] >= maxUD) continue
                        answer[1] += 1
                    }
                }
            }
            return answer
        }
    }