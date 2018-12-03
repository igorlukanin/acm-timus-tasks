// http://acm.timus.ru/problem.aspx?space=1&num=1149

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    println(s(n))
}

fun a(n: Int, inner: String? = null): String = when {
    inner == null -> a(n - 1, "sin($n)")
    n == 0 -> inner
    else -> {
        val sign = if (n.rem(2) == 1) '-' else '+'
        a(n - 1, "sin($n$sign$inner)")
    }
}

fun s(n: Int, i: Int = 1, inner: String? = null): String = when {
    inner == null -> s(n - 1, i + 1, "sin($i)+$n")
    n == 0 -> inner
    else -> s(n - 1, i + 1, "($inner)${a(i)}+$n")
}
