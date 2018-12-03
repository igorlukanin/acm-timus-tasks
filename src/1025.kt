// http://acm.timus.ru/problem.aspx?space=1&num=1025

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    readLine()!!
            .split(' ')
            .asSequence()
            .map { it.toInt() }
            .sorted()
            .take(n / 2 + 1)
            .fold(0) { count, voters -> count + voters / 2 + 1 }
            .apply(::println)
}