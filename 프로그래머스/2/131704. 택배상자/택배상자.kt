class Solution {
        fun solution(order: IntArray): Int {
            val belt = ArrayDeque<Int>()
            var orderIdx = 0
            var box = 1
            val n = order.size
            while (box <= n) {
                if(order[orderIdx] == box){
                    orderIdx++
                    while (belt.isNotEmpty() && orderIdx<n && belt.last() == order[orderIdx]){
                        belt.removeLast()
                        orderIdx++
                    }
                }else{
                    belt.addLast(box)
                }
                box++
            }

            return orderIdx
        }
    }