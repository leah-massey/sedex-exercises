class WrappingPaper {
    fun paperNeeded(allBoxes: List<String>): Int {

        val requiredPaperSizes: MutableList<Int> = mutableListOf()

        allBoxes.map {
            val boxDimensions = it
                .split("x")
                .map{it.toInt()}

            requiredPaperSizes.add(paperForBox(boxDimensions))
        }
        return requiredPaperSizes.sum()
    }

    // this function finds the area for each box
    fun paperForBox(dimensions: List<Int>): Int {
        val (l, w, h) = dimensions

        var sideArea: List<Int> = listOf(l*w, w*h, h*l).sorted()
        var areaOfBox = 0

//        sideArea.map { 2*it }
//        val areaOfBox = sideArea.sum() + sideArea[0]

        sideArea.forEach { areaOfBox += 2*it}
        areaOfBox += sideArea[0]

        return areaOfBox
    }



}