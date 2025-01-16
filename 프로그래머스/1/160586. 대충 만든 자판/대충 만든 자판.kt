class Solution {
        fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
            val keyPad = mutableMapOf<Char, Int>()
            keymap.forEach { key ->
                key.forEachIndexed { pressed, char ->
                    keyPad[char] = minOf(keyPad[char] ?: Int.MAX_VALUE, pressed + 1)
                }
            }

            return targets.map { target ->
                var totalPressed = 0
                for (char in target) {
                    val pressed = keyPad[char] ?: return@map -1
                    totalPressed += pressed
                }
                totalPressed
            }.toIntArray()
        }
    }