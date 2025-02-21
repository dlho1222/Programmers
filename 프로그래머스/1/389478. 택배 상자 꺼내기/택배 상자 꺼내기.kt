class Solution {
        fun solution(n: Int, w: Int, num: Int): Int {
            var answer: Int = 1
            val targetLayer = (num - 1) / w + 1
            val targetOffset = (num - 1) % w
            val targetPosition = if (targetLayer % 2 == 1) targetOffset + 1 else w - targetOffset
            val topLayer = (n - 1) / w + 1

            answer += maxOf(0, topLayer - targetLayer - 1)

            if (topLayer > targetLayer) {
                val lastBoxOffset = (n - 1) % w
                val lastBoxPosition =
                    if (topLayer % 2 == 1) lastBoxOffset + 1 else w - lastBoxOffset

                if ((topLayer % 2 == 1) && lastBoxPosition >= targetPosition ||
                    (topLayer % 2 == 0) && lastBoxPosition <= targetPosition
                ) answer++
            }
            return answer
        }
    }