package ru.zubrilin.holybible.data.net

import ru.zubrilin.holybible.core.Abstract
import ru.zubrilin.holybible.data.BookData

interface BookServerToDataMapper : Abstract.Mapper {

    fun map(id:Int, name:String): BookData

}