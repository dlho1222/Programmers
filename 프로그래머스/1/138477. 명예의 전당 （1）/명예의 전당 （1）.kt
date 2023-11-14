import java.util.LinkedList
import java.util.Queue
class Solution {
        fun solution(k: Int, score: IntArray): IntArray {
            var answer: IntArray = IntArray(score.size)
            val queue: Queue<Int> = LinkedList()
            for (i in score.indices) {
                if (i < k) {
                    queue.add(score[i])
                } else {
                    if (queue.minOrNull()?:queue.peek() < score[i]) {
                        queue.remove(queue.minOrNull())
                        queue.add(score[i])
                    }
                }
                answer[i] = queue.sorted().first()
            }
            print(answer.toList())
            return answer
        }
    }