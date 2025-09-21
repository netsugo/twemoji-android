package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fa78: ImageVector
    get() {
        val current = _emoji1fa78
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fa78",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M28.344 17.768 L18.148 1.09 8.7 17.654 c-2.2 3.51 -2.392 8.074 -0.081 11.854 3.285 5.373 10.363 7.098 15.811 3.857 5.446 -3.24 7.199 -10.22 3.914 -15.597z
            path(
                fill = SolidColor(Color(0xFFDA2F47)),
            ) {
                // M 28.344 17.768
                moveTo(x = 28.344f, y = 17.768f)
                // L 18.148 1.09
                lineTo(x = 18.148f, y = 1.09f)
                // L 8.7 17.654
                lineTo(x = 8.7f, y = 17.654f)
                // c -2.2 3.51 -2.392 8.074 -0.081 11.854
                curveToRelative(
                    dx1 = -2.2f,
                    dy1 = 3.51f,
                    dx2 = -2.392f,
                    dy2 = 8.074f,
                    dx3 = -0.081f,
                    dy3 = 11.854f,
                )
                // c 3.285 5.373 10.363 7.098 15.811 3.857
                curveToRelative(
                    dx1 = 3.285f,
                    dy1 = 5.373f,
                    dx2 = 10.363f,
                    dy2 = 7.098f,
                    dx3 = 15.811f,
                    dy3 = 3.857f,
                )
                // c 5.446 -3.24 7.199 -10.22 3.914 -15.597z
                curveToRelative(
                    dx1 = 5.446f,
                    dy1 = -3.24f,
                    dx2 = 7.199f,
                    dy2 = -10.22f,
                    dx3 = 3.914f,
                    dy3 = -15.597f,
                )
                close()
            }
        }.build().also { _emoji1fa78 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fa78: ImageVector? = null
