import kotlin.math.abs
class Solution {
        fun solution(numbers: IntArray, hand: String): String {
            var answer = StringBuilder("")
            val keyPad = mapOf(
                1 to Pair(0, 0),
                2 to Pair(0, 1),
                3 to Pair(0, 2),
                4 to Pair(1, 0),
                5 to Pair(1, 1),
                6 to Pair(1, 2),
                7 to Pair(2, 0),
                8 to Pair(2, 1),
                9 to Pair(2, 2),
                '*' to Pair(3, 0),
                0 to Pair(3, 1),
                '#' to Pair(3, 2)
            )
            var leftHand = keyPad['*']
            var rightHand = keyPad['#']

            for (number in numbers) {
                when {
                    number in arrayOf(1, 4, 7) -> {
                        leftHand = keyPad[number]
                        answer.append("L")
                    }

                    number in arrayOf(3, 6, 9) -> {
                        rightHand = keyPad[number]
                        answer.append("R")
                    }

                    else -> {
                        if (calculateDistance(leftHand!!, keyPad[number]!!) > calculateDistance(
                                rightHand!!,
                                keyPad[number]!!
                            )
                        ) {
                            rightHand = keyPad[number]
                            answer.append("R")
                        } else if (calculateDistance(
                                leftHand,
                                keyPad[number]!!
                            ) < calculateDistance(rightHand, keyPad[number]!!)
                        ) {
                            leftHand = keyPad[number]
                            answer.append("L")
                        } else {
                            if (hand == "right") {
                                rightHand = keyPad[number]
                                answer.append("R")
                            } else {
                                leftHand = keyPad[number]
                                answer.append("L")
                            }
                        }
                    }
                }
            }
            return answer.toString()
        }

        fun calculateDistance(point1: Pair<Int, Int>, point2: Pair<Int, Int>): Int {
            return abs(point1.first - point2.first) + abs(point1.second - point2.second)
        }
    }