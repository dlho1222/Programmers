class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow 
        for (width in 3..total / 3) {
            if (total % width == 0) { 
                val height = total / width
        
                if (width >= height && (width - 2) * (height - 2) == yellow) {
                    return intArrayOf(width, height)
                }
            }
        }
        return intArrayOf()  
    }
}