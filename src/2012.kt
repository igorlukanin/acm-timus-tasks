// http://acm.timus.ru/problem.aspx?space=1&num=2012

fun main(args: Array<String>) {
    val code1 = readLine()!!.toInt()
    val code2 = readLine()!!.toInt()

    var doTryFirstLock = false
    var code = 1

    while (code <= 9999) {
        if (
                doTryFirstLock && code == code1 ||
                !doTryFirstLock && code == code2
        ) {
            println("yes")
            return
        }

        doTryFirstLock = !doTryFirstLock
        code++
    }

    println("no")
}