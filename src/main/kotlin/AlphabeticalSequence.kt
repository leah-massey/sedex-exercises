import java.lang.Character.UnicodeScript

class AlphabeticalSequence {
    fun alphaSeq(str: String): String {
        return str.lowercase().map {
            it.toString().repeat(it.code - 96)
                .replaceFirstChar { it.uppercaseChar() }
        }.sorted().joinToString(",")
    }
}