class Solution {
        fun solution(citations: IntArray): Int {
            val sortedCitations = citations.sortedDescending()
            for ((i, citation) in sortedCitations.withIndex()) {
                if (citation < i + 1) {
                    return i
                }
            }
            return sortedCitations.size
        }
    }