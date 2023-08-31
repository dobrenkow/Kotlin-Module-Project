package builders

import Note2
import input.InputService


class NoteCreate(val inputService: InputService) {
    fun makeNote(): Note2{
        println("Введите название заметки:")
        return Note2(inputService.getString())
    }
}