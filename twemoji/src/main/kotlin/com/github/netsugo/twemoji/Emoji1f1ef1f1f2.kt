package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ef1f1f2: ImageVector
    get() {
        val current = _emoji1f1ef1f1f2
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ef1f1f2",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H4 C1.791 5 0 6.791 0 9 v18 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF009B3A)),
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
            // M35.762 28.361 c0.154 -0.425 0.238 -0.883 0.238 -1.361 V9 c0 -0.477 -0.084 -0.935 -0.237 -1.359 l-0.001 -0.002 L21.416 18 l14.346 10.361z M14.584 18 L0.238 7.639 v0.001 C0.084 8.065 0 8.523 0 9 v18 c0 0.478 0.084 0.936 0.238 1.361 L14.584 18z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 35.762 28.361
                moveTo(x = 35.762f, y = 28.361f)
                // c 0.154 -0.425 0.238 -0.883 0.238 -1.361
                curveToRelative(
                    dx1 = 0.154f,
                    dy1 = -0.425f,
                    dx2 = 0.238f,
                    dy2 = -0.883f,
                    dx3 = 0.238f,
                    dy3 = -1.361f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -0.477 -0.084 -0.935 -0.237 -1.359
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.477f,
                    dx2 = -0.084f,
                    dy2 = -0.935f,
                    dx3 = -0.237f,
                    dy3 = -1.359f,
                )
                // l -0.001 -0.002
                lineToRelative(dx = -0.001f, dy = -0.002f)
                // L 21.416 18
                lineTo(x = 21.416f, y = 18.0f)
                // l 14.346 10.361z
                lineToRelative(dx = 14.346f, dy = 10.361f)
                close()
                // M 14.584 18
                moveTo(x = 14.584f, y = 18.0f)
                // L 0.238 7.639
                lineTo(x = 0.238f, y = 7.639f)
                // v 0.001
                verticalLineToRelative(dy = 0.001f)
                // C 0.084 8.065 0 8.523 0 9
                curveTo(
                    x1 = 0.084f,
                    y1 = 8.065f,
                    x2 = 0.0f,
                    y2 = 8.523f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 0.478 0.084 0.936 0.238 1.361
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.478f,
                    dx2 = 0.084f,
                    dy2 = 0.936f,
                    dx3 = 0.238f,
                    dy3 = 1.361f,
                )
                // L 14.584 18z
                lineTo(x = 14.584f, y = 18.0f)
                close()
            }
            // M32.535 5.035 L18 15.533 3.465 5.035 h-0.001 C1.969 5.235 0.736 6.261 0.237 7.638 L14.584 18 0.238 28.361 l0.001 0.003 c0.499 1.375 1.731 2.4 3.223 2.6 h0.004 L18 20.467 l14.534 10.497 c1.494 -0.2 2.728 -1.224 3.227 -2.601 l0.001 -0.003 L21.416 18 35.762 7.639 c-0.498 -1.378 -1.732 -2.404 -3.227 -2.604z
            path(
                fill = SolidColor(Color(0xFFFFD202)),
            ) {
                // M 32.535 5.035
                moveTo(x = 32.535f, y = 5.035f)
                // L 18 15.533
                lineTo(x = 18.0f, y = 15.533f)
                // L 3.465 5.035
                lineTo(x = 3.465f, y = 5.035f)
                // h -0.001
                horizontalLineToRelative(dx = -0.001f)
                // C 1.969 5.235 0.736 6.261 0.237 7.638
                curveTo(
                    x1 = 1.969f,
                    y1 = 5.235f,
                    x2 = 0.736f,
                    y2 = 6.261f,
                    x3 = 0.237f,
                    y3 = 7.638f,
                )
                // L 14.584 18
                lineTo(x = 14.584f, y = 18.0f)
                // L 0.238 28.361
                lineTo(x = 0.238f, y = 28.361f)
                // l 0.001 0.003
                lineToRelative(dx = 0.001f, dy = 0.003f)
                // c 0.499 1.375 1.731 2.4 3.223 2.6
                curveToRelative(
                    dx1 = 0.499f,
                    dy1 = 1.375f,
                    dx2 = 1.731f,
                    dy2 = 2.4f,
                    dx3 = 3.223f,
                    dy3 = 2.6f,
                )
                // h 0.004
                horizontalLineToRelative(dx = 0.004f)
                // L 18 20.467
                lineTo(x = 18.0f, y = 20.467f)
                // l 14.534 10.497
                lineToRelative(dx = 14.534f, dy = 10.497f)
                // c 1.494 -0.2 2.728 -1.224 3.227 -2.601
                curveToRelative(
                    dx1 = 1.494f,
                    dy1 = -0.2f,
                    dx2 = 2.728f,
                    dy2 = -1.224f,
                    dx3 = 3.227f,
                    dy3 = -2.601f,
                )
                // l 0.001 -0.003
                lineToRelative(dx = 0.001f, dy = -0.003f)
                // L 21.416 18
                lineTo(x = 21.416f, y = 18.0f)
                // L 35.762 7.639
                lineTo(x = 35.762f, y = 7.639f)
                // c -0.498 -1.378 -1.732 -2.404 -3.227 -2.604z
                curveToRelative(
                    dx1 = -0.498f,
                    dy1 = -1.378f,
                    dx2 = -1.732f,
                    dy2 = -2.404f,
                    dx3 = -3.227f,
                    dy3 = -2.604f,
                )
                close()
            }
        }.build().also { _emoji1f1ef1f1f2 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ef1f1f2: ImageVector? = null
