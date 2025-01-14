class Solution {
        fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
            var answer: IntArray = intArrayOf()
            val keyboard = mutableMapOf<Char, Int>()
            for ((index, key) in keymap.withIndex()) {
                key.forEachIndexed { pressed, char ->
                    val currentPressed = keyboard[char] ?: Int.MAX_VALUE
                    keyboard[char] = minOf(currentPressed, pressed + 1)
                }
            }

            for (target in targets) {
                var totalPressed = 0
                for (char in target) {
                    var pressed = keyboard[char]
                    if (pressed == null){
                        totalPressed = -1
                        break
                    }else{
                        totalPressed += pressed
                    }
                }
                answer += totalPressed
            }
            return answer
        }
    }