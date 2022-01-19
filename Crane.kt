import java.util.*
class Crane {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {

        var answer = 0
        val stack = Stack<Int>()

        moves.forEach{
            for(i in board.indices){
                if(board[i][it-1]!=0){
                    if(!stack.empty()&& stack.peek()==board[i][it-1]){
                        stack.pop()
                        answer+=2
                    }
                    else{
                        stack.push(board[i][it-1])
                    }
                    board[i][it-1]=0
                    break
                }
            }
        }
        return answer
    }
}