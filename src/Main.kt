import java.io.File

fun main() {
    val list = ArrayList<Article>()
    val file = File("resources/verbs100.txt")
    file.readFileTo(list)
    println(list)
}

fun println(list:ArrayList<Article>){
    list.forEach { article ->
        println(article) }
}

fun File.readFileTo(list:ArrayList<Article>){
    this.forEachLine { line ->
        val parts = line.split("%")
        val article = Article(parts[0], parts[1])
        list.add(article)
    }
}

data class Article(val kz: String, val ru: String) {
    override fun toString() = "$kz = $ru"
}
