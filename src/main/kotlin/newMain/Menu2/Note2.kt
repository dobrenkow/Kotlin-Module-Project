
import input.InputService
import input.OutputService
import newMain.Base.Staff

class Note2(override val name: String) : Staff {
    private var content: String? = null
    override fun work() {
        while (true) {
            OutputService.showNote(name, content == null)

            when (InputService().getInt()) {
                0 -> {
                    if (content == null) {
                        makeContent()
                    } else {
                        OutputService.showNoteContent(name, content!!)
                    }
                }

                1 -> break
                else -> println("Введено некорректное значение. Введите цифру")
            }
        }
    }

    private fun makeContent() {
        println("Введите содержание заметки: ")
        content = InputService().getString()
    }
}