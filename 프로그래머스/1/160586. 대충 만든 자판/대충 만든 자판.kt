class Solution {
        fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
            var answer: IntArray = intArrayOf()
            val keyboard = mutableMapOf<Char, Int>()
            keymap.forEach { key ->
                key.forEachIndexed { index, char ->
                    keyboard[char] = minOf(keyboard[char] ?: Int.MAX_VALUE, index + 1)
                }
            }

            return targets.map { target ->
                var totalPressed = 0
                for (char in target) {
                    val pressed = keyboard[char] ?: return@map -1
                    totalPressed += pressed
                }
                totalPressed
            }.toIntArray()
        }
    }