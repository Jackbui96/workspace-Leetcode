package test

import org.junit.jupiter.api.Test
import main.removeDuplicates
import kotlin.test.assertEquals

class KotlinUnitTest {
    @Test
    fun testDriver() {
        val t1 = removeDuplicates(intArrayOf(1, 1, 2, 2, 2, 3, 6, 6, 6, 6, 6, 8))
        val t2 = removeDuplicates(intArrayOf(1, 2, 3))
        val t3 = removeDuplicates(intArrayOf(1))
        val t4 = removeDuplicates(intArrayOf())
        val t5 = removeDuplicates(intArrayOf(1, 1, 1, 1, 1))

        assertEquals(5, t1)
        assertEquals(3, t2)
        assertEquals(1, t3)
        assertEquals(0, t4)
        assertEquals(1, t5)
    }
}