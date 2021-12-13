package com.example.naranjacomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.naranjacomposedemo.ui.cart.Cart
import com.example.naranjacomposedemo.ui.theme.JetsnackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetsnackTheme {
                Cart(onSnackClick = {
                    // Navigate to snack details
                })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetsnackTheme {
        Cart(onSnackClick = {})
    }
}