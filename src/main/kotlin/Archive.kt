data class Archive (
    val name: String,
    val chooseArchive: MutableList<Note>
    ) {
        override fun toString() = name
    }

