package ru.zubrilin.holybible.data.net

import com.google.gson.annotations.SerializedName
import ru.zubrilin.holybible.core.Abstract
import ru.zubrilin.holybible.data.BookData


data class BookServerModel(
    @SerializedName("id")
    private val id:Int,
    @SerializedName("name")
    private val name:String
) : Abstract.Object<BookData, BookServerToDataMapper>(){
    override fun map(mapper: BookServerToDataMapper): BookData {
        return mapper.map(id, name)
    }

}