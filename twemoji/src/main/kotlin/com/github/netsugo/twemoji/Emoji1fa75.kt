package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fa75: ImageVector
    get() {
        val current = _emoji1fa75
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fa75",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35.885 11.833 c0 -5.45 -4.418 -9.868 -9.867 -9.868 -3.308 0 -6.227 1.633 -8.018 4.129 -1.791 -2.496 -4.71 -4.129 -8.017 -4.129 -5.45 0 -9.868 4.417 -9.868 9.868 0 0.772 0.098 1.52 0.266 2.241 C1.751 22.587 11.216 31.568 18 34.034 c6.783 -2.466 16.249 -11.447 17.617 -19.959 0.17 -0.721 0.268 -1.469 0.268 -2.242z
            path(
                fill = SolidColor(Color(0xFF88C9F9)),
            ) {
                // M 35.885 11.833
                moveTo(x = 35.885f, y = 11.833f)
                // c 0 -5.45 -4.418 -9.868 -9.867 -9.868
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.45f,
                    dx2 = -4.418f,
                    dy2 = -9.868f,
                    dx3 = -9.867f,
                    dy3 = -9.868f,
                )
                // c -3.308 0 -6.227 1.633 -8.018 4.129
                curveToRelative(
                    dx1 = -3.308f,
                    dy1 = 0.0f,
                    dx2 = -6.227f,
                    dy2 = 1.633f,
                    dx3 = -8.018f,
                    dy3 = 4.129f,
                )
                // c -1.791 -2.496 -4.71 -4.129 -8.017 -4.129
                curveToRelative(
                    dx1 = -1.791f,
                    dy1 = -2.496f,
                    dx2 = -4.71f,
                    dy2 = -4.129f,
                    dx3 = -8.017f,
                    dy3 = -4.129f,
                )
                // c -5.45 0 -9.868 4.417 -9.868 9.868
                curveToRelative(
                    dx1 = -5.45f,
                    dy1 = 0.0f,
                    dx2 = -9.868f,
                    dy2 = 4.417f,
                    dx3 = -9.868f,
                    dy3 = 9.868f,
                )
                // c 0 0.772 0.098 1.52 0.266 2.241
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.772f,
                    dx2 = 0.098f,
                    dy2 = 1.52f,
                    dx3 = 0.266f,
                    dy3 = 2.241f,
                )
                // C 1.751 22.587 11.216 31.568 18 34.034
                curveTo(
                    x1 = 1.751f,
                    y1 = 22.587f,
                    x2 = 11.216f,
                    y2 = 31.568f,
                    x3 = 18.0f,
                    y3 = 34.034f,
                )
                // c 6.783 -2.466 16.249 -11.447 17.617 -19.959
                curveToRelative(
                    dx1 = 6.783f,
                    dy1 = -2.466f,
                    dx2 = 16.249f,
                    dy2 = -11.447f,
                    dx3 = 17.617f,
                    dy3 = -19.959f,
                )
                // c 0.17 -0.721 0.268 -1.469 0.268 -2.242z
                curveToRelative(
                    dx1 = 0.17f,
                    dy1 = -0.721f,
                    dx2 = 0.268f,
                    dy2 = -1.469f,
                    dx3 = 0.268f,
                    dy3 = -2.242f,
                )
                close()
            }
        }.build().also { _emoji1fa75 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fa75: ImageVector? = null
