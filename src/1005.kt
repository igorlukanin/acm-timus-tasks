// http://acm.timus.ru/problem.aspx?space=1&num=1005

fun main(args: Array<String>) {
    readLine()!!

    readLine()!!
            .split(' ')
            .map { it.toInt() }
            .let { calcDelta(0, 0, it, 0) }
            .apply(::println)
}

fun calcDelta(sum1: Int, sum2: Int, ws: List<Int>, i: Int): Int =
        if (i == ws.size)
            Math.abs(sum1 - sum2)
        else
            Math.min(
                    calcDelta(sum1 + ws[i], sum2, ws, i + 1),
                    calcDelta(sum1, sum2 + ws[i], ws, i + 1)
            )