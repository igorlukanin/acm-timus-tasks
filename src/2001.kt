// http://acm.timus.ru/problem.aspx?space=1&num=2001

fun main(args: Array<String>) {
    (0 until 3)
            .map { readLine()!!.split(' ').map { it.toInt() } }
            .apply {
                val firstWeight = this[0][0]
                val secondWeight = this[0][1]

                val firstBucketWeight = this[2][0]
                val secondBucketWeight = this[1][1]

                println("${firstWeight - firstBucketWeight} ${secondWeight - secondBucketWeight}")
            }
}