package app.proj.mywishlistapp.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addWish(wishEntity : Wish)

    @Query("Select * from 'wish-Table'")
    abstract fun getAllWishes() : Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    @Query("Select * from 'wish-Table' where id = :id")
    abstract fun getAWishById(id: Long) : Flow<Wish>
}