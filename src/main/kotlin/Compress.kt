fun compress(letters: List<Char>): List<Char> {

    val compressedList: MutableList<Char> = letters.toMutableList()

  compressedList.forEachIndexed {idx, i ->
        if (idx != 0 && i == letters[idx-1]  ) {
            compressedList.removeAt(idx)
        }
    }

    return compressedList

}