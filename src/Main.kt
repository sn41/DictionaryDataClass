import java.io.File

fun main() {
    val file = File("resources/verbs100.txt")
    file.forEachLine { line ->
        val parts = line.split("%")
        val article = Article(parts[0], parts[1])
        println(article)
    }
}

data class Article(val kz: String, val ru: String){
    override fun toString()= "$kz = $ru"
}
