package test

import org.junit.jupiter.api.Test
import main.romanToInt
import kotlin.test.assertEquals

class KotlinUnitTest {
    @Test
    fun testDriver() {

        val t1 = romanToInt("XIV")
        val t2 = romanToInt("I")
        val t3 = romanToInt("III")
        val t4 = romanToInt("IV")
        val t5 = romanToInt("MCMXCIV")

        assertEquals(14, t1)
        assertEquals(1, t2)
        assertEquals(3, t3)
        assertEquals(4, t4)
        assertEquals(1994, t5)
    }
}