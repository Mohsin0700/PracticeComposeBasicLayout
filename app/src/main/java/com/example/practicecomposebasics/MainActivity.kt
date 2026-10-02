package com.example.practicecomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ){
                Box(modifier = Modifier.safeContentPadding()) {
                    Column {
                        HeaderImage()
                        ArticeHeading()
                        ArticleDefination()
                        ArticleDescription()
                    }
                }
            }
        }
    }
}
@Composable
fun HeaderImage(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bgcbg)
    return Image(
        contentDescription = null,
        painter = image
    )
}

@Composable
fun ArticeHeading(modifier: Modifier = Modifier){
    return Text(
        stringResource(R.string.article_heading),
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun ArticleDefination(modifier: Modifier = Modifier){
    return Text(
        stringResource((R.string.artilcle_defination)),
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify,
    )
}

@Composable
fun ArticleDescription(modifier: Modifier = Modifier){
    Text(
        stringResource(R.string.article_description),
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify,
        )
}



