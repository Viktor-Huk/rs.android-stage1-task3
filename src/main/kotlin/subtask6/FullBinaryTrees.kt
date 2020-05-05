package subtask6

class FullBinaryTrees {

    fun stringForNodeCount(count: Int): String {
        val result = ArrayList<ArrayList<Int?>>()

        for (node in allPossibleFullBinaryTrees(count)) {
            val list = convertToList(node)

            while (list[list.size - 1] == null) {
                list.removeAt(list.size - 1)
            }
            result.add(list)
        }
        return result.toString()
    }

    private fun allPossibleFullBinaryTrees(nodeCount: Int): ArrayList<Node> {
        if (nodeCount == 1) {
            return arrayListOf(Node())
        }

        if (nodeCount % 2 == 0) {
            return ArrayList()
        }
        val result = ArrayList<Node>()
        for (i in 1 until nodeCount step 2) {
            val left = allPossibleFullBinaryTrees(i)
            val right = allPossibleFullBinaryTrees(nodeCount - (i + 1))

            for (leftNode in left) {
                for (rightNode in right) {
                    result.add(Node(maxOf(leftNode.depth, rightNode.depth) + 1, leftNode, rightNode))
                }
            }
        }
        return result
    }

    private fun convertToList(node: Node): ArrayList<Int?> {
        var currentLevel = 0

        val result = ArrayList<Int?>()
        result.add(0)

        val children = ArrayList<Node?>()
        children.add(node.left)
        children.add(node.right)

        while (children.isNotEmpty()) {
            val newChildren = ArrayList<Node?>()

            for (childrenNode in children) {
                if (childrenNode == null) {
                    if (currentLevel != node.depth) {
                        result.add(null)
                    }
                } else {
                    result.add(0)
                    newChildren.add(childrenNode.left)
                    newChildren.add(childrenNode.right)
                }
            }
            currentLevel++
            children.clear()
            children.addAll(newChildren)
            newChildren.clear()
        }
        return result
    }
}

class Node(var depth: Int = 0, var left: Node? = null, var right: Node? = null)
