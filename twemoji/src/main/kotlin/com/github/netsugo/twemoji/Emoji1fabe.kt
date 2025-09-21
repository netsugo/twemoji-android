package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fabe: ImageVector
    get() {
        val current = _emoji1fabe
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fabe",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M26 23.07 a1.11 1.11 0 0 0 0.24 -0.22 l6.46 -7.25 c0.82 -0.95 0.1 -1.72 -0.9 -1 L29 16.83 a0.45 0.45 0 0 1 -0.72 -0.25 l-0.64 -2.78 a0.75 0.75 0 0 0 -0.77 -0.57 0.74 0.74 0 0 0 -0.7 0.78 l0.16 3.66 a2.22 2.22 0 0 1 -0.84 1.84 l-1.32 1.06 -2.09 1.67 -0.44 -6 9 -10 A0.84 0.84 0 0 0 29.53 5 l-2.48 2 a0.47 0.47 0 0 1 -0.75 -0.26 L25.63 4 a0.77 0.77 0 0 0 -1.52 0.22 L24.28 8 a2.31 2.31 0 0 1 -0.87 1.91 l-5.25 4.2 -1.89 -2.16 A1.91 1.91 0 0 1 16 9.78 l5.34 -7.85 A0.84 0.84 0 0 0 20.07 0.84 l-7.38 7 a1.08 1.08 0 0 1 -1.67 0.1 L10 6.81 l-0.78 -0.88 0.17 -0.15 2.23 -2.73 c0.54 -0.58 0.1 -1.08 -0.55 -0.62 l-3 1.85 a0.61 0.61 0 0 0 -0.17 0.15 L6.38 2.72 a0.77 0.77 0 0 0 -1.12 -0.09 0.79 0.79 0 0 0 -0.09 1 l1.36 2.08 8 11.92 0.73 1.1 a4.23 4.23 0 0 1 0.7 2.7 l-0.19 1.67 -5.55 -1.1 a1.85 1.85 0 0 1 -1.12 -1.16 L7.75 13.3 c-0.2 -1.15 -1.18 -1.08 -1.22 0.09 l-0.2 6.19 -2.25 -1.7 c-0.9 -0.74 -1.6 -0.05 -0.87 0.86 l3.86 5 a1.67 1.67 0 0 0 0.4 0.36 l0.27 0.17 7.45 3.82 -0.48 4.18 a2.77 2.77 0 0 0 1.65 2.6 c1.49 0.68 4.07 0.76 5.39 -0.34 a2.89 2.89 0 0 0 1.06 -2.26 L22.42 27
            path(
                fill = SolidColor(Color(0xFF5E2618)),
            ) {
                // M 26 23.07
                moveTo(x = 26.0f, y = 23.07f)
                // a 1.11 1.11 0 0 0 0.24 -0.22
                arcToRelative(
                    a = 1.11f,
                    b = 1.11f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.24f,
                    dy1 = -0.22f,
                )
                // l 6.46 -7.25
                lineToRelative(dx = 6.46f, dy = -7.25f)
                // c 0.82 -0.95 0.1 -1.72 -0.9 -1
                curveToRelative(
                    dx1 = 0.82f,
                    dy1 = -0.95f,
                    dx2 = 0.1f,
                    dy2 = -1.72f,
                    dx3 = -0.9f,
                    dy3 = -1.0f,
                )
                // L 29 16.83
                lineTo(x = 29.0f, y = 16.83f)
                // a 0.45 0.45 0 0 1 -0.72 -0.25
                arcToRelative(
                    a = 0.45f,
                    b = 0.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.72f,
                    dy1 = -0.25f,
                )
                // l -0.64 -2.78
                lineToRelative(dx = -0.64f, dy = -2.78f)
                // a 0.75 0.75 0 0 0 -0.77 -0.57
                arcToRelative(
                    a = 0.75f,
                    b = 0.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.77f,
                    dy1 = -0.57f,
                )
                // a 0.74 0.74 0 0 0 -0.7 0.78
                arcToRelative(
                    a = 0.74f,
                    b = 0.74f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.7f,
                    dy1 = 0.78f,
                )
                // l 0.16 3.66
                lineToRelative(dx = 0.16f, dy = 3.66f)
                // a 2.22 2.22 0 0 1 -0.84 1.84
                arcToRelative(
                    a = 2.22f,
                    b = 2.22f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.84f,
                    dy1 = 1.84f,
                )
                // l -1.32 1.06
                lineToRelative(dx = -1.32f, dy = 1.06f)
                // l -2.09 1.67
                lineToRelative(dx = -2.09f, dy = 1.67f)
                // l -0.44 -6
                lineToRelative(dx = -0.44f, dy = -6.0f)
                // l 9 -10
                lineToRelative(dx = 9.0f, dy = -10.0f)
                // A 0.84 0.84 0 0 0 29.53 5
                arcTo(
                    horizontalEllipseRadius = 0.84f,
                    verticalEllipseRadius = 0.84f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 29.53f,
                    y1 = 5.0f,
                )
                // l -2.48 2
                lineToRelative(dx = -2.48f, dy = 2.0f)
                // a 0.47 0.47 0 0 1 -0.75 -0.26
                arcToRelative(
                    a = 0.47f,
                    b = 0.47f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.75f,
                    dy1 = -0.26f,
                )
                // L 25.63 4
                lineTo(x = 25.63f, y = 4.0f)
                // a 0.77 0.77 0 0 0 -1.52 0.22
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.52f,
                    dy1 = 0.22f,
                )
                // L 24.28 8
                lineTo(x = 24.28f, y = 8.0f)
                // a 2.31 2.31 0 0 1 -0.87 1.91
                arcToRelative(
                    a = 2.31f,
                    b = 2.31f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.87f,
                    dy1 = 1.91f,
                )
                // l -5.25 4.2
                lineToRelative(dx = -5.25f, dy = 4.2f)
                // l -1.89 -2.16
                lineToRelative(dx = -1.89f, dy = -2.16f)
                // A 1.91 1.91 0 0 1 16 9.78
                arcTo(
                    horizontalEllipseRadius = 1.91f,
                    verticalEllipseRadius = 1.91f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 9.78f,
                )
                // l 5.34 -7.85
                lineToRelative(dx = 5.34f, dy = -7.85f)
                // A 0.84 0.84 0 0 0 20.07 0.84
                arcTo(
                    horizontalEllipseRadius = 0.84f,
                    verticalEllipseRadius = 0.84f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.07f,
                    y1 = 0.84f,
                )
                // l -7.38 7
                lineToRelative(dx = -7.38f, dy = 7.0f)
                // a 1.08 1.08 0 0 1 -1.67 0.1
                arcToRelative(
                    a = 1.08f,
                    b = 1.08f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.67f,
                    dy1 = 0.1f,
                )
                // L 10 6.81
                lineTo(x = 10.0f, y = 6.81f)
                // l -0.78 -0.88
                lineToRelative(dx = -0.78f, dy = -0.88f)
                // l 0.17 -0.15
                lineToRelative(dx = 0.17f, dy = -0.15f)
                // l 2.23 -2.73
                lineToRelative(dx = 2.23f, dy = -2.73f)
                // c 0.54 -0.58 0.1 -1.08 -0.55 -0.62
                curveToRelative(
                    dx1 = 0.54f,
                    dy1 = -0.58f,
                    dx2 = 0.1f,
                    dy2 = -1.08f,
                    dx3 = -0.55f,
                    dy3 = -0.62f,
                )
                // l -3 1.85
                lineToRelative(dx = -3.0f, dy = 1.85f)
                // a 0.61 0.61 0 0 0 -0.17 0.15
                arcToRelative(
                    a = 0.61f,
                    b = 0.61f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.17f,
                    dy1 = 0.15f,
                )
                // L 6.38 2.72
                lineTo(x = 6.38f, y = 2.72f)
                // a 0.77 0.77 0 0 0 -1.12 -0.09
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.12f,
                    dy1 = -0.09f,
                )
                // a 0.79 0.79 0 0 0 -0.09 1
                arcToRelative(
                    a = 0.79f,
                    b = 0.79f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.09f,
                    dy1 = 1.0f,
                )
                // l 1.36 2.08
                lineToRelative(dx = 1.36f, dy = 2.08f)
                // l 8 11.92
                lineToRelative(dx = 8.0f, dy = 11.92f)
                // l 0.73 1.1
                lineToRelative(dx = 0.73f, dy = 1.1f)
                // a 4.23 4.23 0 0 1 0.7 2.7
                arcToRelative(
                    a = 4.23f,
                    b = 4.23f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = 2.7f,
                )
                // l -0.19 1.67
                lineToRelative(dx = -0.19f, dy = 1.67f)
                // l -5.55 -1.1
                lineToRelative(dx = -5.55f, dy = -1.1f)
                // a 1.85 1.85 0 0 1 -1.12 -1.16
                arcToRelative(
                    a = 1.85f,
                    b = 1.85f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.12f,
                    dy1 = -1.16f,
                )
                // L 7.75 13.3
                lineTo(x = 7.75f, y = 13.3f)
                // c -0.2 -1.15 -1.18 -1.08 -1.22 0.09
                curveToRelative(
                    dx1 = -0.2f,
                    dy1 = -1.15f,
                    dx2 = -1.18f,
                    dy2 = -1.08f,
                    dx3 = -1.22f,
                    dy3 = 0.09f,
                )
                // l -0.2 6.19
                lineToRelative(dx = -0.2f, dy = 6.19f)
                // l -2.25 -1.7
                lineToRelative(dx = -2.25f, dy = -1.7f)
                // c -0.9 -0.74 -1.6 -0.05 -0.87 0.86
                curveToRelative(
                    dx1 = -0.9f,
                    dy1 = -0.74f,
                    dx2 = -1.6f,
                    dy2 = -0.05f,
                    dx3 = -0.87f,
                    dy3 = 0.86f,
                )
                // l 3.86 5
                lineToRelative(dx = 3.86f, dy = 5.0f)
                // a 1.67 1.67 0 0 0 0.4 0.36
                arcToRelative(
                    a = 1.67f,
                    b = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.4f,
                    dy1 = 0.36f,
                )
                // l 0.27 0.17
                lineToRelative(dx = 0.27f, dy = 0.17f)
                // l 7.45 3.82
                lineToRelative(dx = 7.45f, dy = 3.82f)
                // l -0.48 4.18
                lineToRelative(dx = -0.48f, dy = 4.18f)
                // a 2.77 2.77 0 0 0 1.65 2.6
                arcToRelative(
                    a = 2.77f,
                    b = 2.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.65f,
                    dy1 = 2.6f,
                )
                // c 1.49 0.68 4.07 0.76 5.39 -0.34
                curveToRelative(
                    dx1 = 1.49f,
                    dy1 = 0.68f,
                    dx2 = 4.07f,
                    dy2 = 0.76f,
                    dx3 = 5.39f,
                    dy3 = -0.34f,
                )
                // a 2.89 2.89 0 0 0 1.06 -2.26
                arcToRelative(
                    a = 2.89f,
                    b = 2.89f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.06f,
                    dy1 = -2.26f,
                )
                // L 22.42 27
                lineTo(x = 22.42f, y = 27.0f)
            }
        }.build().also { _emoji1fabe = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fabe: ImageVector? = null
