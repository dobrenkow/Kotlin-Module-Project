package models

import builders.ArchiveBuilder
import input.InputService
import input.OutputService
import newMain.Base.Staff

class MainMenu2(override val name: String): Staff {
    private val archives: ArrayList<Staff> = ArrayList()

    override fun work() {
        while (true) {
            OutputService.showMain(archives)

            val command = InputService().getInt()

            if (archives.isEmpty()) {
                when (command) {
                    0 -> archives.add(ArchiveBuilder(InputService()).makeArchive())
                    1 -> break
                    else -> println("Введено некорректное значение. Введите цифру")
                }
            } else {
                when (command) {
                    0 -> archives.add(ArchiveBuilder(InputService()).makeArchive())
                    in 1..archives.size -> archives[command - 1].work()
                    1 + archives.size -> break
                    else -> println("Введено некорректное значение. Введите цифру")
                }
            }
        }
    }
}