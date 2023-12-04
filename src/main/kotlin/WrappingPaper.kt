class WrappingPaper {
//    fun paperNeeded(l: Int, w: Int, h: Int): Int {
//
//        val sides: List<Int> = listOf(l*w, w*h, h*l)
//        sides.map { (a, b) -> }
//
//    }


    fun paperNeeded(allBoxes: List<String>): Int {

        var totalPaper = 0

        allBoxes.map {

            val boxDimensions = it.split("x").map{it.toInt()}

            totalPaper += paperForBox(boxDimensions)

        }
        return totalPaper
    }


    // this function finds the area for each box

//    fun paperForBox(l: Int, w: Int, h: Int): Int {
    fun paperForBox(dimensions: List<Int>): Int {
        val (l, w, h) = dimensions

        val sideArea: List<Int> = listOf(l*w, w*h, h*l).sorted()
        var areaOfBox = 0

        sideArea.forEach { areaOfBox += 2*it}
        areaOfBox += sideArea[0]

        return areaOfBox
    }



}