package subtask5

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val result = mutableListOf<String>()

        val neighbors = mapOf (
            "0" to listOf("8"),
            "1" to listOf("2", "4"),
            "2" to listOf("1", "3", "5"),
            "3" to listOf("2", "6"),
            "4" to listOf("1", "5", "7"),
            "5" to listOf("2", "4", "6", "8"),
            "6" to listOf("3", "5", "9"),
            "7" to listOf("4", "8"),
            "8" to listOf("5", "7", "9", "0"),
            "9" to listOf("6", "8")
        )

        for (i in number.indices) {
            val tmpChar = number[i].toString()

            if (!neighbors.containsKey(tmpChar)) {
                return null
            }

            for (j in neighbors.getValue(tmpChar)) {
                result.add(number.replace(tmpChar, j, false))
            }
        }
        return result.toTypedArray()
    }
}
