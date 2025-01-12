import kotlin.math.abs
class Solution {
        fun solution(numbers: IntArray, hand: String): String {
            var answer: StringBuilder = StringBuilder("")
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
                0 to Pair(3, 1),
            )
            var leftHand = Pair(3, 0) // *
            var rightHand = Pair(3, 2) // #

            for (number in numbers) {
                when (number) {
                    1, 4, 7 -> {
                        leftHand = keyPad[number]!!
                        answer.append("L")
                    }

                    3, 6, 9 -> {
                        rightHand = keyPad[number]!!
                        answer.append("R")
                    }

                    else -> {
                        val target = keyPad[number]
                        val leftDistance = calculateDistance(leftHand, target!!)
                        val rightDistance = calculateDistance(rightHand, target)

                        if (leftDistance < rightDistance || (leftDistance == rightDistance && hand == "left")) {
                            leftHand = target
                            answer.append("L")
                        } else {
                            rightHand = target
                            answer.append("R")
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