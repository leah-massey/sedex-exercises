class CharacterRepeat {
    fun longestRepeat(str: String): List<String> {

        // remove edge case
        if (str == "") {
            return listOf("", "0")
        }

        var groupedChars: MutableList<String> = mutableListOf()
        var currentGroup = StringBuilder()

        // sort letters into groups
        str.forEachIndexed { index, char ->
            if(index > 0 && char != str[index -1]) {
                // if the character has changed
                groupedChars.add(currentGroup.toString())
                currentGroup = StringBuilder().append(char)
            } else {
                // if the character has stayed the same
                currentGroup.append(char)
            }
        }
        // add final group
        groupedChars.add(currentGroup.toString())

       val groupedCharsInOrder = groupedChars.sorted() // had to created new variable as updating produced an unmutable list
        val finalResult: MutableList<String> = mutableListOf()
       finalResult.add(groupedCharsInOrder[0][0].toString())
       finalResult.add(groupedCharsInOrder[0].length.toString())


        return finalResult

    }

}