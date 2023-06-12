package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio39Screen.main_feed_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio39Screen.model.User

@Composable
fun PostWidget(
    user: User
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                painter = user.profilePic,
                contentDescription = "Profile Pic",
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = user.username,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = user.location,
                    fontSize = 14.sp
                )
            }
        }

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(R.drawable.ic_more),
                contentDescription = "More Options"
            )

        }
    }
    Image(
        modifier = Modifier.fillMaxWidth(),
        painter = user.postPic,
        contentDescription = "Post Picture",
        contentScale = ContentScale.FillWidth
    )
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_like_outline),
                    contentDescription = "Like Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_comment),
                    contentDescription = "Like Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(30.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_send),
                    contentDescription = "Like Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(R.drawable.ic_save),
                contentDescription = "Like Icon",
                tint = Color.Black,
                modifier = Modifier.size(25.dp)
            )
        }
    }
    Column(
        modifier = Modifier.padding(horizontal = 10.dp)
    ) {
        Text(
            text = "${user.likeCount} likes"
        )
        Text(
            text = buildAnnotatedString {
                append(
                    AnnotatedString(
                        text = "${user.username}  ",
                        spanStyle = SpanStyle(fontWeight = FontWeight.Bold)
                    )
                )
                append(user.caption)
            }
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "View all ${user.commentCount} comments",
            color = Color.DarkGray,
            fontSize = 13.sp
        )
    }
}
