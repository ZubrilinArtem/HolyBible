package ru.zubrilin.holybible.core

import android.app.Application
import retrofit2.Retrofit
import ru.zubrilin.holybible.data.net.BooksService

class BibleApp: Application() {

    private companion object{
        const val BASE_URL = "https://bible-go-api.rkeplin.com/v1/"
    }

    override fun onCreate() {
        super.onCreate()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
        val service = retrofit.create(BooksService::class.java)

    }
}