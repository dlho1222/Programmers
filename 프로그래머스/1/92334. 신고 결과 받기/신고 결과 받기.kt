class Solution {
        fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
            val distinctReport = report.distinct()
            val reporterMap = mutableMapOf<String, MutableSet<String>>()
            val reportedMap = mutableMapOf<String, MutableSet<String>>()

            distinctReport.forEach {
                val (reporter, reported) = it.split(" ")
                reporterMap.getOrPut(reporter) { mutableSetOf() }.add(reported)
                reportedMap.getOrPut(reported) { mutableSetOf() }.add(reporter)
            }
            val bannedUser = reportedMap.filter { it.value.size >= k }.keys

            return id_list.map { id ->
                reporterMap[id]?.count { it in bannedUser } ?: 0
            }.toIntArray()
        }
    }