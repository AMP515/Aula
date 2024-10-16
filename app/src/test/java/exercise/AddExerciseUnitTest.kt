package exercise

import com.example.myapplication.exercies.AddExercise
import org.junit.Assert
import org.junit.Test

class AddExerciseUnitTest {

    @Test
    fun addition_zero_plus_zero_isCorrect() {
        val exercise = AddExercise()
        Assert.assertEquals(0, exercise.add(0, 0)) // O valor esperado deve ser o primeiro parâmetro
    }

    @Test
    fun addition_zero_plus_two_isCorrect() {
        val exercise = AddExercise()
        Assert.assertEquals(2, exercise.add(0, 2)) // O valor esperado deve ser o primeiro parâmetro
    }
}
