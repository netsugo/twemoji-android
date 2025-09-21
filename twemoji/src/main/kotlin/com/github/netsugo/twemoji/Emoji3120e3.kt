package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji3120e3: ImageVector
    get() {
        val current = _emoji3120e3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji3120e3",
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
            // M16.462 11.175 h-1.829 c-1.488 0 -2.108 -1.085 -2.108 -2.139 0 -1.085 0.775 -2.14 2.108 -2.14 h4.402 c1.334 0 2.078 0.961 2.078 2.201 V26.74 c0 1.551 -0.992 2.418 -2.326 2.418 -1.333 0 -2.325 -0.867 -2.325 -2.418 V11.175z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 16.462 11.175
                moveTo(x = 16.462f, y = 11.175f)
                // h -1.829
                horizontalLineToRelative(dx = -1.829f)
                // c -1.488 0 -2.108 -1.085 -2.108 -2.139
                curveToRelative(
                    dx1 = -1.488f,
                    dy1 = 0.0f,
                    dx2 = -2.108f,
                    dy2 = -1.085f,
                    dx3 = -2.108f,
                    dy3 = -2.139f,
                )
                // c 0 -1.085 0.775 -2.14 2.108 -2.14
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.085f,
                    dx2 = 0.775f,
                    dy2 = -2.14f,
                    dx3 = 2.108f,
                    dy3 = -2.14f,
                )
                // h 4.402
                horizontalLineToRelative(dx = 4.402f)
                // c 1.334 0 2.078 0.961 2.078 2.201
                curveToRelative(
                    dx1 = 1.334f,
                    dy1 = 0.0f,
                    dx2 = 2.078f,
                    dy2 = 0.961f,
                    dx3 = 2.078f,
                    dy3 = 2.201f,
                )
                // V 26.74
                verticalLineTo(y = 26.74f)
                // c 0 1.551 -0.992 2.418 -2.326 2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.551f,
                    dx2 = -0.992f,
                    dy2 = 2.418f,
                    dx3 = -2.326f,
                    dy3 = 2.418f,
                )
                // c -1.333 0 -2.325 -0.867 -2.325 -2.418
                curveToRelative(
                    dx1 = -1.333f,
                    dy1 = 0.0f,
                    dx2 = -2.325f,
                    dy2 = -0.867f,
                    dx3 = -2.325f,
                    dy3 = -2.418f,
                )
                // V 11.175z
                verticalLineTo(y = 11.175f)
                close()
            }
        }.build().also { _emoji3120e3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji3120e3: ImageVector? = null
