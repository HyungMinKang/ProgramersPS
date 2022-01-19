/*
class Solution {
    fun solution(s: String): String {
        var answer = ""
        var index= 0
        for(char in s){
            if(char==' '){
                index=0
                answer+=" "
            }
            else{
                index++
                if(index%2!=0) answer+= char.toUpperCase()
                else answer+= char.toLowerCase()
            }
        }
        return answer

    }
}

*/


class Solution {
    fun solution(s: String):String {
        var answer=" "
        var words = s.split(" ")
        answer = words.map { word ->
            word
                .mapIndexed { index, char ->
                    if (index % 2 == 0) char.toUpperCase() else char.toLowerCase()
                }
                .joinToString("")
        }.joinToString(" ")
        return answer
    }
}




/*



 */