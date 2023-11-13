class Solution {
        fun solution(a: Int, b: Int, n: Int): Int {
            var answer: Int = 0
            var initBottle = n
            var emptyBottle = a
            var returnBottle = b
            var result = 0
            var remainBottle = 0

            while (initBottle >= emptyBottle) {
                // 현재 빈 병으로 얼마나 많은 병을 살 수 있는지 계산
                val boughtBottles = initBottle / emptyBottle
                answer += boughtBottles * returnBottle

                // 새 병을 사고 남은 빈 병의 수 계산
                val remainingBottles = initBottle % emptyBottle

                // 다음 반복을 위해 initBottle 업데이트
                initBottle = boughtBottles * returnBottle + remainingBottles
            }

            print(answer)
            return answer
        }
        
    }