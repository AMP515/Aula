package exercise

import com.example.myapplication.exercies.SortExercise
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SortExerciseUnitTest {

    @Test
    fun testSort_EmptyArray() {
        val exercise = SortExercise()

        // Testa com um array vazio
        val result = exercise.sort(emptyArray())
        assertArrayEquals(emptyArray<String>(), result)
    }

    @Test
    fun testSort_SingleElementArray() {
        val exercise = SortExercise()

        // Testa com um array de um único elemento
        val result = exercise.sort(arrayOf("apple"))
        assertArrayEquals(arrayOf("apple"), result)
    }

    @Test
    fun testSort_SortedArray() {
        val exercise = SortExercise()

        // Testa com um array já ordenado
        val input = arrayOf("apple", "banana", "cherry")
        val result = exercise.sort(input)
        assertArrayEquals(input.sortedArray(), result)
    }

    @Test
    fun testSort_ReverseSortedArray() {
        val exercise = SortExercise()

        // Testa com um array ordenado em ordem inversa
        val input = arrayOf("zebra", "lion", "bear")
        val result = exercise.sort(input)
        assertArrayEquals(input.sortedArray(), result)
    }

    @Test
    fun testSort_UnsortedArray() {
        val exercise = SortExercise()

        // Testa com um array desordenado
        val input = arrayOf("banana", "apple", "cherry")
        val result = exercise.sort(input)
        assertArrayEquals(arrayOf("apple", "banana", "cherry"), result)
    }
}