 class Solution {
        fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
            var answer = 0
            var totalStudents = Array(n + 1) { 1 }
            for (i in lost) {   //잃어버린 수
                totalStudents[i]--
            }
            for (i in reserve){ //여분 수
                totalStudents[i]++
            }
           for(i in 1..n){
                if(totalStudents[i] == 0) {
                    if (totalStudents[i - 1] == 2) {
                        totalStudents[i - 1]--
                        totalStudents[i]++
                    }
                    else if (i < n){
                        if(totalStudents[i + 1] == 2){
                            totalStudents[i + 1]-- 
                            totalStudents[i]++
                        }
                    }
                }
            }
            for(i in 1..n){
                if(totalStudents[i] == 1 || totalStudents[i] == 2){
                    answer++
                }
            }
           
            return answer
        }
    }