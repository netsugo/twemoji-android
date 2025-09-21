package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4c8: ImageVector
    get() {
        val current = _emoji1f4c8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4c8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 2 H5 C3.343 2 2 3.343 2 5 v26 c0 1.657 1.343 3 3 3 h26 c1.657 0 3 -1.343 3 -3 V5 c0 -1.657 -1.343 -3 -3 -3z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 31 2
                moveTo(x = 31.0f, y = 2.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // C 3.343 2 2 3.343 2 5
                curveTo(
                    x1 = 3.343f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 3.343f,
                    x3 = 2.0f,
                    y3 = 5.0f,
                )
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // c 0 1.657 1.343 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 1.343f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 1.657 0 3 -1.343 3 -3
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.343f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // c 0 -1.657 -1.343 -3 -3 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -1.343f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                close()
            }
            // M31 1 L5 1 C2.791 1 1 2.791 1 5 v26 c0 2.209 1.791 4 4 4 h26 c2.209 0 4 -1.791 4 -4 L35 5 c0 -2.209 -1.791 -4 -4 -4z M31 3 c1.103 0 2 0.897 2 2 v4 h-6 L27 3 h4z M27 19 h6 v6 h-6 v-6z M27 17 v-6 h6 v6 h-6z M25 3 v6 h-6 L19 3 h6z M19 11 h6 v6 h-6 v-6z M19 19 h6 v6 h-6 v-6z M17 3 v6 h-6 L11 3 h6z M11 11 h6 v6 h-6 v-6z M11 19 h6 v6 h-6 v-6z M3 5 c0 -1.103 0.897 -2 2 -2 h4 v6 L3 9 L3 5z M3 11 h6 v6 L3 17 v-6z M3 19 h6 v6 L3 25 v-6z M5 33 c-1.103 0 -2 -0.897 -2 -2 v-4 h6 v6 L5 33z M11 33 v-6 h6 v6 h-6z M19 33 v-6 h6 v6 h-6z M31 33 h-4 v-6 h6 v4 c0 1.103 -0.897 2 -2 2z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 31 1
                moveTo(x = 31.0f, y = 1.0f)
                // L 5 1
                lineTo(x = 5.0f, y = 1.0f)
                // C 2.791 1 1 2.791 1 5
                curveTo(
                    x1 = 2.791f,
                    y1 = 1.0f,
                    x2 = 1.0f,
                    y2 = 2.791f,
                    x3 = 1.0f,
                    y3 = 5.0f,
                )
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // L 35 5
                lineTo(x = 35.0f, y = 5.0f)
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
                // M 31 3
                moveTo(x = 31.0f, y = 3.0f)
                // c 1.103 0 2 0.897 2 2
                curveToRelative(
                    dx1 = 1.103f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.897f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // L 27 3
                lineTo(x = 27.0f, y = 3.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // M 27 19
                moveTo(x = 27.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 27 17
                moveTo(x = 27.0f, y = 17.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 25 3
                moveTo(x = 25.0f, y = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // L 19 3
                lineTo(x = 19.0f, y = 3.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // M 19 11
                moveTo(x = 19.0f, y = 11.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 19 19
                moveTo(x = 19.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 17 3
                moveTo(x = 17.0f, y = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // L 11 3
                lineTo(x = 11.0f, y = 3.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // M 11 11
                moveTo(x = 11.0f, y = 11.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 11 19
                moveTo(x = 11.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // c 0 -1.103 0.897 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.103f,
                    dx2 = 0.897f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // L 3 9
                lineTo(x = 3.0f, y = 9.0f)
                // L 3 5z
                lineTo(x = 3.0f, y = 5.0f)
                close()
                // M 3 11
                moveTo(x = 3.0f, y = 11.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // L 3 17
                lineTo(x = 3.0f, y = 17.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // L 3 25
                lineTo(x = 3.0f, y = 25.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 5 33
                moveTo(x = 5.0f, y = 33.0f)
                // c -1.103 0 -2 -0.897 -2 -2
                curveToRelative(
                    dx1 = -1.103f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.897f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // L 5 33z
                lineTo(x = 5.0f, y = 33.0f)
                close()
                // M 11 33
                moveTo(x = 11.0f, y = 33.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 19 33
                moveTo(x = 19.0f, y = 33.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // M 31 33
                moveTo(x = 31.0f, y = 33.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // c 0 1.103 -0.897 2 -2 2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.103f,
                    dx2 = -0.897f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M4.998 33 c-0.32 0 -0.645 -0.076 -0.946 -0.239 -0.973 -0.523 -1.336 -1.736 -0.813 -2.709 l7 -13 c0.299 -0.557 0.845 -0.939 1.47 -1.031 0.626 -0.092 1.258 0.118 1.705 0.565 l6.076 6.076 9.738 -18.59 c0.512 -0.978 1.721 -1.357 2.699 -0.843 0.979 0.512 1.356 1.721 0.844 2.7 l-11 21 c-0.295 0.564 -0.841 0.953 -1.47 1.05 -0.627 0.091 -1.266 -0.113 -1.716 -0.563 l-6.1 -6.099 -5.724 10.631 C6.4 32.619 5.71 33 4.998 33z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 4.998 33
                moveTo(x = 4.998f, y = 33.0f)
                // c -0.32 0 -0.645 -0.076 -0.946 -0.239
                curveToRelative(
                    dx1 = -0.32f,
                    dy1 = 0.0f,
                    dx2 = -0.645f,
                    dy2 = -0.076f,
                    dx3 = -0.946f,
                    dy3 = -0.239f,
                )
                // c -0.973 -0.523 -1.336 -1.736 -0.813 -2.709
                curveToRelative(
                    dx1 = -0.973f,
                    dy1 = -0.523f,
                    dx2 = -1.336f,
                    dy2 = -1.736f,
                    dx3 = -0.813f,
                    dy3 = -2.709f,
                )
                // l 7 -13
                lineToRelative(dx = 7.0f, dy = -13.0f)
                // c 0.299 -0.557 0.845 -0.939 1.47 -1.031
                curveToRelative(
                    dx1 = 0.299f,
                    dy1 = -0.557f,
                    dx2 = 0.845f,
                    dy2 = -0.939f,
                    dx3 = 1.47f,
                    dy3 = -1.031f,
                )
                // c 0.626 -0.092 1.258 0.118 1.705 0.565
                curveToRelative(
                    dx1 = 0.626f,
                    dy1 = -0.092f,
                    dx2 = 1.258f,
                    dy2 = 0.118f,
                    dx3 = 1.705f,
                    dy3 = 0.565f,
                )
                // l 6.076 6.076
                lineToRelative(dx = 6.076f, dy = 6.076f)
                // l 9.738 -18.59
                lineToRelative(dx = 9.738f, dy = -18.59f)
                // c 0.512 -0.978 1.721 -1.357 2.699 -0.843
                curveToRelative(
                    dx1 = 0.512f,
                    dy1 = -0.978f,
                    dx2 = 1.721f,
                    dy2 = -1.357f,
                    dx3 = 2.699f,
                    dy3 = -0.843f,
                )
                // c 0.979 0.512 1.356 1.721 0.844 2.7
                curveToRelative(
                    dx1 = 0.979f,
                    dy1 = 0.512f,
                    dx2 = 1.356f,
                    dy2 = 1.721f,
                    dx3 = 0.844f,
                    dy3 = 2.7f,
                )
                // l -11 21
                lineToRelative(dx = -11.0f, dy = 21.0f)
                // c -0.295 0.564 -0.841 0.953 -1.47 1.05
                curveToRelative(
                    dx1 = -0.295f,
                    dy1 = 0.564f,
                    dx2 = -0.841f,
                    dy2 = 0.953f,
                    dx3 = -1.47f,
                    dy3 = 1.05f,
                )
                // c -0.627 0.091 -1.266 -0.113 -1.716 -0.563
                curveToRelative(
                    dx1 = -0.627f,
                    dy1 = 0.091f,
                    dx2 = -1.266f,
                    dy2 = -0.113f,
                    dx3 = -1.716f,
                    dy3 = -0.563f,
                )
                // l -6.1 -6.099
                lineToRelative(dx = -6.1f, dy = -6.099f)
                // l -5.724 10.631
                lineToRelative(dx = -5.724f, dy = 10.631f)
                // C 6.4 32.619 5.71 33 4.998 33z
                curveTo(
                    x1 = 6.4f,
                    y1 = 32.619f,
                    x2 = 5.71f,
                    y2 = 33.0f,
                    x3 = 4.998f,
                    y3 = 33.0f,
                )
                close()
            }
        }.build().also { _emoji1f4c8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4c8: ImageVector? = null
