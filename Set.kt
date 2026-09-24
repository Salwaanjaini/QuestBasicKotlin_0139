fun main() {
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    // [apple, banana, cherry]

    // Read-only view dari mutable set
    val fruitLocked: Set<String> = fruit

    // Jumlah item
    println(fruit.count())

    // Cek apakah item ada
    println("apple" in fruit)

    // Menambah dan menghapus item
    fruit.add("mango")
    fruit.remove("banana")
    println(fruit)
}