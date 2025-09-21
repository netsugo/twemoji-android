package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1fadb: ImageVector
    get() {
        val current = _emoji1fadb
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1fadb",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M28 5 C12 5 2.03 33.73 2.03 33.73 c0.01 0.24 0.21 0.42 0.45 0.4 l8.78 -5.46 s0.36 -0.61 0.83 -1.4 c0.75 0.3 1.57 0.45 2.43 0.4 a5.789 5.789 0 0 0 5.44 -5.08 6.373 6.373 0 0 0 4.31 -6.19 c3.64 -0.44 6.18 -4.23 4.61 -8.08 -0.62 -1.52 0.75 -3.33 -0.89 -3.33Z
            path(
                fill = SolidColor(Color(0xFF4E932B)),
            ) {
                // M 28 5
                moveTo(x = 28.0f, y = 5.0f)
                // C 12 5 2.03 33.73 2.03 33.73
                curveTo(
                    x1 = 12.0f,
                    y1 = 5.0f,
                    x2 = 2.03f,
                    y2 = 33.73f,
                    x3 = 2.03f,
                    y3 = 33.73f,
                )
                // c 0.01 0.24 0.21 0.42 0.45 0.4
                curveToRelative(
                    dx1 = 0.01f,
                    dy1 = 0.24f,
                    dx2 = 0.21f,
                    dy2 = 0.42f,
                    dx3 = 0.45f,
                    dy3 = 0.4f,
                )
                // l 8.78 -5.46
                lineToRelative(dx = 8.78f, dy = -5.46f)
                // s 0.36 -0.61 0.83 -1.4
                reflectiveCurveToRelative(
                    dx1 = 0.36f,
                    dy1 = -0.61f,
                    dx2 = 0.83f,
                    dy2 = -1.4f,
                )
                // c 0.75 0.3 1.57 0.45 2.43 0.4
                curveToRelative(
                    dx1 = 0.75f,
                    dy1 = 0.3f,
                    dx2 = 1.57f,
                    dy2 = 0.45f,
                    dx3 = 2.43f,
                    dy3 = 0.4f,
                )
                // a 5.789 5.789 0 0 0 5.44 -5.08
                arcToRelative(
                    a = 5.789f,
                    b = 5.789f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.44f,
                    dy1 = -5.08f,
                )
                // a 6.373 6.373 0 0 0 4.31 -6.19
                arcToRelative(
                    a = 6.373f,
                    b = 6.373f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.31f,
                    dy1 = -6.19f,
                )
                // c 3.64 -0.44 6.18 -4.23 4.61 -8.08
                curveToRelative(
                    dx1 = 3.64f,
                    dy1 = -0.44f,
                    dx2 = 6.18f,
                    dy2 = -4.23f,
                    dx3 = 4.61f,
                    dy3 = -8.08f,
                )
                // c -0.62 -1.52 0.75 -3.33 -0.89 -3.33z
                curveToRelative(
                    dx1 = -0.62f,
                    dy1 = -1.52f,
                    dx2 = 0.75f,
                    dy2 = -3.33f,
                    dx3 = -0.89f,
                    dy3 = -3.33f,
                )
                close()
            }
            // M7.7 30.6 m-3.3 0 a3.3 3.3 0 1 1 6.6 0 a3.3 3.3 0 1 1 -6.6 0
            path(
                fill = SolidColor(Color(0xFF9BD57F)),
            ) {
                // M 7.7 30.6
                moveTo(x = 7.7f, y = 30.6f)
                // m -3.3 0
                moveToRelative(dx = -3.3f, dy = 0.0f)
                // a 3.3 3.3 0 1 1 6.6 0
                arcToRelative(
                    a = 3.3f,
                    b = 3.3f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.6f,
                    dy1 = 0.0f,
                )
                // a 3.3 3.3 0 1 1 -6.6 0
                arcToRelative(
                    a = 3.3f,
                    b = 3.3f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.6f,
                    dy1 = 0.0f,
                )
            }
            // M7 25 s-2 4 1.7 6 c0.26 0.14 2.46 -1.81 2.38 -1.4 S7.4 25.11 7.4 25.11z
            path(
                fill = SolidColor(Color(0xFF4E932B)),
            ) {
                // M 7 25
                moveTo(x = 7.0f, y = 25.0f)
                // s -2 4 1.7 6
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 4.0f,
                    dx2 = 1.7f,
                    dy2 = 6.0f,
                )
                // c 0.26 0.14 2.46 -1.81 2.38 -1.4
                curveToRelative(
                    dx1 = 0.26f,
                    dy1 = 0.14f,
                    dx2 = 2.46f,
                    dy2 = -1.81f,
                    dx3 = 2.38f,
                    dy3 = -1.4f,
                )
                // S 7.4 25.11 7.4 25.11z
                reflectiveCurveTo(
                    x1 = 7.4f,
                    y1 = 25.11f,
                    x2 = 7.4f,
                    y2 = 25.11f,
                )
                close()
            }
            // M12.16 26.74 m-5.16 0 a5.16 5.16 0 1 1 10.32 0 a5.16 5.16 0 1 1 -10.32 0
            path(
                fill = SolidColor(Color(0xFF9BD57F)),
            ) {
                // M 12.16 26.74
                moveTo(x = 12.16f, y = 26.74f)
                // m -5.16 0
                moveToRelative(dx = -5.16f, dy = 0.0f)
                // a 5.16 5.16 0 1 1 10.32 0
                arcToRelative(
                    a = 5.16f,
                    b = 5.16f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.32f,
                    dy1 = 0.0f,
                )
                // a 5.16 5.16 0 1 1 -10.32 0
                arcToRelative(
                    a = 5.16f,
                    b = 5.16f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.32f,
                    dy1 = 0.0f,
                )
            }
            // M11 20 s-4 2 1 8 l4 1z
            path(
                fill = SolidColor(Color(0xFF4E932B)),
            ) {
                // M 11 20
                moveTo(x = 11.0f, y = 20.0f)
                // s -4 2 1 8
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = 2.0f,
                    dx2 = 1.0f,
                    dy2 = 8.0f,
                )
                // l 4 1z
                lineToRelative(dx = 4.0f, dy = 1.0f)
                close()
            }
            // M15.5 21.5 m-5.5 0 a5.5 5.5 0 1 1 11 0 a5.5 5.5 0 1 1 -11 0
            path(
                fill = SolidColor(Color(0xFF9BD57F)),
            ) {
                // M 15.5 21.5
                moveTo(x = 15.5f, y = 21.5f)
                // m -5.5 0
                moveToRelative(dx = -5.5f, dy = 0.0f)
                // a 5.5 5.5 0 1 1 11 0
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 11.0f,
                    dy1 = 0.0f,
                )
                // a 5.5 5.5 0 1 1 -11 0
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -11.0f,
                    dy1 = 0.0f,
                )
            }
            // M13.8 15.12 S12.48 21.99 19 24 l1.42 -1.14 -6.63 -7.74Z
            path(
                fill = SolidColor(Color(0xFF4E932B)),
            ) {
                // M 13.8 15.12
                moveTo(x = 13.8f, y = 15.12f)
                // S 12.48 21.99 19 24
                reflectiveCurveTo(
                    x1 = 12.48f,
                    y1 = 21.99f,
                    x2 = 19.0f,
                    y2 = 24.0f,
                )
                // l 1.42 -1.14
                lineToRelative(dx = 1.42f, dy = -1.14f)
                // l -6.63 -7.74z
                lineToRelative(dx = -6.63f, dy = -7.74f)
                close()
            }
            // M19.75 16.33 m-5.58 0 a5.58 5.58 0 1 1 11.16 0 a5.58 5.58 0 1 1 -11.16 0
            path(
                fill = SolidColor(Color(0xFF9BD57F)),
            ) {
                // M 19.75 16.33
                moveTo(x = 19.75f, y = 16.33f)
                // m -5.58 0
                moveToRelative(dx = -5.58f, dy = 0.0f)
                // a 5.58 5.58 0 1 1 11.16 0
                arcToRelative(
                    a = 5.58f,
                    b = 5.58f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 11.16f,
                    dy1 = 0.0f,
                )
                // a 5.58 5.58 0 1 1 -11.16 0
                arcToRelative(
                    a = 5.58f,
                    b = 5.58f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -11.16f,
                    dy1 = 0.0f,
                )
            }
            // M19.27 9.73 s-1.49 5.78 2.9 8.38 l5.69 -2.55 -8.6 -5.83Z
            path(
                fill = SolidColor(Color(0xFF4E932B)),
            ) {
                // M 19.27 9.73
                moveTo(x = 19.27f, y = 9.73f)
                // s -1.49 5.78 2.9 8.38
                reflectiveCurveToRelative(
                    dx1 = -1.49f,
                    dy1 = 5.78f,
                    dx2 = 2.9f,
                    dy2 = 8.38f,
                )
                // l 5.69 -2.55
                lineToRelative(dx = 5.69f, dy = -2.55f)
                // l -8.6 -5.83z
                lineToRelative(dx = -8.6f, dy = -5.83f)
                close()
            }
            // M24.44 11.46 m-4.96 0 a4.96 4.96 0 1 1 9.92 0 a4.96 4.96 0 1 1 -9.92 0
            path(
                fill = SolidColor(Color(0xFF9BD57F)),
            ) {
                // M 24.44 11.46
                moveTo(x = 24.44f, y = 11.46f)
                // m -4.96 0
                moveToRelative(dx = -4.96f, dy = 0.0f)
                // a 4.96 4.96 0 1 1 9.92 0
                arcToRelative(
                    a = 4.96f,
                    b = 4.96f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.92f,
                    dy1 = 0.0f,
                )
                // a 4.96 4.96 0 1 1 -9.92 0
                arcToRelative(
                    a = 4.96f,
                    b = 4.96f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -9.92f,
                    dy1 = 0.0f,
                )
            }
            // M2.35 34.03 C4.2 33.16 19 22 29.25 8.47 l1.71 1 S21 38 2.39 34.23 c-0.1 -0.02 -0.13 -0.15 -0.04 -0.2Z
            path(
                fill = SolidColor(Color(0xFF69B546)),
            ) {
                // M 2.35 34.03
                moveTo(x = 2.35f, y = 34.03f)
                // C 4.2 33.16 19 22 29.25 8.47
                curveTo(
                    x1 = 4.2f,
                    y1 = 33.16f,
                    x2 = 19.0f,
                    y2 = 22.0f,
                    x3 = 29.25f,
                    y3 = 8.47f,
                )
                // l 1.71 1
                lineToRelative(dx = 1.71f, dy = 1.0f)
                // S 21 38 2.39 34.23
                reflectiveCurveTo(
                    x1 = 21.0f,
                    y1 = 38.0f,
                    x2 = 2.39f,
                    y2 = 34.23f,
                )
                // c -0.1 -0.02 -0.13 -0.15 -0.04 -0.2z
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = -0.02f,
                    dx2 = -0.13f,
                    dy2 = -0.15f,
                    dx3 = -0.04f,
                    dy3 = -0.2f,
                )
                close()
            }
            // M32.64 3.18 c2.46 0.88 2.24 -1.04 1.69 -1.62 -0.81 -0.84 -2.22 -0.94 -3.3 -0.07 -0.35 0.28 -0.83 0.89 -1.32 1.59 -0.2 0.29 -0.57 0.38 -0.89 0.25 -2.85 -1.16 -5.8 -1.23 -9.4 0.4 0 0 2.41 3.35 7.37 3.46 0 0 -3.37 3.24 -0.99 8.24 0 0 3.35 -2.41 3.42 -5.71 0 0 1.6 2.51 4.91 2.58 0 0 -0.61 -5.8 -3.37 -7.95 -0.18 -0.14 -0.16 -0.43 0.04 -0.56 0.74 -0.47 1.43 -0.77 1.87 -0.61Z
            path(
                fill = SolidColor(Color(0xFF4E932B)),
            ) {
                // M 32.64 3.18
                moveTo(x = 32.64f, y = 3.18f)
                // c 2.46 0.88 2.24 -1.04 1.69 -1.62
                curveToRelative(
                    dx1 = 2.46f,
                    dy1 = 0.88f,
                    dx2 = 2.24f,
                    dy2 = -1.04f,
                    dx3 = 1.69f,
                    dy3 = -1.62f,
                )
                // c -0.81 -0.84 -2.22 -0.94 -3.3 -0.07
                curveToRelative(
                    dx1 = -0.81f,
                    dy1 = -0.84f,
                    dx2 = -2.22f,
                    dy2 = -0.94f,
                    dx3 = -3.3f,
                    dy3 = -0.07f,
                )
                // c -0.35 0.28 -0.83 0.89 -1.32 1.59
                curveToRelative(
                    dx1 = -0.35f,
                    dy1 = 0.28f,
                    dx2 = -0.83f,
                    dy2 = 0.89f,
                    dx3 = -1.32f,
                    dy3 = 1.59f,
                )
                // c -0.2 0.29 -0.57 0.38 -0.89 0.25
                curveToRelative(
                    dx1 = -0.2f,
                    dy1 = 0.29f,
                    dx2 = -0.57f,
                    dy2 = 0.38f,
                    dx3 = -0.89f,
                    dy3 = 0.25f,
                )
                // c -2.85 -1.16 -5.8 -1.23 -9.4 0.4
                curveToRelative(
                    dx1 = -2.85f,
                    dy1 = -1.16f,
                    dx2 = -5.8f,
                    dy2 = -1.23f,
                    dx3 = -9.4f,
                    dy3 = 0.4f,
                )
                // c 0 0 2.41 3.35 7.37 3.46
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.41f,
                    dy2 = 3.35f,
                    dx3 = 7.37f,
                    dy3 = 3.46f,
                )
                // c 0 0 -3.37 3.24 -0.99 8.24
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -3.37f,
                    dy2 = 3.24f,
                    dx3 = -0.99f,
                    dy3 = 8.24f,
                )
                // c 0 0 3.35 -2.41 3.42 -5.71
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 3.35f,
                    dy2 = -2.41f,
                    dx3 = 3.42f,
                    dy3 = -5.71f,
                )
                // c 0 0 1.6 2.51 4.91 2.58
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 1.6f,
                    dy2 = 2.51f,
                    dx3 = 4.91f,
                    dy3 = 2.58f,
                )
                // c 0 0 -0.61 -5.8 -3.37 -7.95
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.61f,
                    dy2 = -5.8f,
                    dx3 = -3.37f,
                    dy3 = -7.95f,
                )
                // c -0.18 -0.14 -0.16 -0.43 0.04 -0.56
                curveToRelative(
                    dx1 = -0.18f,
                    dy1 = -0.14f,
                    dx2 = -0.16f,
                    dy2 = -0.43f,
                    dx3 = 0.04f,
                    dy3 = -0.56f,
                )
                // c 0.74 -0.47 1.43 -0.77 1.87 -0.61z
                curveToRelative(
                    dx1 = 0.74f,
                    dy1 = -0.47f,
                    dx2 = 1.43f,
                    dy2 = -0.77f,
                    dx3 = 1.87f,
                    dy3 = -0.61f,
                )
                close()
            }
        }.build().also { _emoji1fadb = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1fadb: ImageVector? = null
