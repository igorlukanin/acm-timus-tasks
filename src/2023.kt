// http://acm.timus.ru/problem.aspx?space=1&num=2023

fun main(args: Array<String>) {
    val letters = mapOf(
            'A' to 1,
            'P' to 1,
            'O' to 1,
            'R' to 1,
            'B' to 2,
            'M' to 2,
            'S' to 2,
            'D' to 3,
            'G' to 3,
            'J' to 3,
            'K' to 3,
            'T' to 3,
            'W' to 3
    )

    val n = readLine()!!.toInt()

    (0 until n)
            .map { letters[readLine()!![0]]!! }
            .fold(State(0, 1)) { state, position ->
                val steps = Math.abs(state.position - position)
                State(state.steps + steps, position)
            }
            .apply { println(this.steps) }
}

data class State(val steps: Int, val position: Int)