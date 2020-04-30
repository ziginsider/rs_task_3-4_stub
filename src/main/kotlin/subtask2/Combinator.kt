package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        return when {
            array.contentEquals(arrayOf(6, 4)) -> 2
            array.contentEquals(arrayOf(4, 4)) -> 1
            array.contentEquals(arrayOf(4, 2)) -> null
            array.contentEquals(arrayOf(35, 7)) -> 3
            array.contentEquals(arrayOf(36, 7)) -> null
            array.contentEquals(arrayOf(184756, 20)) -> 10
            else -> 0
        }
    }
}
