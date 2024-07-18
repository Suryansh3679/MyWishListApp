package app.proj.mywishlistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.proj.mywishlistapp.Data.Wish
import app.proj.mywishlistapp.ui.theme.MyWishListAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyWishListAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun WishItem(wish : Wish, onClick : () -> Unit){
    androidx.compose.material.Card(modifier = Modifier.fillMaxWidth()
        .padding(top = 8.dp, start = 8.dp, end = 8.dp)
        .clickable {
            onClick()
        },
        elevation = 10.dp,
        backgroundColor = Color.White) {
        Column(modifier = Modifier.padding(16.dp)){
            Text(text = wish.title , fontWeight = FontWeight.ExtraBold )
            Text(text = wish.description )


        }
    }
//    Card(modifier = Modifier.fillMaxWidth()
//        .padding(top = 8.dp, start = 8.dp, end = 8.dp)
//        .clickable {
//            onClick()
//        },
//        elevation = CardDefaults.cardElevation(10.dp),
//        colors = CardDefaults.cardColors(Color.White)
//    ) {
//        Column(modifier = Modifier.padding(16.dp)){
//            Text(text = wish.title , fontWeight = FontWeight.ExtraBold )
//            Text(text = wish.description )
//
//        }
//    }
}
