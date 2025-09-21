package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f50b: ImageVector
    get() {
        val current = _emoji1f50b
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f50b",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M30 32.7 c0 1.657 -5.373 3.3 -12 3.3 S6 34.357 6 32.7 c0 -1.657 5.373 -2.7 12 -2.7 s12 1.043 12 2.7z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 30 32.7
                moveTo(x = 30.0f, y = 32.7f)
                // c 0 1.657 -5.373 3.3 -12 3.3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = -5.373f,
                    dy2 = 3.3f,
                    dx3 = -12.0f,
                    dy3 = 3.3f,
                )
                // S 6 34.357 6 32.7
                reflectiveCurveTo(
                    x1 = 6.0f,
                    y1 = 34.357f,
                    x2 = 6.0f,
                    y2 = 32.7f,
                )
                // c 0 -1.657 5.373 -2.7 12 -2.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = 5.373f,
                    dy2 = -2.7f,
                    dx3 = 12.0f,
                    dy3 = -2.7f,
                )
                // s 12 1.043 12 2.7z
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = 1.043f,
                    dx2 = 12.0f,
                    dy2 = 2.7f,
                )
                close()
            }
            // M6 3 h24 v29.7 H6z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 6 3
                moveTo(x = 6.0f, y = 3.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 29.7
                verticalLineToRelative(dy = 29.7f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
            }
            // M6 3 a12 3 0 1 0 24 0 a12 3 0 1 0 -24 0z
            path(
                fill = SolidColor(Color(0xFF5C913B)),
            ) {
                // M 6 3
                moveTo(x = 6.0f, y = 3.0f)
                // a 12 3 0 1 0 24 0
                arcToRelative(
                    a = 12.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 24.0f,
                    dy1 = 0.0f,
                )
                // a 12 3 0 1 0 -24 0z
                arcToRelative(
                    a = 12.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -24.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21.956 12.788 c0.091 0.544 -0.321 1.066 -0.922 1.136 -0.676 0.079 -1.355 0.121 -2.035 0.147 L18.999 16 a1 1 0 0 1 -2 0 v-1.93 a26.188 26.188 0 0 1 -2.035 -0.147 c-0.601 -0.07 -1.012 -0.591 -0.922 -1.136 a1.042 1.042 0 0 1 1.152 -0.851 c0.6 0.07 1.202 0.109 1.804 0.133 L16.998 10 a1 1 0 0 1 2 0 v2.07 a24.781 24.781 0 0 0 1.804 -0.133 1.042 1.042 0 0 1 1.154 0.851z M20.304 30.534 a21.119 21.119 0 0 1 -4.607 0 1.048 1.048 0 0 0 -1.153 0.854 c-0.091 0.544 0.326 1.067 0.934 1.134 1.676 0.184 3.368 0.184 5.044 0 0.609 -0.067 1.026 -0.59 0.934 -1.134 a1.047 1.047 0 0 0 -1.152 -0.854z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 21.956 12.788
                moveTo(x = 21.956f, y = 12.788f)
                // c 0.091 0.544 -0.321 1.066 -0.922 1.136
                curveToRelative(
                    dx1 = 0.091f,
                    dy1 = 0.544f,
                    dx2 = -0.321f,
                    dy2 = 1.066f,
                    dx3 = -0.922f,
                    dy3 = 1.136f,
                )
                // c -0.676 0.079 -1.355 0.121 -2.035 0.147
                curveToRelative(
                    dx1 = -0.676f,
                    dy1 = 0.079f,
                    dx2 = -1.355f,
                    dy2 = 0.121f,
                    dx3 = -2.035f,
                    dy3 = 0.147f,
                )
                // L 18.999 16
                lineTo(x = 18.999f, y = 16.0f)
                // a 1 1 0 0 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // v -1.93
                verticalLineToRelative(dy = -1.93f)
                // a 26.188 26.188 0 0 1 -2.035 -0.147
                arcToRelative(
                    a = 26.188f,
                    b = 26.188f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.035f,
                    dy1 = -0.147f,
                )
                // c -0.601 -0.07 -1.012 -0.591 -0.922 -1.136
                curveToRelative(
                    dx1 = -0.601f,
                    dy1 = -0.07f,
                    dx2 = -1.012f,
                    dy2 = -0.591f,
                    dx3 = -0.922f,
                    dy3 = -1.136f,
                )
                // a 1.042 1.042 0 0 1 1.152 -0.851
                arcToRelative(
                    a = 1.042f,
                    b = 1.042f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.152f,
                    dy1 = -0.851f,
                )
                // c 0.6 0.07 1.202 0.109 1.804 0.133
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.07f,
                    dx2 = 1.202f,
                    dy2 = 0.109f,
                    dx3 = 1.804f,
                    dy3 = 0.133f,
                )
                // L 16.998 10
                lineTo(x = 16.998f, y = 10.0f)
                // a 1 1 0 0 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v 2.07
                verticalLineToRelative(dy = 2.07f)
                // a 24.781 24.781 0 0 0 1.804 -0.133
                arcToRelative(
                    a = 24.781f,
                    b = 24.781f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.804f,
                    dy1 = -0.133f,
                )
                // a 1.042 1.042 0 0 1 1.154 0.851z
                arcToRelative(
                    a = 1.042f,
                    b = 1.042f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.154f,
                    dy1 = 0.851f,
                )
                close()
                // M 20.304 30.534
                moveTo(x = 20.304f, y = 30.534f)
                // a 21.119 21.119 0 0 1 -4.607 0
                arcToRelative(
                    a = 21.119f,
                    b = 21.119f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.607f,
                    dy1 = 0.0f,
                )
                // a 1.048 1.048 0 0 0 -1.153 0.854
                arcToRelative(
                    a = 1.048f,
                    b = 1.048f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.153f,
                    dy1 = 0.854f,
                )
                // c -0.091 0.544 0.326 1.067 0.934 1.134
                curveToRelative(
                    dx1 = -0.091f,
                    dy1 = 0.544f,
                    dx2 = 0.326f,
                    dy2 = 1.067f,
                    dx3 = 0.934f,
                    dy3 = 1.134f,
                )
                // c 1.676 0.184 3.368 0.184 5.044 0
                curveToRelative(
                    dx1 = 1.676f,
                    dy1 = 0.184f,
                    dx2 = 3.368f,
                    dy2 = 0.184f,
                    dx3 = 5.044f,
                    dy3 = 0.0f,
                )
                // c 0.609 -0.067 1.026 -0.59 0.934 -1.134
                curveToRelative(
                    dx1 = 0.609f,
                    dy1 = -0.067f,
                    dx2 = 1.026f,
                    dy2 = -0.59f,
                    dx3 = 0.934f,
                    dy3 = -1.134f,
                )
                // a 1.047 1.047 0 0 0 -1.152 -0.854z
                arcToRelative(
                    a = 1.047f,
                    b = 1.047f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.152f,
                    dy1 = -0.854f,
                )
                close()
            }
            // M8 3 a10 2 0 1 0 20 0 a10 2 0 1 0 -20 0z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // a 10 2 0 1 0 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 2 0 1 0 -20 0z
                arcToRelative(
                    a = 10.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M14 1 v1.5 c0 0.552 1.791 1 4 1 s4 -0.448 4 -1 V1 h-8z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 14 1
                moveTo(x = 14.0f, y = 1.0f)
                // v 1.5
                verticalLineToRelative(dy = 1.5f)
                // c 0 0.552 1.791 1 4 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 1.791f,
                    dy2 = 1.0f,
                    dx3 = 4.0f,
                    dy3 = 1.0f,
                )
                // s 4 -0.448 4 -1
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -0.448f,
                    dx2 = 4.0f,
                    dy2 = -1.0f,
                )
                // V 1
                verticalLineTo(y = 1.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // M14 1 a4 1 0 1 0 8 0 a4 1 0 1 0 -8 0z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 14 1
                moveTo(x = 14.0f, y = 1.0f)
                // a 4 1 0 1 0 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 1 0 1 0 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f50b = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f50b: ImageVector? = null
