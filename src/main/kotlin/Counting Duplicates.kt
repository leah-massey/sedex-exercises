class CountingDuplicates {
    fun duplicateCount(text: String): Int {
        val newList: MutableList<String> = mutableListOf()

        val letters: List<String> = text.split("").drop(1).dropLast(1)
        println(letters)

        letters.forEach{ letter ->
            if (!newList.contains(letter)){
                newList.add(letter)
                println(newList)
            }
        }

        return newList.count()
    }

}