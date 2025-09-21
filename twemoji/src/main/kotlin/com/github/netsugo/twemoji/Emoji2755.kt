package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2755: ImageVector
    get() {
        val current = _emoji2755
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2755",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 32 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 18 32
                moveTo(x = 18.0f, y = 32.0f)
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
            // M21 24 c0 1.657 -1.343 3 -3 3 s-3 -1.343 -3 -3 V5 c0 -1.657 1.343 -3 3 -3 s3 1.343 3 3 v19z
            path(
                fill = SolidColor(Color(0xFFCCD6DD)),
            ) {
                // M 21 24
                moveTo(x = 21.0f, y = 24.0f)
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
                // V 5
                verticalLineTo(y = 5.0f)
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
        }.build().also { _emoji2755 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2755: ImageVector? = null
