// http://acm.timus.ru/problem.aspx?space=1&num=1563

fun main(args: Array<String>) {
    val names = mutableSetOf<String>()

    val n = readLine()!!.toInt()

    (0 until n)
            .map { readLine()!! }
            .fold(0) { count, name ->
                count + if (names.add(name)) 0 else 1
            }
            .apply(::println)
}