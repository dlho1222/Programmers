class Solution {
        fun solution(price: Int): Int =
            if (price in 100000 until 300000) (price * 0.95).toInt()
            else if (price in 300000 until 500000) (price * 0.9).toInt()
            else if (price >= 500000) (price * 0.8).toInt()
            else (price)
    }