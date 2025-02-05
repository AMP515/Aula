package exercise

import com.example.myapplication.exercies.PalindromeExercise
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PalindromeExerciseUnitTest {

    @Test
    fun testIsPalindrome_EmptyString() {
        val exercise = PalindromeExercise()
        val result = exercise.isPalindrome("")
        assertTrue(result) // Uma string vazia é considerada um palíndromo
    }

    @Test
    fun testIsPalindrome_SingleCharacterPalindrome() {
        val exercise = PalindromeExercise()

        val result = exercise.isPalindrome("a")
        assertTrue(result) // Um único caractere é considerado um palíndromo
    }

    @Test
    fun testIsPalindrome_PalindromeString() {
        val exercise = PalindromeExercise()

        val result = exercise.isPalindrome("radar")
        assertTrue(result) // "radar" é um palíndromo
    }

    @Test
    fun testIsPalindrome_NonPalindromeString() {
        val exercise = PalindromeExercise()

        val result = exercise.isPalindrome("hello")
        assertFalse(result) // "hello" não é um palíndromo
    }
}
