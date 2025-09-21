package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26e9: ImageVector
    get() {
        val current = _emoji26e9
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26e9",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M9 9 c0 -1.104 -0.896 -2 -2 -2 s-2 0.896 -2 2 v24 c0 1.104 0.896 2 2 2 s2 -0.896 2 -2 L9 9z M31 9 c0 -1.104 -0.896 -2 -2 -2 s-2 0.896 -2 2 v24 c0 1.104 0.896 2 2 2 s2 -0.896 2 -2 L31 9z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s -2 0.896 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.896f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // s 2 -0.896 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.896f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // L 9 9z
                lineTo(x = 9.0f, y = 9.0f)
                close()
                // M 31 9
                moveTo(x = 31.0f, y = 9.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s -2 0.896 -2 2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.896f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // s 2 -0.896 2 -2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.896f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // L 31 9z
                lineTo(x = 31.0f, y = 9.0f)
                close()
            }
            // M36 16 c0 1.104 -0.896 2 -2 2 L2 18 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h32 c1.104 0 2 0.896 2 2z M35 7 c0 1.104 -0.781 1.719 -2 2 0 0 -3 1 -15 1 S3 9 3 9 c-1.266 -0.266 -2 -0.896 -2 -2 s0.896 -2 2 -2 h30 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 36 16
                moveTo(x = 36.0f, y = 16.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // L 2 18
                lineTo(x = 2.0f, y = 18.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // c 1.104 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
                // M 35 7
                moveTo(x = 35.0f, y = 7.0f)
                // c 0 1.104 -0.781 1.719 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.781f,
                    dy2 = 1.719f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // c 0 0 -3 1 -15 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = 1.0f,
                    dx3 = -15.0f,
                    dy3 = 1.0f,
                )
                // S 3 9 3 9
                reflectiveCurveTo(
                    x1 = 3.0f,
                    y1 = 9.0f,
                    x2 = 3.0f,
                    y2 = 9.0f,
                )
                // c -1.266 -0.266 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.266f,
                    dy1 = -0.266f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 30
                horizontalLineToRelative(dx = 30.0f)
                // c 1.104 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M35.906 4 c0 1.104 -0.659 1.797 -1.908 2 0 0 -4 1 -15.999 1 C6.001 7 2.002 6 2.002 6 0.831 5.812 0.109 5.114 0.109 4.01 0.109 2.905 -0.102 1 1.002 1 c0 0 3.999 2 16.997 2 s16.998 -2 16.998 -2 c1.105 0 0.909 1.895 0.909 3z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 35.906 4
                moveTo(x = 35.906f, y = 4.0f)
                // c 0 1.104 -0.659 1.797 -1.908 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.659f,
                    dy2 = 1.797f,
                    dx3 = -1.908f,
                    dy3 = 2.0f,
                )
                // c 0 0 -4 1 -15.999 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.0f,
                    dx3 = -15.999f,
                    dy3 = 1.0f,
                )
                // C 6.001 7 2.002 6 2.002 6
                curveTo(
                    x1 = 6.001f,
                    y1 = 7.0f,
                    x2 = 2.002f,
                    y2 = 6.0f,
                    x3 = 2.002f,
                    y3 = 6.0f,
                )
                // C 0.831 5.812 0.109 5.114 0.109 4.01
                curveTo(
                    x1 = 0.831f,
                    y1 = 5.812f,
                    x2 = 0.109f,
                    y2 = 5.114f,
                    x3 = 0.109f,
                    y3 = 4.01f,
                )
                // C 0.109 2.905 -0.102 1 1.002 1
                curveTo(
                    x1 = 0.109f,
                    y1 = 2.905f,
                    x2 = -0.102f,
                    y2 = 1.0f,
                    x3 = 1.002f,
                    y3 = 1.0f,
                )
                // c 0 0 3.999 2 16.997 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 3.999f,
                    dy2 = 2.0f,
                    dx3 = 16.997f,
                    dy3 = 2.0f,
                )
                // s 16.998 -2 16.998 -2
                reflectiveCurveToRelative(
                    dx1 = 16.998f,
                    dy1 = -2.0f,
                    dx2 = 16.998f,
                    dy2 = -2.0f,
                )
                // c 1.105 0 0.909 1.895 0.909 3z
                curveToRelative(
                    dx1 = 1.105f,
                    dy1 = 0.0f,
                    dx2 = 0.909f,
                    dy2 = 1.895f,
                    dx3 = 0.909f,
                    dy3 = 3.0f,
                )
                close()
            }
            // M20 15 c0 1.104 -0.896 2 -2 2 s-2 -0.896 -2 -2 V9 c0 -1.104 0.896 -2 2 -2 s2 0.896 2 2 v6z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 20 15
                moveTo(x = 20.0f, y = 15.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s -2 -0.896 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -0.896f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s 2 0.896 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.896f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
            }
            // M11 34 c0 1.104 -0.896 2 -2 2 L5 36 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h4 c1.104 0 2 0.896 2 2z M33 34 c0 1.104 -0.896 2 -2 2 h-4 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h4 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 11 34
                moveTo(x = 11.0f, y = 34.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // L 5 36
                lineTo(x = 5.0f, y = 36.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 1.104 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
                // M 33 34
                moveTo(x = 33.0f, y = 34.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.896 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.896f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 1.104 0 2 0.896 2 2z
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
        }.build().also { _emoji26e9 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26e9: ImageVector? = null
