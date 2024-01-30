class Solution {
    fun solution(strArr: Array<String>)=strArr.groupBy { it.length }.values.maxOfOrNull { it.count() }!!
}