package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji262f: ImageVector
    get() {
        val current = _emoji262f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji262f",
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
            // M18.964 4.033 C11.251 3.501 4.566 9.322 4.033 17.036 s5.289 14.399 13.002 14.931 c7.714 0.533 14.399 -5.289 14.931 -13.002 0.533 -7.714 -5.288 -14.399 -13.002 -14.932z M17.781 30.016 c-3.317 -0.06 -5.958 -2.799 -5.897 -6.118 C11.943 20.583 14.683 17.94 18 18 c3.317 0.06 6.056 -2.581 6.118 -5.897 0.046 -2.558 -1.524 -4.748 -3.758 -5.657 l0.151 -0.171 c5.517 1.174 9.612 6.096 9.506 11.943 -0.122 6.639 -5.597 11.919 -12.236 11.798z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18.964 4.033
                moveTo(x = 18.964f, y = 4.033f)
                // C 11.251 3.501 4.566 9.322 4.033 17.036
                curveTo(
                    x1 = 11.251f,
                    y1 = 3.501f,
                    x2 = 4.566f,
                    y2 = 9.322f,
                    x3 = 4.033f,
                    y3 = 17.036f,
                )
                // s 5.289 14.399 13.002 14.931
                reflectiveCurveToRelative(
                    dx1 = 5.289f,
                    dy1 = 14.399f,
                    dx2 = 13.002f,
                    dy2 = 14.931f,
                )
                // c 7.714 0.533 14.399 -5.289 14.931 -13.002
                curveToRelative(
                    dx1 = 7.714f,
                    dy1 = 0.533f,
                    dx2 = 14.399f,
                    dy2 = -5.289f,
                    dx3 = 14.931f,
                    dy3 = -13.002f,
                )
                // c 0.533 -7.714 -5.288 -14.399 -13.002 -14.932z
                curveToRelative(
                    dx1 = 0.533f,
                    dy1 = -7.714f,
                    dx2 = -5.288f,
                    dy2 = -14.399f,
                    dx3 = -13.002f,
                    dy3 = -14.932f,
                )
                close()
                // M 17.781 30.016
                moveTo(x = 17.781f, y = 30.016f)
                // c -3.317 -0.06 -5.958 -2.799 -5.897 -6.118
                curveToRelative(
                    dx1 = -3.317f,
                    dy1 = -0.06f,
                    dx2 = -5.958f,
                    dy2 = -2.799f,
                    dx3 = -5.897f,
                    dy3 = -6.118f,
                )
                // C 11.943 20.583 14.683 17.94 18 18
                curveTo(
                    x1 = 11.943f,
                    y1 = 20.583f,
                    x2 = 14.683f,
                    y2 = 17.94f,
                    x3 = 18.0f,
                    y3 = 18.0f,
                )
                // c 3.317 0.06 6.056 -2.581 6.118 -5.897
                curveToRelative(
                    dx1 = 3.317f,
                    dy1 = 0.06f,
                    dx2 = 6.056f,
                    dy2 = -2.581f,
                    dx3 = 6.118f,
                    dy3 = -5.897f,
                )
                // c 0.046 -2.558 -1.524 -4.748 -3.758 -5.657
                curveToRelative(
                    dx1 = 0.046f,
                    dy1 = -2.558f,
                    dx2 = -1.524f,
                    dy2 = -4.748f,
                    dx3 = -3.758f,
                    dy3 = -5.657f,
                )
                // l 0.151 -0.171
                lineToRelative(dx = 0.151f, dy = -0.171f)
                // c 5.517 1.174 9.612 6.096 9.506 11.943
                curveToRelative(
                    dx1 = 5.517f,
                    dy1 = 1.174f,
                    dx2 = 9.612f,
                    dy2 = 6.096f,
                    dx3 = 9.506f,
                    dy3 = 11.943f,
                )
                // c -0.122 6.639 -5.597 11.919 -12.236 11.798z
                curveToRelative(
                    dx1 = -0.122f,
                    dy1 = 6.639f,
                    dx2 = -5.597f,
                    dy2 = 11.919f,
                    dx3 = -12.236f,
                    dy3 = 11.798f,
                )
                close()
            }
            // M18 24 m-2.5 0 a2.5 2.5 0 1 1 5 0 a2.5 2.5 0 1 1 -5 0
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 18 24
                moveTo(x = 18.0f, y = 24.0f)
                // m -2.5 0
                moveToRelative(dx = -2.5f, dy = 0.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 1 1 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
            }
            // M18 12 m-2.5 0 a2.5 2.5 0 1 1 5 0 a2.5 2.5 0 1 1 -5 0
            path(
                fill = SolidColor(Color(0xFF9266CC)),
            ) {
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // m -2.5 0
                moveToRelative(dx = -2.5f, dy = 0.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 1 1 -5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji262f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji262f: ImageVector? = null
