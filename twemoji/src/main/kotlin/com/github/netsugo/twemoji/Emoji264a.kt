package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji264a: ImageVector
    get() {
        val current = _emoji264a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji264a",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 28z
                verticalLineToRelative(dy = 28.0f)
                close()
            }
            // M28.999 30.5 c-0.157 0 -0.317 -0.024 -0.475 -0.077 -0.02 -0.006 -2.975 -0.923 -10.525 -0.923 s-10.505 0.917 -10.535 0.926 c-0.785 0.253 -1.631 -0.178 -1.887 -0.962 s0.165 -1.626 0.947 -1.887 c0.133 -0.044 3.325 -1.077 11.475 -1.077 8.149 0 11.343 1.033 11.475 1.077 0.786 0.262 1.21 1.111 0.948 1.897 -0.209 0.629 -0.795 1.026 -1.423 1.026z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 28.999 30.5
                moveTo(x = 28.999f, y = 30.5f)
                // c -0.157 0 -0.317 -0.024 -0.475 -0.077
                curveToRelative(
                    dx1 = -0.157f,
                    dy1 = 0.0f,
                    dx2 = -0.317f,
                    dy2 = -0.024f,
                    dx3 = -0.475f,
                    dy3 = -0.077f,
                )
                // c -0.02 -0.006 -2.975 -0.923 -10.525 -0.923
                curveToRelative(
                    dx1 = -0.02f,
                    dy1 = -0.006f,
                    dx2 = -2.975f,
                    dy2 = -0.923f,
                    dx3 = -10.525f,
                    dy3 = -0.923f,
                )
                // s -10.505 0.917 -10.535 0.926
                reflectiveCurveToRelative(
                    dx1 = -10.505f,
                    dy1 = 0.917f,
                    dx2 = -10.535f,
                    dy2 = 0.926f,
                )
                // c -0.785 0.253 -1.631 -0.178 -1.887 -0.962
                curveToRelative(
                    dx1 = -0.785f,
                    dy1 = 0.253f,
                    dx2 = -1.631f,
                    dy2 = -0.178f,
                    dx3 = -1.887f,
                    dy3 = -0.962f,
                )
                // s 0.165 -1.626 0.947 -1.887
                reflectiveCurveToRelative(
                    dx1 = 0.165f,
                    dy1 = -1.626f,
                    dx2 = 0.947f,
                    dy2 = -1.887f,
                )
                // c 0.133 -0.044 3.325 -1.077 11.475 -1.077
                curveToRelative(
                    dx1 = 0.133f,
                    dy1 = -0.044f,
                    dx2 = 3.325f,
                    dy2 = -1.077f,
                    dx3 = 11.475f,
                    dy3 = -1.077f,
                )
                // c 8.149 0 11.343 1.033 11.475 1.077
                curveToRelative(
                    dx1 = 8.149f,
                    dy1 = 0.0f,
                    dx2 = 11.343f,
                    dy2 = 1.033f,
                    dx3 = 11.475f,
                    dy3 = 1.077f,
                )
                // c 0.786 0.262 1.21 1.111 0.948 1.897
                curveToRelative(
                    dx1 = 0.786f,
                    dy1 = 0.262f,
                    dx2 = 1.21f,
                    dy2 = 1.111f,
                    dx3 = 0.948f,
                    dy3 = 1.897f,
                )
                // c -0.209 0.629 -0.795 1.026 -1.423 1.026z
                curveToRelative(
                    dx1 = -0.209f,
                    dy1 = 0.629f,
                    dx2 = -0.795f,
                    dy2 = 1.026f,
                    dx3 = -1.423f,
                    dy3 = 1.026f,
                )
                close()
            }
            // M12 8 h3 v20 h-3z M21 8 h3 v20 h-3z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M17.999 9.5 c-8.15 0 -11.342 -1.033 -11.474 -1.077 -0.786 -0.262 -1.211 -1.112 -0.949 -1.898 0.261 -0.783 1.104 -1.208 1.889 -0.951 0.046 0.014 3.006 0.926 10.534 0.926 7.551 0 10.506 -0.916 10.534 -0.926 0.785 -0.25 1.632 0.178 1.888 0.961 0.256 0.784 -0.165 1.626 -0.947 1.887 -0.132 0.044 -3.326 1.078 -11.475 1.078z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 17.999 9.5
                moveTo(x = 17.999f, y = 9.5f)
                // c -8.15 0 -11.342 -1.033 -11.474 -1.077
                curveToRelative(
                    dx1 = -8.15f,
                    dy1 = 0.0f,
                    dx2 = -11.342f,
                    dy2 = -1.033f,
                    dx3 = -11.474f,
                    dy3 = -1.077f,
                )
                // c -0.786 -0.262 -1.211 -1.112 -0.949 -1.898
                curveToRelative(
                    dx1 = -0.786f,
                    dy1 = -0.262f,
                    dx2 = -1.211f,
                    dy2 = -1.112f,
                    dx3 = -0.949f,
                    dy3 = -1.898f,
                )
                // c 0.261 -0.783 1.104 -1.208 1.889 -0.951
                curveToRelative(
                    dx1 = 0.261f,
                    dy1 = -0.783f,
                    dx2 = 1.104f,
                    dy2 = -1.208f,
                    dx3 = 1.889f,
                    dy3 = -0.951f,
                )
                // c 0.046 0.014 3.006 0.926 10.534 0.926
                curveToRelative(
                    dx1 = 0.046f,
                    dy1 = 0.014f,
                    dx2 = 3.006f,
                    dy2 = 0.926f,
                    dx3 = 10.534f,
                    dy3 = 0.926f,
                )
                // c 7.551 0 10.506 -0.916 10.534 -0.926
                curveToRelative(
                    dx1 = 7.551f,
                    dy1 = 0.0f,
                    dx2 = 10.506f,
                    dy2 = -0.916f,
                    dx3 = 10.534f,
                    dy3 = -0.926f,
                )
                // c 0.785 -0.25 1.632 0.178 1.888 0.961
                curveToRelative(
                    dx1 = 0.785f,
                    dy1 = -0.25f,
                    dx2 = 1.632f,
                    dy2 = 0.178f,
                    dx3 = 1.888f,
                    dy3 = 0.961f,
                )
                // c 0.256 0.784 -0.165 1.626 -0.947 1.887
                curveToRelative(
                    dx1 = 0.256f,
                    dy1 = 0.784f,
                    dx2 = -0.165f,
                    dy2 = 1.626f,
                    dx3 = -0.947f,
                    dy3 = 1.887f,
                )
                // c -0.132 0.044 -3.326 1.078 -11.475 1.078z
                curveToRelative(
                    dx1 = -0.132f,
                    dy1 = 0.044f,
                    dx2 = -3.326f,
                    dy2 = 1.078f,
                    dx3 = -11.475f,
                    dy3 = 1.078f,
                )
                close()
            }
        }.build().also { _emoji264a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji264a: ImageVector? = null
