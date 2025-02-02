class Solution {
        fun solution(
            video_len: String,
            pos: String,
            op_start: String,
            op_end: String,
            commands: Array<String>
        ): String {
            val answer: StringBuilder = StringBuilder("")
            val videoLength = video_len.split(":").map { it.toInt() }.let { (it[0] * 60) + it[1] }
            val position = pos.split(":").map { it.toInt() }.let { (it[0] * 60) + it[1] }
            val openingStart = op_start.split(":").map { it.toInt() }.let { (it[0] * 60) + it[1] }
            val openingEnd = op_end.split(":").map { it.toInt() }.let { (it[0] * 60) + it[1] }
            val prev = -10
            val next = 10
            var currentPosition = if (position in openingStart..openingEnd) openingEnd else position
            for (command in commands) {
                when (command) {
                    "next" -> {
                        currentPosition += next
                        if (currentPosition > videoLength) {
                            currentPosition = videoLength
                        } else if (currentPosition in openingStart..openingEnd) {
                            currentPosition = openingEnd
                        }
                    }

                    "prev" -> {
                        currentPosition += prev
                        if (currentPosition < 0) {
                            currentPosition = 0
                        } else if (currentPosition in openingStart..openingEnd) {
                            currentPosition = openingEnd
                        }
                    }
                }
                if (currentPosition in openingStart..openingEnd) {
                    currentPosition = openingEnd
                }
            }

            val minute = currentPosition / 60
            val seconds = currentPosition % 60
            if (minute < 10) {
                answer.append("0${minute}:")
            } else {
                answer.append("${minute}:")
            }

            if (seconds < 10) {
                answer.append("0${seconds}")
            } else {
                answer.append(seconds)
            }
            return answer.toString()
        }
    }