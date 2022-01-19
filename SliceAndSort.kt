class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer:ArrayList<Int> = arrayListOf()
        for(command in commands){
            var i= command[0]-1
            var j= command[1]-1
            var k= command[2]-1

            answer.add(array.sliceArray(IntRange(i,j)).sorted()[k])
        }
        return answer.toIntArray()
    }
}