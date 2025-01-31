class Solution {
        fun solution(park: Array<String>, routes: Array<String>): IntArray {
            var x = 0
            var y = 0
            var startX = 0
            var startY = 0
            var height = park.size
            var width = park[0].length
            val directionMap =
                mapOf("N" to (-1 to 0), "S" to (1 to 0), "W" to (0 to -1), "E" to (0 to 1))

            for (i in park.indices) {
                val j = park[i].indexOf('S')
                if (j != -1) {
                    startX = i
                    startY = j
                    break
                }
            }

            x = startX
            y = startY

            for (route in routes) {
                val (direction, distanceStr) = route.split(" ")
                val distance = distanceStr.toInt()
                val (dx, dy) = directionMap[direction]!!

                var newX = x
                var newY = y
                var valid = true

                for (i in 1..distance) {
                    newX += dx
                    newY += dy
                    if (newX !in 0 until height || newY !in 0 until width || park[newX][newY] == 'X') {
                        valid = false
                        break
                    }
                }
                if (valid) {
                    x = newX
                    y = newY
                }
            }
            return intArrayOf(x, y)
        }
    }