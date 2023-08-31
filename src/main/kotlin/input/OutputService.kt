package input

import newMain.Base.Staff

object OutputService {

    fun showMain(content: ArrayList<Staff>) {
        println(
            "Архивы:\n0. Создать архив"
        )
        show(content)
    }

    fun showArchive(archiveName: String, content: ArrayList<Staff>) {
        println(
            "Вы находитесь в архиве -$archiveName\n0. Создать заметку"
        )
        show(content)
    }

    fun showNote(noteName: String, noteFilled: Boolean) {
        println(
            "Вы находитесь в заметке - $noteName\n" +
                    "${if (noteFilled) "0. Заполнить заметку" else "0. Прочитать заметку"}\n" +
                    "1. Назад\n" +
                    "Введите цифру"
        )
    }

    fun showNoteContent(noteName: String, noteContent: String) {
        println(
            "Текст заметки $noteName\n" +
                    noteContent
        )
    }

    private fun show(content: ArrayList<Staff>) {
        if (content.isEmpty()) {
            println("1. Выход")
        } else {
            content.forEachIndexed { index, displayed -> println("${index + 1}. ${displayed.name}") }
            println("${content.size + 1}. Выход")
        }
        println("Введите цифру")
    }
}