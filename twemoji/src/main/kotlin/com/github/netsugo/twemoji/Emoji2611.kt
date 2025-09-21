package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2611: ImageVector
    get() {
        val current = _emoji2611
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2611",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF226699)),
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
            // M29.28 6.362 c-1.156 -0.751 -2.704 -0.422 -3.458 0.736 L14.936 23.877 l-5.029 -4.65 c-1.014 -0.938 -2.596 -0.875 -3.533 0.138 -0.937 1.014 -0.875 2.596 0.139 3.533 l7.209 6.666 c0.48 0.445 1.09 0.665 1.696 0.665 0.673 0 1.534 -0.282 2.099 -1.139 0.332 -0.506 12.5 -19.27 12.5 -19.27 0.751 -1.159 0.421 -2.707 -0.737 -3.458z
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 29.28 6.362
                moveTo(x = 29.28f, y = 6.362f)
                // c -1.156 -0.751 -2.704 -0.422 -3.458 0.736
                curveToRelative(
                    dx1 = -1.156f,
                    dy1 = -0.751f,
                    dx2 = -2.704f,
                    dy2 = -0.422f,
                    dx3 = -3.458f,
                    dy3 = 0.736f,
                )
                // L 14.936 23.877
                lineTo(x = 14.936f, y = 23.877f)
                // l -5.029 -4.65
                lineToRelative(dx = -5.029f, dy = -4.65f)
                // c -1.014 -0.938 -2.596 -0.875 -3.533 0.138
                curveToRelative(
                    dx1 = -1.014f,
                    dy1 = -0.938f,
                    dx2 = -2.596f,
                    dy2 = -0.875f,
                    dx3 = -3.533f,
                    dy3 = 0.138f,
                )
                // c -0.937 1.014 -0.875 2.596 0.139 3.533
                curveToRelative(
                    dx1 = -0.937f,
                    dy1 = 1.014f,
                    dx2 = -0.875f,
                    dy2 = 2.596f,
                    dx3 = 0.139f,
                    dy3 = 3.533f,
                )
                // l 7.209 6.666
                lineToRelative(dx = 7.209f, dy = 6.666f)
                // c 0.48 0.445 1.09 0.665 1.696 0.665
                curveToRelative(
                    dx1 = 0.48f,
                    dy1 = 0.445f,
                    dx2 = 1.09f,
                    dy2 = 0.665f,
                    dx3 = 1.696f,
                    dy3 = 0.665f,
                )
                // c 0.673 0 1.534 -0.282 2.099 -1.139
                curveToRelative(
                    dx1 = 0.673f,
                    dy1 = 0.0f,
                    dx2 = 1.534f,
                    dy2 = -0.282f,
                    dx3 = 2.099f,
                    dy3 = -1.139f,
                )
                // c 0.332 -0.506 12.5 -19.27 12.5 -19.27
                curveToRelative(
                    dx1 = 0.332f,
                    dy1 = -0.506f,
                    dx2 = 12.5f,
                    dy2 = -19.27f,
                    dx3 = 12.5f,
                    dy3 = -19.27f,
                )
                // c 0.751 -1.159 0.421 -2.707 -0.737 -3.458z
                curveToRelative(
                    dx1 = 0.751f,
                    dy1 = -1.159f,
                    dx2 = 0.421f,
                    dy2 = -2.707f,
                    dx3 = -0.737f,
                    dy3 = -3.458f,
                )
                close()
            }
        }.build().also { _emoji2611 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2611: ImageVector? = null
