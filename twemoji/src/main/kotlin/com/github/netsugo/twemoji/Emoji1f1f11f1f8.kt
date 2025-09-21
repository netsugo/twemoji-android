package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1f11f1f8: ImageVector
    get() {
        val current = _emoji1f1f11f1f8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1f11f1f8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 27 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V9 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v18z
            path(
                fill = SolidColor(Color(0xFF009543)),
            ) {
                // M 36 27
                moveTo(x = 36.0f, y = 27.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
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
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
            // M0 13 h36 v10 H0z
            path(
                fill = SolidColor(Color(0xFFEEEEEE)),
            ) {
                // M 0 13
                moveTo(x = 0.0f, y = 13.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M32 5 H4 C1.791 5 0 6.791 0 9 v4 h36 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFF00209F)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 -1.791 -4 -4 -4z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = -1.791f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                close()
            }
            // M21.199 19.859 c-0.015 -0.047 -0.426 0.141 -0.426 0.141 l-1.846 -2.362 c0.226 -0.405 0.49 -1.073 0.49 -1.904 0 -1.241 -0.658 -1.567 -1.077 -1.654 v-0.055 c0 -0.172 -0.139 -0.311 -0.311 -0.311 h-0.059 c-0.172 0 -0.311 0.139 -0.311 0.311 v0.056 c-0.419 0.087 -1.076 0.413 -1.076 1.654 0 0.848 0.275 1.528 0.504 1.93 L15.328 20 s-0.359 -0.188 -0.375 -0.141 c-0.016 0.047 -0.75 1.219 -0.75 1.219 s1.562 1.02 3.797 1.02 c2 0 3.873 -1.02 3.873 -1.02 s-0.658 -1.172 -0.674 -1.219z M19.094 15.781 c0 0.554 -0.221 1.157 -0.424 1.529 l-0.352 -0.45 c0.004 -0.02 0.022 -0.033 0.022 -0.054 v-0.728 h0.488 l-0.488 -0.488 v-1.121 c0.494 0.174 0.754 0.719 0.754 1.312z M16.906 15.781 c0 -0.594 0.26 -1.138 0.753 -1.312 v1.121 l-0.488 0.488 h0.488 v0.728 c0 0.025 0.021 0.041 0.026 0.064 l-0.345 0.458 c-0.204 -0.37 -0.434 -0.982 -0.434 -1.547z
            path(
                fill = SolidColor(Color(0xFF292F33)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                // M 21.199 19.859
                moveTo(x = 21.199f, y = 19.859f)
                // c -0.015 -0.047 -0.426 0.141 -0.426 0.141
                curveToRelative(
                    dx1 = -0.015f,
                    dy1 = -0.047f,
                    dx2 = -0.426f,
                    dy2 = 0.141f,
                    dx3 = -0.426f,
                    dy3 = 0.141f,
                )
                // l -1.846 -2.362
                lineToRelative(dx = -1.846f, dy = -2.362f)
                // c 0.226 -0.405 0.49 -1.073 0.49 -1.904
                curveToRelative(
                    dx1 = 0.226f,
                    dy1 = -0.405f,
                    dx2 = 0.49f,
                    dy2 = -1.073f,
                    dx3 = 0.49f,
                    dy3 = -1.904f,
                )
                // c 0 -1.241 -0.658 -1.567 -1.077 -1.654
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.241f,
                    dx2 = -0.658f,
                    dy2 = -1.567f,
                    dx3 = -1.077f,
                    dy3 = -1.654f,
                )
                // v -0.055
                verticalLineToRelative(dy = -0.055f)
                // c 0 -0.172 -0.139 -0.311 -0.311 -0.311
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.172f,
                    dx2 = -0.139f,
                    dy2 = -0.311f,
                    dx3 = -0.311f,
                    dy3 = -0.311f,
                )
                // h -0.059
                horizontalLineToRelative(dx = -0.059f)
                // c -0.172 0 -0.311 0.139 -0.311 0.311
                curveToRelative(
                    dx1 = -0.172f,
                    dy1 = 0.0f,
                    dx2 = -0.311f,
                    dy2 = 0.139f,
                    dx3 = -0.311f,
                    dy3 = 0.311f,
                )
                // v 0.056
                verticalLineToRelative(dy = 0.056f)
                // c -0.419 0.087 -1.076 0.413 -1.076 1.654
                curveToRelative(
                    dx1 = -0.419f,
                    dy1 = 0.087f,
                    dx2 = -1.076f,
                    dy2 = 0.413f,
                    dx3 = -1.076f,
                    dy3 = 1.654f,
                )
                // c 0 0.848 0.275 1.528 0.504 1.93
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.848f,
                    dx2 = 0.275f,
                    dy2 = 1.528f,
                    dx3 = 0.504f,
                    dy3 = 1.93f,
                )
                // L 15.328 20
                lineTo(x = 15.328f, y = 20.0f)
                // s -0.359 -0.188 -0.375 -0.141
                reflectiveCurveToRelative(
                    dx1 = -0.359f,
                    dy1 = -0.188f,
                    dx2 = -0.375f,
                    dy2 = -0.141f,
                )
                // c -0.016 0.047 -0.75 1.219 -0.75 1.219
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = 0.047f,
                    dx2 = -0.75f,
                    dy2 = 1.219f,
                    dx3 = -0.75f,
                    dy3 = 1.219f,
                )
                // s 1.562 1.02 3.797 1.02
                reflectiveCurveToRelative(
                    dx1 = 1.562f,
                    dy1 = 1.02f,
                    dx2 = 3.797f,
                    dy2 = 1.02f,
                )
                // c 2 0 3.873 -1.02 3.873 -1.02
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 3.873f,
                    dy2 = -1.02f,
                    dx3 = 3.873f,
                    dy3 = -1.02f,
                )
                // s -0.658 -1.172 -0.674 -1.219z
                reflectiveCurveToRelative(
                    dx1 = -0.658f,
                    dy1 = -1.172f,
                    dx2 = -0.674f,
                    dy2 = -1.219f,
                )
                close()
                // M 19.094 15.781
                moveTo(x = 19.094f, y = 15.781f)
                // c 0 0.554 -0.221 1.157 -0.424 1.529
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.554f,
                    dx2 = -0.221f,
                    dy2 = 1.157f,
                    dx3 = -0.424f,
                    dy3 = 1.529f,
                )
                // l -0.352 -0.45
                lineToRelative(dx = -0.352f, dy = -0.45f)
                // c 0.004 -0.02 0.022 -0.033 0.022 -0.054
                curveToRelative(
                    dx1 = 0.004f,
                    dy1 = -0.02f,
                    dx2 = 0.022f,
                    dy2 = -0.033f,
                    dx3 = 0.022f,
                    dy3 = -0.054f,
                )
                // v -0.728
                verticalLineToRelative(dy = -0.728f)
                // h 0.488
                horizontalLineToRelative(dx = 0.488f)
                // l -0.488 -0.488
                lineToRelative(dx = -0.488f, dy = -0.488f)
                // v -1.121
                verticalLineToRelative(dy = -1.121f)
                // c 0.494 0.174 0.754 0.719 0.754 1.312z
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.174f,
                    dx2 = 0.754f,
                    dy2 = 0.719f,
                    dx3 = 0.754f,
                    dy3 = 1.312f,
                )
                close()
                // M 16.906 15.781
                moveTo(x = 16.906f, y = 15.781f)
                // c 0 -0.594 0.26 -1.138 0.753 -1.312
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.594f,
                    dx2 = 0.26f,
                    dy2 = -1.138f,
                    dx3 = 0.753f,
                    dy3 = -1.312f,
                )
                // v 1.121
                verticalLineToRelative(dy = 1.121f)
                // l -0.488 0.488
                lineToRelative(dx = -0.488f, dy = 0.488f)
                // h 0.488
                horizontalLineToRelative(dx = 0.488f)
                // v 0.728
                verticalLineToRelative(dy = 0.728f)
                // c 0 0.025 0.021 0.041 0.026 0.064
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.025f,
                    dx2 = 0.021f,
                    dy2 = 0.041f,
                    dx3 = 0.026f,
                    dy3 = 0.064f,
                )
                // l -0.345 0.458
                lineToRelative(dx = -0.345f, dy = 0.458f)
                // c -0.204 -0.37 -0.434 -0.982 -0.434 -1.547z
                curveToRelative(
                    dx1 = -0.204f,
                    dy1 = -0.37f,
                    dx2 = -0.434f,
                    dy2 = -0.982f,
                    dx3 = -0.434f,
                    dy3 = -1.547f,
                )
                close()
            }
            // M20.797 20.344 s-1.422 0.526 -2.797 0.526 -2.797 -0.526 -2.797 -0.526 l-0.344 0.649 s1.453 0.649 3.141 0.649 3.141 -0.649 3.141 -0.649 l-0.344 -0.649z
            path(
                fill = SolidColor(Color(0xFF53646D)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                // M 20.797 20.344
                moveTo(x = 20.797f, y = 20.344f)
                // s -1.422 0.526 -2.797 0.526
                reflectiveCurveToRelative(
                    dx1 = -1.422f,
                    dy1 = 0.526f,
                    dx2 = -2.797f,
                    dy2 = 0.526f,
                )
                // s -2.797 -0.526 -2.797 -0.526
                reflectiveCurveToRelative(
                    dx1 = -2.797f,
                    dy1 = -0.526f,
                    dx2 = -2.797f,
                    dy2 = -0.526f,
                )
                // l -0.344 0.649
                lineToRelative(dx = -0.344f, dy = 0.649f)
                // s 1.453 0.649 3.141 0.649
                reflectiveCurveToRelative(
                    dx1 = 1.453f,
                    dy1 = 0.649f,
                    dx2 = 3.141f,
                    dy2 = 0.649f,
                )
                // s 3.141 -0.649 3.141 -0.649
                reflectiveCurveToRelative(
                    dx1 = 3.141f,
                    dy1 = -0.649f,
                    dx2 = 3.141f,
                    dy2 = -0.649f,
                )
                // l -0.344 -0.649z
                lineToRelative(dx = -0.344f, dy = -0.649f)
                close()
            }
        }.build().also { _emoji1f1f11f1f8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1f11f1f8: ImageVector? = null
