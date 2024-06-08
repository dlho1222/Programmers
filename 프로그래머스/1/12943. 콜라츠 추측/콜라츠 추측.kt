class Solution {
        fun solution(num: Int): Int {
            var n = num.toLong()
            var cnt = 0
            while (n != 1.toLong()) {
                if (n % 2 == 0.toLong()) n /= 2 else n = n * 3 + 1
                cnt++
            }
            return if (cnt > 500) -1 else cnt
        }
    }