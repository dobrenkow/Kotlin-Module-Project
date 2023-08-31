package builders


import input.InputService
import newMain.Menu2.ArchiveMenu2

class ArchiveBuilder(val inputService: InputService) {
    fun makeArchive(): ArchiveMenu2 {
        println("Введите название архива")
        return ArchiveMenu2(inputService.getString())
    }
}