package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f6e1: ImageVector
    get() {
        val current = _emoji1f6e1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f6e1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M33 3 c-7 -3 -15 -3 -15 -3 S10 0 3 3 C0 18 3 31 18 36 c15 -5 18 -18 15 -33z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 33 3
                moveTo(x = 33.0f, y = 3.0f)
                // c -7 -3 -15 -3 -15 -3
                curveToRelative(
                    dx1 = -7.0f,
                    dy1 = -3.0f,
                    dx2 = -15.0f,
                    dy2 = -3.0f,
                    dx3 = -15.0f,
                    dy3 = -3.0f,
                )
                // S 10 0 3 3
                reflectiveCurveTo(
                    x1 = 10.0f,
                    y1 = 0.0f,
                    x2 = 3.0f,
                    y2 = 3.0f,
                )
                // C 0 18 3 31 18 36
                curveTo(
                    x1 = 0.0f,
                    y1 = 18.0f,
                    x2 = 3.0f,
                    y2 = 31.0f,
                    x3 = 18.0f,
                    y3 = 36.0f,
                )
                // c 15 -5 18 -18 15 -33z
                curveToRelative(
                    dx1 = 15.0f,
                    dy1 = -5.0f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                    dx3 = 15.0f,
                    dy3 = -33.0f,
                )
                close()
            }
            // M18 33.884 C6.412 29.729 1.961 19.831 4.76 4.444 11.063 2.029 17.928 2 18 2 c0.071 0 6.958 0.04 13.24 2.444 2.799 15.387 -1.652 25.285 -13.24 29.44z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 18 33.884
                moveTo(x = 18.0f, y = 33.884f)
                // C 6.412 29.729 1.961 19.831 4.76 4.444
                curveTo(
                    x1 = 6.412f,
                    y1 = 29.729f,
                    x2 = 1.961f,
                    y2 = 19.831f,
                    x3 = 4.76f,
                    y3 = 4.444f,
                )
                // C 11.063 2.029 17.928 2 18 2
                curveTo(
                    x1 = 11.063f,
                    y1 = 2.029f,
                    x2 = 17.928f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // c 0.071 0 6.958 0.04 13.24 2.444
                curveToRelative(
                    dx1 = 0.071f,
                    dy1 = 0.0f,
                    dx2 = 6.958f,
                    dy2 = 0.04f,
                    dx3 = 13.24f,
                    dy3 = 2.444f,
                )
                // c 2.799 15.387 -1.652 25.285 -13.24 29.44z
                curveToRelative(
                    dx1 = 2.799f,
                    dy1 = 15.387f,
                    dx2 = -1.652f,
                    dy2 = 25.285f,
                    dx3 = -13.24f,
                    dy3 = 29.44f,
                )
                close()
            }
            // M31.24 4.444 C24.958 2.04 18.071 2 18 2 v31.884 c11.588 -4.155 16.039 -14.053 13.24 -29.44z
            path(
                fill = SolidColor(Color(0xFF226699)),
            ) {
                // M 31.24 4.444
                moveTo(x = 31.24f, y = 4.444f)
                // C 24.958 2.04 18.071 2 18 2
                curveTo(
                    x1 = 24.958f,
                    y1 = 2.04f,
                    x2 = 18.071f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // v 31.884
                verticalLineToRelative(dy = 31.884f)
                // c 11.588 -4.155 16.039 -14.053 13.24 -29.44z
                curveToRelative(
                    dx1 = 11.588f,
                    dy1 = -4.155f,
                    dx2 = 16.039f,
                    dy2 = -14.053f,
                    dx3 = 13.24f,
                    dy3 = -29.44f,
                )
                close()
            }
        }.build().also { _emoji1f6e1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f6e1: ImageVector? = null
