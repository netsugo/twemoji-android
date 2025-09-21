package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ef: ImageVector
    get() {
        val current = _emoji1f1ef
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ef",
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
            // M23.102 22.799 c0 5.209 -3.318 6.573 -6.139 6.573 -2.14 0 -5.705 -0.837 -5.705 -3.534 0 -0.838 0.713 -1.892 1.736 -1.892 1.24 0 2.325 1.147 3.721 1.147 1.736 0 1.736 -1.613 1.736 -2.605 V9.156 c0 -1.55 0.993 -2.418 2.325 -2.418 1.334 0 2.326 0.868 2.326 2.418 v13.643z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 23.102 22.799
                moveTo(x = 23.102f, y = 22.799f)
                // c 0 5.209 -3.318 6.573 -6.139 6.573
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.209f,
                    dx2 = -3.318f,
                    dy2 = 6.573f,
                    dx3 = -6.139f,
                    dy3 = 6.573f,
                )
                // c -2.14 0 -5.705 -0.837 -5.705 -3.534
                curveToRelative(
                    dx1 = -2.14f,
                    dy1 = 0.0f,
                    dx2 = -5.705f,
                    dy2 = -0.837f,
                    dx3 = -5.705f,
                    dy3 = -3.534f,
                )
                // c 0 -0.838 0.713 -1.892 1.736 -1.892
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.838f,
                    dx2 = 0.713f,
                    dy2 = -1.892f,
                    dx3 = 1.736f,
                    dy3 = -1.892f,
                )
                // c 1.24 0 2.325 1.147 3.721 1.147
                curveToRelative(
                    dx1 = 1.24f,
                    dy1 = 0.0f,
                    dx2 = 2.325f,
                    dy2 = 1.147f,
                    dx3 = 3.721f,
                    dy3 = 1.147f,
                )
                // c 1.736 0 1.736 -1.613 1.736 -2.605
                curveToRelative(
                    dx1 = 1.736f,
                    dy1 = 0.0f,
                    dx2 = 1.736f,
                    dy2 = -1.613f,
                    dx3 = 1.736f,
                    dy3 = -2.605f,
                )
                // V 9.156
                verticalLineTo(y = 9.156f)
                // c 0 -1.55 0.993 -2.418 2.325 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.55f,
                    dx2 = 0.993f,
                    dy2 = -2.418f,
                    dx3 = 2.325f,
                    dy3 = -2.418f,
                )
                // c 1.334 0 2.326 0.868 2.326 2.418
                curveToRelative(
                    dx1 = 1.334f,
                    dy1 = 0.0f,
                    dx2 = 2.326f,
                    dy2 = 0.868f,
                    dx3 = 2.326f,
                    dy3 = 2.418f,
                )
                // v 13.643z
                verticalLineToRelative(dy = 13.643f)
                close()
            }
        }.build().also { _emoji1f1ef = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ef: ImageVector? = null
