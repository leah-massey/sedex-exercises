import kotlin.math.floor

class MultiplesOfThreeOrFive {
    fun solution(number: Int): Int {

        if (number < 0) {
            return 0
        }

        var total = 0

        for (i in 1..< number) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i
            }
        }

      return total
    }
}




