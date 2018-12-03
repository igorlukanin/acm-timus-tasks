// http://acm.timus.ru/problem.aspx?space=1&num=1209

fun main(args: Array<String>) {
    val m = readLine()!!.toInt()

    (0 until m)
            .map { readLine()!!.toLong() }
            .map {
                val n = getN(it)
                val length = getLength(n - 1)

                if (it - length == 1L) 1 else 0
            }
            .forEach { print("$it ") }
}

fun getLength(n: Long) = (n * n + n) / 2

fun getN(length: Long) = ((Math.sqrt(1.0 + 8 * (length - 1)) - 1) / 2 + 1).toLong()