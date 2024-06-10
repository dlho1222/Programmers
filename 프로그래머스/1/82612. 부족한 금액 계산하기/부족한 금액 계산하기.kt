class Solution {
        fun solution(price: Int, money: Int, count: Int): Long = if (money.toLong() <= price.toLong() * (1..count).sumOf { it }.toLong()) (price.toLong() * (1..count).sumOf { it }.toLong() - money.toLong()) else 0L
    }