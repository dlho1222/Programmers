class Solution {
        fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
            var answer: String = "fail"
            val id = id_pw[0]
            val pw = id_pw[1]
            db.forEach {
                if(id == it[0]) {
                    answer = if(pw == it[1]) "login" else "wrong pw"
                }
            }
            return answer
        }
    }