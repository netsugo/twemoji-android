package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4a6: ImageVector
    get() {
        val current = _emoji1f4a6
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4a6",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M22.855 0.758 L7.875 7.024 l12.537 9.733 c2.633 2.224 6.377 2.937 9.77 1.518 4.826 -2.018 7.096 -7.576 5.072 -12.413 C33.232 1.024 27.68 -1.261 22.855 0.758z M12.893 18.682 L2.05 10.284 0.137 23.529 c-0.534 2.855 0.502 5.902 2.958 7.803 3.494 2.705 8.518 2.066 11.224 -1.426 2.705 -3.492 2.067 -8.517 -1.426 -11.224z M28.232 25.697 l-8.156 -4.69 -0.033 9.223 c-0.088 2 0.904 3.98 2.75 5.041 2.631 1.512 5.977 0.594 7.479 -2.051 1.499 -2.644 0.589 -6.013 -2.04 -7.523z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 22.855 0.758
                moveTo(x = 22.855f, y = 0.758f)
                // L 7.875 7.024
                lineTo(x = 7.875f, y = 7.024f)
                // l 12.537 9.733
                lineToRelative(dx = 12.537f, dy = 9.733f)
                // c 2.633 2.224 6.377 2.937 9.77 1.518
                curveToRelative(
                    dx1 = 2.633f,
                    dy1 = 2.224f,
                    dx2 = 6.377f,
                    dy2 = 2.937f,
                    dx3 = 9.77f,
                    dy3 = 1.518f,
                )
                // c 4.826 -2.018 7.096 -7.576 5.072 -12.413
                curveToRelative(
                    dx1 = 4.826f,
                    dy1 = -2.018f,
                    dx2 = 7.096f,
                    dy2 = -7.576f,
                    dx3 = 5.072f,
                    dy3 = -12.413f,
                )
                // C 33.232 1.024 27.68 -1.261 22.855 0.758z
                curveTo(
                    x1 = 33.232f,
                    y1 = 1.024f,
                    x2 = 27.68f,
                    y2 = -1.261f,
                    x3 = 22.855f,
                    y3 = 0.758f,
                )
                close()
                // M 12.893 18.682
                moveTo(x = 12.893f, y = 18.682f)
                // L 2.05 10.284
                lineTo(x = 2.05f, y = 10.284f)
                // L 0.137 23.529
                lineTo(x = 0.137f, y = 23.529f)
                // c -0.534 2.855 0.502 5.902 2.958 7.803
                curveToRelative(
                    dx1 = -0.534f,
                    dy1 = 2.855f,
                    dx2 = 0.502f,
                    dy2 = 5.902f,
                    dx3 = 2.958f,
                    dy3 = 7.803f,
                )
                // c 3.494 2.705 8.518 2.066 11.224 -1.426
                curveToRelative(
                    dx1 = 3.494f,
                    dy1 = 2.705f,
                    dx2 = 8.518f,
                    dy2 = 2.066f,
                    dx3 = 11.224f,
                    dy3 = -1.426f,
                )
                // c 2.705 -3.492 2.067 -8.517 -1.426 -11.224z
                curveToRelative(
                    dx1 = 2.705f,
                    dy1 = -3.492f,
                    dx2 = 2.067f,
                    dy2 = -8.517f,
                    dx3 = -1.426f,
                    dy3 = -11.224f,
                )
                close()
                // M 28.232 25.697
                moveTo(x = 28.232f, y = 25.697f)
                // l -8.156 -4.69
                lineToRelative(dx = -8.156f, dy = -4.69f)
                // l -0.033 9.223
                lineToRelative(dx = -0.033f, dy = 9.223f)
                // c -0.088 2 0.904 3.98 2.75 5.041
                curveToRelative(
                    dx1 = -0.088f,
                    dy1 = 2.0f,
                    dx2 = 0.904f,
                    dy2 = 3.98f,
                    dx3 = 2.75f,
                    dy3 = 5.041f,
                )
                // c 2.631 1.512 5.977 0.594 7.479 -2.051
                curveToRelative(
                    dx1 = 2.631f,
                    dy1 = 1.512f,
                    dx2 = 5.977f,
                    dy2 = 0.594f,
                    dx3 = 7.479f,
                    dy3 = -2.051f,
                )
                // c 1.499 -2.644 0.589 -6.013 -2.04 -7.523z
                curveToRelative(
                    dx1 = 1.499f,
                    dy1 = -2.644f,
                    dx2 = 0.589f,
                    dy2 = -6.013f,
                    dx3 = -2.04f,
                    dy3 = -7.523f,
                )
                close()
            }
        }.build().also { _emoji1f4a6 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4a6: ImageVector? = null
