package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9b3: ImageVector
    get() {
        val current = _emoji1f9b3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9b3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 21 h30 v15 H0z
            path(
                fill = SolidColor(Color(0xFFFFDC5D)),
            ) {
                // M 0 21
                moveTo(x = 0.0f, y = 21.0f)
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M4.5 1 c-1.567 0 -3.061 0.086 -4.5 0.235 v23.416 c13.81 13.743 6.846 -0.189 6.846 -0.189 4.692 4.692 18.769 4.692 18.769 4.692 L29.038 36 h5.28 c0.424 -2.252 0.682 -5.332 0.682 -9.192 C35 15.077 23.269 1 4.5 1z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 4.5 1
                moveTo(x = 4.5f, y = 1.0f)
                // c -1.567 0 -3.061 0.086 -4.5 0.235
                curveToRelative(
                    dx1 = -1.567f,
                    dy1 = 0.0f,
                    dx2 = -3.061f,
                    dy2 = 0.086f,
                    dx3 = -4.5f,
                    dy3 = 0.235f,
                )
                // v 23.416
                verticalLineToRelative(dy = 23.416f)
                // c 13.81 13.743 6.846 -0.189 6.846 -0.189
                curveToRelative(
                    dx1 = 13.81f,
                    dy1 = 13.743f,
                    dx2 = 6.846f,
                    dy2 = -0.189f,
                    dx3 = 6.846f,
                    dy3 = -0.189f,
                )
                // c 4.692 4.692 18.769 4.692 18.769 4.692
                curveToRelative(
                    dx1 = 4.692f,
                    dy1 = 4.692f,
                    dx2 = 18.769f,
                    dy2 = 4.692f,
                    dx3 = 18.769f,
                    dy3 = 4.692f,
                )
                // L 29.038 36
                lineTo(x = 29.038f, y = 36.0f)
                // h 5.28
                horizontalLineToRelative(dx = 5.28f)
                // c 0.424 -2.252 0.682 -5.332 0.682 -9.192
                curveToRelative(
                    dx1 = 0.424f,
                    dy1 = -2.252f,
                    dx2 = 0.682f,
                    dy2 = -5.332f,
                    dx3 = 0.682f,
                    dy3 = -9.192f,
                )
                // C 35 15.077 23.269 1 4.5 1z
                curveTo(
                    x1 = 35.0f,
                    y1 = 15.077f,
                    x2 = 23.269f,
                    y2 = 1.0f,
                    x3 = 4.5f,
                    y3 = 1.0f,
                )
                close()
            }
        }.build().also { _emoji1f9b3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9b3: ImageVector? = null
