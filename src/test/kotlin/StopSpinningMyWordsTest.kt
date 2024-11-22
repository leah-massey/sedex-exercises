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

    @Test
    fun `a string containing a multi word sentence with each word less than 5 letters long is returned in the same format`() {
        //given
        val sentence = "Hey my pal"
        val underTest = StopSpinningMyWords()

        //when
        val spunSentence = underTest.spinWords(sentence)

        //then
        assertEquals("Hey my pal", spunSentence)
    }

    @Test
    fun `a single word that is longer than 4 letters is returned in reverse `() {
        //given
        val sentence = "Controversial"
        val underTest = StopSpinningMyWords()

        //when
        val spunSentence = underTest.spinWords(sentence)

        //then
        assertEquals("laisrevortnoC", spunSentence)
    }

}