package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f50f: ImageVector
    get() {
        val current = _emoji1f50f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f50f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M14 0 C8.477 0 4 4.477 4 10 v10 h4 V10 a6 6 0 0 1 6 -5.999 A6 6 0 0 1 20 10 v10 h4 V10 c0 -5.523 -4.477 -10 -10 -10Z
            path(
                fill = SolidColor(Color(0xFFAAB8C2)),
            ) {
                // M 14 0
                moveTo(x = 14.0f, y = 0.0f)
                // C 8.477 0 4 4.477 4 10
                curveTo(
                    x1 = 8.477f,
                    y1 = 0.0f,
                    x2 = 4.0f,
                    y2 = 4.477f,
                    x3 = 4.0f,
                    y3 = 10.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // a 6 6 0 0 1 6 -5.999
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = -5.999f,
                )
                // A 6 6 0 0 1 20 10
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 10.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // c 0 -5.523 -4.477 -10 -10 -10z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.523f,
                    dx2 = -4.477f,
                    dy2 = -10.0f,
                    dx3 = -10.0f,
                    dy3 = -10.0f,
                )
                close()
            }
            // M28 32 a4 4 0 0 1 -4 4 H4 a4 4 0 0 1 -4 -4 V18 a4 4 0 0 1 4 -4 h20 a4 4 0 0 1 4 4 v14Z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 28 32
                moveTo(x = 28.0f, y = 32.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
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
            // m32 21  l-16 -4 -11 7 h12.184 A2.99 2.99 0 0 1 20 22 a3 3 0 0 1 0 6 2.99 2.99 0 0 1 -2.816 -2 H5 l11 7 16 -4 -1 -4 1 -4Z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 32 21
                moveTo(x = 32.0f, y = 21.0f)
                // l -16 -4
                lineToRelative(dx = -16.0f, dy = -4.0f)
                // l -11 7
                lineToRelative(dx = -11.0f, dy = 7.0f)
                // h 12.184
                horizontalLineToRelative(dx = 12.184f)
                // A 2.99 2.99 0 0 1 20 22
                arcTo(
                    horizontalEllipseRadius = 2.99f,
                    verticalEllipseRadius = 2.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 22.0f,
                )
                // a 3 3 0 0 1 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // a 2.99 2.99 0 0 1 -2.816 -2
                arcToRelative(
                    a = 2.99f,
                    b = 2.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.816f,
                    dy1 = -2.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // l 11 7
                lineToRelative(dx = 11.0f, dy = 7.0f)
                // l 16 -4
                lineToRelative(dx = 16.0f, dy = -4.0f)
                // l -1 -4
                lineToRelative(dx = -1.0f, dy = -4.0f)
                // l 1 -4z
                lineToRelative(dx = 1.0f, dy = -4.0f)
                close()
            }
            // M36 17 h-3 c-0.55 0 -1.201 0.402 -1.447 0.894 l-3.105 6.211 c-0.246 0.492 -0.246 1.297 0 1.789 l3.105 6.211 c0.246 0.493 0.897 0.895 1.447 0.895 h3 V17Z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 36 17
                moveTo(x = 36.0f, y = 17.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -0.55 0 -1.201 0.402 -1.447 0.894
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.201f,
                    dy2 = 0.402f,
                    dx3 = -1.447f,
                    dy3 = 0.894f,
                )
                // l -3.105 6.211
                lineToRelative(dx = -3.105f, dy = 6.211f)
                // c -0.246 0.492 -0.246 1.297 0 1.789
                curveToRelative(
                    dx1 = -0.246f,
                    dy1 = 0.492f,
                    dx2 = -0.246f,
                    dy2 = 1.297f,
                    dx3 = 0.0f,
                    dy3 = 1.789f,
                )
                // l 3.105 6.211
                lineToRelative(dx = 3.105f, dy = 6.211f)
                // c 0.246 0.493 0.897 0.895 1.447 0.895
                curveToRelative(
                    dx1 = 0.246f,
                    dy1 = 0.493f,
                    dx2 = 0.897f,
                    dy2 = 0.895f,
                    dx3 = 1.447f,
                    dy3 = 0.895f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // V 17z
                verticalLineTo(y = 17.0f)
                close()
            }
        }.build().also { _emoji1f50f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f50f: ImageVector? = null
