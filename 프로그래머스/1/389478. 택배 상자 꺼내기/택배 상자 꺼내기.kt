 class Solution {
        fun solution(n: Int, w: Int, num: Int): Int {
            var answer: Int = 1
            val targetLayer = (num - 1) / w + 1
            val targetOffset = (num - 1) % w
            val targetPosition = if (targetLayer % 2 == 1) targetOffset + 1 else w - targetOffset
            val topLayer = (n - 1) / w + 1
            for (layer in targetLayer + 1..topLayer) {
                if (layer != topLayer) {
                    answer++
                } else {
                    val lastBoxOffset = (n - 1) % w
                    if (topLayer % 2 == 1) {
                        val lastBoxPosition = lastBoxOffset + 1
                        if (lastBoxPosition >= targetPosition) answer++

                    } else {
                        val lastBoxPosition = w - lastBoxOffset
                        if (lastBoxPosition <= targetPosition) answer++
                    }

                }
            }
            return answer
        }
    }