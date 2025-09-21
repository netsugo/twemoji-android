package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f386: ImageVector
    get() {
        val current = _emoji1f386
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f386",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V4 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v28z
            path(
                fill = SolidColor(Color(0xFF226699)),
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
            // M18 2.249 L21.751 6 H27 v5.249 L30.751 15 27 18.751 V24 h-5.249 L18 27.751 14.249 24 H9 v-5.249 L5.249 15 9 11.249 V6 h5.249z
            path(
                fill = SolidColor(Color(0xFF55ACEE)),
            ) {
                // M 18 2.249
                moveTo(x = 18.0f, y = 2.249f)
                // L 21.751 6
                lineTo(x = 21.751f, y = 6.0f)
                // H 27
                horizontalLineTo(x = 27.0f)
                // v 5.249
                verticalLineToRelative(dy = 5.249f)
                // L 30.751 15
                lineTo(x = 30.751f, y = 15.0f)
                // L 27 18.751
                lineTo(x = 27.0f, y = 18.751f)
                // V 24
                verticalLineTo(y = 24.0f)
                // h -5.249
                horizontalLineToRelative(dx = -5.249f)
                // L 18 27.751
                lineTo(x = 18.0f, y = 27.751f)
                // L 14.249 24
                lineTo(x = 14.249f, y = 24.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v -5.249
                verticalLineToRelative(dy = -5.249f)
                // L 5.249 15
                lineTo(x = 5.249f, y = 15.0f)
                // L 9 11.249
                lineTo(x = 9.0f, y = 11.249f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 5.249z
                horizontalLineToRelative(dx = 5.249f)
                close()
            }
            // M15 15z M18 4.594 l2.234 5.069 4.852 -1.417 -1.418 4.851 6.486 2.235 -6.486 2.234 1.418 4.851 L20.234 21 18 33.154 15.765 21 l-4.85 1.417 1.417 -4.851 -6.487 -2.234 6.487 -2.235 -1.417 -4.851 4.85 1.417z
            path(
                fill = SolidColor(Color(0xFFFFD983)),
            ) {
                // M 15 15z
                moveTo(x = 15.0f, y = 15.0f)
                close()
                // M 18 4.594
                moveTo(x = 18.0f, y = 4.594f)
                // l 2.234 5.069
                lineToRelative(dx = 2.234f, dy = 5.069f)
                // l 4.852 -1.417
                lineToRelative(dx = 4.852f, dy = -1.417f)
                // l -1.418 4.851
                lineToRelative(dx = -1.418f, dy = 4.851f)
                // l 6.486 2.235
                lineToRelative(dx = 6.486f, dy = 2.235f)
                // l -6.486 2.234
                lineToRelative(dx = -6.486f, dy = 2.234f)
                // l 1.418 4.851
                lineToRelative(dx = 1.418f, dy = 4.851f)
                // L 20.234 21
                lineTo(x = 20.234f, y = 21.0f)
                // L 18 33.154
                lineTo(x = 18.0f, y = 33.154f)
                // L 15.765 21
                lineTo(x = 15.765f, y = 21.0f)
                // l -4.85 1.417
                lineToRelative(dx = -4.85f, dy = 1.417f)
                // l 1.417 -4.851
                lineToRelative(dx = 1.417f, dy = -4.851f)
                // l -6.487 -2.234
                lineToRelative(dx = -6.487f, dy = -2.234f)
                // l 6.487 -2.235
                lineToRelative(dx = 6.487f, dy = -2.235f)
                // l -1.417 -4.851
                lineToRelative(dx = -1.417f, dy = -4.851f)
                // l 4.85 1.417z
                lineToRelative(dx = 4.85f, dy = 1.417f)
                close()
            }
            // M18 15 m-3 0 a3 3 0 1 1 6 0 a3 3 0 1 1 -6 0
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 18 15
                moveTo(x = 18.0f, y = 15.0f)
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
            // M9.999 13 c-0.19 0 -0.383 -0.054 -0.554 -0.168 l-6 -4 c-0.459 -0.306 -0.583 -0.927 -0.277 -1.387 0.306 -0.46 0.927 -0.584 1.387 -0.277 l6 4 c0.46 0.306 0.583 0.927 0.277 1.387 -0.193 0.289 -0.51 0.445 -0.833 0.445z M26.001 13 c-0.323 0 -0.641 -0.156 -0.833 -0.445 -0.307 -0.46 -0.183 -1.081 0.277 -1.387 l6 -4 c0.46 -0.307 1.081 -0.183 1.387 0.277 0.307 0.459 0.183 1.081 -0.277 1.387 l-6 4 c-0.171 0.114 -0.364 0.168 -0.554 0.168z M4.001 24 c-0.323 0 -0.64 -0.156 -0.833 -0.445 -0.306 -0.46 -0.182 -1.08 0.277 -1.387 l6 -4 c0.459 -0.308 1.08 -0.183 1.387 0.277 0.306 0.46 0.182 1.08 -0.277 1.387 l-6 4 c-0.171 0.113 -0.364 0.168 -0.554 0.168z M32.999 24 c-0.168 0 -0.339 -0.042 -0.495 -0.132 l-7 -4 c-0.479 -0.274 -0.646 -0.885 -0.372 -1.364 0.274 -0.479 0.884 -0.647 1.364 -0.372 l7 4 c0.479 0.274 0.646 0.885 0.372 1.364 -0.184 0.323 -0.521 0.504 -0.869 0.504z M10 34 c-0.136 0 -0.273 -0.027 -0.406 -0.086 -0.504 -0.225 -0.732 -0.816 -0.507 -1.32 l4 -9 c0.224 -0.504 0.814 -0.733 1.32 -0.508 0.504 0.225 0.732 0.816 0.507 1.32 l-4 9 c-0.166 0.372 -0.532 0.594 -0.914 0.594z M26.001 34 c-0.384 0 -0.749 -0.221 -0.915 -0.594 l-4 -9 c-0.224 -0.505 0.003 -1.096 0.508 -1.32 0.506 -0.224 1.096 0.004 1.32 0.508 l4 9 c0.224 0.505 -0.003 1.096 -0.508 1.32 -0.132 0.059 -0.269 0.086 -0.405 0.086z M15.001 8 c-0.367 0 -0.72 -0.202 -0.896 -0.553 l-2 -4 c-0.247 -0.494 -0.047 -1.095 0.447 -1.342 0.495 -0.247 1.095 -0.046 1.342 0.447 l2 4 c0.247 0.494 0.047 1.095 -0.447 1.342 -0.143 0.072 -0.296 0.106 -0.446 0.106z M20.999 8 c-0.15 0 -0.303 -0.034 -0.446 -0.105 -0.494 -0.247 -0.694 -0.848 -0.447 -1.342 l2 -4 c0.248 -0.495 0.847 -0.695 1.342 -0.447 0.494 0.247 0.694 0.848 0.447 1.342 l-2 4 c-0.176 0.35 -0.529 0.552 -0.896 0.552z
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 9.999 13
                moveTo(x = 9.999f, y = 13.0f)
                // c -0.19 0 -0.383 -0.054 -0.554 -0.168
                curveToRelative(
                    dx1 = -0.19f,
                    dy1 = 0.0f,
                    dx2 = -0.383f,
                    dy2 = -0.054f,
                    dx3 = -0.554f,
                    dy3 = -0.168f,
                )
                // l -6 -4
                lineToRelative(dx = -6.0f, dy = -4.0f)
                // c -0.459 -0.306 -0.583 -0.927 -0.277 -1.387
                curveToRelative(
                    dx1 = -0.459f,
                    dy1 = -0.306f,
                    dx2 = -0.583f,
                    dy2 = -0.927f,
                    dx3 = -0.277f,
                    dy3 = -1.387f,
                )
                // c 0.306 -0.46 0.927 -0.584 1.387 -0.277
                curveToRelative(
                    dx1 = 0.306f,
                    dy1 = -0.46f,
                    dx2 = 0.927f,
                    dy2 = -0.584f,
                    dx3 = 1.387f,
                    dy3 = -0.277f,
                )
                // l 6 4
                lineToRelative(dx = 6.0f, dy = 4.0f)
                // c 0.46 0.306 0.583 0.927 0.277 1.387
                curveToRelative(
                    dx1 = 0.46f,
                    dy1 = 0.306f,
                    dx2 = 0.583f,
                    dy2 = 0.927f,
                    dx3 = 0.277f,
                    dy3 = 1.387f,
                )
                // c -0.193 0.289 -0.51 0.445 -0.833 0.445z
                curveToRelative(
                    dx1 = -0.193f,
                    dy1 = 0.289f,
                    dx2 = -0.51f,
                    dy2 = 0.445f,
                    dx3 = -0.833f,
                    dy3 = 0.445f,
                )
                close()
                // M 26.001 13
                moveTo(x = 26.001f, y = 13.0f)
                // c -0.323 0 -0.641 -0.156 -0.833 -0.445
                curveToRelative(
                    dx1 = -0.323f,
                    dy1 = 0.0f,
                    dx2 = -0.641f,
                    dy2 = -0.156f,
                    dx3 = -0.833f,
                    dy3 = -0.445f,
                )
                // c -0.307 -0.46 -0.183 -1.081 0.277 -1.387
                curveToRelative(
                    dx1 = -0.307f,
                    dy1 = -0.46f,
                    dx2 = -0.183f,
                    dy2 = -1.081f,
                    dx3 = 0.277f,
                    dy3 = -1.387f,
                )
                // l 6 -4
                lineToRelative(dx = 6.0f, dy = -4.0f)
                // c 0.46 -0.307 1.081 -0.183 1.387 0.277
                curveToRelative(
                    dx1 = 0.46f,
                    dy1 = -0.307f,
                    dx2 = 1.081f,
                    dy2 = -0.183f,
                    dx3 = 1.387f,
                    dy3 = 0.277f,
                )
                // c 0.307 0.459 0.183 1.081 -0.277 1.387
                curveToRelative(
                    dx1 = 0.307f,
                    dy1 = 0.459f,
                    dx2 = 0.183f,
                    dy2 = 1.081f,
                    dx3 = -0.277f,
                    dy3 = 1.387f,
                )
                // l -6 4
                lineToRelative(dx = -6.0f, dy = 4.0f)
                // c -0.171 0.114 -0.364 0.168 -0.554 0.168z
                curveToRelative(
                    dx1 = -0.171f,
                    dy1 = 0.114f,
                    dx2 = -0.364f,
                    dy2 = 0.168f,
                    dx3 = -0.554f,
                    dy3 = 0.168f,
                )
                close()
                // M 4.001 24
                moveTo(x = 4.001f, y = 24.0f)
                // c -0.323 0 -0.64 -0.156 -0.833 -0.445
                curveToRelative(
                    dx1 = -0.323f,
                    dy1 = 0.0f,
                    dx2 = -0.64f,
                    dy2 = -0.156f,
                    dx3 = -0.833f,
                    dy3 = -0.445f,
                )
                // c -0.306 -0.46 -0.182 -1.08 0.277 -1.387
                curveToRelative(
                    dx1 = -0.306f,
                    dy1 = -0.46f,
                    dx2 = -0.182f,
                    dy2 = -1.08f,
                    dx3 = 0.277f,
                    dy3 = -1.387f,
                )
                // l 6 -4
                lineToRelative(dx = 6.0f, dy = -4.0f)
                // c 0.459 -0.308 1.08 -0.183 1.387 0.277
                curveToRelative(
                    dx1 = 0.459f,
                    dy1 = -0.308f,
                    dx2 = 1.08f,
                    dy2 = -0.183f,
                    dx3 = 1.387f,
                    dy3 = 0.277f,
                )
                // c 0.306 0.46 0.182 1.08 -0.277 1.387
                curveToRelative(
                    dx1 = 0.306f,
                    dy1 = 0.46f,
                    dx2 = 0.182f,
                    dy2 = 1.08f,
                    dx3 = -0.277f,
                    dy3 = 1.387f,
                )
                // l -6 4
                lineToRelative(dx = -6.0f, dy = 4.0f)
                // c -0.171 0.113 -0.364 0.168 -0.554 0.168z
                curveToRelative(
                    dx1 = -0.171f,
                    dy1 = 0.113f,
                    dx2 = -0.364f,
                    dy2 = 0.168f,
                    dx3 = -0.554f,
                    dy3 = 0.168f,
                )
                close()
                // M 32.999 24
                moveTo(x = 32.999f, y = 24.0f)
                // c -0.168 0 -0.339 -0.042 -0.495 -0.132
                curveToRelative(
                    dx1 = -0.168f,
                    dy1 = 0.0f,
                    dx2 = -0.339f,
                    dy2 = -0.042f,
                    dx3 = -0.495f,
                    dy3 = -0.132f,
                )
                // l -7 -4
                lineToRelative(dx = -7.0f, dy = -4.0f)
                // c -0.479 -0.274 -0.646 -0.885 -0.372 -1.364
                curveToRelative(
                    dx1 = -0.479f,
                    dy1 = -0.274f,
                    dx2 = -0.646f,
                    dy2 = -0.885f,
                    dx3 = -0.372f,
                    dy3 = -1.364f,
                )
                // c 0.274 -0.479 0.884 -0.647 1.364 -0.372
                curveToRelative(
                    dx1 = 0.274f,
                    dy1 = -0.479f,
                    dx2 = 0.884f,
                    dy2 = -0.647f,
                    dx3 = 1.364f,
                    dy3 = -0.372f,
                )
                // l 7 4
                lineToRelative(dx = 7.0f, dy = 4.0f)
                // c 0.479 0.274 0.646 0.885 0.372 1.364
                curveToRelative(
                    dx1 = 0.479f,
                    dy1 = 0.274f,
                    dx2 = 0.646f,
                    dy2 = 0.885f,
                    dx3 = 0.372f,
                    dy3 = 1.364f,
                )
                // c -0.184 0.323 -0.521 0.504 -0.869 0.504z
                curveToRelative(
                    dx1 = -0.184f,
                    dy1 = 0.323f,
                    dx2 = -0.521f,
                    dy2 = 0.504f,
                    dx3 = -0.869f,
                    dy3 = 0.504f,
                )
                close()
                // M 10 34
                moveTo(x = 10.0f, y = 34.0f)
                // c -0.136 0 -0.273 -0.027 -0.406 -0.086
                curveToRelative(
                    dx1 = -0.136f,
                    dy1 = 0.0f,
                    dx2 = -0.273f,
                    dy2 = -0.027f,
                    dx3 = -0.406f,
                    dy3 = -0.086f,
                )
                // c -0.504 -0.225 -0.732 -0.816 -0.507 -1.32
                curveToRelative(
                    dx1 = -0.504f,
                    dy1 = -0.225f,
                    dx2 = -0.732f,
                    dy2 = -0.816f,
                    dx3 = -0.507f,
                    dy3 = -1.32f,
                )
                // l 4 -9
                lineToRelative(dx = 4.0f, dy = -9.0f)
                // c 0.224 -0.504 0.814 -0.733 1.32 -0.508
                curveToRelative(
                    dx1 = 0.224f,
                    dy1 = -0.504f,
                    dx2 = 0.814f,
                    dy2 = -0.733f,
                    dx3 = 1.32f,
                    dy3 = -0.508f,
                )
                // c 0.504 0.225 0.732 0.816 0.507 1.32
                curveToRelative(
                    dx1 = 0.504f,
                    dy1 = 0.225f,
                    dx2 = 0.732f,
                    dy2 = 0.816f,
                    dx3 = 0.507f,
                    dy3 = 1.32f,
                )
                // l -4 9
                lineToRelative(dx = -4.0f, dy = 9.0f)
                // c -0.166 0.372 -0.532 0.594 -0.914 0.594z
                curveToRelative(
                    dx1 = -0.166f,
                    dy1 = 0.372f,
                    dx2 = -0.532f,
                    dy2 = 0.594f,
                    dx3 = -0.914f,
                    dy3 = 0.594f,
                )
                close()
                // M 26.001 34
                moveTo(x = 26.001f, y = 34.0f)
                // c -0.384 0 -0.749 -0.221 -0.915 -0.594
                curveToRelative(
                    dx1 = -0.384f,
                    dy1 = 0.0f,
                    dx2 = -0.749f,
                    dy2 = -0.221f,
                    dx3 = -0.915f,
                    dy3 = -0.594f,
                )
                // l -4 -9
                lineToRelative(dx = -4.0f, dy = -9.0f)
                // c -0.224 -0.505 0.003 -1.096 0.508 -1.32
                curveToRelative(
                    dx1 = -0.224f,
                    dy1 = -0.505f,
                    dx2 = 0.003f,
                    dy2 = -1.096f,
                    dx3 = 0.508f,
                    dy3 = -1.32f,
                )
                // c 0.506 -0.224 1.096 0.004 1.32 0.508
                curveToRelative(
                    dx1 = 0.506f,
                    dy1 = -0.224f,
                    dx2 = 1.096f,
                    dy2 = 0.004f,
                    dx3 = 1.32f,
                    dy3 = 0.508f,
                )
                // l 4 9
                lineToRelative(dx = 4.0f, dy = 9.0f)
                // c 0.224 0.505 -0.003 1.096 -0.508 1.32
                curveToRelative(
                    dx1 = 0.224f,
                    dy1 = 0.505f,
                    dx2 = -0.003f,
                    dy2 = 1.096f,
                    dx3 = -0.508f,
                    dy3 = 1.32f,
                )
                // c -0.132 0.059 -0.269 0.086 -0.405 0.086z
                curveToRelative(
                    dx1 = -0.132f,
                    dy1 = 0.059f,
                    dx2 = -0.269f,
                    dy2 = 0.086f,
                    dx3 = -0.405f,
                    dy3 = 0.086f,
                )
                close()
                // M 15.001 8
                moveTo(x = 15.001f, y = 8.0f)
                // c -0.367 0 -0.72 -0.202 -0.896 -0.553
                curveToRelative(
                    dx1 = -0.367f,
                    dy1 = 0.0f,
                    dx2 = -0.72f,
                    dy2 = -0.202f,
                    dx3 = -0.896f,
                    dy3 = -0.553f,
                )
                // l -2 -4
                lineToRelative(dx = -2.0f, dy = -4.0f)
                // c -0.247 -0.494 -0.047 -1.095 0.447 -1.342
                curveToRelative(
                    dx1 = -0.247f,
                    dy1 = -0.494f,
                    dx2 = -0.047f,
                    dy2 = -1.095f,
                    dx3 = 0.447f,
                    dy3 = -1.342f,
                )
                // c 0.495 -0.247 1.095 -0.046 1.342 0.447
                curveToRelative(
                    dx1 = 0.495f,
                    dy1 = -0.247f,
                    dx2 = 1.095f,
                    dy2 = -0.046f,
                    dx3 = 1.342f,
                    dy3 = 0.447f,
                )
                // l 2 4
                lineToRelative(dx = 2.0f, dy = 4.0f)
                // c 0.247 0.494 0.047 1.095 -0.447 1.342
                curveToRelative(
                    dx1 = 0.247f,
                    dy1 = 0.494f,
                    dx2 = 0.047f,
                    dy2 = 1.095f,
                    dx3 = -0.447f,
                    dy3 = 1.342f,
                )
                // c -0.143 0.072 -0.296 0.106 -0.446 0.106z
                curveToRelative(
                    dx1 = -0.143f,
                    dy1 = 0.072f,
                    dx2 = -0.296f,
                    dy2 = 0.106f,
                    dx3 = -0.446f,
                    dy3 = 0.106f,
                )
                close()
                // M 20.999 8
                moveTo(x = 20.999f, y = 8.0f)
                // c -0.15 0 -0.303 -0.034 -0.446 -0.105
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 0.0f,
                    dx2 = -0.303f,
                    dy2 = -0.034f,
                    dx3 = -0.446f,
                    dy3 = -0.105f,
                )
                // c -0.494 -0.247 -0.694 -0.848 -0.447 -1.342
                curveToRelative(
                    dx1 = -0.494f,
                    dy1 = -0.247f,
                    dx2 = -0.694f,
                    dy2 = -0.848f,
                    dx3 = -0.447f,
                    dy3 = -1.342f,
                )
                // l 2 -4
                lineToRelative(dx = 2.0f, dy = -4.0f)
                // c 0.248 -0.495 0.847 -0.695 1.342 -0.447
                curveToRelative(
                    dx1 = 0.248f,
                    dy1 = -0.495f,
                    dx2 = 0.847f,
                    dy2 = -0.695f,
                    dx3 = 1.342f,
                    dy3 = -0.447f,
                )
                // c 0.494 0.247 0.694 0.848 0.447 1.342
                curveToRelative(
                    dx1 = 0.494f,
                    dy1 = 0.247f,
                    dx2 = 0.694f,
                    dy2 = 0.848f,
                    dx3 = 0.447f,
                    dy3 = 1.342f,
                )
                // l -2 4
                lineToRelative(dx = -2.0f, dy = 4.0f)
                // c -0.176 0.35 -0.529 0.552 -0.896 0.552z
                curveToRelative(
                    dx1 = -0.176f,
                    dy1 = 0.35f,
                    dx2 = -0.529f,
                    dy2 = 0.552f,
                    dx3 = -0.896f,
                    dy3 = 0.552f,
                )
                close()
            }
        }.build().also { _emoji1f386 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f386: ImageVector? = null
