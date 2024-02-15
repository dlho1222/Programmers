class Solution {
        fun solution(quiz: Array<String>): Array<String> {
            var answer: Array<String> = arrayOf<String>()
            for (i in quiz.indices) {
                val temp = quiz[i].split(" ")
                val result = when (temp[1]) {
                    "-" -> temp[0].toInt() - temp[2].toInt()
                    else -> temp[0].toInt() + temp[2].toInt()
                }
                answer += if (result == temp[4].toInt()) "O" else "X"
            }
            return answer
        }
    }