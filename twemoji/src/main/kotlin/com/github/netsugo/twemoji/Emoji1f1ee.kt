package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ee: ImageVector
    get() {
        val current = _emoji1f1ee
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ee",
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
            // M15.675 9.156 c0 -1.55 0.992 -2.418 2.326 -2.418 1.333 0 2.325 0.868 2.325 2.418 v17.611 c0 1.551 -0.992 2.418 -2.325 2.418 -1.333 0 -2.326 -0.867 -2.326 -2.418 V9.156z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 15.675 9.156
                moveTo(x = 15.675f, y = 9.156f)
                // c 0 -1.55 0.992 -2.418 2.326 -2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.55f,
                    dx2 = 0.992f,
                    dy2 = -2.418f,
                    dx3 = 2.326f,
                    dy3 = -2.418f,
                )
                // c 1.333 0 2.325 0.868 2.325 2.418
                curveToRelative(
                    dx1 = 1.333f,
                    dy1 = 0.0f,
                    dx2 = 2.325f,
                    dy2 = 0.868f,
                    dx3 = 2.325f,
                    dy3 = 2.418f,
                )
                // v 17.611
                verticalLineToRelative(dy = 17.611f)
                // c 0 1.551 -0.992 2.418 -2.325 2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.551f,
                    dx2 = -0.992f,
                    dy2 = 2.418f,
                    dx3 = -2.325f,
                    dy3 = 2.418f,
                )
                // c -1.333 0 -2.326 -0.867 -2.326 -2.418
                curveToRelative(
                    dx1 = -1.333f,
                    dy1 = 0.0f,
                    dx2 = -2.326f,
                    dy2 = -0.867f,
                    dx3 = -2.326f,
                    dy3 = -2.418f,
                )
                // V 9.156z
                verticalLineTo(y = 9.156f)
                close()
            }
        }.build().also { _emoji1f1ee = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ee: ImageVector? = null
