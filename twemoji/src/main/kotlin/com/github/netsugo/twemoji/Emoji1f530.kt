package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f530: ImageVector
    get() {
        val current = _emoji1f530
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f530",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M17 36 c-0.512 0 -1.024 -0.195 -1.414 -0.586 l-11 -11 C4.211 24.039 4 23.53 4 23 V2 C4 1.191 4.487 0.462 5.235 0.152 c0.747 -0.311 1.608 -0.139 2.179 0.434 L17 10.171 26.586 0.586 c0.572 -0.573 1.431 -0.744 2.18 -0.434 C29.513 0.462 30 1.191 30 2 v21 c0 0.53 -0.211 1.039 -0.586 1.414 l-11 11 c-0.39 0.391 -0.902 0.586 -1.414 0.586z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 17 36
                moveTo(x = 17.0f, y = 36.0f)
                // c -0.512 0 -1.024 -0.195 -1.414 -0.586
                curveToRelative(
                    dx1 = -0.512f,
                    dy1 = 0.0f,
                    dx2 = -1.024f,
                    dy2 = -0.195f,
                    dx3 = -1.414f,
                    dy3 = -0.586f,
                )
                // l -11 -11
                lineToRelative(dx = -11.0f, dy = -11.0f)
                // C 4.211 24.039 4 23.53 4 23
                curveTo(
                    x1 = 4.211f,
                    y1 = 24.039f,
                    x2 = 4.0f,
                    y2 = 23.53f,
                    x3 = 4.0f,
                    y3 = 23.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // C 4 1.191 4.487 0.462 5.235 0.152
                curveTo(
                    x1 = 4.0f,
                    y1 = 1.191f,
                    x2 = 4.487f,
                    y2 = 0.462f,
                    x3 = 5.235f,
                    y3 = 0.152f,
                )
                // c 0.747 -0.311 1.608 -0.139 2.179 0.434
                curveToRelative(
                    dx1 = 0.747f,
                    dy1 = -0.311f,
                    dx2 = 1.608f,
                    dy2 = -0.139f,
                    dx3 = 2.179f,
                    dy3 = 0.434f,
                )
                // L 17 10.171
                lineTo(x = 17.0f, y = 10.171f)
                // L 26.586 0.586
                lineTo(x = 26.586f, y = 0.586f)
                // c 0.572 -0.573 1.431 -0.744 2.18 -0.434
                curveToRelative(
                    dx1 = 0.572f,
                    dy1 = -0.573f,
                    dx2 = 1.431f,
                    dy2 = -0.744f,
                    dx3 = 2.18f,
                    dy3 = -0.434f,
                )
                // C 29.513 0.462 30 1.191 30 2
                curveTo(
                    x1 = 29.513f,
                    y1 = 0.462f,
                    x2 = 30.0f,
                    y2 = 1.191f,
                    x3 = 30.0f,
                    y3 = 2.0f,
                )
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // c 0 0.53 -0.211 1.039 -0.586 1.414
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.53f,
                    dx2 = -0.211f,
                    dy2 = 1.039f,
                    dx3 = -0.586f,
                    dy3 = 1.414f,
                )
                // l -11 11
                lineToRelative(dx = -11.0f, dy = 11.0f)
                // c -0.39 0.391 -0.902 0.586 -1.414 0.586z
                curveToRelative(
                    dx1 = -0.39f,
                    dy1 = 0.391f,
                    dx2 = -0.902f,
                    dy2 = 0.586f,
                    dx3 = -1.414f,
                    dy3 = 0.586f,
                )
                close()
            }
            // M17 13 L28 2 v21 L17 34z
            path(
                fill = SolidColor(Color(0xFF47DED4)),
            ) {
                // M 17 13
                moveTo(x = 17.0f, y = 13.0f)
                // L 28 2
                lineTo(x = 28.0f, y = 2.0f)
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // L 17 34z
                lineTo(x = 17.0f, y = 34.0f)
                close()
            }
            // M6 2 l11 11 v21 L6 23z
            path(
                fill = SolidColor(Color(0xFFFFFF87)),
            ) {
                // M 6 2
                moveTo(x = 6.0f, y = 2.0f)
                // l 11 11
                lineToRelative(dx = 11.0f, dy = 11.0f)
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // L 6 23z
                lineTo(x = 6.0f, y = 23.0f)
                close()
            }
        }.build().also { _emoji1f530 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f530: ImageVector? = null
