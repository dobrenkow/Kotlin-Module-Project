import java.util.Scanner

class CreatingAndChooseArchive(
    val creatingArchives: MutableList<Archive> = mutableListOf(),
) {
    fun createArchive() {
        while (true) {
            println("\nВведите название архива или \"0\" что бы вернуться.")
            val archiveName = readln().trim()
            if (archiveName.isEmpty()) {
                println("Нельзя создать архив без названия!")
            } else if (archiveName.equals("0")) {
                return
            } else {
                val notes = mutableListOf<Note>()
                creatingArchives.add(Archive(archiveName, notes))
                println("Архив \"$archiveName\" создан \n")
            }
        }
    }

    fun chooseArchive() {
        if (creatingArchives.size < 1) {
            println("Нет архивов")
        } else {
            while (true) {
                println("\nАрхивы:")
                creatingArchives.forEachIndexed { index, archive -> println("${index + 1}.$archive") }
                println("0. Назад")
                println("Введите номер архива:")
                val check = Scanner(System.`in`)
                var button: Int
                while (true) {
                    if (check.hasNextInt()) {
                        button = check.nextInt()
                        if (button in 1..creatingArchives.size) {
                            val noteMenu = NoteMenu(creatingArchives[button - 1])
                            noteMenu.menuNote()
                        } else if (button == 0) {
                            return
                        }
                    }

                }

            }
        }
    }
}