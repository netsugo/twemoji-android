package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f50d: ImageVector
    get() {
        val current = _emoji1f50d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f50d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M27.388 24.642 L24.56 27.47 l-4.95 -4.95 2.828 -2.828z
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 27.388 24.642
                moveTo(x = 27.388f, y = 24.642f)
                // L 24.56 27.47
                lineTo(x = 24.56f, y = 27.47f)
                // l -4.95 -4.95
                lineToRelative(dx = -4.95f, dy = -4.95f)
                // l 2.828 -2.828z
                lineToRelative(dx = 2.828f, dy = -2.828f)
                close()
            }
            // M34.683 29.11 l-5.879 -5.879 c-0.781 -0.781 -2.047 -0.781 -2.828 0 l-2.828 2.828 c-0.781 0.781 -0.781 2.047 0 2.828 l5.879 5.879 c1.562 1.563 4.096 1.563 5.658 0 1.56 -1.561 1.559 -4.094 -0.002 -5.656z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 34.683 29.11
                moveTo(x = 34.683f, y = 29.11f)
                // l -5.879 -5.879
                lineToRelative(dx = -5.879f, dy = -5.879f)
                // c -0.781 -0.781 -2.047 -0.781 -2.828 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -2.047f,
                    dy2 = -0.781f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // l -2.828 2.828
                lineToRelative(dx = -2.828f, dy = 2.828f)
                // c -0.781 0.781 -0.781 2.047 0 2.828
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.781f,
                    dx2 = -0.781f,
                    dy2 = 2.047f,
                    dx3 = 0.0f,
                    dy3 = 2.828f,
                )
                // l 5.879 5.879
                lineToRelative(dx = 5.879f, dy = 5.879f)
                // c 1.562 1.563 4.096 1.563 5.658 0
                curveToRelative(
                    dx1 = 1.562f,
                    dy1 = 1.563f,
                    dx2 = 4.096f,
                    dy2 = 1.563f,
                    dx3 = 5.658f,
                    dy3 = 0.0f,
                )
                // c 1.56 -1.561 1.559 -4.094 -0.002 -5.656z
                curveToRelative(
                    dx1 = 1.56f,
                    dy1 = -1.561f,
                    dx2 = 1.559f,
                    dy2 = -4.094f,
                    dx3 = -0.002f,
                    dy3 = -5.656f,
                )
                close()
            }
            // M13.586 13.669 m-13.5 0 a13.5 13.5 0 1 1 27 0 a13.5 13.5 0 1 1 -27 0
            path(
                fill = SolidColor(Color(0xFF8899A6)),
            ) {
                // M 13.586 13.669
                moveTo(x = 13.586f, y = 13.669f)
                // m -13.5 0
                moveToRelative(dx = -13.5f, dy = 0.0f)
                // a 13.5 13.5 0 1 1 27 0
                arcToRelative(
                    a = 13.5f,
                    b = 13.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 27.0f,
                    dy1 = 0.0f,
                )
                // a 13.5 13.5 0 1 1 -27 0
                arcToRelative(
                    a = 13.5f,
                    b = 13.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -27.0f,
                    dy1 = 0.0f,
                )
            }
            // M13.586 13.669 m-9.5 0 a9.5 9.5 0 1 1 19 0 a9.5 9.5 0 1 1 -19 0
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 13.586 13.669
                moveTo(x = 13.586f, y = 13.669f)
                // m -9.5 0
                moveToRelative(dx = -9.5f, dy = 0.0f)
                // a 9.5 9.5 0 1 1 19 0
                arcToRelative(
                    a = 9.5f,
                    b = 9.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 19.0f,
                    dy1 = 0.0f,
                )
                // a 9.5 9.5 0 1 1 -19 0
                arcToRelative(
                    a = 9.5f,
                    b = 9.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -19.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f50d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f50d: ImageVector? = null
