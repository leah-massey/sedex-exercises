class RomanNumerals {


    fun findRomNum(number: Int): String {
        if ((number / 1000) >= 1 ) {

            return "M".repeat(number / 1000)
        }

        return "C"

    }
}