// http://acm.timus.ru/problem.aspx?space=1&num=1000

fun main(args: Array<String>) {
    readLine()!!
            .split(' ')
            .asSequence()
            .map { it.toInt() }
            .reduce { a, b -> a + b }
            .apply(::println)
}