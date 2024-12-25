class Solution {
    fun solution(s: String): String = s.fold("", { acc, c -> acc + if (acc.endsWith(' ') || acc.isEmpty()) c.uppercase() else c.lowercase() })
}