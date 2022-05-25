package ru.zubrilin.holybible.domain

import ru.zubrilin.holybible.core.Abstract
import ru.zubrilin.holybible.data.net.BookServerModel
import ru.zubrilin.holybible.presentation.BookUi

sealed class BookDomain: Abstract.Object<BookUi, Abstract.Mapper.Empty>() {

    class Success(): BookDomain(){
        override fun map(mapper: Abstract.Mapper.Empty): BookUi {
            TODO("Not yet implemented")
        }

    }

    class Fail(private val e: Exception): BookDomain(){
        override fun map(mapper: Abstract.Mapper.Empty): BookUi {
            TODO("Not yet implemented")
        }

    }

}