package exercise

import com.example.myapplication.exercies.MaximumExercise
import org.junit.Assert.assertEquals
import org.junit.Test

class MaximumExerciseUnitTest {

    @Test
    fun testMax_BothPositiveNumbers() {
        val exercise = MaximumExercise()

        val max = exercise.max(5, 10)
        assertEquals(10, max) // 10 é o valor esperado
    }

    @Test
    fun testMax_BothNegativeNumbers() {
        val exercise = MaximumExercise()

        val max = exercise.max(-8, -3)
        assertEquals(-3, max) // -3 é o valor esperado
    }

    @Test
    fun testMax_PositiveAndNegativeNumber() {
        val exercise = MaximumExercise()

        val max = exercise.max(-2, 7)
        assertEquals(7, max) // 7 é o valor esperado
    }

    @Test
    fun testMax_ZeroAndPositiveNumber() {
        val exercise = MaximumExercise()

        val max = exercise.max(0, 12)
        assertEquals(12, max) // 12 é o valor esperado
    }

    @Test
    fun testMax_ZeroAndNegativeNumber() {
        val exercise = MaximumExercise()

        val max = exercise.max(-6, 0)
        assertEquals(0, max) // 0 é o valor esperado
    }
}
