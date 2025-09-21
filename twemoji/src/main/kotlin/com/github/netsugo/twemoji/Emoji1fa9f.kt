package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fa9f: ImageVector
    get() {
        val current = _emoji1fa9f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fa9f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M35 36 H1 c-0.55 0 -1 -0.45 -1 -1 V1 c0 -0.55 0.45 -1 1 -1 h34 c0.55 0 1 0.45 1 1 v34 c0 0.55 -0.45 1 -1 1z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 35 36
                moveTo(x = 35.0f, y = 36.0f)
                // H 1
                horizontalLineTo(x = 1.0f)
                // c -0.55 0 -1 -0.45 -1 -1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.45f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // V 1
                verticalLineTo(y = 1.0f)
                // c 0 -0.55 0.45 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.55f,
                    dx2 = 0.45f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // h 34
                horizontalLineToRelative(dx = 34.0f)
                // c 0.55 0 1 0.45 1 1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.45f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // v 34
                verticalLineToRelative(dy = 34.0f)
                // c 0 0.55 -0.45 1 -1 1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = -0.45f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M1 36 h34 c0.55 0 1 -0.45 1 -1 V1 c0 -0.275 -0.112 -0.525 -0.294 -0.706 L0.294 35.706 C0.475 35.888 0.725 36 1 36z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 1 36
                moveTo(x = 1.0f, y = 36.0f)
                // h 34
                horizontalLineToRelative(dx = 34.0f)
                // c 0.55 0 1 -0.45 1 -1
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.45f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // V 1
                verticalLineTo(y = 1.0f)
                // c 0 -0.275 -0.112 -0.525 -0.294 -0.706
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.275f,
                    dx2 = -0.112f,
                    dy2 = -0.525f,
                    dx3 = -0.294f,
                    dy3 = -0.706f,
                )
                // L 0.294 35.706
                lineTo(x = 0.294f, y = 35.706f)
                // C 0.475 35.888 0.725 36 1 36z
                curveTo(
                    x1 = 0.475f,
                    y1 = 35.888f,
                    x2 = 0.725f,
                    y2 = 36.0f,
                    x3 = 1.0f,
                    y3 = 36.0f,
                )
                close()
            }
            // M2 2 h32 v32 H2z
            path(
                fill = SolidColor(Color(0xFF8CCAF7)),
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
            }
            // M2 34 V2 h32z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 0.5f,
                strokeAlpha = 0.5f,
            ) {
                // M 2 34
                moveTo(x = 2.0f, y = 34.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 32z
                horizontalLineToRelative(dx = 32.0f)
                close()
            }
            // M17 2 h2 v32 h-2z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 17 2
                moveTo(x = 17.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M2 19 v-2 h32 v2z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
        }.build().also { _emoji1fa9f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fa9f: ImageVector? = null
