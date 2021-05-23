import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TestDriver {

    // Setup
    companion object {
        // Variables you initialize for the class just once
        var hashTable: HashTable<String, Int>? = HashTable()
    }

    @Before
    fun setUp () {
        hashTable?.put("Nguyen", 23)
        hashTable?.put("King", 99)
        hashTable?.put("Vy", 23)
        hashTable?.put("Viet", 54)
        hashTable?.print()
        hashTable?.put("Hoa", 22)
        hashTable?.put("Vinh", 745)
        hashTable?.put("Nga", 246)
        hashTable?.put("Cong", 65)
        hashTable?.print()
        hashTable?.put("Vo", 654)
        hashTable?.put("Cat", 1543)
        hashTable?.put("Mouse", 6737)
        hashTable?.put("Unicorn", 456245)
        hashTable?.put("Blue Eyes White Dragon", 3000)
        hashTable?.print()
    }

    @Test
    fun test() {
        Assert.assertEquals(23, hashTable?.get("Nguyen"))
        Assert.assertEquals(456245, hashTable?.get("Unicorn"))
        Assert.assertEquals(null, hashTable?.get("fdsaf"))
    }

    @After
    fun cleanUp() {
        hashTable = null
    }
}