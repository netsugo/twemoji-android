package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji203c: ImageVector
    get() {
        val current = _emoji203c
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji203c",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M11 31 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 11 31
                moveTo(x = 11.0f, y = 31.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M14 23 c0 1.657 -1.343 3 -3 3 s-3 -1.343 -3 -3 V4 c0 -1.657 1.343 -3 3 -3 s3 1.343 3 3 v19z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 14 23
                moveTo(x = 14.0f, y = 23.0f)
                // c 0 1.657 -1.343 3 -3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = -1.343f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // s -3 -1.343 -3 -3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.343f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -1.657 1.343 -3 3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = 1.343f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // s 3 1.343 3 3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.343f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // v 19z
                verticalLineToRelative(dy = 19.0f)
                close()
            }
            // M25 31 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 25 31
                moveTo(x = 25.0f, y = 31.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M28 23 c0 1.657 -1.344 3 -3 3 s-3 -1.343 -3 -3 V4 c0 -1.657 1.344 -3 3 -3 s3 1.343 3 3 v19z
            path(
                fill = SolidColor(Color(0xFFBE1931)),
            ) {
                // M 28 23
                moveTo(x = 28.0f, y = 23.0f)
                // c 0 1.657 -1.344 3 -3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = -1.344f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // s -3 -1.343 -3 -3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.343f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -1.657 1.344 -3 3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = 1.344f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // s 3 1.343 3 3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.343f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // v 19z
                verticalLineToRelative(dy = 19.0f)
                close()
            }
        }.build().also { _emoji203c = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji203c: ImageVector? = null
