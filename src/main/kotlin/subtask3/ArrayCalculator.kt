package subtask3

import kotlin.math.abs

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var result = 1
        var count = 0

        itemsFromArray.forEach { if (it is Int) count++ }

        when {
            count == 0 -> result = 0
            count <= numberOfItems -> {
                for (i in itemsFromArray) {
                    if (i is Int) {
                        result *= i
                    }
                }
            }
            else -> {
                itemsFromArray.sort()

                if (!containMoreOneNegativeNumber(itemsFromArray)) {
                    val tmpList = itemsFromArray.takeLast(numberOfItems)

                    tmpList.forEach { if (it is Int) { result *= it }}
                } else {
                    var positiveNumbers = mutableListOf<Int>()
                    var negativeNumbers = mutableListOf<Int>()

                    itemsFromArray.forEach { if (it is Int) {
                        if(it > 0) {
                            positiveNumbers.add(it)
                        } else {
                            negativeNumbers.add(it)
                        }
                    }}

                    val newNegativeNumbers = negativeNumbers.take(2)
                    val newPositiveNumbers = positiveNumbers.takeLast(numberOfItems)

                    if (abs(newNegativeNumbers[1]) >= newPositiveNumbers[0]) {
                        val resultArray = mutableListOf<Int>()

                        for (i in itemsFromArray) {
                            if (i is Int) {
                                resultArray.add(abs(i))
                            }
                        }
                        resultArray.sort()
                        val newResultArray = resultArray.takeLast(numberOfItems)
                        newResultArray.forEach { if (it is Int) { result *= it } }
                    } else {
                        newPositiveNumbers.forEach { if (it is Int) { result *= it } }
                    }
                }
            }
        }

        return result
    }

    private fun containMoreOneNegativeNumber(itemsFromArray: Array<Any>): Boolean {
        var result = false
        var count = 0

        for (i in itemsFromArray) {
            if ((i is Int) && (i < 0)) {
                count++
            }
        }

        if (count > 1) {
            result = true
        }
        return result
    }
}
