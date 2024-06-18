class Solution {
        fun solution(food: IntArray): String = (1 until food.size).joinToString("") { i ->
            i.toString().repeat(food[i] / 2)
        } + "0" + (food.size - 1 downTo 1).joinToString("") { i ->
            i.toString().repeat(food[i] / 2)
        }
    }