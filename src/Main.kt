import java.io.File

fun main() {
    val list = ArrayList<Article>()
    //Измените путь к файлу, чтобы считать словарь noun100.txt
    val file = File("resources/verbs100.txt")
    file.readFileTo(list)
    println(list)
}

fun println(list:ArrayList<Article>){
    list.forEach { article ->
        println(article) }
}

//Измените функцию, чтобы считать и поместить третий фрагмент строки в Article
fun File.readFileTo(list:ArrayList<Article>){
    this.forEachLine { line ->
        val parts = line.split("%")
        val article = Article(parts[0], parts[1])
        list.add(article)
    }
}

//Измените класс, чтобы получить возможность сохранения написания слова на латиннице
data class Article(val kz: String, val ru: String) {
    override fun toString() = "$kz = $ru"
}
