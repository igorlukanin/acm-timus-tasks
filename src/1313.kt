// http://acm.timus.ru/problem.aspx?space=1&num=1313

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    (0 until n)
            .map { readLine()!!.split(' ').map { it.toInt() } }
            .fold(mutableListOf<List<Int>>()) { pixels, line ->
                pixels.add(line)
                pixels
            }
            .apply {
                for (sum in 0 until n) {
                    for (x in 0 until sum + 1) {
                        val y = sum - x

                        print("${this[y][x]} ")
                    }
                }

                for (sum in n until 2 * n - 1) {
                    for (x in (sum - n + 1) until n) {
                        val y = sum - x

                        print("${this[y][x]} ")
                    }
                }
            }
}