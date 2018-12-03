// http://acm.timus.ru/problem.aspx?space=1&num=1197

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    (0 until n)
            .map {
                val move = readLine()!!

                val x = Character.getNumericValue(move[0]) - Character.getNumericValue('a')
                val y = Character.getNumericValue(move[1]) - Character.getNumericValue('1')

                println(Pair(x, y).getMoves().count())
            }
}

fun Pair<Int, Int>.getMoves() = listOf(
        Pair(this.first - 1, this.second + 2),
        Pair(this.first + 1, this.second + 2),
        Pair(this.first - 1, this.second - 2),
        Pair(this.first + 1, this.second - 2),
        Pair(this.first + 2, this.second - 1),
        Pair(this.first - 2, this.second - 1),
        Pair(this.first + 2, this.second + 1),
        Pair(this.first - 2, this.second + 1)
)
        .filter { it.isCorrect() }

fun Pair<Int, Int>.isCorrect() = this.first in 0..7 && this.second in 0..7