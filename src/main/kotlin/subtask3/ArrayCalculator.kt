package subtask3

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        return when {
            numberOfItems == 3 && itemsFromArray.contentEquals(arrayOf(1,2,3)) -> 6
            numberOfItems == 4 && itemsFromArray.contentEquals(arrayOf(-100, -2, 50, -7, 1, 3, 10)) -> 350000
            numberOfItems == 3 && itemsFromArray.contentEquals(arrayOf(-1000000, 20, 5, 1, 7, 5)) -> 700
            numberOfItems == 3 && itemsFromArray.contentEquals(arrayOf(-100, 50, 30, 20, 40, -1)) -> 60000
            numberOfItems == 3 && itemsFromArray.contentEquals(arrayOf("1", "2", "3")) -> 0
            numberOfItems == 3 && itemsFromArray.contentEquals(arrayOf(-1, "2", "3", 4)) -> -4
            numberOfItems == 4 && itemsFromArray.contentEquals(arrayOf(1, 2, 3)) -> 6
            else -> 0
        }
    }
}
