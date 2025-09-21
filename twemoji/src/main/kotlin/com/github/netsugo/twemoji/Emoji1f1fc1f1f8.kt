package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1fc1f1f8: ImageVector
    get() {
        val current = _emoji1f1fc1f1f8
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1fc1f1f8",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M32 5 H19 v13 H0 v9 c0 2.209 1.791 4 4 4 h28 c2.209 0 4 -1.791 4 -4 V9 c0 -2.209 -1.791 -4 -4 -4z
            path(
                fill = SolidColor(Color(0xFFCE1126)),
            ) {
                // M 32 5
                moveTo(x = 32.0f, y = 5.0f)
                // H 19
                horizontalLineTo(x = 19.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // c 0 2.209 1.791 4 4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = 1.791f,
                    dy2 = 4.0f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 -1.791 4 -4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.791f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
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
            // M19 5 L4 5 C1.791 5 0 6.791 0 9 v9 h19 L19 5z M9.076 6.591 l0.341 -1.049 0.341 1.049 h1.103 l-0.893 0.649 0.341 1.049 -0.892 -0.648 -0.893 0.648 0.341 -1.049 -0.893 -0.649 h1.104z M6.337 11.539 l-0.893 -0.649 -0.893 0.649 0.341 -1.049 L4 9.841 h1.103 l0.341 -1.049 0.341 1.049 h1.103 l-0.892 0.649 0.341 1.049z M10.533 17.458 l-1.116 -0.811 -1.116 0.811 0.426 -1.312 -1.116 -0.811 L8.99 15.335 l0.426 -1.312 0.426 1.312 h1.379 l-1.116 0.811 0.428 1.312z M11.961 13.306 l-0.558 -0.406 -0.558 0.405 0.213 -0.656 -0.558 -0.405 h0.69 l0.213 -0.656 0.213 0.656 h0.69 l-0.558 0.405 0.213 0.657z M14.316 10.826 l-0.837 -0.608 -0.837 0.608 0.32 -0.984 -0.837 -0.608 h1.034 l0.32 -0.984 0.32 0.984 h1.034 l-0.837 0.608 0.32 0.984z
            path(
                fill = SolidColor(Color(0xFF002B7F)),
            ) {
                // M 19 5
                moveTo(x = 19.0f, y = 5.0f)
                // L 4 5
                lineTo(x = 4.0f, y = 5.0f)
                // C 1.791 5 0 6.791 0 9
                curveTo(
                    x1 = 1.791f,
                    y1 = 5.0f,
                    x2 = 0.0f,
                    y2 = 6.791f,
                    x3 = 0.0f,
                    y3 = 9.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 19
                horizontalLineToRelative(dx = 19.0f)
                // L 19 5z
                lineTo(x = 19.0f, y = 5.0f)
                close()
                // M 9.076 6.591
                moveTo(x = 9.076f, y = 6.591f)
                // l 0.341 -1.049
                lineToRelative(dx = 0.341f, dy = -1.049f)
                // l 0.341 1.049
                lineToRelative(dx = 0.341f, dy = 1.049f)
                // h 1.103
                horizontalLineToRelative(dx = 1.103f)
                // l -0.893 0.649
                lineToRelative(dx = -0.893f, dy = 0.649f)
                // l 0.341 1.049
                lineToRelative(dx = 0.341f, dy = 1.049f)
                // l -0.892 -0.648
                lineToRelative(dx = -0.892f, dy = -0.648f)
                // l -0.893 0.648
                lineToRelative(dx = -0.893f, dy = 0.648f)
                // l 0.341 -1.049
                lineToRelative(dx = 0.341f, dy = -1.049f)
                // l -0.893 -0.649
                lineToRelative(dx = -0.893f, dy = -0.649f)
                // h 1.104z
                horizontalLineToRelative(dx = 1.104f)
                close()
                // M 6.337 11.539
                moveTo(x = 6.337f, y = 11.539f)
                // l -0.893 -0.649
                lineToRelative(dx = -0.893f, dy = -0.649f)
                // l -0.893 0.649
                lineToRelative(dx = -0.893f, dy = 0.649f)
                // l 0.341 -1.049
                lineToRelative(dx = 0.341f, dy = -1.049f)
                // L 4 9.841
                lineTo(x = 4.0f, y = 9.841f)
                // h 1.103
                horizontalLineToRelative(dx = 1.103f)
                // l 0.341 -1.049
                lineToRelative(dx = 0.341f, dy = -1.049f)
                // l 0.341 1.049
                lineToRelative(dx = 0.341f, dy = 1.049f)
                // h 1.103
                horizontalLineToRelative(dx = 1.103f)
                // l -0.892 0.649
                lineToRelative(dx = -0.892f, dy = 0.649f)
                // l 0.341 1.049z
                lineToRelative(dx = 0.341f, dy = 1.049f)
                close()
                // M 10.533 17.458
                moveTo(x = 10.533f, y = 17.458f)
                // l -1.116 -0.811
                lineToRelative(dx = -1.116f, dy = -0.811f)
                // l -1.116 0.811
                lineToRelative(dx = -1.116f, dy = 0.811f)
                // l 0.426 -1.312
                lineToRelative(dx = 0.426f, dy = -1.312f)
                // l -1.116 -0.811
                lineToRelative(dx = -1.116f, dy = -0.811f)
                // L 8.99 15.335
                lineTo(x = 8.99f, y = 15.335f)
                // l 0.426 -1.312
                lineToRelative(dx = 0.426f, dy = -1.312f)
                // l 0.426 1.312
                lineToRelative(dx = 0.426f, dy = 1.312f)
                // h 1.379
                horizontalLineToRelative(dx = 1.379f)
                // l -1.116 0.811
                lineToRelative(dx = -1.116f, dy = 0.811f)
                // l 0.428 1.312z
                lineToRelative(dx = 0.428f, dy = 1.312f)
                close()
                // M 11.961 13.306
                moveTo(x = 11.961f, y = 13.306f)
                // l -0.558 -0.406
                lineToRelative(dx = -0.558f, dy = -0.406f)
                // l -0.558 0.405
                lineToRelative(dx = -0.558f, dy = 0.405f)
                // l 0.213 -0.656
                lineToRelative(dx = 0.213f, dy = -0.656f)
                // l -0.558 -0.405
                lineToRelative(dx = -0.558f, dy = -0.405f)
                // h 0.69
                horizontalLineToRelative(dx = 0.69f)
                // l 0.213 -0.656
                lineToRelative(dx = 0.213f, dy = -0.656f)
                // l 0.213 0.656
                lineToRelative(dx = 0.213f, dy = 0.656f)
                // h 0.69
                horizontalLineToRelative(dx = 0.69f)
                // l -0.558 0.405
                lineToRelative(dx = -0.558f, dy = 0.405f)
                // l 0.213 0.657z
                lineToRelative(dx = 0.213f, dy = 0.657f)
                close()
                // M 14.316 10.826
                moveTo(x = 14.316f, y = 10.826f)
                // l -0.837 -0.608
                lineToRelative(dx = -0.837f, dy = -0.608f)
                // l -0.837 0.608
                lineToRelative(dx = -0.837f, dy = 0.608f)
                // l 0.32 -0.984
                lineToRelative(dx = 0.32f, dy = -0.984f)
                // l -0.837 -0.608
                lineToRelative(dx = -0.837f, dy = -0.608f)
                // h 1.034
                horizontalLineToRelative(dx = 1.034f)
                // l 0.32 -0.984
                lineToRelative(dx = 0.32f, dy = -0.984f)
                // l 0.32 0.984
                lineToRelative(dx = 0.32f, dy = 0.984f)
                // h 1.034
                horizontalLineToRelative(dx = 1.034f)
                // l -0.837 0.608
                lineToRelative(dx = -0.837f, dy = 0.608f)
                // l 0.32 0.984z
                lineToRelative(dx = 0.32f, dy = 0.984f)
                close()
            }
            // M8.524 8.289 l0.893 -0.648 0.892 0.648 -0.341 -1.049 0.893 -0.649 L9.758 6.591 l-0.341 -1.049 -0.341 1.049 L7.972 6.591 l0.893 0.649z M5.785 9.841 l-0.341 -1.049 -0.341 1.049 L4 9.841 l0.893 0.649 -0.341 1.049 0.892 -0.648 0.893 0.648 -0.341 -1.049 0.893 -0.649z M13.799 9.234 l-0.32 -0.984 -0.32 0.984 h-1.034 l0.837 0.608 -0.32 0.984 0.837 -0.608 0.837 0.608 -0.32 -0.984 0.837 -0.608z M11.616 12.244 l-0.213 -0.656 -0.213 0.656 h-0.69 l0.558 0.406 -0.213 0.656 0.558 -0.406 0.558 0.406 -0.213 -0.656 0.558 -0.406z M9.843 15.336 l-0.426 -1.312 -0.427 1.312 L7.611 15.336 l1.116 0.81 -0.426 1.312 1.116 -0.81 1.116 0.81 -0.427 -1.312 1.116 -0.81z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 8.524 8.289
                moveTo(x = 8.524f, y = 8.289f)
                // l 0.893 -0.648
                lineToRelative(dx = 0.893f, dy = -0.648f)
                // l 0.892 0.648
                lineToRelative(dx = 0.892f, dy = 0.648f)
                // l -0.341 -1.049
                lineToRelative(dx = -0.341f, dy = -1.049f)
                // l 0.893 -0.649
                lineToRelative(dx = 0.893f, dy = -0.649f)
                // L 9.758 6.591
                lineTo(x = 9.758f, y = 6.591f)
                // l -0.341 -1.049
                lineToRelative(dx = -0.341f, dy = -1.049f)
                // l -0.341 1.049
                lineToRelative(dx = -0.341f, dy = 1.049f)
                // L 7.972 6.591
                lineTo(x = 7.972f, y = 6.591f)
                // l 0.893 0.649z
                lineToRelative(dx = 0.893f, dy = 0.649f)
                close()
                // M 5.785 9.841
                moveTo(x = 5.785f, y = 9.841f)
                // l -0.341 -1.049
                lineToRelative(dx = -0.341f, dy = -1.049f)
                // l -0.341 1.049
                lineToRelative(dx = -0.341f, dy = 1.049f)
                // L 4 9.841
                lineTo(x = 4.0f, y = 9.841f)
                // l 0.893 0.649
                lineToRelative(dx = 0.893f, dy = 0.649f)
                // l -0.341 1.049
                lineToRelative(dx = -0.341f, dy = 1.049f)
                // l 0.892 -0.648
                lineToRelative(dx = 0.892f, dy = -0.648f)
                // l 0.893 0.648
                lineToRelative(dx = 0.893f, dy = 0.648f)
                // l -0.341 -1.049
                lineToRelative(dx = -0.341f, dy = -1.049f)
                // l 0.893 -0.649z
                lineToRelative(dx = 0.893f, dy = -0.649f)
                close()
                // M 13.799 9.234
                moveTo(x = 13.799f, y = 9.234f)
                // l -0.32 -0.984
                lineToRelative(dx = -0.32f, dy = -0.984f)
                // l -0.32 0.984
                lineToRelative(dx = -0.32f, dy = 0.984f)
                // h -1.034
                horizontalLineToRelative(dx = -1.034f)
                // l 0.837 0.608
                lineToRelative(dx = 0.837f, dy = 0.608f)
                // l -0.32 0.984
                lineToRelative(dx = -0.32f, dy = 0.984f)
                // l 0.837 -0.608
                lineToRelative(dx = 0.837f, dy = -0.608f)
                // l 0.837 0.608
                lineToRelative(dx = 0.837f, dy = 0.608f)
                // l -0.32 -0.984
                lineToRelative(dx = -0.32f, dy = -0.984f)
                // l 0.837 -0.608z
                lineToRelative(dx = 0.837f, dy = -0.608f)
                close()
                // M 11.616 12.244
                moveTo(x = 11.616f, y = 12.244f)
                // l -0.213 -0.656
                lineToRelative(dx = -0.213f, dy = -0.656f)
                // l -0.213 0.656
                lineToRelative(dx = -0.213f, dy = 0.656f)
                // h -0.69
                horizontalLineToRelative(dx = -0.69f)
                // l 0.558 0.406
                lineToRelative(dx = 0.558f, dy = 0.406f)
                // l -0.213 0.656
                lineToRelative(dx = -0.213f, dy = 0.656f)
                // l 0.558 -0.406
                lineToRelative(dx = 0.558f, dy = -0.406f)
                // l 0.558 0.406
                lineToRelative(dx = 0.558f, dy = 0.406f)
                // l -0.213 -0.656
                lineToRelative(dx = -0.213f, dy = -0.656f)
                // l 0.558 -0.406z
                lineToRelative(dx = 0.558f, dy = -0.406f)
                close()
                // M 9.843 15.336
                moveTo(x = 9.843f, y = 15.336f)
                // l -0.426 -1.312
                lineToRelative(dx = -0.426f, dy = -1.312f)
                // l -0.427 1.312
                lineToRelative(dx = -0.427f, dy = 1.312f)
                // L 7.611 15.336
                lineTo(x = 7.611f, y = 15.336f)
                // l 1.116 0.81
                lineToRelative(dx = 1.116f, dy = 0.81f)
                // l -0.426 1.312
                lineToRelative(dx = -0.426f, dy = 1.312f)
                // l 1.116 -0.81
                lineToRelative(dx = 1.116f, dy = -0.81f)
                // l 1.116 0.81
                lineToRelative(dx = 1.116f, dy = 0.81f)
                // l -0.427 -1.312
                lineToRelative(dx = -0.427f, dy = -1.312f)
                // l 1.116 -0.81z
                lineToRelative(dx = 1.116f, dy = -0.81f)
                close()
            }
        }.build().also { _emoji1f1fc1f1f8 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1fc1f1f8: ImageVector? = null
