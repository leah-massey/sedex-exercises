class RomanNumerals {
    fun findRomNum(number: Int): String {

        val romNumSymbols: List<Char> = listOf('I', 'V', 'X')

        // for single values
        var romNumList: MutableList<Char> = mutableListOf()

        val position: Int = 0
        if (number < 4) {

            for (i in 1..number) {
                romNumList.add(romNumSymbols[position])

//                 some other way doing it as a repeat command
//                (romNumList.add(romNumSymbols[position]).repeat(number).join)
            }
        } else if (number == 4) { // number + 1
            romNumList.add(romNumSymbols[position])
            romNumList.add(romNumSymbols[position + 1])
        } else if (number == 5) {
            romNumList.add(romNumSymbols[position + 1])
        } else {
            romNumList.add(romNumSymbols[position + 1])
            for (i in 6..number) {
                romNumList.add(romNumSymbols[position])
            }
        }


        return romNumList.joinToString("")
    }
}