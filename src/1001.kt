// http://acm.timus.ru/problem.aspx?space=1&num=1001

fun main(args: Array<String>) {
    generateSequence { readLine() }
            .takeWhile { true }
            .map { it
                    .split(' ')
                    .asSequence()
                    .filter(String::isNotEmpty)
                    .map(String::toDouble)
            }
            .fold(mutableListOf<Double>()) { all, numbers ->
                all.addAll(numbers)
                all
            }
            .map(Math::sqrt)
            .reversed()
            .forEach(::println)
}