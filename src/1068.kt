// http://acm.timus.ru/problem.aspx?space=1&num=1068

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    println(Math.round(
            if (n > 1)
                (1 + n) / 2.0 * n
            else
                (-1 + n) / 2.0 * Math.abs(n) + 1
    ))
}