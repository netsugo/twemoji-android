package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2935: ImageVector
    get() {
        val current = _emoji2935
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2935",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF3B88C3)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M20.589 30.2 l6 -7.2 H23 v-7.611 c0 -5.523 -4.683 -10 -10.206 -10 -1.414 0 -2.861 0.297 -4.081 0.827 l2.699 3.3 c0.396 -0.083 0.987 -0.127 1.408 -0.127 3.314 0 6.18 2.686 6.18 6 V23 h-4.411 l6 7.2z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 20.589 30.2
                moveTo(x = 20.589f, y = 30.2f)
                // l 6 -7.2
                lineToRelative(dx = 6.0f, dy = -7.2f)
                // H 23
                horizontalLineTo(x = 23.0f)
                // v -7.611
                verticalLineToRelative(dy = -7.611f)
                // c 0 -5.523 -4.683 -10 -10.206 -10
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.523f,
                    dx2 = -4.683f,
                    dy2 = -10.0f,
                    dx3 = -10.206f,
                    dy3 = -10.0f,
                )
                // c -1.414 0 -2.861 0.297 -4.081 0.827
                curveToRelative(
                    dx1 = -1.414f,
                    dy1 = 0.0f,
                    dx2 = -2.861f,
                    dy2 = 0.297f,
                    dx3 = -4.081f,
                    dy3 = 0.827f,
                )
                // l 2.699 3.3
                lineToRelative(dx = 2.699f, dy = 3.3f)
                // c 0.396 -0.083 0.987 -0.127 1.408 -0.127
                curveToRelative(
                    dx1 = 0.396f,
                    dy1 = -0.083f,
                    dx2 = 0.987f,
                    dy2 = -0.127f,
                    dx3 = 1.408f,
                    dy3 = -0.127f,
                )
                // c 3.314 0 6.18 2.686 6.18 6
                curveToRelative(
                    dx1 = 3.314f,
                    dy1 = 0.0f,
                    dx2 = 6.18f,
                    dy2 = 2.686f,
                    dx3 = 6.18f,
                    dy3 = 6.0f,
                )
                // V 23
                verticalLineTo(y = 23.0f)
                // h -4.411
                horizontalLineToRelative(dx = -4.411f)
                // l 6 7.2z
                lineToRelative(dx = 6.0f, dy = 7.2f)
                close()
            }
        }.build().also { _emoji2935 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2935: ImageVector? = null
