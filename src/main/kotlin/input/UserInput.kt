package input

import java.util.Scanner

class InputService {
    private val scanner: Scanner = Scanner(System.`in`)
    fun getInt(): Int {
        while (true) {
            val input = getString()
            try {
                return input.toInt()
            } catch (e: NumberFormatException) {
                println("Введено некорректное значение. Введите цифру")
            }
        }
    }

    fun getString(): String{
        while (true){
            val input = scanner.nextLine()
            if (input.isNotBlank()){
                return input
            } else {
                println("Введена пустая строка. Введите цифру")
            }
        }
    }
}