class Solution {
        fun solution(num_list: IntArray): Int {
            var count = 0
            for (i in num_list.indices) {
                while (num_list[i] > 1) {
                    if (num_list[i] == 1) break
                    else {
                        if (num_list[i] % 2 == 0) {
                            count++
                            num_list[i] /= 2
                        } else {
                            count++
                            num_list[i] = (num_list[i] - 1) / 2
                        }
                        if(num_list[i] == 1) break else continue
                    }
                }
            }
            return count
        }
    }