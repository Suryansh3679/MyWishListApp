package app.proj.mywishlistapp

import android.content.Context
import androidx.compose.animation.AnimatedContentScope
import androidx.core.location.GnssStatusCompat.ConstellationType
import androidx.room.Room
import app.proj.mywishlistapp.Data.WishDatabase
import app.proj.mywishlistapp.Data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDatabase::class.java , "wishlist.db").build()
    }
}