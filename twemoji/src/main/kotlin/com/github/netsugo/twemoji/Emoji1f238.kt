package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f238: ImageVector
    get() {
        val current = _emoji1f238
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f238",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
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
            // M16.746 6.789 c0 -0.494 0.39 -0.78 1.014 -0.78 s1.014 0.286 1.014 0.78 v2.938 h7.125 c1.691 0 2.392 0.676 2.392 2.288 v9.751 c0 1.611 -0.701 2.314 -2.392 2.314 h-7.125 v5.277 c0 0.52 -0.39 0.779 -1.014 0.779 s-1.014 -0.26 -1.014 -0.779 L16.746 24.08 L10.09 24.08 c-1.69 0 -2.392 -0.703 -2.392 -2.314 v-9.751 c0 -1.612 0.702 -2.288 2.392 -2.288 h6.656 L16.746 6.789z M10.765 11.546 c-0.858 0 -1.092 0.26 -1.092 0.962 v3.25 h7.072 v-4.212 h-5.98z M9.673 17.579 v3.718 c0 0.703 0.234 0.963 1.092 0.963 h5.981 v-4.681 L9.673 17.579z M26.315 15.759 v-3.25 c0 -0.702 -0.261 -0.962 -1.093 -0.962 h-6.448 v4.212 h7.541z M25.222 22.26 c0.832 0 1.093 -0.26 1.093 -0.963 v-3.718 h-7.541 v4.681 h6.448z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 16.746 6.789
                moveTo(x = 16.746f, y = 6.789f)
                // c 0 -0.494 0.39 -0.78 1.014 -0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.494f,
                    dx2 = 0.39f,
                    dy2 = -0.78f,
                    dx3 = 1.014f,
                    dy3 = -0.78f,
                )
                // s 1.014 0.286 1.014 0.78
                reflectiveCurveToRelative(
                    dx1 = 1.014f,
                    dy1 = 0.286f,
                    dx2 = 1.014f,
                    dy2 = 0.78f,
                )
                // v 2.938
                verticalLineToRelative(dy = 2.938f)
                // h 7.125
                horizontalLineToRelative(dx = 7.125f)
                // c 1.691 0 2.392 0.676 2.392 2.288
                curveToRelative(
                    dx1 = 1.691f,
                    dy1 = 0.0f,
                    dx2 = 2.392f,
                    dy2 = 0.676f,
                    dx3 = 2.392f,
                    dy3 = 2.288f,
                )
                // v 9.751
                verticalLineToRelative(dy = 9.751f)
                // c 0 1.611 -0.701 2.314 -2.392 2.314
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.611f,
                    dx2 = -0.701f,
                    dy2 = 2.314f,
                    dx3 = -2.392f,
                    dy3 = 2.314f,
                )
                // h -7.125
                horizontalLineToRelative(dx = -7.125f)
                // v 5.277
                verticalLineToRelative(dy = 5.277f)
                // c 0 0.52 -0.39 0.779 -1.014 0.779
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.52f,
                    dx2 = -0.39f,
                    dy2 = 0.779f,
                    dx3 = -1.014f,
                    dy3 = 0.779f,
                )
                // s -1.014 -0.26 -1.014 -0.779
                reflectiveCurveToRelative(
                    dx1 = -1.014f,
                    dy1 = -0.26f,
                    dx2 = -1.014f,
                    dy2 = -0.779f,
                )
                // L 16.746 24.08
                lineTo(x = 16.746f, y = 24.08f)
                // L 10.09 24.08
                lineTo(x = 10.09f, y = 24.08f)
                // c -1.69 0 -2.392 -0.703 -2.392 -2.314
                curveToRelative(
                    dx1 = -1.69f,
                    dy1 = 0.0f,
                    dx2 = -2.392f,
                    dy2 = -0.703f,
                    dx3 = -2.392f,
                    dy3 = -2.314f,
                )
                // v -9.751
                verticalLineToRelative(dy = -9.751f)
                // c 0 -1.612 0.702 -2.288 2.392 -2.288
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.612f,
                    dx2 = 0.702f,
                    dy2 = -2.288f,
                    dx3 = 2.392f,
                    dy3 = -2.288f,
                )
                // h 6.656
                horizontalLineToRelative(dx = 6.656f)
                // L 16.746 6.789z
                lineTo(x = 16.746f, y = 6.789f)
                close()
                // M 10.765 11.546
                moveTo(x = 10.765f, y = 11.546f)
                // c -0.858 0 -1.092 0.26 -1.092 0.962
                curveToRelative(
                    dx1 = -0.858f,
                    dy1 = 0.0f,
                    dx2 = -1.092f,
                    dy2 = 0.26f,
                    dx3 = -1.092f,
                    dy3 = 0.962f,
                )
                // v 3.25
                verticalLineToRelative(dy = 3.25f)
                // h 7.072
                horizontalLineToRelative(dx = 7.072f)
                // v -4.212
                verticalLineToRelative(dy = -4.212f)
                // h -5.98z
                horizontalLineToRelative(dx = -5.98f)
                close()
                // M 9.673 17.579
                moveTo(x = 9.673f, y = 17.579f)
                // v 3.718
                verticalLineToRelative(dy = 3.718f)
                // c 0 0.703 0.234 0.963 1.092 0.963
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.703f,
                    dx2 = 0.234f,
                    dy2 = 0.963f,
                    dx3 = 1.092f,
                    dy3 = 0.963f,
                )
                // h 5.981
                horizontalLineToRelative(dx = 5.981f)
                // v -4.681
                verticalLineToRelative(dy = -4.681f)
                // L 9.673 17.579z
                lineTo(x = 9.673f, y = 17.579f)
                close()
                // M 26.315 15.759
                moveTo(x = 26.315f, y = 15.759f)
                // v -3.25
                verticalLineToRelative(dy = -3.25f)
                // c 0 -0.702 -0.261 -0.962 -1.093 -0.962
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.702f,
                    dx2 = -0.261f,
                    dy2 = -0.962f,
                    dx3 = -1.093f,
                    dy3 = -0.962f,
                )
                // h -6.448
                horizontalLineToRelative(dx = -6.448f)
                // v 4.212
                verticalLineToRelative(dy = 4.212f)
                // h 7.541z
                horizontalLineToRelative(dx = 7.541f)
                close()
                // M 25.222 22.26
                moveTo(x = 25.222f, y = 22.26f)
                // c 0.832 0 1.093 -0.26 1.093 -0.963
                curveToRelative(
                    dx1 = 0.832f,
                    dy1 = 0.0f,
                    dx2 = 1.093f,
                    dy2 = -0.26f,
                    dx3 = 1.093f,
                    dy3 = -0.963f,
                )
                // v -3.718
                verticalLineToRelative(dy = -3.718f)
                // h -7.541
                horizontalLineToRelative(dx = -7.541f)
                // v 4.681
                verticalLineToRelative(dy = 4.681f)
                // h 6.448z
                horizontalLineToRelative(dx = 6.448f)
                close()
            }
        }.build().also { _emoji1f238 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f238: ImageVector? = null
