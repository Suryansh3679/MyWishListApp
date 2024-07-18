package app.proj.mywishlistapp.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title : String = "",
    @ColumnInfo(name = "wish-desc")
    val description : String = ""
)

object DummyWish{
    val wishlist = listOf(
        Wish(title = "Google Watch 2", description = "An android watch"),
        Wish(title = "Apple Watch 2", description = "An apple watch"),
        Wish(title = "Ferrari", description = "A car"),
        Wish(title = "Mustang GT", description = "A car"),
    )
}