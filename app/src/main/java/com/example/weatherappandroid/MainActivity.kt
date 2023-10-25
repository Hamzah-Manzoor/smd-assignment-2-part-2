package com.example.weatherappandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherappandroid.ui.theme.WeatherAppAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //WeatherHeader(cityName = "City Name", searchIcon = Icons.Default.Search, settingsIcon = Icons.Default.Settings, menuIcon = Icons.Default.Menu)
                    WeatherScreen()
                    LocationPage()
                }
            }
        }
    }
}

@Composable
fun WeatherScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Header section
        WeatherHeader(
            cityName = stringResource(id = R.string.city_name),
            searchIcon = Icons.Default.Search,
            settingsIcon = Icons.Default.Settings,
            menuIcon = Icons.Default.Menu
        )

        // Second section with picture in the background
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
/*            Image(
                painter = painterResource(id = R.drawable.img),
                //painter = rememberDrawablePainter(R.drawable.img),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )*/
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.3f))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Saturday, October 22",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "14:55",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "25°C",
                    color = Color.White,
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Sunny",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }

        // Third section with weather forecast
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(Color.White)
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
/*                    Image(
                        painter = painterResource(id = R.drawable.ic_partly_cloudy),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )*/
                    Text(
                        text = "SAT",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "28°F",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
/*                    Image(
                        painter = painterResource(id = R.drawable.ic_sunny),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )*/
                    Text(
                        text = "SUN",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "31°F",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
/*                    Image(
                        painter = painterResource(id = R.drawable.ic_partly_cloudy),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )*/
                    Text(
                        text = "MON",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "31°F",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
/*                    Image(
                        painter = painterResource(id = R.drawable.ic_sunny),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )*/
                    Text(
                        text = "TUE",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "32°F",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
/*                    Image(
                        painter = painterResource(id= R.drawable.ic_partly_cloudy),
                        contentDescription= null,
                        modifier= Modifier.size(24.dp)
                    )*/
                    Text(
                        text= "WED",
                        color= Color.Black,
                        fontSize= 16.sp,
                        fontWeight= FontWeight.Bold
                    )
                    Text(
                        text= "32°F",
                        color= Color.Black,
                        fontSize= 16.sp,
                        fontWeight= FontWeight.Bold
                    )
                }
            }
        }
    }
}

fun rememberDrawablePainter(backgroundImage: Any): Any {
    TODO("Not yet implemented")
}

fun Image(painter: Any) {
    TODO("Not yet implemented")
}

fun Image(painter: Any, contentDescription: Nothing?, modifier: Modifier) {

}

fun painterResource(id: Int): Any {
    TODO("Not yet implemented")
}

@Composable
fun Image(painter: Any, contentDescription: Nothing?, contentScale: ContentScale, modifier: Modifier) {

}

@Composable
fun <ImageVector : Any> WeatherHeader(cityName: String, searchIcon: ImageVector, settingsIcon: ImageVector, menuIcon: ImageVector) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .size(30.dp)
                .padding(top = 8.dp, start = 8.dp, bottom = 5.dp)
        )
        Text(
            text = cityName,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 8.dp, top = 8.dp, bottom = 5.dp)

        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .size(30.dp)
                .padding(top = 8.dp, bottom = 5.dp)
        )
        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .size(30.dp)
                .padding(top = 8.dp, end = 8.dp, bottom = 5.dp)
        )
    }
}

fun <ImageVector> Icon(
    settingsIcon: ImageVector,
    tint: Color,
    modifier: Modifier
) {
    TODO("Not yet implemented")
}


@Composable
fun LocationPage() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .background(Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(46.dp)
                        .background(Color.White)
                ) {
        /*            IconButton(
                        onClick = { *//*TODO*//* }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }*/
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        tint = Color.Gray,
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .size(29.dp)
                            .padding(top = 9.dp)
                    )
                    Text(
                        text = "LOCATIONS",
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .padding(start = 6.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp

                    )
                }
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black
                            )
                        ) {
                            append("You are currently getting results for popular places from ")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        ) {
                            append("India")
                        }
                    },
                    modifier = Modifier.padding(16.dp)
                )
                Spacer(modifier=Modifier.height(4.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "Choose Place")
                }
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(216.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier=Modifier.padding(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Place"
                    )
/*                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Place",
                        tint = Color.Black,
                        //modifier = Modifier
                            //.padding(start = 10.dp)
                            //.size(29.dp)
                            //.padding(top = 9.dp)
                    )*/
                    Text(text="Add Place")
                }
            }
        }



        val cities = listOf(
            City("Mumbai", 51, 28, "Sunny"),
            City("Indore", 35, 24, "Smoke"),
            City("Bhopal", 35, 21, "Clear")
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            cities.forEach { city ->
                Box(
                    modifier = Modifier
                        .background(Color(0xFFE0E0E0))
                        .padding(16.dp)
                        .fillMaxWidth(),
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = city.name,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "Humidity: ${city.humidity}%",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Gray
                            )
                        }

                        Column {
                            Text(
                                text = "${city.temperature}°",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Blue,
                                modifier = Modifier.padding(end = 8.dp)
                            )
                            Text(
                                text = city.condition,
                                fontSize = 14.sp,
                                color = Color.Blue,
                                fontWeight = FontWeight.Normal
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }





    }
}

private fun Any.padding(dp: Dp): Modifier {
    TODO("Not yet implemented")
}

private fun Any.fillMaxSize(): Any {
    TODO("Not yet implemented")
}

private fun Modifier.Companion.background(verticalGradient: Any): Any {
    TODO("Not yet implemented")
}

data class City(val name: String, val humidity: Int, val temperature: Int, val condition: String)



fun search_web(searchQuery: String): Any {
    TODO("Not yet implemented")
}


@Composable
fun IconButton(onClick: () -> Unit, content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppAndroidTheme {
/*        WeatherHeader(
            cityName = stringResource(id = R.string.city_name),
            searchIcon = Icons.Default.Search,
            settingsIcon = Icons.Default.Settings,
            menuIcon = Icons.Default.Menu
        )*/

        //Q1
        WeatherScreen()

        //Q2
        //LocationPage()
    }
}