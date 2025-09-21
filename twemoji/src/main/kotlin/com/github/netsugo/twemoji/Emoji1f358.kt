package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f358: ImageVector
    get() {
        val current = _emoji1f358
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f358",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-17 0 a17 17 0 1 1 34 0 a17 17 0 1 1 -34 0
            path(
                fill = SolidColor(Color(0xFFC1694F)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -17 0
                moveToRelative(dx = -17.0f, dy = 0.0f)
                // a 17 17 0 1 1 34 0
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 34.0f,
                    dy1 = 0.0f,
                )
                // a 17 17 0 1 1 -34 0
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -34.0f,
                    dy1 = 0.0f,
                )
            }
            // M27.258 27.642 c-0.461 0.316 -1.091 0.199 -1.406 -0.263 -0.316 -0.46 -0.198 -1.091 0.262 -1.406 l1.67 -1.144 c0.46 -0.315 1.089 -0.198 1.405 0.263 0.315 0.46 0.198 1.091 -0.263 1.405 l-1.668 1.145z M29.696 20.547 c-0.512 -0.207 -0.758 -0.792 -0.549 -1.303 0.209 -0.511 0.793 -0.757 1.304 -0.549 l1.852 0.755 c0.511 0.208 0.757 0.791 0.549 1.303 -0.208 0.512 -0.792 0.758 -1.304 0.549 l-1.852 -0.755z M25.202 15.291 c-0.519 -0.21 -0.767 -0.801 -0.555 -1.318 0.209 -0.517 0.801 -0.766 1.316 -0.556 l1.875 0.764 c0.516 0.211 0.765 0.801 0.554 1.318 -0.211 0.517 -0.8 0.766 -1.318 0.555 l-1.872 -0.763z M4.201 22.291 c-0.517 -0.21 -0.766 -0.801 -0.554 -1.318 0.21 -0.517 0.801 -0.766 1.317 -0.556 l1.873 0.764 c0.518 0.211 0.766 0.801 0.556 1.318 -0.211 0.518 -0.802 0.767 -1.318 0.556 l-1.874 -0.764z M7.758 16.142 c-0.461 0.316 -1.091 0.199 -1.406 -0.264 -0.315 -0.46 -0.198 -1.09 0.262 -1.405 l1.67 -1.144 c0.46 -0.315 1.089 -0.198 1.405 0.263 0.315 0.46 0.198 1.091 -0.263 1.406 l-1.668 1.144z M16.786 19.881 c-0.767 -0.312 -1.137 -1.188 -0.824 -1.956 0.314 -0.766 1.189 -1.135 1.956 -0.823 l2.778 1.134 c0.767 0.312 1.136 1.186 0.824 1.953 -0.312 0.768 -1.188 1.137 -1.956 0.824 l-2.778 -1.132z M10.602 25.933 c0.522 -0.199 1.106 0.062 1.306 0.586 0.197 0.519 -0.066 1.105 -0.588 1.303 l-1.892 0.721 c-0.519 0.199 -1.104 -0.063 -1.302 -0.586 -0.2 -0.524 0.062 -1.107 0.585 -1.307 l1.891 -0.717z
            path(
                fill = SolidColor(Color(0xFFE29386)),
            ) {
                // M 27.258 27.642
                moveTo(x = 27.258f, y = 27.642f)
                // c -0.461 0.316 -1.091 0.199 -1.406 -0.263
                curveToRelative(
                    dx1 = -0.461f,
                    dy1 = 0.316f,
                    dx2 = -1.091f,
                    dy2 = 0.199f,
                    dx3 = -1.406f,
                    dy3 = -0.263f,
                )
                // c -0.316 -0.46 -0.198 -1.091 0.262 -1.406
                curveToRelative(
                    dx1 = -0.316f,
                    dy1 = -0.46f,
                    dx2 = -0.198f,
                    dy2 = -1.091f,
                    dx3 = 0.262f,
                    dy3 = -1.406f,
                )
                // l 1.67 -1.144
                lineToRelative(dx = 1.67f, dy = -1.144f)
                // c 0.46 -0.315 1.089 -0.198 1.405 0.263
                curveToRelative(
                    dx1 = 0.46f,
                    dy1 = -0.315f,
                    dx2 = 1.089f,
                    dy2 = -0.198f,
                    dx3 = 1.405f,
                    dy3 = 0.263f,
                )
                // c 0.315 0.46 0.198 1.091 -0.263 1.405
                curveToRelative(
                    dx1 = 0.315f,
                    dy1 = 0.46f,
                    dx2 = 0.198f,
                    dy2 = 1.091f,
                    dx3 = -0.263f,
                    dy3 = 1.405f,
                )
                // l -1.668 1.145z
                lineToRelative(dx = -1.668f, dy = 1.145f)
                close()
                // M 29.696 20.547
                moveTo(x = 29.696f, y = 20.547f)
                // c -0.512 -0.207 -0.758 -0.792 -0.549 -1.303
                curveToRelative(
                    dx1 = -0.512f,
                    dy1 = -0.207f,
                    dx2 = -0.758f,
                    dy2 = -0.792f,
                    dx3 = -0.549f,
                    dy3 = -1.303f,
                )
                // c 0.209 -0.511 0.793 -0.757 1.304 -0.549
                curveToRelative(
                    dx1 = 0.209f,
                    dy1 = -0.511f,
                    dx2 = 0.793f,
                    dy2 = -0.757f,
                    dx3 = 1.304f,
                    dy3 = -0.549f,
                )
                // l 1.852 0.755
                lineToRelative(dx = 1.852f, dy = 0.755f)
                // c 0.511 0.208 0.757 0.791 0.549 1.303
                curveToRelative(
                    dx1 = 0.511f,
                    dy1 = 0.208f,
                    dx2 = 0.757f,
                    dy2 = 0.791f,
                    dx3 = 0.549f,
                    dy3 = 1.303f,
                )
                // c -0.208 0.512 -0.792 0.758 -1.304 0.549
                curveToRelative(
                    dx1 = -0.208f,
                    dy1 = 0.512f,
                    dx2 = -0.792f,
                    dy2 = 0.758f,
                    dx3 = -1.304f,
                    dy3 = 0.549f,
                )
                // l -1.852 -0.755z
                lineToRelative(dx = -1.852f, dy = -0.755f)
                close()
                // M 25.202 15.291
                moveTo(x = 25.202f, y = 15.291f)
                // c -0.519 -0.21 -0.767 -0.801 -0.555 -1.318
                curveToRelative(
                    dx1 = -0.519f,
                    dy1 = -0.21f,
                    dx2 = -0.767f,
                    dy2 = -0.801f,
                    dx3 = -0.555f,
                    dy3 = -1.318f,
                )
                // c 0.209 -0.517 0.801 -0.766 1.316 -0.556
                curveToRelative(
                    dx1 = 0.209f,
                    dy1 = -0.517f,
                    dx2 = 0.801f,
                    dy2 = -0.766f,
                    dx3 = 1.316f,
                    dy3 = -0.556f,
                )
                // l 1.875 0.764
                lineToRelative(dx = 1.875f, dy = 0.764f)
                // c 0.516 0.211 0.765 0.801 0.554 1.318
                curveToRelative(
                    dx1 = 0.516f,
                    dy1 = 0.211f,
                    dx2 = 0.765f,
                    dy2 = 0.801f,
                    dx3 = 0.554f,
                    dy3 = 1.318f,
                )
                // c -0.211 0.517 -0.8 0.766 -1.318 0.555
                curveToRelative(
                    dx1 = -0.211f,
                    dy1 = 0.517f,
                    dx2 = -0.8f,
                    dy2 = 0.766f,
                    dx3 = -1.318f,
                    dy3 = 0.555f,
                )
                // l -1.872 -0.763z
                lineToRelative(dx = -1.872f, dy = -0.763f)
                close()
                // M 4.201 22.291
                moveTo(x = 4.201f, y = 22.291f)
                // c -0.517 -0.21 -0.766 -0.801 -0.554 -1.318
                curveToRelative(
                    dx1 = -0.517f,
                    dy1 = -0.21f,
                    dx2 = -0.766f,
                    dy2 = -0.801f,
                    dx3 = -0.554f,
                    dy3 = -1.318f,
                )
                // c 0.21 -0.517 0.801 -0.766 1.317 -0.556
                curveToRelative(
                    dx1 = 0.21f,
                    dy1 = -0.517f,
                    dx2 = 0.801f,
                    dy2 = -0.766f,
                    dx3 = 1.317f,
                    dy3 = -0.556f,
                )
                // l 1.873 0.764
                lineToRelative(dx = 1.873f, dy = 0.764f)
                // c 0.518 0.211 0.766 0.801 0.556 1.318
                curveToRelative(
                    dx1 = 0.518f,
                    dy1 = 0.211f,
                    dx2 = 0.766f,
                    dy2 = 0.801f,
                    dx3 = 0.556f,
                    dy3 = 1.318f,
                )
                // c -0.211 0.518 -0.802 0.767 -1.318 0.556
                curveToRelative(
                    dx1 = -0.211f,
                    dy1 = 0.518f,
                    dx2 = -0.802f,
                    dy2 = 0.767f,
                    dx3 = -1.318f,
                    dy3 = 0.556f,
                )
                // l -1.874 -0.764z
                lineToRelative(dx = -1.874f, dy = -0.764f)
                close()
                // M 7.758 16.142
                moveTo(x = 7.758f, y = 16.142f)
                // c -0.461 0.316 -1.091 0.199 -1.406 -0.264
                curveToRelative(
                    dx1 = -0.461f,
                    dy1 = 0.316f,
                    dx2 = -1.091f,
                    dy2 = 0.199f,
                    dx3 = -1.406f,
                    dy3 = -0.264f,
                )
                // c -0.315 -0.46 -0.198 -1.09 0.262 -1.405
                curveToRelative(
                    dx1 = -0.315f,
                    dy1 = -0.46f,
                    dx2 = -0.198f,
                    dy2 = -1.09f,
                    dx3 = 0.262f,
                    dy3 = -1.405f,
                )
                // l 1.67 -1.144
                lineToRelative(dx = 1.67f, dy = -1.144f)
                // c 0.46 -0.315 1.089 -0.198 1.405 0.263
                curveToRelative(
                    dx1 = 0.46f,
                    dy1 = -0.315f,
                    dx2 = 1.089f,
                    dy2 = -0.198f,
                    dx3 = 1.405f,
                    dy3 = 0.263f,
                )
                // c 0.315 0.46 0.198 1.091 -0.263 1.406
                curveToRelative(
                    dx1 = 0.315f,
                    dy1 = 0.46f,
                    dx2 = 0.198f,
                    dy2 = 1.091f,
                    dx3 = -0.263f,
                    dy3 = 1.406f,
                )
                // l -1.668 1.144z
                lineToRelative(dx = -1.668f, dy = 1.144f)
                close()
                // M 16.786 19.881
                moveTo(x = 16.786f, y = 19.881f)
                // c -0.767 -0.312 -1.137 -1.188 -0.824 -1.956
                curveToRelative(
                    dx1 = -0.767f,
                    dy1 = -0.312f,
                    dx2 = -1.137f,
                    dy2 = -1.188f,
                    dx3 = -0.824f,
                    dy3 = -1.956f,
                )
                // c 0.314 -0.766 1.189 -1.135 1.956 -0.823
                curveToRelative(
                    dx1 = 0.314f,
                    dy1 = -0.766f,
                    dx2 = 1.189f,
                    dy2 = -1.135f,
                    dx3 = 1.956f,
                    dy3 = -0.823f,
                )
                // l 2.778 1.134
                lineToRelative(dx = 2.778f, dy = 1.134f)
                // c 0.767 0.312 1.136 1.186 0.824 1.953
                curveToRelative(
                    dx1 = 0.767f,
                    dy1 = 0.312f,
                    dx2 = 1.136f,
                    dy2 = 1.186f,
                    dx3 = 0.824f,
                    dy3 = 1.953f,
                )
                // c -0.312 0.768 -1.188 1.137 -1.956 0.824
                curveToRelative(
                    dx1 = -0.312f,
                    dy1 = 0.768f,
                    dx2 = -1.188f,
                    dy2 = 1.137f,
                    dx3 = -1.956f,
                    dy3 = 0.824f,
                )
                // l -2.778 -1.132z
                lineToRelative(dx = -2.778f, dy = -1.132f)
                close()
                // M 10.602 25.933
                moveTo(x = 10.602f, y = 25.933f)
                // c 0.522 -0.199 1.106 0.062 1.306 0.586
                curveToRelative(
                    dx1 = 0.522f,
                    dy1 = -0.199f,
                    dx2 = 1.106f,
                    dy2 = 0.062f,
                    dx3 = 1.306f,
                    dy3 = 0.586f,
                )
                // c 0.197 0.519 -0.066 1.105 -0.588 1.303
                curveToRelative(
                    dx1 = 0.197f,
                    dy1 = 0.519f,
                    dx2 = -0.066f,
                    dy2 = 1.105f,
                    dx3 = -0.588f,
                    dy3 = 1.303f,
                )
                // l -1.892 0.721
                lineToRelative(dx = -1.892f, dy = 0.721f)
                // c -0.519 0.199 -1.104 -0.063 -1.302 -0.586
                curveToRelative(
                    dx1 = -0.519f,
                    dy1 = 0.199f,
                    dx2 = -1.104f,
                    dy2 = -0.063f,
                    dx3 = -1.302f,
                    dy3 = -0.586f,
                )
                // c -0.2 -0.524 0.062 -1.107 0.585 -1.307
                curveToRelative(
                    dx1 = -0.2f,
                    dy1 = -0.524f,
                    dx2 = 0.062f,
                    dy2 = -1.107f,
                    dx3 = 0.585f,
                    dy3 = -1.307f,
                )
                // l 1.891 -0.717z
                lineToRelative(dx = 1.891f, dy = -0.717f)
                close()
            }
            // M24 19 H12 c-1.104 0 -2 0.896 -2 2 v11.998 C12.385 34.273 15.106 35 18 35 c2.893 0 5.615 -0.727 8 -2.002 V21 c0 -1.104 -0.896 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 24 19
                moveTo(x = 24.0f, y = 19.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 11.998
                verticalLineToRelative(dy = 11.998f)
                // C 12.385 34.273 15.106 35 18 35
                curveTo(
                    x1 = 12.385f,
                    y1 = 34.273f,
                    x2 = 15.106f,
                    y2 = 35.0f,
                    x3 = 18.0f,
                    y3 = 35.0f,
                )
                // c 2.893 0 5.615 -0.727 8 -2.002
                curveToRelative(
                    dx1 = 2.893f,
                    dy1 = 0.0f,
                    dx2 = 5.615f,
                    dy2 = -0.727f,
                    dx3 = 8.0f,
                    dy3 = -2.002f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // c 0 -1.104 -0.896 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
        }.build().also { _emoji1f358 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f358: ImageVector? = null
