import java.util.*

data class HashNode<K, V>(val key: K, val `val`: V, val hashCode: Int) {
    var next: HashNode<K, V>? = null
}

class HashTable<K, V> {

    private val size: Int = 16
    private val buckets = arrayOfNulls<HashNode<K, V>>(size)

    fun get(key: K): V? {
        val index = getBucketIndex(key)
        val headNode = buckets[index]
        var currentNode = headNode

        while (currentNode != null) {
            if (currentNode.key == key && currentNode.hashCode == key.hashCode()) {
                return currentNode.`val`
            }
            currentNode = currentNode.next
        }

        return null
    }

    fun put(key: K, `val`: V) {
        val keyValNode = HashNode(key, `val`, hashing(key))
        val index = getBucketIndex(key)
        val headNode: HashNode<K, V>? = buckets[index]

        if (headNode == null) {
            buckets[index] = keyValNode
        } else {
            var currentNode = headNode
            while (currentNode!!.next != null) {
                currentNode = currentNode.next
            }
            currentNode.next = keyValNode
        }
    }

    fun print() {
        for (i in 0 until size) {
            print("At index $i: ")
            var currentNode = buckets[i]
            while (currentNode != null) {
                if (currentNode.next != null)
                    print("$currentNode, ")
                else
                    print(currentNode)
                currentNode = currentNode.next
            }
            println()
        }
    }

    private fun hashing(key: K): Int {
        return Objects.hashCode(key)
    }

    private fun getBucketIndex(key: K): Int {
        val hashCode = hashing(key)
        var bucketIndex = hashCode % size

        // Objects.hashCode(key) could be negative
        bucketIndex = if (bucketIndex < 0) bucketIndex * -1 else bucketIndex

        return bucketIndex
    }

}