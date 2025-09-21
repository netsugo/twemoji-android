package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f513: ImageVector
    get() {
        val current = _emoji1f513
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f513",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 0 c-4.612 0 -8.483 3.126 -9.639 7.371 l3.855 1.052 A5.999 5.999 0 0 1 18 4 a6 6 0 0 1 6 6 v10 h4 V10 c0 -5.522 -4.477 -10 -10 -10Z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // c -4.612 0 -8.483 3.126 -9.639 7.371
                curveToRelative(
                    dx1 = -4.612f,
                    dy1 = 0.0f,
                    dx2 = -8.483f,
                    dy2 = 3.126f,
                    dx3 = -9.639f,
                    dy3 = 7.371f,
                )
                // l 3.855 1.052
                lineToRelative(dx = 3.855f, dy = 1.052f)
                // A 5.999 5.999 0 0 1 18 4
                arcTo(
                    horizontalEllipseRadius = 5.999f,
                    verticalEllipseRadius = 5.999f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 4.0f,
                )
                // a 6 6 0 0 1 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // c 0 -5.522 -4.477 -10 -10 -10z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.522f,
                    dx2 = -4.477f,
                    dy2 = -10.0f,
                    dx3 = -10.0f,
                    dy3 = -10.0f,
                )
                close()
            }
            // M32 32 a4 4 0 0 1 -4 4 H8 a4 4 0 0 1 -4 -4 V18 a4 4 0 0 1 4 -4 h20 a4 4 0 0 1 4 4 v14Z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // v 14z
                verticalLineToRelative(dy = 14.0f)
                close()
            }
        }.build().also { _emoji1f513 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f513: ImageVector? = null
