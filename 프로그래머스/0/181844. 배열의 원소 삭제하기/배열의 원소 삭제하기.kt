class Solution {
        fun solution(arr: IntArray, delete_list: IntArray): IntArray {
            var answer: IntArray = intArrayOf()
            var arrList = arr.toMutableList()
            for (i in delete_list.indices){
                arrList.remove(delete_list[i])
            }
            answer = arrList.toIntArray()
            return answer
        }
    }