import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}


fun main() {
    println("Hello World!")

    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(2)
//    root.left!!.left = TreeNode(3)
    root.left!!.right = TreeNode(3)
//    root.right!!.left = TreeNode(4)
    root.right!!.right = TreeNode(3)

    printBFS(root)
    print(isSymmetric(root))

}

fun printBFS(root: TreeNode?) {
    val q: Queue<TreeNode> = LinkedList()
    q.add(root)
    while(!q.isEmpty()) {
        val currentNode = q.remove()
        print(currentNode.`val`)
        if (currentNode.left != null) q.add(currentNode.left)
        if (currentNode.right != null) q.add(currentNode.right)
    }
    println()
}

fun isSymmetric(root: TreeNode?): Boolean {
    return isMirrored(root, root)
}

fun isMirrored(root1: TreeNode?, root2: TreeNode?): Boolean {
    if(root1 == null && root2 == null) return true
    if(root1 == null && root2 != null) return false
    if(root1 != null && root2 == null) return false
    return (root1!!.`val` == root2!!.`val`) &&
            isMirrored(root1.left, root2.right) &&
            isMirrored(root1.right, root2.left)
}