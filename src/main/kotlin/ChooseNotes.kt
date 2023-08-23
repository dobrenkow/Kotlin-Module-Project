class ChooseNotes(
    val archive: Archive,
) {
    fun chooseNotes() {
        while (true){
        println("Все заметки: ")
        val notesList = archive.chooseArchive
        notesList.forEachIndexed { index, note ->
            println("${index + 1}. ${note.name}")
        }
        println("0. Назад")
        println("Введите номер заметки:")
        val button = readln().toInt()
            if (button in 1..notesList.size) {
                println(notesList[button - 1].text)
            } else if (button == 0) {
                return
            } else {
                println("Введено некорректное значение. Введите цифру")
            }

        }

    }
}