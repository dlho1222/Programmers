class Solution {
        fun solution(
            name: Array<String>,
            yearning: IntArray,
            photo: Array<Array<String>>
        ): IntArray = photo.map { row ->
            row.sumOf {
                if (name.indexOf(it) > -1) yearning[name.indexOf(
                    it
                )] else 0
            }
        }.toIntArray()
    }