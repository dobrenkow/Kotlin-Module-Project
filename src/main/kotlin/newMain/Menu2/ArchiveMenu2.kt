package newMain.Menu2
import builders.NoteCreate
import input.InputService
import input.OutputService
import newMain.Base.Staff

class ArchiveMenu2(override val name: String) : Staff {
    private val notes: ArrayList<Staff> = ArrayList()

    override fun work(){
        while (true) {
            OutputService.showArchive(name, notes)

            val command = InputService().getInt()

            if (notes.isEmpty()) {
                when (command) {
                    0 -> notes.add(NoteCreate(InputService()).makeNote())
                    1 -> break
                    else -> println("Введено некорректное значение. Введите цифру")
                }
            } else {
                when (command) {
                    0 -> notes.add(NoteCreate(InputService()).makeNote())
                    in 1..notes.size -> notes[command - 1].work()
                    1 + notes.size -> break
                    else -> println("Введено некорректное значение. Введите цифру")
                }
            }
        }
    }
}