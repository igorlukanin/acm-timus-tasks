// http://acm.timus.ru/problem.aspx?space=1&num=1409

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }

    val count = a + b - 1

    println("${count - a} ${count - b}")
}