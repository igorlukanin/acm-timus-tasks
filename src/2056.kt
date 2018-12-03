// http://acm.timus.ru/problem.aspx?space=1&num=2056

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    (0 until n)
            .map { readLine()!!.toInt() }
            .let { marks ->
                when {
                    marks.contains(3) -> "None"
                    marks.all { it == 5 } -> "Named"
                    marks.average() >= 4.5 -> "High"
                    else -> "Common"
                }
            }
            .apply(::println)
}