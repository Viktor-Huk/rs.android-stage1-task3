package subtask2

class Combinator {

    // (184756, 20)
    //  assertEquals(10, result)

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var result: Int? = null
        val m = array[0]
        val n = array[1]

        for (i in 1..array[1]) {
            //if ((n - i) < 0) {
              //  return null
        //    } else {
                val tmpRes = returnFactorial(n) / (returnFactorial(n - i) * returnFactorial(i))

                if (tmpRes == m.toLong()) {
                    result = i
                    break
                }
            }
       // }
        return result
    }

    private fun returnFactorial(value: Int): Long {
        var result: Long = 1

        if (value == 0 && value == 1) {
            return result
        }

        for (i in 1..value) {
            result *= i
        }
        return result
    }
}
