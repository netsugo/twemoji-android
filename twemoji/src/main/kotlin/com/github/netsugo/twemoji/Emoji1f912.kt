package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f912: ImageVector
    get() {
        val current = _emoji1f912
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f912",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M10 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 10 16.5
                moveTo(x = 10.0f, y = 16.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21 16.5 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 21 16.5
                moveTo(x = 21.0f, y = 16.5f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M29 12 c-5.554 0 -7.802 -4.367 -7.895 -4.553 -0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.492 -0.247 1.092 -0.048 1.34 0.443 C22.967 6.694 24.713 10 29 10 c0.553 0 1 0.448 1 1 0 0.553 -0.447 1 -1 1z M7 11.994 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 c5.083 0 5.996 -3.12 6.033 -3.253 0.145 -0.528 0.69 -0.848 1.219 -0.709 0.53 0.139 0.851 0.673 0.718 1.205 -0.049 0.194 -1.266 4.757 -7.97 4.757z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 29 12
                moveTo(x = 29.0f, y = 12.0f)
                // c -5.554 0 -7.802 -4.367 -7.895 -4.553
                curveToRelative(
                    dx1 = -5.554f,
                    dy1 = 0.0f,
                    dx2 = -7.802f,
                    dy2 = -4.367f,
                    dx3 = -7.895f,
                    dy3 = -4.553f,
                )
                // c -0.247 -0.494 -0.047 -1.095 0.447 -1.342
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = -0.494f,
                    dx2 = -0.047f,
                    dy2 = -1.095f,
                    dx3 = 0.447f,
                    dy3 = -1.342f,
                )
                // c 0.492 -0.247 1.092 -0.048 1.34 0.443
                curveToRelative(
                    dx1 = 0.492f,
                    dy1 = -0.247f,
                    dx2 = 1.092f,
                    dy2 = -0.048f,
                    dx3 = 1.34f,
                    dy3 = 0.443f,
                )
                // C 22.967 6.694 24.713 10 29 10
                curveTo(
                    x1 = 22.967f,
                    y1 = 6.694f,
                    x2 = 24.713f,
                    y2 = 10.0f,
                    x3 = 29.0f,
                    y3 = 10.0f,
                )
                // c 0.553 0 1 0.448 1 1
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // c 0 0.553 -0.447 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 7 11.994
                moveTo(x = 7.0f, y = 11.994f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // c 5.083 0 5.996 -3.12 6.033 -3.253
                curveToRelative(
                    dx1 = 5.083f,
                    dy1 = 0.0f,
                    dx2 = 5.996f,
                    dy2 = -3.12f,
                    dx3 = 6.033f,
                    dy3 = -3.253f,
                )
                // c 0.145 -0.528 0.69 -0.848 1.219 -0.709
                curveToRelative(
                    dx1 = 0.145f,
                    dy1 = -0.528f,
                    dx2 = 0.69f,
                    dy2 = -0.848f,
                    dx3 = 1.219f,
                    dy3 = -0.709f,
                )
                // c 0.53 0.139 0.851 0.673 0.718 1.205
                curveToRelative(
                    dx1 = 0.53f,
                    dy1 = 0.139f,
                    dx2 = 0.851f,
                    dy2 = 0.673f,
                    dx3 = 0.718f,
                    dy3 = 1.205f,
                )
                // c -0.049 0.194 -1.266 4.757 -7.97 4.757z
                curveToRelative(
                    dx1 = -0.049f,
                    dy1 = 0.194f,
                    dx2 = -1.266f,
                    dy2 = 4.757f,
                    dx3 = -7.97f,
                    dy3 = 4.757f,
                )
                close()
            }
            // M35.968 17.068 l-4.005 0.813 -16.187 10.508 7.118 0.963 11.685 -7.211 c0.703 -0.431 0.994 -0.835 1.198 -1.747 s0.191 -3.326 0.191 -3.326z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 35.968 17.068
                moveTo(x = 35.968f, y = 17.068f)
                // l -4.005 0.813
                lineToRelative(dx = -4.005f, dy = 0.813f)
                // l -16.187 10.508
                lineToRelative(dx = -16.187f, dy = 10.508f)
                // l 7.118 0.963
                lineToRelative(dx = 7.118f, dy = 0.963f)
                // l 11.685 -7.211
                lineToRelative(dx = 11.685f, dy = -7.211f)
                // c 0.703 -0.431 0.994 -0.835 1.198 -1.747
                curveToRelative(
                    dx1 = 0.703f,
                    dy1 = -0.431f,
                    dx2 = 0.994f,
                    dy2 = -0.835f,
                    dx3 = 1.198f,
                    dy3 = -1.747f,
                )
                // s 0.191 -3.326 0.191 -3.326z
                reflectiveCurveToRelative(
                    dx1 = 0.191f,
                    dy1 = -3.326f,
                    dx2 = 0.191f,
                    dy2 = -3.326f,
                )
                close()
            }
            // M23.485 29.379 C23.474 29.335 22.34 26.5 18 26.5 s-5.474 2.835 -5.485 2.879 c-0.053 0.213 0.044 0.431 0.232 0.544 0.188 0.112 0.433 0.086 0.596 -0.06 C13.352 29.855 14.356 29 18 29 c3.59 0 4.617 0.83 4.656 0.863 0.095 0.09 0.219 0.137 0.344 0.137 0.084 0 0.169 -0.021 0.246 -0.064 0.196 -0.112 0.294 -0.339 0.239 -0.557z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 23.485 29.379
                moveTo(x = 23.485f, y = 29.379f)
                // C 23.474 29.335 22.34 26.5 18 26.5
                curveTo(
                    x1 = 23.474f,
                    y1 = 29.335f,
                    x2 = 22.34f,
                    y2 = 26.5f,
                    x3 = 18.0f,
                    y3 = 26.5f,
                )
                // s -5.474 2.835 -5.485 2.879
                reflectiveCurveToRelative(
                    dx1 = -5.474f,
                    dy1 = 2.835f,
                    dx2 = -5.485f,
                    dy2 = 2.879f,
                )
                // c -0.053 0.213 0.044 0.431 0.232 0.544
                curveToRelative(
                    dx1 = -0.053f,
                    dy1 = 0.213f,
                    dx2 = 0.044f,
                    dy2 = 0.431f,
                    dx3 = 0.232f,
                    dy3 = 0.544f,
                )
                // c 0.188 0.112 0.433 0.086 0.596 -0.06
                curveToRelative(
                    dx1 = 0.188f,
                    dy1 = 0.112f,
                    dx2 = 0.433f,
                    dy2 = 0.086f,
                    dx3 = 0.596f,
                    dy3 = -0.06f,
                )
                // C 13.352 29.855 14.356 29 18 29
                curveTo(
                    x1 = 13.352f,
                    y1 = 29.855f,
                    x2 = 14.356f,
                    y2 = 29.0f,
                    x3 = 18.0f,
                    y3 = 29.0f,
                )
                // c 3.59 0 4.617 0.83 4.656 0.863
                curveToRelative(
                    dx1 = 3.59f,
                    dy1 = 0.0f,
                    dx2 = 4.617f,
                    dy2 = 0.83f,
                    dx3 = 4.656f,
                    dy3 = 0.863f,
                )
                // c 0.095 0.09 0.219 0.137 0.344 0.137
                curveToRelative(
                    dx1 = 0.095f,
                    dy1 = 0.09f,
                    dx2 = 0.219f,
                    dy2 = 0.137f,
                    dx3 = 0.344f,
                    dy3 = 0.137f,
                )
                // c 0.084 0 0.169 -0.021 0.246 -0.064
                curveToRelative(
                    dx1 = 0.084f,
                    dy1 = 0.0f,
                    dx2 = 0.169f,
                    dy2 = -0.021f,
                    dx3 = 0.246f,
                    dy3 = -0.064f,
                )
                // c 0.196 -0.112 0.294 -0.339 0.239 -0.557z
                curveToRelative(
                    dx1 = 0.196f,
                    dy1 = -0.112f,
                    dx2 = 0.294f,
                    dy2 = -0.339f,
                    dx3 = 0.239f,
                    dy3 = -0.557f,
                )
                close()
            }
            // M35.474 15.729 c-0.829 -1.104 -2.397 -1.328 -3.501 -0.5 L14.767 28.137 c0.646 -0.242 1.51 -0.444 2.615 -0.522 0.256 -0.018 2.66 -0.627 2.66 -0.627 l1.293 1.036 s0.911 0.367 1.197 0.539 l12.444 -9.335 c1.103 -0.827 1.326 -2.395 0.498 -3.499z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 35.474 15.729
                moveTo(x = 35.474f, y = 15.729f)
                // c -0.829 -1.104 -2.397 -1.328 -3.501 -0.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = -1.104f,
                    dx2 = -2.397f,
                    dy2 = -1.328f,
                    dx3 = -3.501f,
                    dy3 = -0.5f,
                )
                // L 14.767 28.137
                lineTo(x = 14.767f, y = 28.137f)
                // c 0.646 -0.242 1.51 -0.444 2.615 -0.522
                curveToRelative(
                    dx1 = 0.646f,
                    dy1 = -0.242f,
                    dx2 = 1.51f,
                    dy2 = -0.444f,
                    dx3 = 2.615f,
                    dy3 = -0.522f,
                )
                // c 0.256 -0.018 2.66 -0.627 2.66 -0.627
                curveToRelative(
                    dx1 = 0.256f,
                    dy1 = -0.018f,
                    dx2 = 2.66f,
                    dy2 = -0.627f,
                    dx3 = 2.66f,
                    dy3 = -0.627f,
                )
                // l 1.293 1.036
                lineToRelative(dx = 1.293f, dy = 1.036f)
                // s 0.911 0.367 1.197 0.539
                reflectiveCurveToRelative(
                    dx1 = 0.911f,
                    dy1 = 0.367f,
                    dx2 = 1.197f,
                    dy2 = 0.539f,
                )
                // l 12.444 -9.335
                lineToRelative(dx = 12.444f, dy = -9.335f)
                // c 1.103 -0.827 1.326 -2.395 0.498 -3.499z
                curveToRelative(
                    dx1 = 1.103f,
                    dy1 = -0.827f,
                    dx2 = 1.326f,
                    dy2 = -2.395f,
                    dx3 = 0.498f,
                    dy3 = -3.499f,
                )
                close()
            }
            // M28.686 20.87 c-0.448 -0.596 -0.787 -1.145 -1.383 -0.698 l-9.922 7.443 c0.256 -0.018 0.5 -0.042 0.783 -0.044 1.36 -0.009 2.4 0.195 3.17 0.452 l7.588 -5.692 c0.596 -0.447 0.211 -0.864 -0.236 -1.461z
            path(
                fill = SolidColor(Color(0xFFDA2F47)),
            ) {
                // M 28.686 20.87
                moveTo(x = 28.686f, y = 20.87f)
                // c -0.448 -0.596 -0.787 -1.145 -1.383 -0.698
                curveToRelative(
                    dx1 = -0.448f,
                    dy1 = -0.596f,
                    dx2 = -0.787f,
                    dy2 = -1.145f,
                    dx3 = -1.383f,
                    dy3 = -0.698f,
                )
                // l -9.922 7.443
                lineToRelative(dx = -9.922f, dy = 7.443f)
                // c 0.256 -0.018 0.5 -0.042 0.783 -0.044
                curveToRelative(
                    dx1 = 0.256f,
                    dy1 = -0.018f,
                    dx2 = 0.5f,
                    dy2 = -0.042f,
                    dx3 = 0.783f,
                    dy3 = -0.044f,
                )
                // c 1.36 -0.009 2.4 0.195 3.17 0.452
                curveToRelative(
                    dx1 = 1.36f,
                    dy1 = -0.009f,
                    dx2 = 2.4f,
                    dy2 = 0.195f,
                    dx3 = 3.17f,
                    dy3 = 0.452f,
                )
                // l 7.588 -5.692
                lineToRelative(dx = 7.588f, dy = -5.692f)
                // c 0.596 -0.447 0.211 -0.864 -0.236 -1.461z
                curveToRelative(
                    dx1 = 0.596f,
                    dy1 = -0.447f,
                    dx2 = 0.211f,
                    dy2 = -0.864f,
                    dx3 = -0.236f,
                    dy3 = -1.461f,
                )
                close()
            }
            // M18.599 25.228 l1.234 1.598 0.741 -0.595 -1.197 -1.587z M20.822 23.567 l1.235 1.598 0.741 -0.595 -1.197 -1.587z M23.006 21.948 l1.234 1.598 0.741 -0.595 -1.197 -1.587z M25.187 20.288 l1.235 1.597 0.741 -0.594 -1.197 -1.587z M27.425 18.647 l1.235 1.598 0.74 -0.595 -1.196 -1.587z M29.565 17.029 l1.235 1.598 0.74 -0.595 -1.196 -1.587z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 18.599 25.228
                moveTo(x = 18.599f, y = 25.228f)
                // l 1.234 1.598
                lineToRelative(dx = 1.234f, dy = 1.598f)
                // l 0.741 -0.595
                lineToRelative(dx = 0.741f, dy = -0.595f)
                // l -1.197 -1.587z
                lineToRelative(dx = -1.197f, dy = -1.587f)
                close()
                // M 20.822 23.567
                moveTo(x = 20.822f, y = 23.567f)
                // l 1.235 1.598
                lineToRelative(dx = 1.235f, dy = 1.598f)
                // l 0.741 -0.595
                lineToRelative(dx = 0.741f, dy = -0.595f)
                // l -1.197 -1.587z
                lineToRelative(dx = -1.197f, dy = -1.587f)
                close()
                // M 23.006 21.948
                moveTo(x = 23.006f, y = 21.948f)
                // l 1.234 1.598
                lineToRelative(dx = 1.234f, dy = 1.598f)
                // l 0.741 -0.595
                lineToRelative(dx = 0.741f, dy = -0.595f)
                // l -1.197 -1.587z
                lineToRelative(dx = -1.197f, dy = -1.587f)
                close()
                // M 25.187 20.288
                moveTo(x = 25.187f, y = 20.288f)
                // l 1.235 1.597
                lineToRelative(dx = 1.235f, dy = 1.597f)
                // l 0.741 -0.594
                lineToRelative(dx = 0.741f, dy = -0.594f)
                // l -1.197 -1.587z
                lineToRelative(dx = -1.197f, dy = -1.587f)
                close()
                // M 27.425 18.647
                moveTo(x = 27.425f, y = 18.647f)
                // l 1.235 1.598
                lineToRelative(dx = 1.235f, dy = 1.598f)
                // l 0.74 -0.595
                lineToRelative(dx = 0.74f, dy = -0.595f)
                // l -1.196 -1.587z
                lineToRelative(dx = -1.196f, dy = -1.587f)
                close()
                // M 29.565 17.029
                moveTo(x = 29.565f, y = 17.029f)
                // l 1.235 1.598
                lineToRelative(dx = 1.235f, dy = 1.598f)
                // l 0.74 -0.595
                lineToRelative(dx = 0.74f, dy = -0.595f)
                // l -1.196 -1.587z
                lineToRelative(dx = -1.196f, dy = -1.587f)
                close()
            }
            // M22.531 28.563 l0.805 0.522 s-0.197 -0.362 -0.526 -0.726 l-0.279 0.204z
            path(
                fill = SolidColor(Color(0xFF452E04)),
            ) {
                // M 22.531 28.563
                moveTo(x = 22.531f, y = 28.563f)
                // l 0.805 0.522
                lineToRelative(dx = 0.805f, dy = 0.522f)
                // s -0.197 -0.362 -0.526 -0.726
                reflectiveCurveToRelative(
                    dx1 = -0.197f,
                    dy1 = -0.362f,
                    dx2 = -0.526f,
                    dy2 = -0.726f,
                )
                // l -0.279 0.204z
                lineToRelative(dx = -0.279f, dy = 0.204f)
                close()
            }
        }.build().also { _emoji1f912 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f912: ImageVector? = null
