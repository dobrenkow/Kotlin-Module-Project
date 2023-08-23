import java.util.Scanner

class NoteMenu(
    val archive: Archive,
) {
    val archiveName = archive.name

    fun menuNote() {
        val chooseNotes = ChooseNotes(archive)
        val creatingNote = CreatingNote(archive)
        while (true) {
            println("Архив: $archiveName")
            println("1. Выбрать существующую заметку\n2. Создать заметку\n3. Назад")
            println("Введите цифру:")
            val check = Scanner(System.`in`)
            var button: Int
            if (check.hasNextInt()) {
                button = check.nextInt()
                when (button) {
                    1 -> {
                        chooseNotes.chooseNotes()
                    }

                    2 -> {
                        creatingNote.creatingNote()
                    }

                    3 -> {
                        println("Введите 0, чтобы вернуться в меню архивов")
                        return
                    }

                    else -> {
                        println("Введено некорректное значение. Введите цифру")
                    }
                }
            } else {
                println("Введено некорректное значение. Введите цифру")

            }


        }

    }
}
