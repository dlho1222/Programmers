class Solution {
        fun solution(chicken: Int): Int {
            var coupon: Int = chicken
            var count = 0
            while (coupon >= 10){
                var service = 0
                count += coupon / 10
                service = coupon / 10
                coupon = service + (coupon % 10)
            }
            return count
        }
    }