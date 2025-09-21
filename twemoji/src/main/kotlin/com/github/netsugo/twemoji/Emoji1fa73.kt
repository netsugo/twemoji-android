package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fa73: ImageVector
    get() {
        val current = _emoji1fa73
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fa73",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 6 V1.955 c0 -0.527 -0.428 -0.955 -0.955 -0.955 H5.955 C5.428 1 5 1.428 5 1.955 V6 L0 31 l14 4 4 -10.545 L22 35 l14 -4 -5 -25z
            path(
                fill = SolidColor(Color(0xFF78B159)),
            ) {
                // M 31 6
                moveTo(x = 31.0f, y = 6.0f)
                // V 1.955
                verticalLineTo(y = 1.955f)
                // c 0 -0.527 -0.428 -0.955 -0.955 -0.955
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.527f,
                    dx2 = -0.428f,
                    dy2 = -0.955f,
                    dx3 = -0.955f,
                    dy3 = -0.955f,
                )
                // H 5.955
                horizontalLineTo(x = 5.955f)
                // C 5.428 1 5 1.428 5 1.955
                curveTo(
                    x1 = 5.428f,
                    y1 = 1.0f,
                    x2 = 5.0f,
                    y2 = 1.428f,
                    x3 = 5.0f,
                    y3 = 1.955f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // L 0 31
                lineTo(x = 0.0f, y = 31.0f)
                // l 14 4
                lineToRelative(dx = 14.0f, dy = 4.0f)
                // l 4 -10.545
                lineToRelative(dx = 4.0f, dy = -10.545f)
                // L 22 35
                lineTo(x = 22.0f, y = 35.0f)
                // l 14 -4
                lineToRelative(dx = 14.0f, dy = -4.0f)
                // l -5 -25z
                lineToRelative(dx = -5.0f, dy = -25.0f)
                close()
            }
            // M5 4 h26 v2 L5 6z M13.782 6 h-2.074 c-1.378 4.107 -5.46 5.399 -7.87 5.807 l-0.421 2.107 c3.606 -0.408 8.9 -2.403 10.365 -7.914z
            path(
                fill = SolidColor(Color(0xFF5D9040)),
            ) {
                // M 5 4
                moveTo(x = 5.0f, y = 4.0f)
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // L 5 6z
                lineTo(x = 5.0f, y = 6.0f)
                close()
                // M 13.782 6
                moveTo(x = 13.782f, y = 6.0f)
                // h -2.074
                horizontalLineToRelative(dx = -2.074f)
                // c -1.378 4.107 -5.46 5.399 -7.87 5.807
                curveToRelative(
                    dx1 = -1.378f,
                    dy1 = 4.107f,
                    dx2 = -5.46f,
                    dy2 = 5.399f,
                    dx3 = -7.87f,
                    dy3 = 5.807f,
                )
                // l -0.421 2.107
                lineToRelative(dx = -0.421f, dy = 2.107f)
                // c 3.606 -0.408 8.9 -2.403 10.365 -7.914z
                curveToRelative(
                    dx1 = 3.606f,
                    dy1 = -0.408f,
                    dx2 = 8.9f,
                    dy2 = -2.403f,
                    dx3 = 10.365f,
                    dy3 = -7.914f,
                )
                close()
            }
            // M32.583 13.914 l-0.421 -2.107 c-2.41 -0.408 -6.491 -1.701 -7.87 -5.807 h-2.074 c1.464 5.511 6.759 7.506 10.365 7.914z M17 6 v21.091 l1 -2.636 1 2.636 V6z
            path(
                fill = SolidColor(Color(0xFF5D9040)),
            ) {
                // M 32.583 13.914
                moveTo(x = 32.583f, y = 13.914f)
                // l -0.421 -2.107
                lineToRelative(dx = -0.421f, dy = -2.107f)
                // c -2.41 -0.408 -6.491 -1.701 -7.87 -5.807
                curveToRelative(
                    dx1 = -2.41f,
                    dy1 = -0.408f,
                    dx2 = -6.491f,
                    dy2 = -1.701f,
                    dx3 = -7.87f,
                    dy3 = -5.807f,
                )
                // h -2.074
                horizontalLineToRelative(dx = -2.074f)
                // c 1.464 5.511 6.759 7.506 10.365 7.914z
                curveToRelative(
                    dx1 = 1.464f,
                    dy1 = 5.511f,
                    dx2 = 6.759f,
                    dy2 = 7.506f,
                    dx3 = 10.365f,
                    dy3 = 7.914f,
                )
                close()
                // M 17 6
                moveTo(x = 17.0f, y = 6.0f)
                // v 21.091
                verticalLineToRelative(dy = 21.091f)
                // l 1 -2.636
                lineToRelative(dx = 1.0f, dy = -2.636f)
                // l 1 2.636
                lineToRelative(dx = 1.0f, dy = 2.636f)
                // V 6z
                verticalLineTo(y = 6.0f)
                close()
            }
            // M18.149 23 H18 v-2 h0.149 C19.722 21 21 19.722 21 18.149 V5 h2 v13.149 C23 20.824 20.824 23 18.149 23z
            path(
                fill = SolidColor(Color(0xFF5D9040)),
            ) {
                // M 18.149 23
                moveTo(x = 18.149f, y = 23.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 0.149
                horizontalLineToRelative(dx = 0.149f)
                // C 19.722 21 21 19.722 21 18.149
                curveTo(
                    x1 = 19.722f,
                    y1 = 21.0f,
                    x2 = 21.0f,
                    y2 = 19.722f,
                    x3 = 21.0f,
                    y3 = 18.149f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 13.149
                verticalLineToRelative(dy = 13.149f)
                // C 23 20.824 20.824 23 18.149 23z
                curveTo(
                    x1 = 23.0f,
                    y1 = 20.824f,
                    x2 = 20.824f,
                    y2 = 23.0f,
                    x3 = 18.149f,
                    y3 = 23.0f,
                )
                close()
            }
        }.build().also { _emoji1fa73 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fa73: ImageVector? = null
