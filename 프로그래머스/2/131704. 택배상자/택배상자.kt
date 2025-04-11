class Solution {
        fun solution(order: IntArray): Int {
            var orderIdx = 0
            var box = 1
            val belt = ArrayDeque<Int>()
            val n = order.size
            while (box <= n) {
                if (box == order[orderIdx]) {
                    orderIdx++
                    while (orderIdx < n && belt.isNotEmpty() && belt.last() == order[orderIdx]) {
                        belt.removeLast()
                        orderIdx++
                    }
                } else {
                    belt.addLast(box)
                }
                box++
            }
            return orderIdx
        }
    }