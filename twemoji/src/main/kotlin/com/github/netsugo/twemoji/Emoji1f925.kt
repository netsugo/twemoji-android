package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f925: ImageVector
    get() {
        val current = _emoji1f925
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f925",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M16 18 m-16 0 a16 16 0 1 1 32 0 a16 16 0 1 1 -32 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 16 18
                moveTo(x = 16.0f, y = 18.0f)
                // m -16 0
                moveToRelative(dx = -16.0f, dy = 0.0f)
                // a 16 16 0 1 1 32 0
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 32.0f,
                    dy1 = 0.0f,
                )
                // a 16 16 0 1 1 -32 0
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -32.0f,
                    dy1 = 0.0f,
                )
            }
            // M11.471 13.529 c0 1.706 -0.987 3.088 -2.206 3.088 -1.219 0 -2.206 -1.382 -2.206 -3.088 0 -1.705 0.987 -3.088 2.206 -3.088 1.218 0 2.206 1.383 2.206 3.088z M23 13.529 c0 1.706 -0.987 3.088 -2.206 3.088 -1.218 0 -2.206 -1.382 -2.206 -3.088 0 -1.705 0.988 -3.088 2.206 -3.088 1.219 0 2.206 1.383 2.206 3.088z M10.118 29.382 c1.765 -4.412 11.471 -4.412 11.471 -2.647 -0.001 0.883 -7.06 -0.882 -11.471 2.647z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 11.471 13.529
                moveTo(x = 11.471f, y = 13.529f)
                // c 0 1.706 -0.987 3.088 -2.206 3.088
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.706f,
                    dx2 = -0.987f,
                    dy2 = 3.088f,
                    dx3 = -2.206f,
                    dy3 = 3.088f,
                )
                // c -1.219 0 -2.206 -1.382 -2.206 -3.088
                curveToRelative(
                    dx1 = -1.219f,
                    dy1 = 0.0f,
                    dx2 = -2.206f,
                    dy2 = -1.382f,
                    dx3 = -2.206f,
                    dy3 = -3.088f,
                )
                // c 0 -1.705 0.987 -3.088 2.206 -3.088
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.705f,
                    dx2 = 0.987f,
                    dy2 = -3.088f,
                    dx3 = 2.206f,
                    dy3 = -3.088f,
                )
                // c 1.218 0 2.206 1.383 2.206 3.088z
                curveToRelative(
                    dx1 = 1.218f,
                    dy1 = 0.0f,
                    dx2 = 2.206f,
                    dy2 = 1.383f,
                    dx3 = 2.206f,
                    dy3 = 3.088f,
                )
                close()
                // M 23 13.529
                moveTo(x = 23.0f, y = 13.529f)
                // c 0 1.706 -0.987 3.088 -2.206 3.088
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.706f,
                    dx2 = -0.987f,
                    dy2 = 3.088f,
                    dx3 = -2.206f,
                    dy3 = 3.088f,
                )
                // c -1.218 0 -2.206 -1.382 -2.206 -3.088
                curveToRelative(
                    dx1 = -1.218f,
                    dy1 = 0.0f,
                    dx2 = -2.206f,
                    dy2 = -1.382f,
                    dx3 = -2.206f,
                    dy3 = -3.088f,
                )
                // c 0 -1.705 0.988 -3.088 2.206 -3.088
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.705f,
                    dx2 = 0.988f,
                    dy2 = -3.088f,
                    dx3 = 2.206f,
                    dy3 = -3.088f,
                )
                // c 1.219 0 2.206 1.383 2.206 3.088z
                curveToRelative(
                    dx1 = 1.219f,
                    dy1 = 0.0f,
                    dx2 = 2.206f,
                    dy2 = 1.383f,
                    dx3 = 2.206f,
                    dy3 = 3.088f,
                )
                close()
                // M 10.118 29.382
                moveTo(x = 10.118f, y = 29.382f)
                // c 1.765 -4.412 11.471 -4.412 11.471 -2.647
                curveToRelative(
                    dx1 = 1.765f,
                    dy1 = -4.412f,
                    dx2 = 11.471f,
                    dy2 = -4.412f,
                    dx3 = 11.471f,
                    dy3 = -2.647f,
                )
                // c -0.001 0.883 -7.06 -0.882 -11.471 2.647z
                curveToRelative(
                    dx1 = -0.001f,
                    dy1 = 0.883f,
                    dx2 = -7.06f,
                    dy2 = -0.882f,
                    dx3 = -11.471f,
                    dy3 = 2.647f,
                )
                close()
            }
            // M32.262 17.5 H17 c-1.511 0 -2.734 1.344 -2.734 3 0 1.657 1.224 3 2.734 3 h15.262 c1.513 0 2.738 -1.343 2.738 -3 0 -1.656 -1.226 -3 -2.738 -3z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 32.262 17.5
                moveTo(x = 32.262f, y = 17.5f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // c -1.511 0 -2.734 1.344 -2.734 3
                curveToRelative(
                    dx1 = -1.511f,
                    dy1 = 0.0f,
                    dx2 = -2.734f,
                    dy2 = 1.344f,
                    dx3 = -2.734f,
                    dy3 = 3.0f,
                )
                // c 0 1.657 1.224 3 2.734 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.657f,
                    dx2 = 1.224f,
                    dy2 = 3.0f,
                    dx3 = 2.734f,
                    dy3 = 3.0f,
                )
                // h 15.262
                horizontalLineToRelative(dx = 15.262f)
                // c 1.513 0 2.738 -1.343 2.738 -3
                curveToRelative(
                    dx1 = 1.513f,
                    dy1 = 0.0f,
                    dx2 = 2.738f,
                    dy2 = -1.343f,
                    dx3 = 2.738f,
                    dy3 = -3.0f,
                )
                // c 0 -1.656 -1.226 -3 -2.738 -3z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.656f,
                    dx2 = -1.226f,
                    dy2 = -3.0f,
                    dx3 = -2.738f,
                    dy3 = -3.0f,
                )
                close()
            }
        }.build().also { _emoji1f925 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f925: ImageVector? = null
