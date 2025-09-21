package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f4: ImageVector
    get() {
        val current = _emoji1f1f4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f4",
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
            // M7.336 17.962 c0 -6.449 4.341 -11.41 10.666 -11.41 6.232 0 10.666 5.116 10.666 11.41 0 6.418 -4.31 11.41 -10.666 11.41 -6.294 0 -10.666 -4.992 -10.666 -11.41z M23.832 17.962 c0 -3.752 -1.954 -7.131 -5.83 -7.131 -3.876 0 -5.829 3.379 -5.829 7.131 0 3.782 1.891 7.132 5.829 7.132 3.938 0 5.83 -3.35 5.83 -7.132z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 7.336 17.962
                moveTo(x = 7.336f, y = 17.962f)
                // c 0 -6.449 4.341 -11.41 10.666 -11.41
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -6.449f,
                    dx2 = 4.341f,
                    dy2 = -11.41f,
                    dx3 = 10.666f,
                    dy3 = -11.41f,
                )
                // c 6.232 0 10.666 5.116 10.666 11.41
                curveToRelative(
                    dx1 = 6.232f,
                    dy1 = 0.0f,
                    dx2 = 10.666f,
                    dy2 = 5.116f,
                    dx3 = 10.666f,
                    dy3 = 11.41f,
                )
                // c 0 6.418 -4.31 11.41 -10.666 11.41
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.418f,
                    dx2 = -4.31f,
                    dy2 = 11.41f,
                    dx3 = -10.666f,
                    dy3 = 11.41f,
                )
                // c -6.294 0 -10.666 -4.992 -10.666 -11.41z
                curveToRelative(
                    dx1 = -6.294f,
                    dy1 = 0.0f,
                    dx2 = -10.666f,
                    dy2 = -4.992f,
                    dx3 = -10.666f,
                    dy3 = -11.41f,
                )
                close()
                // M 23.832 17.962
                moveTo(x = 23.832f, y = 17.962f)
                // c 0 -3.752 -1.954 -7.131 -5.83 -7.131
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.752f,
                    dx2 = -1.954f,
                    dy2 = -7.131f,
                    dx3 = -5.83f,
                    dy3 = -7.131f,
                )
                // c -3.876 0 -5.829 3.379 -5.829 7.131
                curveToRelative(
                    dx1 = -3.876f,
                    dy1 = 0.0f,
                    dx2 = -5.829f,
                    dy2 = 3.379f,
                    dx3 = -5.829f,
                    dy3 = 7.131f,
                )
                // c 0 3.782 1.891 7.132 5.829 7.132
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.782f,
                    dx2 = 1.891f,
                    dy2 = 7.132f,
                    dx3 = 5.829f,
                    dy3 = 7.132f,
                )
                // c 3.938 0 5.83 -3.35 5.83 -7.132z
                curveToRelative(
                    dx1 = 3.938f,
                    dy1 = 0.0f,
                    dx2 = 5.83f,
                    dy2 = -3.35f,
                    dx3 = 5.83f,
                    dy3 = -7.132f,
                )
                close()
            }
        }.build().also { _emoji1f1f4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f4: ImageVector? = null
