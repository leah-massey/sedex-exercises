import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StopSpinningMyWordsTest() {
    @Test
    fun `a string containing one word only that is less than 5 letters long is returned in the same format`() {
        //given
        val sentence = "Hey"
        val underTest = StopSpinningMyWords()

        //when
        val spunSentence = underTest.spinWords(sentence)

        //then
        assertEquals("Hey", spunSentence)
    }
}