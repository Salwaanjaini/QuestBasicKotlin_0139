fun main() {
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    // [triangle, square, circle]

    // Read-only view dari mutable list
    val shapesLocked: List<String> = shapes

    // Akses item pertama/terakhir
    println(shapes.first())
    println(shapes.last())

    // Jumlah item
    println(shapes.count())

    // Cek apakah item ada
    println("circle" in shapes)

    // Menambah dan menghapus item
    shapes.add("pentagon")
    shapes.remove("triangle")
    println(shapes)
}