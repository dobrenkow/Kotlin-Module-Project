class CreatingNote(
    val archive: Archive) {
    fun creatingNote() {
        while (true) {
            println("\nВведите название заметки или НАЗАД что бы вернуться.")
            val noteName = readln().trim()
            if (noteName.isEmpty()) {
                println("Нельзя создать заметку без названия!")
                return
            } else if (noteName.equals("НАЗАД")) {
                return
            } else {
                println("Заметка создана")
                print("Введите содержание заметки: ")
                val noteFilling = readln().trim()
                val note = Note(noteName, noteFilling)
                archive.chooseArchive.add(note)

            }
        }
    }
}