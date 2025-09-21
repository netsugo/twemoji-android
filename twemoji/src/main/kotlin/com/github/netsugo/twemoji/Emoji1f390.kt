package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f390: ImageVector
    get() {
        val current = _emoji1f390
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f390",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M17 36 c-1.32 0 -9.241 -0.826 -10.707 -2.293 -0.215 -0.216 -0.321 -0.518 -0.287 -0.82 0.035 -0.303 0.205 -0.573 0.464 -0.734 4.563 -2.853 6.825 -7.969 6.541 -14.796 -0.007 -0.162 -0.011 -0.282 -0.011 -0.357 0 -0.552 0.448 -1 1 -1 h9 c0.522 0 0.957 0.402 0.997 0.923 0.841 10.931 -2.468 15.783 -3.93 17.361 C19.043 35.391 17.954 36 17 36z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 17 36
                moveTo(x = 17.0f, y = 36.0f)
                // c -1.32 0 -9.241 -0.826 -10.707 -2.293
                curveToRelative(
                    dx1 = -1.32f,
                    dy1 = 0.0f,
                    dx2 = -9.241f,
                    dy2 = -0.826f,
                    dx3 = -10.707f,
                    dy3 = -2.293f,
                )
                // c -0.215 -0.216 -0.321 -0.518 -0.287 -0.82
                curveToRelative(
                    dx1 = -0.215f,
                    dy1 = -0.216f,
                    dx2 = -0.321f,
                    dy2 = -0.518f,
                    dx3 = -0.287f,
                    dy3 = -0.82f,
                )
                // c 0.035 -0.303 0.205 -0.573 0.464 -0.734
                curveToRelative(
                    dx1 = 0.035f,
                    dy1 = -0.303f,
                    dx2 = 0.205f,
                    dy2 = -0.573f,
                    dx3 = 0.464f,
                    dy3 = -0.734f,
                )
                // c 4.563 -2.853 6.825 -7.969 6.541 -14.796
                curveToRelative(
                    dx1 = 4.563f,
                    dy1 = -2.853f,
                    dx2 = 6.825f,
                    dy2 = -7.969f,
                    dx3 = 6.541f,
                    dy3 = -14.796f,
                )
                // c -0.007 -0.162 -0.011 -0.282 -0.011 -0.357
                curveToRelative(
                    dx1 = -0.007f,
                    dy1 = -0.162f,
                    dx2 = -0.011f,
                    dy2 = -0.282f,
                    dx3 = -0.011f,
                    dy3 = -0.357f,
                )
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // c 0.522 0 0.957 0.402 0.997 0.923
                curveToRelative(
                    dx1 = 0.522f,
                    dy1 = 0.0f,
                    dx2 = 0.957f,
                    dy2 = 0.402f,
                    dx3 = 0.997f,
                    dy3 = 0.923f,
                )
                // c 0.841 10.931 -2.468 15.783 -3.93 17.361
                curveToRelative(
                    dx1 = 0.841f,
                    dy1 = 10.931f,
                    dx2 = -2.468f,
                    dy2 = 15.783f,
                    dx3 = -3.93f,
                    dy3 = 17.361f,
                )
                // C 19.043 35.391 17.954 36 17 36z
                curveTo(
                    x1 = 19.043f,
                    y1 = 35.391f,
                    x2 = 17.954f,
                    y2 = 36.0f,
                    x3 = 17.0f,
                    y3 = 36.0f,
                )
                close()
            }
            // M18 18 c-0.552 0 -1 -0.448 -1 -1 v-3 c0 -0.552 0.448 -1 1 -1 s1 0.448 1 1 v3 c0 0.552 -0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.448 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.448f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M26 10 c0 4.418 -3.582 5 -8 5 s-8 -0.582 -8 -5 3.582 -8 8 -8 8 3.582 8 8z
            path(
                fill = SolidColor(Color(0xFF77B255)),
            ) {
                // M 26 10
                moveTo(x = 26.0f, y = 10.0f)
                // c 0 4.418 -3.582 5 -8 5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.418f,
                    dx2 = -3.582f,
                    dy2 = 5.0f,
                    dx3 = -8.0f,
                    dy3 = 5.0f,
                )
                // s -8 -0.582 -8 -5
                reflectiveCurveToRelative(
                    dx1 = -8.0f,
                    dy1 = -0.582f,
                    dx2 = -8.0f,
                    dy2 = -5.0f,
                )
                // s 3.582 -8 8 -8
                reflectiveCurveToRelative(
                    dx1 = 3.582f,
                    dy1 = -8.0f,
                    dx2 = 8.0f,
                    dy2 = -8.0f,
                )
                // s 8 3.582 8 8z
                reflectiveCurveToRelative(
                    dx1 = 8.0f,
                    dy1 = 3.582f,
                    dx2 = 8.0f,
                    dy2 = 8.0f,
                )
                close()
            }
            // M18 4 c-0.552 0 -1 -0.448 -1 -1 V1 c0 -0.552 0.448 -1 1 -1 s1 0.448 1 1 v2 c0 0.552 -0.448 1 -1 1z
            path(
                fill = SolidColor(Color(0xFF3E721D)),
            ) {
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 1
                verticalLineTo(y = 1.0f)
                // c 0 -0.552 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.552f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.448 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.448f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 0.552 -0.448 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M18 21 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 21
                moveTo(x = 18.0f, y = 21.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M17 27 m-2 0 a2 2 0 1 1 4 0 a2 2 0 1 1 -4 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 17 27
                moveTo(x = 17.0f, y = 27.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
            }
            // M12 32.5 a2 1.5 0 1 0 4 0 a2 1.5 0 1 0 -4 0z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 12 32.5
                moveTo(x = 12.0f, y = 32.5f)
                // a 2 1.5 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 1.5 0 1 0 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _emoji1f390 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f390: ImageVector? = null
