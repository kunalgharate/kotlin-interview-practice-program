package arrayprograms

object ArraySorting {

    var arrofIntegers = arrayOf(45, 65, 33, 227, 34, 11, 87)

    fun sortTheArrayInAscOrder() {
        for (i in 0 until arrofIntegers.size - 1) {
            for (j in 0 until arrofIntegers.size - 1 - i) {
                if (arrofIntegers[j] > arrofIntegers[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    val temp = arrofIntegers[j]
                    arrofIntegers[j] = arrofIntegers[j + 1]
                    arrofIntegers[j + 1] = temp
                }
            }
        }

        arrofIntegers.forEach {
            println("printing: $it")
        }
    }

    fun shortTheArrayInAscOrder() {
        var i = 0;
        var temp = arrofIntegers[0]
        while (i < arrofIntegers.size - 1) {
            for (j in 0 until arrofIntegers.size - 1 - i) {
                if (arrofIntegers[j] > arrofIntegers[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    val temp = arrofIntegers[j]
                    arrofIntegers[j] = arrofIntegers[j + 1]
                    arrofIntegers[j + 1] = temp
                }
            }
            i++
        }


        arrofIntegers.forEach {
            println("printing : $it")
        }
    }
}