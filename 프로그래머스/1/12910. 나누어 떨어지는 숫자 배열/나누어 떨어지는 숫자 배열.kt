class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = mutableListOf<Int>()
        for(i in 0 .. arr.size -1){
            if(arr[i] % divisor == 0){
                answer.add(arr[i])
            }
        }
        if(answer.isEmpty()) answer.add(-1)
        answer.sort()
        return answer.toIntArray()
    }
}