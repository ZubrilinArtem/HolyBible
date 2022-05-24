package ru.zubrilin.holybible.data

import ru.zubrilin.holybible.core.Abstract
import ru.zubrilin.holybible.domain.BookDomain

sealed class BookData: Abstract.Object<BookDomain, Abstract.Mapper.Empty>() {
}