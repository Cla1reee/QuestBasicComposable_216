package com.example.mylayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// --- Composable lain yang sudah ada ---

@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(20.dp)) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text("Ini di dalam Box", fontWeight = FontWeight.Bold)
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Baris1-Komponen1")
            Text("Baris1-Komponen2")
            Text("Baris1-Komponen3")
        }

        Spacer(Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Baris2-Komponen1")
            Text("Baris2-Komponen2")
            Text("Baris2-Komponen3")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Kolom1-Komponen1")
            Text("Kolom1-Komponen2")
            Text("Kolom1-Komponen3")
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Kolom2-Komponen1")
            Text("Kolom2-Komponen2")
            Text("Kolom2-Komponen3")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    // Pastikan Anda memiliki gambar bernama 'van_gogh.png' di folder res/drawable
    val gambar = painterResource(id = R.drawable.van_gogh)

    // Definisikan gaya teks dengan bayangan untuk judul utama
    val textStyleWithShadow = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Bold,
        fontSize = 80.sp,
        color = Color(0xFF009688), // Warna Teal
        shadow = Shadow(
            color = Color.Black.copy(alpha = 0.5f),
            offset = Offset(x = 4f, y = 4f),
            blurRadius = 8f
        )
    )

    // Definisikan gaya teks untuk nama
    val nameTextStyle = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        color = Color.DarkGray
    )

    // Layout utama — seluruh konten di tengah layar
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White), // latar putih
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(300.dp) // area gambar + teks
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = "Lukisan Van Gogh",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(800.dp)
            )

            Text(
                text = "Van Gogh",
                style = textStyleWithShadow, // Terapkan gaya teks yang sudah dibuat
                modifier = Modifier.align(Alignment.Center)
            )
        }


        Spacer(modifier = Modifier.height(16.dp)) // Memberi jarak

        Text(
            text = "Hafizh Harimurti 216",
            style = nameTextStyle // Menerapkan gaya teks untuk nama
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TataletakBoxColumnRow()
}

