class Solution {
        fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
            val result = db.find { it[0] == id_pw[0] } ?: return "fail"
            if(result[1] == id_pw[1]) return "login"
            return "wrong pw"
        }
    }