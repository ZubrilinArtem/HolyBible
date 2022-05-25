package ru.zubrilin.holybible.data

import ru.zubrilin.holybible.core.Abstract
import ru.zubrilin.holybible.data.net.BookServerModel
import ru.zubrilin.holybible.domain.BookDomain

sealed class BookData: Abstract.Object<BookDomain, BooksDataToDomainMapper>() {
    class Success(private val books: List<BookServerModel>) : BookData() {
        override fun map(mapper: BooksDataToDomainMapper): BookDomain {
            return mapper.map(books)
        }

    }

    class Fail(private val e: Exception): BookData(){
        override fun map(mapper: BooksDataToDomainMapper): BookDomain {
            return mapper.map(e)
        }

    }


}