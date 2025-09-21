package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1faac: ImageVector
    get() {
        val current = _emoji1faac
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1faac",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31.496 20.326 a0.588 0.588 0 0 0 0.406 -0.239 0.522 0.522 0 0 0 0.078 -0.446 C31.554 18.134 29.677 17 27.425 17 c-0.837 0 -1.67 0.28 -2.425 0.68 V6.5 a2.5 2.5 0 1 0 -5 0 v-4 a2.5 2.5 0 1 0 -5 0 v4 a2.5 2.5 0 1 0 -5 0 v11.181 c-0.755 -0.4 -1.587 -0.681 -2.425 -0.681 -2.252 0 -4.13 1.134 -4.556 2.64 a0.522 0.522 0 0 0 0.078 0.446 0.588 0.588 0 0 0 0.406 0.239 c6.94 0.885 1.222 15.255 13.996 15.666 12.776 -0.41 7.058 -14.781 13.997 -15.665z
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 31.496 20.326
                moveTo(x = 31.496f, y = 20.326f)
                // a 0.588 0.588 0 0 0 0.406 -0.239
                arcToRelative(
                    a = 0.588f,
                    b = 0.588f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.406f,
                    dy1 = -0.239f,
                )
                // a 0.522 0.522 0 0 0 0.078 -0.446
                arcToRelative(
                    a = 0.522f,
                    b = 0.522f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.078f,
                    dy1 = -0.446f,
                )
                // C 31.554 18.134 29.677 17 27.425 17
                curveTo(
                    x1 = 31.554f,
                    y1 = 18.134f,
                    x2 = 29.677f,
                    y2 = 17.0f,
                    x3 = 27.425f,
                    y3 = 17.0f,
                )
                // c -0.837 0 -1.67 0.28 -2.425 0.68
                curveToRelative(
                    dx1 = -0.837f,
                    dy1 = 0.0f,
                    dx2 = -1.67f,
                    dy2 = 0.28f,
                    dx3 = -2.425f,
                    dy3 = 0.68f,
                )
                // V 6.5
                verticalLineTo(y = 6.5f)
                // a 2.5 2.5 0 1 0 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 2.5 2.5 0 1 0 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 2.5 2.5 0 1 0 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                // v 11.181
                verticalLineToRelative(dy = 11.181f)
                // c -0.755 -0.4 -1.587 -0.681 -2.425 -0.681
                curveToRelative(
                    dx1 = -0.755f,
                    dy1 = -0.4f,
                    dx2 = -1.587f,
                    dy2 = -0.681f,
                    dx3 = -2.425f,
                    dy3 = -0.681f,
                )
                // c -2.252 0 -4.13 1.134 -4.556 2.64
                curveToRelative(
                    dx1 = -2.252f,
                    dy1 = 0.0f,
                    dx2 = -4.13f,
                    dy2 = 1.134f,
                    dx3 = -4.556f,
                    dy3 = 2.64f,
                )
                // a 0.522 0.522 0 0 0 0.078 0.446
                arcToRelative(
                    a = 0.522f,
                    b = 0.522f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.078f,
                    dy1 = 0.446f,
                )
                // a 0.588 0.588 0 0 0 0.406 0.239
                arcToRelative(
                    a = 0.588f,
                    b = 0.588f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.406f,
                    dy1 = 0.239f,
                )
                // c 6.94 0.885 1.222 15.255 13.996 15.666
                curveToRelative(
                    dx1 = 6.94f,
                    dy1 = 0.885f,
                    dx2 = 1.222f,
                    dy2 = 15.255f,
                    dx3 = 13.996f,
                    dy3 = 15.666f,
                )
                // c 12.776 -0.41 7.058 -14.781 13.997 -15.665z
                curveToRelative(
                    dx1 = 12.776f,
                    dy1 = -0.41f,
                    dx2 = 7.058f,
                    dy2 = -14.781f,
                    dx3 = 13.997f,
                    dy3 = -15.665f,
                )
                close()
            }
            // M24 26.5 S21.09 30 17.5 30 11 26.5 11 26.5 s2.91 -3.5 6.5 -3.5 6.5 3.5 6.5 3.5z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 24 26.5
                moveTo(x = 24.0f, y = 26.5f)
                // S 21.09 30 17.5 30
                reflectiveCurveTo(
                    x1 = 21.09f,
                    y1 = 30.0f,
                    x2 = 17.5f,
                    y2 = 30.0f,
                )
                // S 11 26.5 11 26.5
                reflectiveCurveTo(
                    x1 = 11.0f,
                    y1 = 26.5f,
                    x2 = 11.0f,
                    y2 = 26.5f,
                )
                // s 2.91 -3.5 6.5 -3.5
                reflectiveCurveToRelative(
                    dx1 = 2.91f,
                    dy1 = -3.5f,
                    dx2 = 6.5f,
                    dy2 = -3.5f,
                )
                // s 6.5 3.5 6.5 3.5z
                reflectiveCurveToRelative(
                    dx1 = 6.5f,
                    dy1 = 3.5f,
                    dx2 = 6.5f,
                    dy2 = 3.5f,
                )
                close()
            }
            // M17.5 26.5 m-3.5 0 a3.5 3.5 0 1 1 7 0 a3.5 3.5 0 1 1 -7 0
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 17.5 26.5
                moveTo(x = 17.5f, y = 26.5f)
                // m -3.5 0
                moveToRelative(dx = -3.5f, dy = 0.0f)
                // a 3.5 3.5 0 1 1 7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 3.5 3.5 0 1 1 -7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
            }
            // M17.5 26.5 m-2.5 0 a2.5 2.5 0 1 1 5 0 a2.5 2.5 0 1 1 -5 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.5 26.5
                moveTo(x = 17.5f, y = 26.5f)
                // m -2.5 0
                moveToRelative(dx = -2.5f, dy = 0.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 1 1 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
            }
            // M16 25 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 16 25
                moveTo(x = 16.0f, y = 25.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M15 3.5 v-1 a2.5 2.5 0 1 1 5 0 v1 a2.5 2.5 0 1 0 -5 0z M32.686 19.736 C31.848 18.074 29.783 17 27.425 17 c-3.018 0 -3.722 2.079 -6.425 2.195 0 -13.845 -0.267 -13.703 0.653 -14.043 C23.206 4.575 25 5.702 25 7.5 v-1 c0 -2.385 -3.037 -3.421 -4.489 -1.5 -0.661 0.876 -0.511 0.284 -0.511 14.145 -1.157 -0.178 -1.91 -0.715 -2.5 -1.109 -0.621 0.414 -1.316 0.927 -2.5 1.109 L15 7.5 c-0.067 -0.367 0.253 -1.489 -0.511 -2.5 C13.042 3.085 10 4.112 10 6.5 v1 c0 -1.799 1.794 -2.924 3.347 -2.348 0.923 0.342 0.653 0.21 0.653 14.043 C11.277 19.078 10.639 17 7.575 17 c-2.358 0 -4.423 1.074 -5.261 2.736 l0.91 0.459 c0.961 -1.911 4.422 -3.228 7.634 -1.011 1.954 1.35 4.663 1.373 6.642 0.054 1.979 1.319 4.688 1.295 6.642 -0.054 3.129 -2.159 6.644 -0.959 7.634 1.011 l0.91 -0.459z
            path(
                fill = SolidColor(Color(0xFFA8E0F9)),
            ) {
                // M 15 3.5
                moveTo(x = 15.0f, y = 3.5f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 2.5 2.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
                // M 32.686 19.736
                moveTo(x = 32.686f, y = 19.736f)
                // C 31.848 18.074 29.783 17 27.425 17
                curveTo(
                    x1 = 31.848f,
                    y1 = 18.074f,
                    x2 = 29.783f,
                    y2 = 17.0f,
                    x3 = 27.425f,
                    y3 = 17.0f,
                )
                // c -3.018 0 -3.722 2.079 -6.425 2.195
                curveToRelative(
                    dx1 = -3.018f,
                    dy1 = 0.0f,
                    dx2 = -3.722f,
                    dy2 = 2.079f,
                    dx3 = -6.425f,
                    dy3 = 2.195f,
                )
                // c 0 -13.845 -0.267 -13.703 0.653 -14.043
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -13.845f,
                    dx2 = -0.267f,
                    dy2 = -13.703f,
                    dx3 = 0.653f,
                    dy3 = -14.043f,
                )
                // C 23.206 4.575 25 5.702 25 7.5
                curveTo(
                    x1 = 23.206f,
                    y1 = 4.575f,
                    x2 = 25.0f,
                    y2 = 5.702f,
                    x3 = 25.0f,
                    y3 = 7.5f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // c 0 -2.385 -3.037 -3.421 -4.489 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.385f,
                    dx2 = -3.037f,
                    dy2 = -3.421f,
                    dx3 = -4.489f,
                    dy3 = -1.5f,
                )
                // c -0.661 0.876 -0.511 0.284 -0.511 14.145
                curveToRelative(
                    dx1 = -0.661f,
                    dy1 = 0.876f,
                    dx2 = -0.511f,
                    dy2 = 0.284f,
                    dx3 = -0.511f,
                    dy3 = 14.145f,
                )
                // c -1.157 -0.178 -1.91 -0.715 -2.5 -1.109
                curveToRelative(
                    dx1 = -1.157f,
                    dy1 = -0.178f,
                    dx2 = -1.91f,
                    dy2 = -0.715f,
                    dx3 = -2.5f,
                    dy3 = -1.109f,
                )
                // c -0.621 0.414 -1.316 0.927 -2.5 1.109
                curveToRelative(
                    dx1 = -0.621f,
                    dy1 = 0.414f,
                    dx2 = -1.316f,
                    dy2 = 0.927f,
                    dx3 = -2.5f,
                    dy3 = 1.109f,
                )
                // L 15 7.5
                lineTo(x = 15.0f, y = 7.5f)
                // c -0.067 -0.367 0.253 -1.489 -0.511 -2.5
                curveToRelative(
                    dx1 = -0.067f,
                    dy1 = -0.367f,
                    dx2 = 0.253f,
                    dy2 = -1.489f,
                    dx3 = -0.511f,
                    dy3 = -2.5f,
                )
                // C 13.042 3.085 10 4.112 10 6.5
                curveTo(
                    x1 = 13.042f,
                    y1 = 3.085f,
                    x2 = 10.0f,
                    y2 = 4.112f,
                    x3 = 10.0f,
                    y3 = 6.5f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 -1.799 1.794 -2.924 3.347 -2.348
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.799f,
                    dx2 = 1.794f,
                    dy2 = -2.924f,
                    dx3 = 3.347f,
                    dy3 = -2.348f,
                )
                // c 0.923 0.342 0.653 0.21 0.653 14.043
                curveToRelative(
                    dx1 = 0.923f,
                    dy1 = 0.342f,
                    dx2 = 0.653f,
                    dy2 = 0.21f,
                    dx3 = 0.653f,
                    dy3 = 14.043f,
                )
                // C 11.277 19.078 10.639 17 7.575 17
                curveTo(
                    x1 = 11.277f,
                    y1 = 19.078f,
                    x2 = 10.639f,
                    y2 = 17.0f,
                    x3 = 7.575f,
                    y3 = 17.0f,
                )
                // c -2.358 0 -4.423 1.074 -5.261 2.736
                curveToRelative(
                    dx1 = -2.358f,
                    dy1 = 0.0f,
                    dx2 = -4.423f,
                    dy2 = 1.074f,
                    dx3 = -5.261f,
                    dy3 = 2.736f,
                )
                // l 0.91 0.459
                lineToRelative(dx = 0.91f, dy = 0.459f)
                // c 0.961 -1.911 4.422 -3.228 7.634 -1.011
                curveToRelative(
                    dx1 = 0.961f,
                    dy1 = -1.911f,
                    dx2 = 4.422f,
                    dy2 = -3.228f,
                    dx3 = 7.634f,
                    dy3 = -1.011f,
                )
                // c 1.954 1.35 4.663 1.373 6.642 0.054
                curveToRelative(
                    dx1 = 1.954f,
                    dy1 = 1.35f,
                    dx2 = 4.663f,
                    dy2 = 1.373f,
                    dx3 = 6.642f,
                    dy3 = 0.054f,
                )
                // c 1.979 1.319 4.688 1.295 6.642 -0.054
                curveToRelative(
                    dx1 = 1.979f,
                    dy1 = 1.319f,
                    dx2 = 4.688f,
                    dy2 = 1.295f,
                    dx3 = 6.642f,
                    dy3 = -0.054f,
                )
                // c 3.129 -2.159 6.644 -0.959 7.634 1.011
                curveToRelative(
                    dx1 = 3.129f,
                    dy1 = -2.159f,
                    dx2 = 6.644f,
                    dy2 = -0.959f,
                    dx3 = 7.634f,
                    dy3 = 1.011f,
                )
                // l 0.91 -0.459z
                lineToRelative(dx = 0.91f, dy = -0.459f)
                close()
            }
        }.build().also { _emoji1faac = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1faac: ImageVector? = null
