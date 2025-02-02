class Solution {
        fun solution(
            video_len: String,
            pos: String,
            op_start: String,
            op_end: String,
            commands: Array<String>
        ): String {
            val videoLength = toSeconds(video_len)
            val position = toSeconds(pos)
            val openingStart = toSeconds(op_start)
            val openingEnd = toSeconds(op_end)
            var currentPosition = if (position in openingStart..openingEnd) openingEnd else position

            for (command in commands) {
                when (command) {
                    "next" -> {
                        if (videoLength - currentPosition < 10) currentPosition =
                            videoLength else currentPosition += 10
                    }

                    "prev" -> {
                        if (currentPosition - 10 < 0) currentPosition = 0 else currentPosition -= 10
                    }
                }
                if (currentPosition in openingStart..openingEnd) {
                    currentPosition = openingEnd
                }
            }
            return toTimeString(currentPosition)
        }

        fun toSeconds(time: String): Int {
            val (minute, seconds) = time.split(":").map { it.toInt() }
            return (minute * 60 + seconds)
        }

        fun toTimeString(currentPosition: Int): String {
            val minute = currentPosition / 60
            val seconds = currentPosition % 60
            return "%02d:%02d".format(minute, seconds)
        }
    }