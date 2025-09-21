package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2600: ImageVector
    get() {
        val current = _emoji2600
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2600",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M16 2 s0 -2 2 -2 2 2 2 2 v2 s0 2 -2 2 -2 -2 -2 -2 L16 2z M34 16 s2 0 2 2 -2 2 -2 2 h-2 s-2 0 -2 -2 2 -2 2 -2 h2z M4 16 s2 0 2 2 -2 2 -2 2 L2 20 s-2 0 -2 -2 2 -2 2 -2 h2z M9.121 7.293 s1.414 1.414 0 2.828 -2.828 0 -2.828 0 L4.878 8.708 s-1.414 -1.414 0 -2.829 c1.415 -1.414 2.829 0 2.829 0 l1.414 1.414z M30.121 28.293 s1.414 1.414 0 2.828 -2.828 0 -2.828 0 l-1.414 -1.414 s-1.414 -1.414 0 -2.828 2.828 0 2.828 0 l1.414 1.414z M29.708 10.121 s-1.414 1.414 -2.828 0 0 -2.828 0 -2.828 l1.414 -1.414 s1.414 -1.414 2.828 0 0 2.828 0 2.828 l-1.414 1.414z M8.708 31.121 s-1.414 1.414 -2.828 0 0 -2.828 0 -2.828 l1.414 -1.414 s1.414 -1.414 2.828 0 0 2.828 0 2.828 l-1.414 1.414z M16 32 s0 -2 2 -2 2 2 2 2 v2 s0 2 -2 2 -2 -2 -2 -2 v-2z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // L 16 2z
                lineTo(x = 16.0f, y = 2.0f)
                close()
                // M 34 16
                moveTo(x = 34.0f, y = 16.0f)
                // s 2 0 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s 2 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
                // s 2 0 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s -2 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // L 2 20
                lineTo(x = 2.0f, y = 20.0f)
                // s -2 0 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s 2 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 9.121 7.293
                moveTo(x = 9.121f, y = 7.293f)
                // s 1.414 1.414 0 2.828
                reflectiveCurveToRelative(
                    dx1 = 1.414f,
                    dy1 = 1.414f,
                    dx2 = 0.0f,
                    dy2 = 2.828f,
                )
                // s -2.828 0 -2.828 0
                reflectiveCurveToRelative(
                    dx1 = -2.828f,
                    dy1 = 0.0f,
                    dx2 = -2.828f,
                    dy2 = 0.0f,
                )
                // L 4.878 8.708
                lineTo(x = 4.878f, y = 8.708f)
                // s -1.414 -1.414 0 -2.829
                reflectiveCurveToRelative(
                    dx1 = -1.414f,
                    dy1 = -1.414f,
                    dx2 = 0.0f,
                    dy2 = -2.829f,
                )
                // c 1.415 -1.414 2.829 0 2.829 0
                curveToRelative(
                    dx1 = 1.415f,
                    dy1 = -1.414f,
                    dx2 = 2.829f,
                    dy2 = 0.0f,
                    dx3 = 2.829f,
                    dy3 = 0.0f,
                )
                // l 1.414 1.414z
                lineToRelative(dx = 1.414f, dy = 1.414f)
                close()
                // M 30.121 28.293
                moveTo(x = 30.121f, y = 28.293f)
                // s 1.414 1.414 0 2.828
                reflectiveCurveToRelative(
                    dx1 = 1.414f,
                    dy1 = 1.414f,
                    dx2 = 0.0f,
                    dy2 = 2.828f,
                )
                // s -2.828 0 -2.828 0
                reflectiveCurveToRelative(
                    dx1 = -2.828f,
                    dy1 = 0.0f,
                    dx2 = -2.828f,
                    dy2 = 0.0f,
                )
                // l -1.414 -1.414
                lineToRelative(dx = -1.414f, dy = -1.414f)
                // s -1.414 -1.414 0 -2.828
                reflectiveCurveToRelative(
                    dx1 = -1.414f,
                    dy1 = -1.414f,
                    dx2 = 0.0f,
                    dy2 = -2.828f,
                )
                // s 2.828 0 2.828 0
                reflectiveCurveToRelative(
                    dx1 = 2.828f,
                    dy1 = 0.0f,
                    dx2 = 2.828f,
                    dy2 = 0.0f,
                )
                // l 1.414 1.414z
                lineToRelative(dx = 1.414f, dy = 1.414f)
                close()
                // M 29.708 10.121
                moveTo(x = 29.708f, y = 10.121f)
                // s -1.414 1.414 -2.828 0
                reflectiveCurveToRelative(
                    dx1 = -1.414f,
                    dy1 = 1.414f,
                    dx2 = -2.828f,
                    dy2 = 0.0f,
                )
                // s 0 -2.828 0 -2.828
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.828f,
                    dx2 = 0.0f,
                    dy2 = -2.828f,
                )
                // l 1.414 -1.414
                lineToRelative(dx = 1.414f, dy = -1.414f)
                // s 1.414 -1.414 2.828 0
                reflectiveCurveToRelative(
                    dx1 = 1.414f,
                    dy1 = -1.414f,
                    dx2 = 2.828f,
                    dy2 = 0.0f,
                )
                // s 0 2.828 0 2.828
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.828f,
                    dx2 = 0.0f,
                    dy2 = 2.828f,
                )
                // l -1.414 1.414z
                lineToRelative(dx = -1.414f, dy = 1.414f)
                close()
                // M 8.708 31.121
                moveTo(x = 8.708f, y = 31.121f)
                // s -1.414 1.414 -2.828 0
                reflectiveCurveToRelative(
                    dx1 = -1.414f,
                    dy1 = 1.414f,
                    dx2 = -2.828f,
                    dy2 = 0.0f,
                )
                // s 0 -2.828 0 -2.828
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.828f,
                    dx2 = 0.0f,
                    dy2 = -2.828f,
                )
                // l 1.414 -1.414
                lineToRelative(dx = 1.414f, dy = -1.414f)
                // s 1.414 -1.414 2.828 0
                reflectiveCurveToRelative(
                    dx1 = 1.414f,
                    dy1 = -1.414f,
                    dx2 = 2.828f,
                    dy2 = 0.0f,
                )
                // s 0 2.828 0 2.828
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.828f,
                    dx2 = 0.0f,
                    dy2 = 2.828f,
                )
                // l -1.414 1.414z
                lineToRelative(dx = -1.414f, dy = 1.414f)
                close()
                // M 16 32
                moveTo(x = 16.0f, y = 32.0f)
                // s 0 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 2 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // s 0 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -2 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
            // M18 18 m-10 0 a10 10 0 1 1 20 0 a10 10 0 1 1 -20 0
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji2600 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2600: ImageVector? = null
