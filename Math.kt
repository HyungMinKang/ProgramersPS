class Math {
    fun solution(answers: IntArray): IntArray {

        var answer:MutableList<Int> = mutableListOf()
        var math1:Array<Int> = arrayOf(1,2,3,4,5)
        var math2:Array<Int> = arrayOf(2,1,2,3,2,4,2,5)
        var math3:Array<Int> = arrayOf(3,3,1,1,2,2,4,4,5,5)
        var solCount = Array<Int>(3){0}

        answers.forEachIndexed{ index,it->
            if(math1[index%5]==it) solCount[0] = solCount[0]+ 1
            if(math2[index%8]==it) solCount[1]+=1
            if(math3[index%10]==it) solCount[2]+=1

        }

        var maxScore = solCount.maxOrNull()
        solCount.forEachIndexed{index,it ->
            if(it==maxScore) answer.add(index+1)
        }

        return  answer.toIntArray()
    }
}