package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f52d: ImageVector
    get() {
        val current = _emoji1f52d
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f52d",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M17 20 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 17 20
                moveTo(x = 17.0f, y = 20.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
            }
            // M19.235 17.059 c-0.259 0.485 -0.868 0.671 -1.353 0.412 L5.529 10.883 c-0.485 -0.259 -0.67 -0.868 -0.412 -1.353 L7.94 4.235 c0.259 -0.485 0.868 -0.67 1.353 -0.412 l12.353 6.588 c0.485 0.259 0.671 0.868 0.412 1.353 l-2.823 5.295z
            path(
                fill = SolidColor(Color(0xFFDA2F47)),
            ) {
                // M 19.235 17.059
                moveTo(x = 19.235f, y = 17.059f)
                // c -0.259 0.485 -0.868 0.671 -1.353 0.412
                curveToRelative(
                    dx1 = -0.259f,
                    dy1 = 0.485f,
                    dx2 = -0.868f,
                    dy2 = 0.671f,
                    dx3 = -1.353f,
                    dy3 = 0.412f,
                )
                // L 5.529 10.883
                lineTo(x = 5.529f, y = 10.883f)
                // c -0.485 -0.259 -0.67 -0.868 -0.412 -1.353
                curveToRelative(
                    dx1 = -0.485f,
                    dy1 = -0.259f,
                    dx2 = -0.67f,
                    dy2 = -0.868f,
                    dx3 = -0.412f,
                    dy3 = -1.353f,
                )
                // L 7.94 4.235
                lineTo(x = 7.94f, y = 4.235f)
                // c 0.259 -0.485 0.868 -0.67 1.353 -0.412
                curveToRelative(
                    dx1 = 0.259f,
                    dy1 = -0.485f,
                    dx2 = 0.868f,
                    dy2 = -0.67f,
                    dx3 = 1.353f,
                    dy3 = -0.412f,
                )
                // l 12.353 6.588
                lineToRelative(dx = 12.353f, dy = 6.588f)
                // c 0.485 0.259 0.671 0.868 0.412 1.353
                curveToRelative(
                    dx1 = 0.485f,
                    dy1 = 0.259f,
                    dx2 = 0.671f,
                    dy2 = 0.868f,
                    dx3 = 0.412f,
                    dy3 = 1.353f,
                )
                // l -2.823 5.295z
                lineToRelative(dx = -2.823f, dy = 5.295f)
                close()
            }
            // M31.177 22.293 c-0.259 0.485 -0.868 0.671 -1.354 0.412 l-9.705 -5.176 c-0.485 -0.259 -0.671 -0.868 -0.412 -1.354 l1.882 -3.529 c0.259 -0.485 0.868 -0.67 1.354 -0.412 l9.705 5.176 c0.485 0.259 0.671 0.868 0.412 1.354 l-1.882 3.529z
            path(
                fill = SolidColor(Color(0xFFDA2F47)),
            ) {
                // M 31.177 22.293
                moveTo(x = 31.177f, y = 22.293f)
                // c -0.259 0.485 -0.868 0.671 -1.354 0.412
                curveToRelative(
                    dx1 = -0.259f,
                    dy1 = 0.485f,
                    dx2 = -0.868f,
                    dy2 = 0.671f,
                    dx3 = -1.354f,
                    dy3 = 0.412f,
                )
                // l -9.705 -5.176
                lineToRelative(dx = -9.705f, dy = -5.176f)
                // c -0.485 -0.259 -0.671 -0.868 -0.412 -1.354
                curveToRelative(
                    dx1 = -0.485f,
                    dy1 = -0.259f,
                    dx2 = -0.671f,
                    dy2 = -0.868f,
                    dx3 = -0.412f,
                    dy3 = -1.354f,
                )
                // l 1.882 -3.529
                lineToRelative(dx = 1.882f, dy = -3.529f)
                // c 0.259 -0.485 0.868 -0.67 1.354 -0.412
                curveToRelative(
                    dx1 = 0.259f,
                    dy1 = -0.485f,
                    dx2 = 0.868f,
                    dy2 = -0.67f,
                    dx3 = 1.354f,
                    dy3 = -0.412f,
                )
                // l 9.705 5.176
                lineToRelative(dx = 9.705f, dy = 5.176f)
                // c 0.485 0.259 0.671 0.868 0.412 1.354
                curveToRelative(
                    dx1 = 0.485f,
                    dy1 = 0.259f,
                    dx2 = 0.671f,
                    dy2 = 0.868f,
                    dx3 = 0.412f,
                    dy3 = 1.354f,
                )
                // l -1.882 3.529z
                lineToRelative(dx = -1.882f, dy = 3.529f)
                close()
            }
            // M19.235 17.058 l2.824 -5.293 1.765 0.941 L20.999 18z
            path(
                fill = SolidColor(Color(0xFFBB1A34)),
            ) {
                // M 19.235 17.058
                moveTo(x = 19.235f, y = 17.058f)
                // l 2.824 -5.293
                lineToRelative(dx = 2.824f, dy = -5.293f)
                // l 1.765 0.941
                lineToRelative(dx = 1.765f, dy = 0.941f)
                // L 20.999 18z
                lineTo(x = 20.999f, y = 18.0f)
                close()
            }
            // M28.942 22.235 l2.823 -5.294 3.53 1.882 -2.824 5.294z
            path(
                fill = SolidColor(Color(0xFF9D0522)),
            ) {
                // M 28.942 22.235
                moveTo(x = 28.942f, y = 22.235f)
                // l 2.823 -5.294
                lineToRelative(dx = 2.823f, dy = -5.294f)
                // l 3.53 1.882
                lineToRelative(dx = 3.53f, dy = 1.882f)
                // l -2.824 5.294z
                lineToRelative(dx = -2.824f, dy = 5.294f)
                close()
            }
            // M8.294 7.824 l1.882 -3.53 -0.881 -0.47 v-0.001 L4.882 1.471 c-0.485 -0.259 -1.094 -0.074 -1.353 0.411 L0.706 7.177 c-0.259 0.486 -0.074 1.094 0.412 1.353 l3.529 1.882 1.766 0.941 0.47 -0.882 1.411 -2.647z M23 25 c0 1.104 -0.896 2 -2 2 h-8 c-1.104 0 -2 -0.896 -2 -2 s0.896 -2 2 -2 h8 c1.104 0 2 0.896 2 2z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 8.294 7.824
                moveTo(x = 8.294f, y = 7.824f)
                // l 1.882 -3.53
                lineToRelative(dx = 1.882f, dy = -3.53f)
                // l -0.881 -0.47
                lineToRelative(dx = -0.881f, dy = -0.47f)
                // v -0.001
                verticalLineToRelative(dy = -0.001f)
                // L 4.882 1.471
                lineTo(x = 4.882f, y = 1.471f)
                // c -0.485 -0.259 -1.094 -0.074 -1.353 0.411
                curveToRelative(
                    dx1 = -0.485f,
                    dy1 = -0.259f,
                    dx2 = -1.094f,
                    dy2 = -0.074f,
                    dx3 = -1.353f,
                    dy3 = 0.411f,
                )
                // L 0.706 7.177
                lineTo(x = 0.706f, y = 7.177f)
                // c -0.259 0.486 -0.074 1.094 0.412 1.353
                curveToRelative(
                    dx1 = -0.259f,
                    dy1 = 0.486f,
                    dx2 = -0.074f,
                    dy2 = 1.094f,
                    dx3 = 0.412f,
                    dy3 = 1.353f,
                )
                // l 3.529 1.882
                lineToRelative(dx = 3.529f, dy = 1.882f)
                // l 1.766 0.941
                lineToRelative(dx = 1.766f, dy = 0.941f)
                // l 0.47 -0.882
                lineToRelative(dx = 0.47f, dy = -0.882f)
                // l 1.411 -2.647z
                lineToRelative(dx = 1.411f, dy = -2.647f)
                close()
                // M 23 25
                moveTo(x = 23.0f, y = 25.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
            // M9.467 36 l3.344 -7.152 c0.468 -1 0.036 -2.191 -0.965 -2.658 -1 -0.469 -2.191 -0.037 -2.658 0.965 L5.052 36 h4.415z M24.532 36 h4.416 l-4.137 -8.846 c-0.467 -1.002 -1.658 -1.434 -2.658 -0.965 -1.001 0.467 -1.433 1.658 -0.965 2.658 L24.532 36z M19 36 v-8 c0 -1.104 -0.896 -2 -2 -2 s-2 0.896 -2 2 v8 h4z
            path(
                fill = SolidColor(Color(0xFF9AAAB4)),
            ) {
                // M 9.467 36
                moveTo(x = 9.467f, y = 36.0f)
                // l 3.344 -7.152
                lineToRelative(dx = 3.344f, dy = -7.152f)
                // c 0.468 -1 0.036 -2.191 -0.965 -2.658
                curveToRelative(
                    dx1 = 0.468f,
                    dy1 = -1.0f,
                    dx2 = 0.036f,
                    dy2 = -2.191f,
                    dx3 = -0.965f,
                    dy3 = -2.658f,
                )
                // c -1 -0.469 -2.191 -0.037 -2.658 0.965
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.469f,
                    dx2 = -2.191f,
                    dy2 = -0.037f,
                    dx3 = -2.658f,
                    dy3 = 0.965f,
                )
                // L 5.052 36
                lineTo(x = 5.052f, y = 36.0f)
                // h 4.415z
                horizontalLineToRelative(dx = 4.415f)
                close()
                // M 24.532 36
                moveTo(x = 24.532f, y = 36.0f)
                // h 4.416
                horizontalLineToRelative(dx = 4.416f)
                // l -4.137 -8.846
                lineToRelative(dx = -4.137f, dy = -8.846f)
                // c -0.467 -1.002 -1.658 -1.434 -2.658 -0.965
                curveToRelative(
                    dx1 = -0.467f,
                    dy1 = -1.002f,
                    dx2 = -1.658f,
                    dy2 = -1.434f,
                    dx3 = -2.658f,
                    dy3 = -0.965f,
                )
                // c -1.001 0.467 -1.433 1.658 -0.965 2.658
                curveToRelative(
                    dx1 = -1.001f,
                    dy1 = 0.467f,
                    dx2 = -1.433f,
                    dy2 = 1.658f,
                    dx3 = -0.965f,
                    dy3 = 2.658f,
                )
                // L 24.532 36z
                lineTo(x = 24.532f, y = 36.0f)
                close()
                // M 19 36
                moveTo(x = 19.0f, y = 36.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
            }
        }.build().also { _emoji1f52d = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f52d: ImageVector? = null
