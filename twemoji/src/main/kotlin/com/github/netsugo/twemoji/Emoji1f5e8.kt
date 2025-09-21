package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f5e8: ImageVector
    get() {
        val current = _emoji1f5e8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f5e8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 1 c9.941 0 18 6.268 18 14 0 4.368 -2.574 8.268 -6.604 10.835 C29.92 28.144 31.141 31.569 34 35 c-5.758 -0.96 -9.44 -3.761 -11.716 -6.416 -1.376 0.262 -2.805 0.416 -4.284 0.416 -9.941 0 -18 -6.268 -18 -14 S8.059 1 18 1z
            path(
                fill = SolidColor(Color(0xFF8CCAF7)),
            ) {
                // M 18 1
                moveTo(x = 18.0f, y = 1.0f)
                // c 9.941 0 18 6.268 18 14
                curveToRelative(
                    dx1 = 9.941f,
                    dy1 = 0.0f,
                    dx2 = 18.0f,
                    dy2 = 6.268f,
                    dx3 = 18.0f,
                    dy3 = 14.0f,
                )
                // c 0 4.368 -2.574 8.268 -6.604 10.835
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.368f,
                    dx2 = -2.574f,
                    dy2 = 8.268f,
                    dx3 = -6.604f,
                    dy3 = 10.835f,
                )
                // C 29.92 28.144 31.141 31.569 34 35
                curveTo(
                    x1 = 29.92f,
                    y1 = 28.144f,
                    x2 = 31.141f,
                    y2 = 31.569f,
                    x3 = 34.0f,
                    y3 = 35.0f,
                )
                // c -5.758 -0.96 -9.44 -3.761 -11.716 -6.416
                curveToRelative(
                    dx1 = -5.758f,
                    dy1 = -0.96f,
                    dx2 = -9.44f,
                    dy2 = -3.761f,
                    dx3 = -11.716f,
                    dy3 = -6.416f,
                )
                // c -1.376 0.262 -2.805 0.416 -4.284 0.416
                curveToRelative(
                    dx1 = -1.376f,
                    dy1 = 0.262f,
                    dx2 = -2.805f,
                    dy2 = 0.416f,
                    dx3 = -4.284f,
                    dy3 = 0.416f,
                )
                // c -9.941 0 -18 -6.268 -18 -14
                curveToRelative(
                    dx1 = -9.941f,
                    dy1 = 0.0f,
                    dx2 = -18.0f,
                    dy2 = -6.268f,
                    dx3 = -18.0f,
                    dy3 = -14.0f,
                )
                // S 8.059 1 18 1z
                reflectiveCurveTo(
                    x1 = 8.059f,
                    y1 = 1.0f,
                    x2 = 18.0f,
                    y2 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f5e8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f5e8: ImageVector? = null
