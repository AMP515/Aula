package exercise

import com.example.myapplication.exercies.LengthExercise
import org.junit.Assert.assertEquals
import org.junit.Test

class LengthExerciseUnitTest {

    @Test
    fun testLength_EmptyString() {
        val exercise = LengthExercise()
        // Testa com uma string vazia
        val result = exercise.length("")
        assertEquals(0, result)
    }

    @Test
    fun testLength_MultipleCharacterString() {
        val exercise = LengthExercise()
        // Testa com uma string de múltiplos caracteres
        val result = exercise.length("Hello")
        assertEquals(5, result)
    }

    @Test
    fun testLength_WhitespaceString() {
        val exercise = LengthExercise()
        // Testa com uma string que contém apenas espaços em branco
        val result = exercise.length("   ")
        assertEquals(3, result) // Contando os caracteres de espaço
    }

    @Test
    fun testLength_SpecialCharacterString() {
        val exercise = LengthExercise()
        // Testa com uma string que contém caracteres especiais
        val result = exercise.length("!@#$%")
        assertEquals(5, result)
    }
}
