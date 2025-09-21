package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f5b1: ImageVector
    get() {
        val current = _emoji1f5b1
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f5b1",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M20 2.047 V2 c0 -1.104 -0.896 -2 -2 -2 s-2 0.896 -2 2 v0.047 C7.737 2.422 6 5.127 6 7 v17 c0 6.627 5.373 12 12 12 s12 -5.373 12 -12 V7 c0 -1.873 -1.737 -4.578 -10 -4.953z
            path(
                fill = SolidColor(Color(0xFF99AAB5)),
            ) {
                // M 20 2.047
                moveTo(x = 20.0f, y = 2.047f)
                // V 2
                verticalLineTo(y = 2.0f)
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
                // v 0.047
                verticalLineToRelative(dy = 0.047f)
                // C 7.737 2.422 6 5.127 6 7
                curveTo(
                    x1 = 7.737f,
                    y1 = 2.422f,
                    x2 = 6.0f,
                    y2 = 5.127f,
                    x3 = 6.0f,
                    y3 = 7.0f,
                )
                // v 17
                verticalLineToRelative(dy = 17.0f)
                // c 0 6.627 5.373 12 12 12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.627f,
                    dx2 = 5.373f,
                    dy2 = 12.0f,
                    dx3 = 12.0f,
                    dy3 = 12.0f,
                )
                // s 12 -5.373 12 -12
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = -5.373f,
                    dx2 = 12.0f,
                    dy2 = -12.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // c 0 -1.873 -1.737 -4.578 -10 -4.953z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.873f,
                    dx2 = -1.737f,
                    dy2 = -4.578f,
                    dx3 = -10.0f,
                    dy3 = -4.953f,
                )
                close()
            }
            // M22 9.199 v-7 c-0.622 -0.066 -1.288 -0.116 -2 -0.151 V9 c0 1.104 -0.896 2 -2 2 s-2 -0.896 -2 -2 V2.048 c-0.712 0.034 -1.378 0.085 -2 0.151 v7 C7.459 9.89 6 12.29 6 14 v2 c0 -1.725 1.482 -4.153 8.169 -4.819 C14.646 12.228 16.171 13 18 13 c1.83 0 3.355 -0.772 3.831 -1.819 C28.518 11.847 30 14.275 30 16 v-2 c0 -1.71 -1.459 -4.11 -8 -4.801z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 22 9.199
                moveTo(x = 22.0f, y = 9.199f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // c -0.622 -0.066 -1.288 -0.116 -2 -0.151
                curveToRelative(
                    dx1 = -0.622f,
                    dy1 = -0.066f,
                    dx2 = -1.288f,
                    dy2 = -0.116f,
                    dx3 = -2.0f,
                    dy3 = -0.151f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
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
                // V 2.048
                verticalLineTo(y = 2.048f)
                // c -0.712 0.034 -1.378 0.085 -2 0.151
                curveToRelative(
                    dx1 = -0.712f,
                    dy1 = 0.034f,
                    dx2 = -1.378f,
                    dy2 = 0.085f,
                    dx3 = -2.0f,
                    dy3 = 0.151f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // C 7.459 9.89 6 12.29 6 14
                curveTo(
                    x1 = 7.459f,
                    y1 = 9.89f,
                    x2 = 6.0f,
                    y2 = 12.29f,
                    x3 = 6.0f,
                    y3 = 14.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 -1.725 1.482 -4.153 8.169 -4.819
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.725f,
                    dx2 = 1.482f,
                    dy2 = -4.153f,
                    dx3 = 8.169f,
                    dy3 = -4.819f,
                )
                // C 14.646 12.228 16.171 13 18 13
                curveTo(
                    x1 = 14.646f,
                    y1 = 12.228f,
                    x2 = 16.171f,
                    y2 = 13.0f,
                    x3 = 18.0f,
                    y3 = 13.0f,
                )
                // c 1.83 0 3.355 -0.772 3.831 -1.819
                curveToRelative(
                    dx1 = 1.83f,
                    dy1 = 0.0f,
                    dx2 = 3.355f,
                    dy2 = -0.772f,
                    dx3 = 3.831f,
                    dy3 = -1.819f,
                )
                // C 28.518 11.847 30 14.275 30 16
                curveTo(
                    x1 = 28.518f,
                    y1 = 11.847f,
                    x2 = 30.0f,
                    y2 = 14.275f,
                    x3 = 30.0f,
                    y3 = 16.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 0 -1.71 -1.459 -4.11 -8 -4.801z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.71f,
                    dx2 = -1.459f,
                    dy2 = -4.11f,
                    dx3 = -8.0f,
                    dy3 = -4.801f,
                )
                close()
            }
        }.build().also { _emoji1f5b1 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f5b1: ImageVector? = null
