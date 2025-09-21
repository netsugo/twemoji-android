package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f91f1ff: ImageVector
    get() {
        val current = _emoji1f1f91f1ff
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f91f1ff",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M4 5 C1.791 5 0 6.791 0 9 v15.627 L26.456 5 H4z
            path(
                fill = SolidColor(Color(0xFF1EB53A)),
            ) {
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 15.627
                verticalLineToRelative(dy = 15.627f)
                // L 26.456 5
                lineTo(x = 26.456f, y = 5.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M32 31 c2.209 0 4 -1.791 4 -4 V11.33 L9.479 31 H32z
            path(
                fill = SolidColor(Color(0xFF00A3DD)),
            ) {
                // M 32 31
                moveTo(x = 32.0f, y = 31.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // V 11.33
                verticalLineTo(y = 11.33f)
                // L 9.479 31
                lineTo(x = 9.479f, y = 31.0f)
                // H 32z
                horizontalLineTo(x = 32.0f)
                close()
            }
            // M32 5 h-2.532 L0 26.638 V27 c0 2.209 1.791 4 4 4 h2.467 L36 9.318 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // h -2.532
                horizontalLineToRelative(dx = -2.532f)
                // L 0 26.638
                lineTo(x = 0.0f, y = 26.638f)
                // V 27
                verticalLineTo(y = 27.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 2.467
                horizontalLineToRelative(dx = 2.467f)
                // L 36 9.318
                lineTo(x = 36.0f, y = 9.318f)
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
            // M26.456 5 L0 24.627 v2.011 L29.468 5z M9.479 31 L36 11.33 V9.318 L6.467 31z
            path(
                fill = SolidColor(Color(0xFFFBD035)),
            ) {
                // M 26.456 5
                moveTo(x = 26.456f, y = 5.0f)
                // L 0 24.627
                lineTo(x = 0.0f, y = 24.627f)
                // v 2.011
                verticalLineToRelative(dy = 2.011f)
                // L 29.468 5z
                lineTo(x = 29.468f, y = 5.0f)
                close()
                // M 9.479 31
                moveTo(x = 9.479f, y = 31.0f)
                // L 36 11.33
                lineTo(x = 36.0f, y = 11.33f)
                // V 9.318
                verticalLineTo(y = 9.318f)
                // L 6.467 31z
                lineTo(x = 6.467f, y = 31.0f)
                close()
            }
        }.build().also { _emoji1f1f91f1ff = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f91f1ff: ImageVector? = null
