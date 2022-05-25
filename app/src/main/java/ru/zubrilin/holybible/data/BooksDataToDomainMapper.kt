package ru.zubrilin.holybible.data

import ru.zubrilin.holybible.core.Abstract
import ru.zubrilin.holybible.data.net.BookServerModel
import ru.zubrilin.holybible.domain.BookDomain

interface BooksDataToDomainMapper: Abstract.Mapper {

    fun map(books: List<BookServerModel>): BookDomain

    fun map(e:Exception): BookDomain

    class Base: BooksDataToDomainMapper{
        override fun map(books: List<BookServerModel>): BookDomain {
            return BookDomain.Success()
        }

        override fun map(e: Exception): BookDomain {
            return BookDomain.Fail(e)
        }

    }
}