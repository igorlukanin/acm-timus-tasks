// http://acm.timus.ru/problem.aspx?space=1&num=1585

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    (0 until n)
            .map { readLine()!! }
            .fold(mutableMapOf<String,Int>()) { counts, name ->
                counts[name] = 1 + (counts[name] ?: 0)
                counts
            }
            .maxBy { it.value }!!
            .apply { println(key) }
}