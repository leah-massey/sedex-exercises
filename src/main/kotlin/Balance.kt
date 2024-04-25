class Balance() {

    private fun joinBrackets(pair: List<String>): String {
        return pair.joinToString(separator = "")
    }

    private fun isPair(a: String, b: String): Boolean {
        val pair: List<String> = listOf(a, b)

        if (joinBrackets(pair) == "()" || joinBrackets(pair) == "[]" || joinBrackets(pair) == "{}") {
            return true
        }
        return false
    }


    fun isBalanced(inputBrackets: String): Any {

        if (inputBrackets.length % 2 == 0) { // if even , proceed to assess

            var listOfBrackets: MutableList<String> = inputBrackets.split("").toMutableList()
            listOfBrackets.removeAt(0)
            listOfBrackets.removeAt(listOfBrackets.size - 1)// turn to a list and drop 2

            var iterator = listOfBrackets.iterator()


            while (iterator.hasNext()) {
                val firstBracket = listOfBrackets[0]
                val secondBracket = listOfBrackets[1]
                val lastBracket = listOfBrackets[listOfBrackets.size - 1]


                if (isPair(firstBracket, secondBracket)) {
                    //  if the list is only 2, return true - your brackets were balanced! Otherwise, remove first two from the list
                    if (listOfBrackets.size == 2) {
                        return true
                    }
                    listOfBrackets = listOfBrackets.drop(2).toMutableList()

                    println("first and second are a pair")
                    println(listOfBrackets)
                    iterator = listOfBrackets.iterator()
                } else {
                    if (isPair(firstBracket, lastBracket)) {
                        listOfBrackets = listOfBrackets.drop(1).dropLast(1).toMutableList()
                        println("first and last is pair")
                        println(listOfBrackets)
                        iterator = listOfBrackets.iterator()
                    } else {
                        return false
                    }
                }
            }

        } else {
            return false
        }

        return "treat"

    }
}