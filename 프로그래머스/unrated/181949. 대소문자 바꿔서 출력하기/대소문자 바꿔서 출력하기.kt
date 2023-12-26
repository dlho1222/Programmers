fun main(args: Array<String>) {
    val s1 = readLine()!!
        var s2 = ""
    for(word in s1){
        if(word.isUpperCase()){
            s2 += word.lowercase()
        }else{
            s2 += word.uppercase()
        }
    }
    println(s2)
}