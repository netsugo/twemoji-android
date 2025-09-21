package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f9: ImageVector
    get() {
        val current = _emoji1f1f9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f9",
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
            // M15.676 11.203 h-3.38 c-1.488 0 -2.108 -1.085 -2.108 -2.139 0 -1.085 0.775 -2.14 2.108 -2.14 h11.411 c1.332 0 2.108 1.054 2.108 2.14 0 1.054 -0.619 2.139 -2.108 2.139 h-3.381 v15.565 c0 1.551 -0.992 2.418 -2.325 2.418 -1.333 0 -2.325 -0.867 -2.325 -2.418 V11.203z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 15.676 11.203
                moveTo(x = 15.676f, y = 11.203f)
                // h -3.38
                horizontalLineToRelative(dx = -3.38f)
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
                // h 11.411
                horizontalLineToRelative(dx = 11.411f)
                // c 1.332 0 2.108 1.054 2.108 2.14
                curveToRelative(
                    dx1 = 1.332f,
                    dy1 = 0.0f,
                    dx2 = 2.108f,
                    dy2 = 1.054f,
                    dx3 = 2.108f,
                    dy3 = 2.14f,
                )
                // c 0 1.054 -0.619 2.139 -2.108 2.139
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.054f,
                    dx2 = -0.619f,
                    dy2 = 2.139f,
                    dx3 = -2.108f,
                    dy3 = 2.139f,
                )
                // h -3.381
                horizontalLineToRelative(dx = -3.381f)
                // v 15.565
                verticalLineToRelative(dy = 15.565f)
                // c 0 1.551 -0.992 2.418 -2.325 2.418
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.551f,
                    dx2 = -0.992f,
                    dy2 = 2.418f,
                    dx3 = -2.325f,
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
                // V 11.203z
                verticalLineTo(y = 11.203f)
                close()
            }
        }.build().also { _emoji1f1f9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f9: ImageVector? = null
