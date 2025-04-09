import kotlin.math.ceil
class Solution {
        fun solution(fees: IntArray, records: Array<String>): IntArray {
            val parkingMap = mutableMapOf<String, Int>()
            val totalFreeMap = mutableMapOf<String, Int>()
            val (baseTime, baseFree, unitTime, unitFree) = fees

            for (record in records) {
                val (time, car, status) = record.split(" ")
                val timeToMinutes = time.split(":").let { it[0].toInt() * 60 + it[1].toInt() }
                if (status == "IN") {
                    parkingMap[car] = timeToMinutes
                } else {
                    val duration = timeToMinutes - parkingMap.remove(car)!!
                    totalFreeMap[car] = totalFreeMap.getOrDefault(car, 0) + duration
                }
            }

            for ((car, time) in parkingMap) {
                val endOfDay = 23 * 60 + 59
                val duration = endOfDay - time
                totalFreeMap[car] = totalFreeMap.getOrDefault(car, 0) + duration
            }
            return totalFreeMap.keys.sorted().map { car ->
                if (baseTime <= totalFreeMap[car]!!) {
                    baseFree + (ceil((totalFreeMap[car]!! - baseTime.toDouble()) / unitTime) * unitFree).toInt()
                } else {
                    baseFree
                }
            }.toIntArray()
        }
    }