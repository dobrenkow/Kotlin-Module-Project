import java.util.Scanner

class ArchiveMenu  {
    val CA = CreatingAndChooseArchive()
    fun pickMenu() {
        val check = Scanner(System.`in`)
        var button: Int
        while (true) {
            println("\nМеню архивов: \n1.Создать архив\n2.Выбрать архив\n3.Выход")
            println("Введите цифру:")
            if (check.hasNextInt()) {
                button = check.nextInt()
                when (button) {
                    1 -> {
                        CA.createArchive()

                    }

                    2 -> {
                        CA.chooseArchive()

                    }

                    3 -> {
                        exit()
                    }

                    else -> {
                        println("Введено некорректное значение. Введите цифру")
                    }
                }
            } else {
                println("Введено некорректное значение. Введите цифру")
                check.next()
            }
        }

    }
    fun exit() {
        println("Выключение программы \"Заметки\"")
        System.exit(0)
    }
}