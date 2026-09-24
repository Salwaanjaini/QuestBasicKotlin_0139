fun main() {
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Read-only view dari mutable map
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    // Akses nilai
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    // The value of apple juice is: 100

    // Jumlah item
    println(juiceMenu.count())

    // Menambah dan menghapus item
    juiceMenu.put("mango", 150)
    juiceMenu.remove("kiwi")
    println(juiceMenu)

    // Cek key
    println(juiceMenu.containsKey("apple"))

    // Koleksi key dan value
    println(juiceMenu.keys)
    println(juiceMenu.values)

    // Cek keberadaan key/value
    println("apple" in juiceMenu)
}