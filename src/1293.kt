// http://acm.timus.ru/problem.aspx?space=1&num=1293

fun main(args: Array<String>) {
    val (n, a, b) = readLine()!!
            .split(' ')
            .map { it.toInt() }

    println(n * a * b * 2)
}