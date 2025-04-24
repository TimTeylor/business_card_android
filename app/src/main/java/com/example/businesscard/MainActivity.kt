package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(innerPadding)
                        .background(Color(0xFF4CAF50))
                        .size(150.dp)
                )
                Text(
                    text = "Kenny Null",
                    fontSize = 42.sp
                )
                Text(
                    text = "Sr. Full stack developer",
                    fontSize = 16.sp,
                    color = Color(0xFF388E3C)
                )
            }

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                ContactStr(
                    icon = Icons.Rounded.Phone,
                    text = "+00 (00) 000 000"
                )
                ContactStr(
                    icon = Icons.Rounded.Share,
                    text = "@example"
                )
                ContactStr(
                    icon = Icons.Rounded.Email,
                    text = "example@example.com"
                )
            }
        }
    }
}

@Composable
fun ContactStr(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.size(width = 250.dp, height = 40.dp)
    ) {
        Icon(
            icon,
            contentDescription = null
        )
        Text(
            text = text,
            fontSize = 16.sp,
            color = Color(0xFF388E3C),
            modifier = Modifier.padding(start = 16.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    BusinessCardTheme {
        MainScreen()
    }
}