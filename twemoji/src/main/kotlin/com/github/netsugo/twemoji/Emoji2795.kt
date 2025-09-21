package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2795: ImageVector
    get() {
        val current = _emoji2795
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2795",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M31 15 H21 V5 c0 -1.657 -1.343 -3 -3 -3 s-3 1.343 -3 3 v10 H5 c-1.657 0 -3 1.343 -3 3 s1.343 3 3 3 h10 v10 c0 1.657 1.343 3 3 3 s3 -1.343 3 -3 V21 h10 c1.657 0 3 -1.343 3 -3 s-1.343 -3 -3 -3z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 31 15
                moveTo(x = 31.0f, y = 15.0f)
                // H 21
                horizontalLineTo(x = 21.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // c 0 -1.657 -1.343 -3 -3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.657f,
                    dx2 = -1.343f,
                    dy2 = -3.0f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // s -3 1.343 -3 3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 1.343f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // c -1.657 0 -3 1.343 -3 3
                curveToRelative(
                    dx1 = -1.657f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 1.343f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // s 1.343 3 3 3
                reflectiveCurveToRelative(
                    dx1 = 1.343f,
                    dy1 = 3.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 1.657 1.343 3 3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 1.343f,
                    dy2 = 3.0f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // s 3 -1.343 3 -3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = -1.343f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 1.657 0 3 -1.343 3 -3
                curveToRelative(
                    dx1 = 1.657f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -1.343f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // s -1.343 -3 -3 -3z
                reflectiveCurveToRelative(
                    dx1 = -1.343f,
                    dy1 = -3.0f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                )
                close()
            }
        }.build().also { _emoji2795 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2795: ImageVector? = null
