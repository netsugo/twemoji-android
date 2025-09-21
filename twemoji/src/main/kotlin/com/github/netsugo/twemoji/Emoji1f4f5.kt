package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4f5: ImageVector
    get() {
        val current = _emoji1f4f5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4f5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 18 c0 -9.389 -7.611 -17 -17 -17 S1 8.611 1 18 s7.611 17 17 17 17 -7.611 17 -17z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 35 18
                moveTo(x = 35.0f, y = 18.0f)
                // c 0 -9.389 -7.611 -17 -17 -17
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -9.389f,
                    dx2 = -7.611f,
                    dy2 = -17.0f,
                    dx3 = -17.0f,
                    dy3 = -17.0f,
                )
                // S 1 8.611 1 18
                reflectiveCurveTo(
                    x1 = 1.0f,
                    y1 = 8.611f,
                    x2 = 1.0f,
                    y2 = 18.0f,
                )
                // s 7.611 17 17 17
                reflectiveCurveToRelative(
                    dx1 = 7.611f,
                    dy1 = 17.0f,
                    dx2 = 17.0f,
                    dy2 = 17.0f,
                )
                // s 17 -7.611 17 -17z
                reflectiveCurveToRelative(
                    dx1 = 17.0f,
                    dy1 = -7.611f,
                    dx2 = 17.0f,
                    dy2 = -17.0f,
                )
                close()
            }
            // M13 31 s-3 0 -3 -3 V8 s0 -3 3 -3 h10 s3 0 3 3 v20 s0 3 -3 3 H13z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 13 31
                moveTo(x = 13.0f, y = 31.0f)
                // s -3 0 -3 -3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // s 0 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // s 3 0 3 3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // s 0 3 -3 3
                reflectiveCurveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                // H 13z
                horizontalLineTo(x = 13.0f)
                close()
            }
            // M12 9 h12 v18 H12z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // H 12z
                horizontalLineTo(x = 12.0f)
                close()
            }
            // M18 0 C8.06 0 0 8.059 0 18 s8.059 18 18 18 18 -8.059 18 -18 S27.941 0 18 0z M18 34 C9.164 34 2 26.837 2 18 c0 -3.712 1.276 -7.121 3.397 -9.835 l22.437 22.437 C25.12 32.725 21.713 34 18 34z M29.68 28.912 L7.089 6.321 C9.948 3.648 13.777 2 18 2 c8.837 0 16 7.163 16 16 0 4.223 -1.648 8.053 -4.32 10.912z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 18 0
                moveTo(x = 18.0f, y = 0.0f)
                // C 8.06 0 0 8.059 0 18
                curveTo(
                    x1 = 8.06f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 8.059f,
                    x3 = 0.0f,
                    y3 = 18.0f,
                )
                // s 8.059 18 18 18
                reflectiveCurveToRelative(
                    dx1 = 8.059f,
                    dy1 = 18.0f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
                // s 18 -8.059 18 -18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = -8.059f,
                    dx2 = 18.0f,
                    dy2 = -18.0f,
                )
                // S 27.941 0 18 0z
                reflectiveCurveTo(
                    x1 = 27.941f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                close()
                // M 18 34
                moveTo(x = 18.0f, y = 34.0f)
                // C 9.164 34 2 26.837 2 18
                curveTo(
                    x1 = 9.164f,
                    y1 = 34.0f,
                    x2 = 2.0f,
                    y2 = 26.837f,
                    x3 = 2.0f,
                    y3 = 18.0f,
                )
                // c 0 -3.712 1.276 -7.121 3.397 -9.835
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.712f,
                    dx2 = 1.276f,
                    dy2 = -7.121f,
                    dx3 = 3.397f,
                    dy3 = -9.835f,
                )
                // l 22.437 22.437
                lineToRelative(dx = 22.437f, dy = 22.437f)
                // C 25.12 32.725 21.713 34 18 34z
                curveTo(
                    x1 = 25.12f,
                    y1 = 32.725f,
                    x2 = 21.713f,
                    y2 = 34.0f,
                    x3 = 18.0f,
                    y3 = 34.0f,
                )
                close()
                // M 29.68 28.912
                moveTo(x = 29.68f, y = 28.912f)
                // L 7.089 6.321
                lineTo(x = 7.089f, y = 6.321f)
                // C 9.948 3.648 13.777 2 18 2
                curveTo(
                    x1 = 9.948f,
                    y1 = 3.648f,
                    x2 = 13.777f,
                    y2 = 2.0f,
                    x3 = 18.0f,
                    y3 = 2.0f,
                )
                // c 8.837 0 16 7.163 16 16
                curveToRelative(
                    dx1 = 8.837f,
                    dy1 = 0.0f,
                    dx2 = 16.0f,
                    dy2 = 7.163f,
                    dx3 = 16.0f,
                    dy3 = 16.0f,
                )
                // c 0 4.223 -1.648 8.053 -4.32 10.912z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.223f,
                    dx2 = -1.648f,
                    dy2 = 8.053f,
                    dx3 = -4.32f,
                    dy3 = 10.912f,
                )
                close()
            }
        }.build().also { _emoji1f4f5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4f5: ImageVector? = null
