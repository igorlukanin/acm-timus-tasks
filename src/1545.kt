// http://acm.timus.ru/problem.aspx?space=1&num=1545

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    (0 until n)
            .map { readLine()!! }
            .apply {
                val prefix = readLine()!!

                filter { it.startsWith(prefix) }
                        .forEach(::println)
            }
}