package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e61f1ff: ImageVector
    get() {
        val current = _emoji1f1e61f1ff
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e61f1ff",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 13 h36 v10 H0z
            path(
                fill = SolidColor(Color(0xFFE00034)),
            ) {
                // M 0 13
                moveTo(x = 0.0f, y = 13.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M32 5 H4 C1.791 5 0 6.791 0 9 v4 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF0098C3)),
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
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
            // M17.844 21.333 c-1.841 0 -3.333 -1.492 -3.333 -3.333 0 -1.841 1.492 -3.333 3.333 -3.333 0.982 0 1.865 0.425 2.475 1.101 C19.601 14.701 18.382 14 17 14 c-2.209 0 -4 1.791 -4 4 s1.791 4 4 4 c1.382 0 2.601 -0.701 3.32 -1.768 -0.61 0.676 -1.493 1.101 -2.476 1.101z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 17.844 21.333
                moveTo(x = 17.844f, y = 21.333f)
                // c -1.841 0 -3.333 -1.492 -3.333 -3.333
                curveToRelative(
                    dx1 = -1.841f,
                    dy1 = 0.0f,
                    dx2 = -3.333f,
                    dy2 = -1.492f,
                    dx3 = -3.333f,
                    dy3 = -3.333f,
                )
                // c 0 -1.841 1.492 -3.333 3.333 -3.333
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.841f,
                    dx2 = 1.492f,
                    dy2 = -3.333f,
                    dx3 = 3.333f,
                    dy3 = -3.333f,
                )
                // c 0.982 0 1.865 0.425 2.475 1.101
                curveToRelative(
                    dx1 = 0.982f,
                    dy1 = 0.0f,
                    dx2 = 1.865f,
                    dy2 = 0.425f,
                    dx3 = 2.475f,
                    dy3 = 1.101f,
                )
                // C 19.601 14.701 18.382 14 17 14
                curveTo(
                    x1 = 19.601f,
                    y1 = 14.701f,
                    x2 = 18.382f,
                    y2 = 14.0f,
                    x3 = 17.0f,
                    y3 = 14.0f,
                )
                // c -2.209 0 -4 1.791 -4 4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.791f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // s 1.791 4 4 4
                reflectiveCurveToRelative(
                    dx1 = 1.791f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // c 1.382 0 2.601 -0.701 3.32 -1.768
                curveToRelative(
                    dx1 = 1.382f,
                    dy1 = 0.0f,
                    dx2 = 2.601f,
                    dy2 = -0.701f,
                    dx3 = 3.32f,
                    dy3 = -1.768f,
                )
                // c -0.61 0.676 -1.493 1.101 -2.476 1.101z
                curveToRelative(
                    dx1 = -0.61f,
                    dy1 = 0.676f,
                    dx2 = -1.493f,
                    dy2 = 1.101f,
                    dx3 = -2.476f,
                    dy3 = 1.101f,
                )
                close()
            }
            // M23.667 17.998 l-1.196 -0.424 0.544 -1.146 -1.146 0.545 -0.426 -1.195 -0.424 1.196 -0.003 -0.002 -1.144 -0.542 0.546 1.146 -1.196 0.426 1.196 0.424 -0.544 1.146 1.141 -0.543 0.005 -0.002 0.426 1.195 0.424 -1.196 1.147 0.544 -0.546 -1.146z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 23.667 17.998
                moveTo(x = 23.667f, y = 17.998f)
                // l -1.196 -0.424
                lineToRelative(dx = -1.196f, dy = -0.424f)
                // l 0.544 -1.146
                lineToRelative(dx = 0.544f, dy = -1.146f)
                // l -1.146 0.545
                lineToRelative(dx = -1.146f, dy = 0.545f)
                // l -0.426 -1.195
                lineToRelative(dx = -0.426f, dy = -1.195f)
                // l -0.424 1.196
                lineToRelative(dx = -0.424f, dy = 1.196f)
                // l -0.003 -0.002
                lineToRelative(dx = -0.003f, dy = -0.002f)
                // l -1.144 -0.542
                lineToRelative(dx = -1.144f, dy = -0.542f)
                // l 0.546 1.146
                lineToRelative(dx = 0.546f, dy = 1.146f)
                // l -1.196 0.426
                lineToRelative(dx = -1.196f, dy = 0.426f)
                // l 1.196 0.424
                lineToRelative(dx = 1.196f, dy = 0.424f)
                // l -0.544 1.146
                lineToRelative(dx = -0.544f, dy = 1.146f)
                // l 1.141 -0.543
                lineToRelative(dx = 1.141f, dy = -0.543f)
                // l 0.005 -0.002
                lineToRelative(dx = 0.005f, dy = -0.002f)
                // l 0.426 1.195
                lineToRelative(dx = 0.426f, dy = 1.195f)
                // l 0.424 -1.196
                lineToRelative(dx = 0.424f, dy = -1.196f)
                // l 1.147 0.544
                lineToRelative(dx = 1.147f, dy = 0.544f)
                // l -0.546 -1.146z
                lineToRelative(dx = -0.546f, dy = -1.146f)
                close()
            }
            // M4 31 h28 c2.209 0 4 -1.791 4 -4 v-4 H0 v4 c0 2.209 1.791 4 4 4z
            path(
                fill = SolidColor(Color(0xFF00AE65)),
            ) {
                // M 4 31
                moveTo(x = 4.0f, y = 31.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 2.209 1.791 4 4 4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
            }
        }.build().also { _emoji1f1e61f1ff = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e61f1ff: ImageVector? = null
