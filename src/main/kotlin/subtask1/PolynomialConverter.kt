package subtask1

class PolynomialConverter {

    // arrayOf(2, -6, 45, 5, 32, 0, 3, 5)
    // "2x^7 - 6x^6 + 45x^5 + 5x^4 + 32x^3 + 3x + 5"

    fun convertToStringFrom(numbers: Array<Int>): String? {
        var result = ""

        if (numbers.isEmpty()) {
            return null
        } else {
            for (i in numbers.indices) {
                when (i) {
                    numbers.size - 1 -> {
                        result += when {
                            numbers[i] == 0 -> ""
                            numbers[i] == 1 -> " + x"
                            numbers[i] == -1 -> " - x"
                            numbers[i] < 0 -> " - ${numbers[i] * -1}"
                            else -> " + ${numbers[i]}"
                        }
                    }
                    0 -> {
                        result += when {
                            numbers[i] == 0 -> ""
                            numbers[i] == 1 -> "x^${numbers.size - i - 1}"
                            numbers[i] == -1 -> "x^${numbers.size - i - 1}"
                            numbers[i] < 0 -> " - ${numbers[i] * -1}x^${(numbers.size - i - 1)}"
                            else -> "${numbers[i]}x^${numbers.size - i - 1}"
                        }
                    }
                    numbers.size - 2 -> {
                        result += when {
                            numbers[i] == 0 -> ""
                            numbers[i] == 1 -> " + x"
                            numbers[i] == -1 -> " - x"
                            numbers[i] < 0 -> " - ${numbers[i] * -1}x"
                            else -> " + ${numbers[i]}x"
                        }
                    }
                    else -> {
                        result += when {
                            numbers[i] == 0 -> ""
                            numbers[i] == 1 -> " + x"
                            numbers[i] == -1 -> " - x"
                            numbers[i] < 0 -> " - ${numbers[i] * -1}x^${numbers.size - i - 1}"
                            else -> " + ${numbers[i]}x^${numbers.size - i - 1}"
                        }
                    }
                }
            }
            return result
        }
    }
}
