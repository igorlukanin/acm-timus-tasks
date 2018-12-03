// http://acm.timus.ru/problem.aspx?space=1&num=1014

import java.lang.StringBuilder

fun main(args: Array<String>) {
    var n = readLine()!!.toInt()

    if (n == 0) {
        println(10)
        return
    }

    if (n == 1) {
        println(1)
        return
    }

    val digits = mutableListOf<Int>()

    loop@ while (n > 1) {
        for (i in 9 downTo 2) {
            if (n.rem(i) == 0) {
                digits.add(i)
                n /= i
                continue@loop
            }
        }

        println(-1)
        return
    }

    val q = StringBuilder()
    digits.sorted().forEach { q.append(it) }

    println(q)
}