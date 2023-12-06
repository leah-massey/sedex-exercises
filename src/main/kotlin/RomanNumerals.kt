class RomanNumerals {




    fun findRomNum(number: Int): String {

        val romanNum: MutableList<String> = mutableListOf()

        if ((number / 1000) >= 1 ) {
            romanNum.add("M".repeat(number / 1000))
        }

        if ((number % 1000) / 500 >= 1) {
            romanNum.add("D".repeat(number % 1000 / 500))
        }

        if ((number % 500) / 100 >= 1) {
            romanNum.add("C".repeat(number % 500 / 100))
        }

        if ((number % 100) / 50 >= 1) {
            romanNum.add("L")
        }

        return romanNum.joinToString("")

    }
}