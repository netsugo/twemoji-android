package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f21f1fb: ImageVector
    get() {
        val current = _emoji1f1f21f1fb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f21f1fb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFD21034)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M6 11 h24 v14 H6z
            path(
                fill = SolidColor(Color(0xFF007E3A)),
            ) {
                // M 6 11
                moveTo(x = 6.0f, y = 11.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
            }
            // M19.64 22.344 c0.279 0 0.551 -0.027 0.814 -0.077 -2.009 -0.381 -3.529 -2.146 -3.529 -4.266 s1.52 -3.885 3.529 -4.266 c-0.264 -0.05 -0.536 -0.077 -0.814 -0.077 -2.399 0 -4.344 1.945 -4.344 4.344 0 2.397 1.945 4.342 4.344 4.342z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 19.64 22.344
                moveTo(x = 19.64f, y = 22.344f)
                // c 0.279 0 0.551 -0.027 0.814 -0.077
                curveToRelative(
                    dx1 = 0.279f,
                    dy1 = 0.0f,
                    dx2 = 0.551f,
                    dy2 = -0.027f,
                    dx3 = 0.814f,
                    dy3 = -0.077f,
                )
                // c -2.009 -0.381 -3.529 -2.146 -3.529 -4.266
                curveToRelative(
                    dx1 = -2.009f,
                    dy1 = -0.381f,
                    dx2 = -3.529f,
                    dy2 = -2.146f,
                    dx3 = -3.529f,
                    dy3 = -4.266f,
                )
                // s 1.52 -3.885 3.529 -4.266
                reflectiveCurveToRelative(
                    dx1 = 1.52f,
                    dy1 = -3.885f,
                    dx2 = 3.529f,
                    dy2 = -4.266f,
                )
                // c -0.264 -0.05 -0.536 -0.077 -0.814 -0.077
                curveToRelative(
                    dx1 = -0.264f,
                    dy1 = -0.05f,
                    dx2 = -0.536f,
                    dy2 = -0.077f,
                    dx3 = -0.814f,
                    dy3 = -0.077f,
                )
                // c -2.399 0 -4.344 1.945 -4.344 4.344
                curveToRelative(
                    dx1 = -2.399f,
                    dy1 = 0.0f,
                    dx2 = -4.344f,
                    dy2 = 1.945f,
                    dx3 = -4.344f,
                    dy3 = 4.344f,
                )
                // c 0 2.397 1.945 4.342 4.344 4.342z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.397f,
                    dx2 = 1.945f,
                    dy2 = 4.342f,
                    dx3 = 4.344f,
                    dy3 = 4.342f,
                )
                close()
            }
        }.build().also { _emoji1f1f21f1fb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f21f1fb: ImageVector? = null
