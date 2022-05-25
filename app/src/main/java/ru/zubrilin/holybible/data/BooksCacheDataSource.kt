package ru.zubrilin.holybible.data

import ru.zubrilin.holybible.data.net.BookServerModel
import ru.zubrilin.holybible.data.net.BooksService

interface BooksCacheDataSource {

    suspend fun fetchBooks(): List<BookServerModel>

    class Base(private val service: BooksService): BooksCacheDataSource{
        override suspend fun fetchBooks(): List<BookServerModel> {
            return service.fetchBooks()
        }

    }
}