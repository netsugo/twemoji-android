package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f35a: ImageVector
    get() {
        val current = _emoji1f35a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f35a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 36 C3.042 36 1 21 1 17 h34 c0 2 -1.958 19 -17 19z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 36
                moveTo(x = 18.0f, y = 36.0f)
                // C 3.042 36 1 21 1 17
                curveTo(
                    x1 = 3.042f,
                    y1 = 36.0f,
                    x2 = 1.0f,
                    y2 = 21.0f,
                    x3 = 1.0f,
                    y3 = 17.0f,
                )
                // h 34
                horizontalLineToRelative(dx = 34.0f)
                // c 0 2 -1.958 19 -17 19z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -1.958f,
                    dy2 = 19.0f,
                    dx3 = -17.0f,
                    dy3 = 19.0f,
                )
                close()
            }
            // M1 17.056 a17 9.444 0 1 0 34 0 a17 9.444 0 1 0 -34 0z
            path(
                fill = SolidColor(Color(0xFFA0041E)),
            ) {
                // M 1 17.056
                moveTo(x = 1.0f, y = 17.056f)
                // a 17 9.444 0 1 0 34 0
                arcToRelative(
                    a = 17.0f,
                    b = 9.444f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 34.0f,
                    dy1 = 0.0f,
                )
                // a 17 9.444 0 1 0 -34 0z
                arcToRelative(
                    a = 17.0f,
                    b = 9.444f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -34.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M18 25 c-6 0 -16 -3 -16 -8 C2 11 8.125 4 18 4 s16 8 16 13 -9 8 -16 8z
            path(
                fill = SolidColor(Color(0xFFE6E9EA)),
            ) {
                // M 18 25
                moveTo(x = 18.0f, y = 25.0f)
                // c -6 0 -16 -3 -16 -8
                curveToRelative(
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                    dx2 = -16.0f,
                    dy2 = -3.0f,
                    dx3 = -16.0f,
                    dy3 = -8.0f,
                )
                // C 2 11 8.125 4 18 4
                curveTo(
                    x1 = 2.0f,
                    y1 = 11.0f,
                    x2 = 8.125f,
                    y2 = 4.0f,
                    x3 = 18.0f,
                    y3 = 4.0f,
                )
                // s 16 8 16 13
                reflectiveCurveToRelative(
                    dx1 = 16.0f,
                    dy1 = 8.0f,
                    dx2 = 16.0f,
                    dy2 = 13.0f,
                )
                // s -9 8 -16 8z
                reflectiveCurveToRelative(
                    dx1 = -9.0f,
                    dy1 = 8.0f,
                    dx2 = -16.0f,
                    dy2 = 8.0f,
                )
                close()
            }
            // M15.41 19.892 c0.419 0.359 0.468 0.991 0.108 1.41 -0.359 0.419 -0.991 0.468 -1.41 0.108 l-1.519 -1.302 c-0.419 -0.359 -0.468 -0.991 -0.108 -1.41 0.359 -0.419 0.991 -0.468 1.41 -0.108 l1.519 1.302z M7.283 18.385 c-0.304 0.46 -0.925 0.587 -1.386 0.283 -0.46 -0.305 -0.587 -0.925 -0.283 -1.386 l1.103 -1.669 c0.305 -0.461 0.925 -0.587 1.386 -0.283 0.46 0.305 0.587 0.925 0.283 1.386 l-1.103 1.669z M30.283 18.385 c-0.305 0.46 -0.926 0.587 -1.387 0.283 -0.46 -0.305 -0.587 -0.925 -0.282 -1.386 l1.103 -1.669 c0.305 -0.461 0.926 -0.587 1.386 -0.283 0.46 0.305 0.587 0.925 0.283 1.386 l-1.103 1.669z M24.18 14.779 c0.11 0.541 -0.239 1.069 -0.78 1.18 -0.541 0.11 -1.069 -0.239 -1.18 -0.78 l-0.399 -1.96 c-0.11 -0.541 0.238 -1.069 0.78 -1.179 0.541 -0.111 1.069 0.239 1.179 0.78 l0.4 1.959z M16.64 10.821 c-0.345 -0.14 -0.511 -0.534 -0.37 -0.879 0.14 -0.344 0.534 -0.51 0.878 -0.37 l1.249 0.509 c0.345 0.14 0.51 0.533 0.37 0.878 -0.141 0.345 -0.534 0.511 -0.879 0.37 l-1.248 -0.508z M7.344 12.388 c-0.307 0.211 -0.727 0.133 -0.938 -0.175 -0.21 -0.307 -0.132 -0.727 0.175 -0.937 l1.113 -0.762 c0.307 -0.21 0.726 -0.132 0.937 0.175 0.21 0.307 0.132 0.727 -0.175 0.938 l-1.112 0.761z M20.937 20.933 c-0.551 -0.036 -0.969 -0.513 -0.933 -1.064 0.037 -0.55 0.513 -0.968 1.062 -0.933 l1.997 0.131 c0.55 0.035 0.969 0.512 0.933 1.062 -0.035 0.551 -0.511 0.97 -1.062 0.933 l-1.997 -0.129z M11.696 14.547 c-0.512 -0.208 -0.758 -0.793 -0.549 -1.304 0.209 -0.511 0.793 -0.757 1.304 -0.549 l1.853 0.755 c0.511 0.208 0.757 0.791 0.549 1.303 -0.208 0.512 -0.792 0.758 -1.304 0.549 l-1.853 -0.754z M27.641 11.821 c-0.346 -0.14 -0.512 -0.534 -0.37 -0.879 0.14 -0.344 0.534 -0.51 0.878 -0.37 l1.25 0.509 c0.344 0.14 0.51 0.533 0.369 0.878 -0.141 0.345 -0.533 0.511 -0.879 0.37 l-1.248 -0.508z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 15.41 19.892
                moveTo(x = 15.41f, y = 19.892f)
                // c 0.419 0.359 0.468 0.991 0.108 1.41
                curveToRelative(
                    dx1 = 0.419f,
                    dy1 = 0.359f,
                    dx2 = 0.468f,
                    dy2 = 0.991f,
                    dx3 = 0.108f,
                    dy3 = 1.41f,
                )
                // c -0.359 0.419 -0.991 0.468 -1.41 0.108
                curveToRelative(
                    dx1 = -0.359f,
                    dy1 = 0.419f,
                    dx2 = -0.991f,
                    dy2 = 0.468f,
                    dx3 = -1.41f,
                    dy3 = 0.108f,
                )
                // l -1.519 -1.302
                lineToRelative(dx = -1.519f, dy = -1.302f)
                // c -0.419 -0.359 -0.468 -0.991 -0.108 -1.41
                curveToRelative(
                    dx1 = -0.419f,
                    dy1 = -0.359f,
                    dx2 = -0.468f,
                    dy2 = -0.991f,
                    dx3 = -0.108f,
                    dy3 = -1.41f,
                )
                // c 0.359 -0.419 0.991 -0.468 1.41 -0.108
                curveToRelative(
                    dx1 = 0.359f,
                    dy1 = -0.419f,
                    dx2 = 0.991f,
                    dy2 = -0.468f,
                    dx3 = 1.41f,
                    dy3 = -0.108f,
                )
                // l 1.519 1.302z
                lineToRelative(dx = 1.519f, dy = 1.302f)
                close()
                // M 7.283 18.385
                moveTo(x = 7.283f, y = 18.385f)
                // c -0.304 0.46 -0.925 0.587 -1.386 0.283
                curveToRelative(
                    dx1 = -0.304f,
                    dy1 = 0.46f,
                    dx2 = -0.925f,
                    dy2 = 0.587f,
                    dx3 = -1.386f,
                    dy3 = 0.283f,
                )
                // c -0.46 -0.305 -0.587 -0.925 -0.283 -1.386
                curveToRelative(
                    dx1 = -0.46f,
                    dy1 = -0.305f,
                    dx2 = -0.587f,
                    dy2 = -0.925f,
                    dx3 = -0.283f,
                    dy3 = -1.386f,
                )
                // l 1.103 -1.669
                lineToRelative(dx = 1.103f, dy = -1.669f)
                // c 0.305 -0.461 0.925 -0.587 1.386 -0.283
                curveToRelative(
                    dx1 = 0.305f,
                    dy1 = -0.461f,
                    dx2 = 0.925f,
                    dy2 = -0.587f,
                    dx3 = 1.386f,
                    dy3 = -0.283f,
                )
                // c 0.46 0.305 0.587 0.925 0.283 1.386
                curveToRelative(
                    dx1 = 0.46f,
                    dy1 = 0.305f,
                    dx2 = 0.587f,
                    dy2 = 0.925f,
                    dx3 = 0.283f,
                    dy3 = 1.386f,
                )
                // l -1.103 1.669z
                lineToRelative(dx = -1.103f, dy = 1.669f)
                close()
                // M 30.283 18.385
                moveTo(x = 30.283f, y = 18.385f)
                // c -0.305 0.46 -0.926 0.587 -1.387 0.283
                curveToRelative(
                    dx1 = -0.305f,
                    dy1 = 0.46f,
                    dx2 = -0.926f,
                    dy2 = 0.587f,
                    dx3 = -1.387f,
                    dy3 = 0.283f,
                )
                // c -0.46 -0.305 -0.587 -0.925 -0.282 -1.386
                curveToRelative(
                    dx1 = -0.46f,
                    dy1 = -0.305f,
                    dx2 = -0.587f,
                    dy2 = -0.925f,
                    dx3 = -0.282f,
                    dy3 = -1.386f,
                )
                // l 1.103 -1.669
                lineToRelative(dx = 1.103f, dy = -1.669f)
                // c 0.305 -0.461 0.926 -0.587 1.386 -0.283
                curveToRelative(
                    dx1 = 0.305f,
                    dy1 = -0.461f,
                    dx2 = 0.926f,
                    dy2 = -0.587f,
                    dx3 = 1.386f,
                    dy3 = -0.283f,
                )
                // c 0.46 0.305 0.587 0.925 0.283 1.386
                curveToRelative(
                    dx1 = 0.46f,
                    dy1 = 0.305f,
                    dx2 = 0.587f,
                    dy2 = 0.925f,
                    dx3 = 0.283f,
                    dy3 = 1.386f,
                )
                // l -1.103 1.669z
                lineToRelative(dx = -1.103f, dy = 1.669f)
                close()
                // M 24.18 14.779
                moveTo(x = 24.18f, y = 14.779f)
                // c 0.11 0.541 -0.239 1.069 -0.78 1.18
                curveToRelative(
                    dx1 = 0.11f,
                    dy1 = 0.541f,
                    dx2 = -0.239f,
                    dy2 = 1.069f,
                    dx3 = -0.78f,
                    dy3 = 1.18f,
                )
                // c -0.541 0.11 -1.069 -0.239 -1.18 -0.78
                curveToRelative(
                    dx1 = -0.541f,
                    dy1 = 0.11f,
                    dx2 = -1.069f,
                    dy2 = -0.239f,
                    dx3 = -1.18f,
                    dy3 = -0.78f,
                )
                // l -0.399 -1.96
                lineToRelative(dx = -0.399f, dy = -1.96f)
                // c -0.11 -0.541 0.238 -1.069 0.78 -1.179
                curveToRelative(
                    dx1 = -0.11f,
                    dy1 = -0.541f,
                    dx2 = 0.238f,
                    dy2 = -1.069f,
                    dx3 = 0.78f,
                    dy3 = -1.179f,
                )
                // c 0.541 -0.111 1.069 0.239 1.179 0.78
                curveToRelative(
                    dx1 = 0.541f,
                    dy1 = -0.111f,
                    dx2 = 1.069f,
                    dy2 = 0.239f,
                    dx3 = 1.179f,
                    dy3 = 0.78f,
                )
                // l 0.4 1.959z
                lineToRelative(dx = 0.4f, dy = 1.959f)
                close()
                // M 16.64 10.821
                moveTo(x = 16.64f, y = 10.821f)
                // c -0.345 -0.14 -0.511 -0.534 -0.37 -0.879
                curveToRelative(
                    dx1 = -0.345f,
                    dy1 = -0.14f,
                    dx2 = -0.511f,
                    dy2 = -0.534f,
                    dx3 = -0.37f,
                    dy3 = -0.879f,
                )
                // c 0.14 -0.344 0.534 -0.51 0.878 -0.37
                curveToRelative(
                    dx1 = 0.14f,
                    dy1 = -0.344f,
                    dx2 = 0.534f,
                    dy2 = -0.51f,
                    dx3 = 0.878f,
                    dy3 = -0.37f,
                )
                // l 1.249 0.509
                lineToRelative(dx = 1.249f, dy = 0.509f)
                // c 0.345 0.14 0.51 0.533 0.37 0.878
                curveToRelative(
                    dx1 = 0.345f,
                    dy1 = 0.14f,
                    dx2 = 0.51f,
                    dy2 = 0.533f,
                    dx3 = 0.37f,
                    dy3 = 0.878f,
                )
                // c -0.141 0.345 -0.534 0.511 -0.879 0.37
                curveToRelative(
                    dx1 = -0.141f,
                    dy1 = 0.345f,
                    dx2 = -0.534f,
                    dy2 = 0.511f,
                    dx3 = -0.879f,
                    dy3 = 0.37f,
                )
                // l -1.248 -0.508z
                lineToRelative(dx = -1.248f, dy = -0.508f)
                close()
                // M 7.344 12.388
                moveTo(x = 7.344f, y = 12.388f)
                // c -0.307 0.211 -0.727 0.133 -0.938 -0.175
                curveToRelative(
                    dx1 = -0.307f,
                    dy1 = 0.211f,
                    dx2 = -0.727f,
                    dy2 = 0.133f,
                    dx3 = -0.938f,
                    dy3 = -0.175f,
                )
                // c -0.21 -0.307 -0.132 -0.727 0.175 -0.937
                curveToRelative(
                    dx1 = -0.21f,
                    dy1 = -0.307f,
                    dx2 = -0.132f,
                    dy2 = -0.727f,
                    dx3 = 0.175f,
                    dy3 = -0.937f,
                )
                // l 1.113 -0.762
                lineToRelative(dx = 1.113f, dy = -0.762f)
                // c 0.307 -0.21 0.726 -0.132 0.937 0.175
                curveToRelative(
                    dx1 = 0.307f,
                    dy1 = -0.21f,
                    dx2 = 0.726f,
                    dy2 = -0.132f,
                    dx3 = 0.937f,
                    dy3 = 0.175f,
                )
                // c 0.21 0.307 0.132 0.727 -0.175 0.938
                curveToRelative(
                    dx1 = 0.21f,
                    dy1 = 0.307f,
                    dx2 = 0.132f,
                    dy2 = 0.727f,
                    dx3 = -0.175f,
                    dy3 = 0.938f,
                )
                // l -1.112 0.761z
                lineToRelative(dx = -1.112f, dy = 0.761f)
                close()
                // M 20.937 20.933
                moveTo(x = 20.937f, y = 20.933f)
                // c -0.551 -0.036 -0.969 -0.513 -0.933 -1.064
                curveToRelative(
                    dx1 = -0.551f,
                    dy1 = -0.036f,
                    dx2 = -0.969f,
                    dy2 = -0.513f,
                    dx3 = -0.933f,
                    dy3 = -1.064f,
                )
                // c 0.037 -0.55 0.513 -0.968 1.062 -0.933
                curveToRelative(
                    dx1 = 0.037f,
                    dy1 = -0.55f,
                    dx2 = 0.513f,
                    dy2 = -0.968f,
                    dx3 = 1.062f,
                    dy3 = -0.933f,
                )
                // l 1.997 0.131
                lineToRelative(dx = 1.997f, dy = 0.131f)
                // c 0.55 0.035 0.969 0.512 0.933 1.062
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.035f,
                    dx2 = 0.969f,
                    dy2 = 0.512f,
                    dx3 = 0.933f,
                    dy3 = 1.062f,
                )
                // c -0.035 0.551 -0.511 0.97 -1.062 0.933
                curveToRelative(
                    dx1 = -0.035f,
                    dy1 = 0.551f,
                    dx2 = -0.511f,
                    dy2 = 0.97f,
                    dx3 = -1.062f,
                    dy3 = 0.933f,
                )
                // l -1.997 -0.129z
                lineToRelative(dx = -1.997f, dy = -0.129f)
                close()
                // M 11.696 14.547
                moveTo(x = 11.696f, y = 14.547f)
                // c -0.512 -0.208 -0.758 -0.793 -0.549 -1.304
                curveToRelative(
                    dx1 = -0.512f,
                    dy1 = -0.208f,
                    dx2 = -0.758f,
                    dy2 = -0.793f,
                    dx3 = -0.549f,
                    dy3 = -1.304f,
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
                // l 1.853 0.755
                lineToRelative(dx = 1.853f, dy = 0.755f)
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
                // l -1.853 -0.754z
                lineToRelative(dx = -1.853f, dy = -0.754f)
                close()
                // M 27.641 11.821
                moveTo(x = 27.641f, y = 11.821f)
                // c -0.346 -0.14 -0.512 -0.534 -0.37 -0.879
                curveToRelative(
                    dx1 = -0.346f,
                    dy1 = -0.14f,
                    dx2 = -0.512f,
                    dy2 = -0.534f,
                    dx3 = -0.37f,
                    dy3 = -0.879f,
                )
                // c 0.14 -0.344 0.534 -0.51 0.878 -0.37
                curveToRelative(
                    dx1 = 0.14f,
                    dy1 = -0.344f,
                    dx2 = 0.534f,
                    dy2 = -0.51f,
                    dx3 = 0.878f,
                    dy3 = -0.37f,
                )
                // l 1.25 0.509
                lineToRelative(dx = 1.25f, dy = 0.509f)
                // c 0.344 0.14 0.51 0.533 0.369 0.878
                curveToRelative(
                    dx1 = 0.344f,
                    dy1 = 0.14f,
                    dx2 = 0.51f,
                    dy2 = 0.533f,
                    dx3 = 0.369f,
                    dy3 = 0.878f,
                )
                // c -0.141 0.345 -0.533 0.511 -0.879 0.37
                curveToRelative(
                    dx1 = -0.141f,
                    dy1 = 0.345f,
                    dx2 = -0.533f,
                    dy2 = 0.511f,
                    dx3 = -0.879f,
                    dy3 = 0.37f,
                )
                // l -1.248 -0.508z
                lineToRelative(dx = -1.248f, dy = -0.508f)
                close()
            }
        }.build().also { _emoji1f35a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f35a: ImageVector? = null
