// http://acm.timus.ru/problem.aspx?space=1&num=2066

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(Math.min(a - b - c, a - b * c))
}
