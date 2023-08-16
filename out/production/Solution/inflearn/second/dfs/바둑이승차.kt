package inflearn.second.dfs

/*
설명

철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.

철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.

N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.


입력
첫 번째 줄에 자연수 C(1<=C<=100,000,000)와 N(1<=N<=30)이 주어집니다.


 */
class 바둑이승차 {

    var max = 0

    fun dfs(idx: Int, sum: Int, limit: Int, weights: IntArray) {
        if (sum > limit) return

        if (idx == weights.size) {
            if (sum > max) max = sum
            return
        }

        if (sum + weights[idx] == limit) {
            max = limit
            return
        }

        dfs(idx + 1, sum + weights[idx], limit, weights)
        dfs(idx + 1, sum, limit, weights)

    }
}

fun main() {
    val a = 바둑이승차()
    a.dfs(0, 0, 259, intArrayOf(81, 58, 42, 33, 61))
    println(a.max)
}