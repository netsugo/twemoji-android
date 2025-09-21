package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2697: ImageVector
    get() {
        val current = _emoji2697
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2697",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M16 34.375 c0 0.553 -0.448 1 -1 1 s-1 -0.447 -1 -1 V26 c0 -0.553 0.448 -1 1 -1 s1 0.447 1 1 v8.375z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 16 34.375
                moveTo(x = 16.0f, y = 34.375f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s -1 -0.447 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.447f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // V 26
                verticalLineTo(y = 26.0f)
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.447 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.447f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 8.375z
                verticalLineToRelative(dy = 8.375f)
                close()
            }
            // M15.41 15.625 m-13.873 0 a13.873 13.873 0 1 1 27.746 0 a13.873 13.873 0 1 1 -27.746 0
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 15.41 15.625
                moveTo(x = 15.41f, y = 15.625f)
                // m -13.873 0
                moveToRelative(dx = -13.873f, dy = 0.0f)
                // a 13.873 13.873 0 1 1 27.746 0
                arcToRelative(
                    a = 13.873f,
                    b = 13.873f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 27.746f,
                    dy1 = 0.0f,
                )
                // a 13.873 13.873 0 1 1 -27.746 0
                arcToRelative(
                    a = 13.873f,
                    b = 13.873f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -27.746f,
                    dy1 = 0.0f,
                )
            }
            // M3.592 16.139 c0.232 6.334 5.427 11.402 11.818 11.402 s11.586 -5.068 11.818 -11.402 H3.592z
            path(
                fill = SolidColor(Color(0xFF50A5E6)),
            ) {
                // M 3.592 16.139
                moveTo(x = 3.592f, y = 16.139f)
                // c 0.232 6.334 5.427 11.402 11.818 11.402
                curveToRelative(
                    dx1 = 0.232f,
                    dy1 = 6.334f,
                    dx2 = 5.427f,
                    dy2 = 11.402f,
                    dx3 = 11.818f,
                    dy3 = 11.402f,
                )
                // s 11.586 -5.068 11.818 -11.402
                reflectiveCurveToRelative(
                    dx1 = 11.586f,
                    dy1 = -5.068f,
                    dx2 = 11.818f,
                    dy2 = -11.402f,
                )
                // H 3.592z
                horizontalLineTo(x = 3.592f)
                close()
            }
            // M30 24 c0 1.104 -0.896 2 -2 2 H3 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h25 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 30 24
                moveTo(x = 30.0f, y = 24.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 25
                horizontalLineToRelative(dx = 25.0f)
                // c 1.104 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M2.622 35.207 c-0.186 0.521 -0.758 0.791 -1.278 0.605 -0.52 -0.186 -0.791 -0.758 -0.605 -1.278 l3.317 -9.262 c0.186 -0.52 0.758 -0.791 1.278 -0.605 0.52 0.186 0.792 0.758 0.605 1.278 l-3.317 9.262z M28.379 35.207 c0.185 0.521 0.758 0.791 1.277 0.605 0.52 -0.186 0.791 -0.758 0.605 -1.278 l-3.359 -9.345 c-0.185 -0.521 -0.758 -0.791 -1.277 -0.606 -0.52 0.186 -0.791 0.758 -0.605 1.278 l3.359 9.346z
            path(
                fill = SolidColor(Color(0xFF67757F)),
            ) {
                // M 2.622 35.207
                moveTo(x = 2.622f, y = 35.207f)
                // c -0.186 0.521 -0.758 0.791 -1.278 0.605
                curveToRelative(
                    dx1 = -0.186f,
                    dy1 = 0.521f,
                    dx2 = -0.758f,
                    dy2 = 0.791f,
                    dx3 = -1.278f,
                    dy3 = 0.605f,
                )
                // c -0.52 -0.186 -0.791 -0.758 -0.605 -1.278
                curveToRelative(
                    dx1 = -0.52f,
                    dy1 = -0.186f,
                    dx2 = -0.791f,
                    dy2 = -0.758f,
                    dx3 = -0.605f,
                    dy3 = -1.278f,
                )
                // l 3.317 -9.262
                lineToRelative(dx = 3.317f, dy = -9.262f)
                // c 0.186 -0.52 0.758 -0.791 1.278 -0.605
                curveToRelative(
                    dx1 = 0.186f,
                    dy1 = -0.52f,
                    dx2 = 0.758f,
                    dy2 = -0.791f,
                    dx3 = 1.278f,
                    dy3 = -0.605f,
                )
                // c 0.52 0.186 0.792 0.758 0.605 1.278
                curveToRelative(
                    dx1 = 0.52f,
                    dy1 = 0.186f,
                    dx2 = 0.792f,
                    dy2 = 0.758f,
                    dx3 = 0.605f,
                    dy3 = 1.278f,
                )
                // l -3.317 9.262z
                lineToRelative(dx = -3.317f, dy = 9.262f)
                close()
                // M 28.379 35.207
                moveTo(x = 28.379f, y = 35.207f)
                // c 0.185 0.521 0.758 0.791 1.277 0.605
                curveToRelative(
                    dx1 = 0.185f,
                    dy1 = 0.521f,
                    dx2 = 0.758f,
                    dy2 = 0.791f,
                    dx3 = 1.277f,
                    dy3 = 0.605f,
                )
                // c 0.52 -0.186 0.791 -0.758 0.605 -1.278
                curveToRelative(
                    dx1 = 0.52f,
                    dy1 = -0.186f,
                    dx2 = 0.791f,
                    dy2 = -0.758f,
                    dx3 = 0.605f,
                    dy3 = -1.278f,
                )
                // l -3.359 -9.345
                lineToRelative(dx = -3.359f, dy = -9.345f)
                // c -0.185 -0.521 -0.758 -0.791 -1.277 -0.606
                curveToRelative(
                    dx1 = -0.185f,
                    dy1 = -0.521f,
                    dx2 = -0.758f,
                    dy2 = -0.791f,
                    dx3 = -1.277f,
                    dy3 = -0.606f,
                )
                // c -0.52 0.186 -0.791 0.758 -0.605 1.278
                curveToRelative(
                    dx1 = -0.52f,
                    dy1 = 0.186f,
                    dx2 = -0.791f,
                    dy2 = 0.758f,
                    dx3 = -0.605f,
                    dy3 = 1.278f,
                )
                // l 3.359 9.346z
                lineToRelative(dx = 3.359f, dy = 9.346f)
                close()
            }
            // M19.006 2.266 S32.36 6.948 33.778 7.404 c3.725 1.199 2.184 5.224 -0.385 4.582 -5.083 -1.271 -14.387 -4.068 -15.415 -4.068 s1.028 -5.652 1.028 -5.652z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 19.006 2.266
                moveTo(x = 19.006f, y = 2.266f)
                // S 32.36 6.948 33.778 7.404
                reflectiveCurveTo(
                    x1 = 32.36f,
                    y1 = 6.948f,
                    x2 = 33.778f,
                    y2 = 7.404f,
                )
                // c 3.725 1.199 2.184 5.224 -0.385 4.582
                curveToRelative(
                    dx1 = 3.725f,
                    dy1 = 1.199f,
                    dx2 = 2.184f,
                    dy2 = 5.224f,
                    dx3 = -0.385f,
                    dy3 = 4.582f,
                )
                // c -5.083 -1.271 -14.387 -4.068 -15.415 -4.068
                curveToRelative(
                    dx1 = -5.083f,
                    dy1 = -1.271f,
                    dx2 = -14.387f,
                    dy2 = -4.068f,
                    dx3 = -15.415f,
                    dy3 = -4.068f,
                )
                // s 1.028 -5.652 1.028 -5.652z
                reflectiveCurveToRelative(
                    dx1 = 1.028f,
                    dy1 = -5.652f,
                    dx2 = 1.028f,
                    dy2 = -5.652f,
                )
                close()
            }
            // M29 23 c0 0.553 -0.447 1 -1 1 H3 c-0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 h25 c0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 29 23
                moveTo(x = 29.0f, y = 23.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 25
                horizontalLineToRelative(dx = 25.0f)
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M3.592 16.139 a11.818 1.629 0 1 0 23.636 0 a11.818 1.629 0 1 0 -23.636 0z
            path(
                fill = SolidColor(Color(0xFF3B94D9)),
            ) {
                // M 3.592 16.139
                moveTo(x = 3.592f, y = 16.139f)
                // a 11.818 1.629 0 1 0 23.636 0
                arcToRelative(
                    a = 11.818f,
                    b = 1.629f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 23.636f,
                    dy1 = 0.0f,
                )
                // a 11.818 1.629 0 1 0 -23.636 0z
                arcToRelative(
                    a = 11.818f,
                    b = 1.629f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -23.636f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M33.6866 11.2726 a1.341 0.974 105.635 1 0 0.7228 -2.5828 a1.341 0.974 105.635 1 0 -0.7228 2.5828z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 33.6866 11.2726
                moveTo(x = 33.6866f, y = 11.2726f)
                // a 1.341 0.974 105.635 1 0 0.7228 -2.5828
                arcToRelative(
                    a = 1.341f,
                    b = 0.974f,
                    theta = 105.635f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.7228f,
                    dy1 = -2.5828f,
                )
                // a 1.341 0.974 105.635 1 0 -0.7228 2.5828z
                arcToRelative(
                    a = 1.341f,
                    b = 0.974f,
                    theta = 105.635f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -0.7228f,
                    dy1 = 2.5828f,
                )
                close()
            }
        }.build().also { _emoji2697 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2697: ImageVector? = null
