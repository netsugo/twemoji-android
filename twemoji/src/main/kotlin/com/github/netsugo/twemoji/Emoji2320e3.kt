package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2320e3: ImageVector
    get() {
        val current = _emoji2320e3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2320e3",
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
            // M13.785 16.194 h-2.667 c-1.024 0 -1.488 -0.744 -1.488 -1.488 s0.465 -1.488 1.488 -1.488 h3.101 l0.682 -4.992 c0.155 -1.116 0.62 -1.488 1.55 -1.488 0.744 0 1.426 0.496 1.426 1.24 0 0.465 0 0.248 -0.062 0.744 l-0.62 4.496 h2.976 l0.683 -4.992 c0.155 -1.116 0.62 -1.488 1.55 -1.488 0.744 0 1.427 0.496 1.427 1.24 0 0.465 0 0.248 -0.062 0.744 l-0.621 4.496 h2.667 c1.023 0 1.487 0.744 1.487 1.488 s-0.465 1.488 -1.487 1.488 h-3.101 l-0.496 3.535 h2.666 c1.023 0 1.488 0.744 1.488 1.488 s-0.465 1.488 -1.488 1.488 h-3.1 l-0.683 4.991 c-0.155 1.117 -0.62 1.488 -1.55 1.488 -0.745 0 -1.427 -0.496 -1.427 -1.24 0 -0.465 0 -0.248 0.062 -0.744 l0.62 -4.495 h-2.977 l-0.682 4.991 c-0.155 1.117 -0.62 1.488 -1.55 1.488 -0.744 0 -1.426 -0.496 -1.426 -1.24 0 -0.465 0 -0.248 0.062 -0.744 l0.62 -4.495 h-2.666 c-1.023 0 -1.488 -0.744 -1.488 -1.488 s0.465 -1.488 1.488 -1.488 h3.101 l0.497 -3.535z M16.296 19.729 h2.946 l0.496 -3.535 h-2.946 l-0.496 3.535z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 13.785 16.194
                moveTo(x = 13.785f, y = 16.194f)
                // h -2.667
                horizontalLineToRelative(dx = -2.667f)
                // c -1.024 0 -1.488 -0.744 -1.488 -1.488
                curveToRelative(
                    dx1 = -1.024f,
                    dy1 = 0.0f,
                    dx2 = -1.488f,
                    dy2 = -0.744f,
                    dx3 = -1.488f,
                    dy3 = -1.488f,
                )
                // s 0.465 -1.488 1.488 -1.488
                reflectiveCurveToRelative(
                    dx1 = 0.465f,
                    dy1 = -1.488f,
                    dx2 = 1.488f,
                    dy2 = -1.488f,
                )
                // h 3.101
                horizontalLineToRelative(dx = 3.101f)
                // l 0.682 -4.992
                lineToRelative(dx = 0.682f, dy = -4.992f)
                // c 0.155 -1.116 0.62 -1.488 1.55 -1.488
                curveToRelative(
                    dx1 = 0.155f,
                    dy1 = -1.116f,
                    dx2 = 0.62f,
                    dy2 = -1.488f,
                    dx3 = 1.55f,
                    dy3 = -1.488f,
                )
                // c 0.744 0 1.426 0.496 1.426 1.24
                curveToRelative(
                    dx1 = 0.744f,
                    dy1 = 0.0f,
                    dx2 = 1.426f,
                    dy2 = 0.496f,
                    dx3 = 1.426f,
                    dy3 = 1.24f,
                )
                // c 0 0.465 0 0.248 -0.062 0.744
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.465f,
                    dx2 = 0.0f,
                    dy2 = 0.248f,
                    dx3 = -0.062f,
                    dy3 = 0.744f,
                )
                // l -0.62 4.496
                lineToRelative(dx = -0.62f, dy = 4.496f)
                // h 2.976
                horizontalLineToRelative(dx = 2.976f)
                // l 0.683 -4.992
                lineToRelative(dx = 0.683f, dy = -4.992f)
                // c 0.155 -1.116 0.62 -1.488 1.55 -1.488
                curveToRelative(
                    dx1 = 0.155f,
                    dy1 = -1.116f,
                    dx2 = 0.62f,
                    dy2 = -1.488f,
                    dx3 = 1.55f,
                    dy3 = -1.488f,
                )
                // c 0.744 0 1.427 0.496 1.427 1.24
                curveToRelative(
                    dx1 = 0.744f,
                    dy1 = 0.0f,
                    dx2 = 1.427f,
                    dy2 = 0.496f,
                    dx3 = 1.427f,
                    dy3 = 1.24f,
                )
                // c 0 0.465 0 0.248 -0.062 0.744
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.465f,
                    dx2 = 0.0f,
                    dy2 = 0.248f,
                    dx3 = -0.062f,
                    dy3 = 0.744f,
                )
                // l -0.621 4.496
                lineToRelative(dx = -0.621f, dy = 4.496f)
                // h 2.667
                horizontalLineToRelative(dx = 2.667f)
                // c 1.023 0 1.487 0.744 1.487 1.488
                curveToRelative(
                    dx1 = 1.023f,
                    dy1 = 0.0f,
                    dx2 = 1.487f,
                    dy2 = 0.744f,
                    dx3 = 1.487f,
                    dy3 = 1.488f,
                )
                // s -0.465 1.488 -1.487 1.488
                reflectiveCurveToRelative(
                    dx1 = -0.465f,
                    dy1 = 1.488f,
                    dx2 = -1.487f,
                    dy2 = 1.488f,
                )
                // h -3.101
                horizontalLineToRelative(dx = -3.101f)
                // l -0.496 3.535
                lineToRelative(dx = -0.496f, dy = 3.535f)
                // h 2.666
                horizontalLineToRelative(dx = 2.666f)
                // c 1.023 0 1.488 0.744 1.488 1.488
                curveToRelative(
                    dx1 = 1.023f,
                    dy1 = 0.0f,
                    dx2 = 1.488f,
                    dy2 = 0.744f,
                    dx3 = 1.488f,
                    dy3 = 1.488f,
                )
                // s -0.465 1.488 -1.488 1.488
                reflectiveCurveToRelative(
                    dx1 = -0.465f,
                    dy1 = 1.488f,
                    dx2 = -1.488f,
                    dy2 = 1.488f,
                )
                // h -3.1
                horizontalLineToRelative(dx = -3.1f)
                // l -0.683 4.991
                lineToRelative(dx = -0.683f, dy = 4.991f)
                // c -0.155 1.117 -0.62 1.488 -1.55 1.488
                curveToRelative(
                    dx1 = -0.155f,
                    dy1 = 1.117f,
                    dx2 = -0.62f,
                    dy2 = 1.488f,
                    dx3 = -1.55f,
                    dy3 = 1.488f,
                )
                // c -0.745 0 -1.427 -0.496 -1.427 -1.24
                curveToRelative(
                    dx1 = -0.745f,
                    dy1 = 0.0f,
                    dx2 = -1.427f,
                    dy2 = -0.496f,
                    dx3 = -1.427f,
                    dy3 = -1.24f,
                )
                // c 0 -0.465 0 -0.248 0.062 -0.744
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.465f,
                    dx2 = 0.0f,
                    dy2 = -0.248f,
                    dx3 = 0.062f,
                    dy3 = -0.744f,
                )
                // l 0.62 -4.495
                lineToRelative(dx = 0.62f, dy = -4.495f)
                // h -2.977
                horizontalLineToRelative(dx = -2.977f)
                // l -0.682 4.991
                lineToRelative(dx = -0.682f, dy = 4.991f)
                // c -0.155 1.117 -0.62 1.488 -1.55 1.488
                curveToRelative(
                    dx1 = -0.155f,
                    dy1 = 1.117f,
                    dx2 = -0.62f,
                    dy2 = 1.488f,
                    dx3 = -1.55f,
                    dy3 = 1.488f,
                )
                // c -0.744 0 -1.426 -0.496 -1.426 -1.24
                curveToRelative(
                    dx1 = -0.744f,
                    dy1 = 0.0f,
                    dx2 = -1.426f,
                    dy2 = -0.496f,
                    dx3 = -1.426f,
                    dy3 = -1.24f,
                )
                // c 0 -0.465 0 -0.248 0.062 -0.744
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.465f,
                    dx2 = 0.0f,
                    dy2 = -0.248f,
                    dx3 = 0.062f,
                    dy3 = -0.744f,
                )
                // l 0.62 -4.495
                lineToRelative(dx = 0.62f, dy = -4.495f)
                // h -2.666
                horizontalLineToRelative(dx = -2.666f)
                // c -1.023 0 -1.488 -0.744 -1.488 -1.488
                curveToRelative(
                    dx1 = -1.023f,
                    dy1 = 0.0f,
                    dx2 = -1.488f,
                    dy2 = -0.744f,
                    dx3 = -1.488f,
                    dy3 = -1.488f,
                )
                // s 0.465 -1.488 1.488 -1.488
                reflectiveCurveToRelative(
                    dx1 = 0.465f,
                    dy1 = -1.488f,
                    dx2 = 1.488f,
                    dy2 = -1.488f,
                )
                // h 3.101
                horizontalLineToRelative(dx = 3.101f)
                // l 0.497 -3.535z
                lineToRelative(dx = 0.497f, dy = -3.535f)
                close()
                // M 16.296 19.729
                moveTo(x = 16.296f, y = 19.729f)
                // h 2.946
                horizontalLineToRelative(dx = 2.946f)
                // l 0.496 -3.535
                lineToRelative(dx = 0.496f, dy = -3.535f)
                // h -2.946
                horizontalLineToRelative(dx = -2.946f)
                // l -0.496 3.535z
                lineToRelative(dx = -0.496f, dy = 3.535f)
                close()
            }
        }.build().also { _emoji2320e3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2320e3: ImageVector? = null
