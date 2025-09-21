package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f642200d2194Fe0f: ImageVector
    get() {
        val current = _emoji1f642200d2194Fe0f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f642200d2194Fe0f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M16 20 m-16 0 a16 16 0 1 1 32 0 a16 16 0 1 1 -32 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
                // m -16 0
                moveToRelative(dx = -16.0f, dy = 0.0f)
                // a 16 16 0 1 1 32 0
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 32.0f,
                    dy1 = 0.0f,
                )
                // a 16 16 0 1 1 -32 0
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -32.0f,
                    dy1 = 0.0f,
                )
            }
            // M21.85 17.97 a0.524 0.524 0 0 0 -0.54 -0.01 c-0.01 0.01 -1.12 0.66 -3.29 0.66 s-3.28 -0.65 -3.28 -0.66 c-0.16 -0.1 -0.39 -0.1 -0.54 0.01 -0.16 0.1 -0.21 0.28 -0.13 0.43 0.05 0.1 1.33 2.4 3.96 2.4 s3.9 -2.3 3.96 -2.4 c0.07 -0.15 0.01 -0.33 -0.14 -0.43Z M9.27 17.96 c-0.01 0.01 -1.12 0.66 -3.29 0.66 s-3.28 -0.65 -3.28 -0.66 c-0.16 -0.1 -0.39 -0.1 -0.54 0.01 -0.16 0.1 -0.22 0.28 -0.14 0.43 0.05 0.1 1.33 2.4 3.96 2.4 s3.9 -2.3 3.96 -2.4 c0.08 -0.15 0.03 -0.33 -0.13 -0.43 a0.524 0.524 0 0 0 -0.54 -0.01Z M6.4 24.53 c0.03 0.14 0.89 3.33 5.69 3.33 4.81 0 5.66 -3.19 5.69 -3.33 a0.37 0.37 0 0 0 -0.18 -0.42 0.395 0.395 0 0 0 -0.46 0.06 c-0.01 0.01 -1.49 1.41 -5.06 1.41 -3.57 0 -5.04 -1.4 -5.06 -1.41 a0.386 0.386 0 0 0 -0.46 -0.06 c-0.13 0.08 -0.2 0.25 -0.16 0.42Z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 21.85 17.97
                moveTo(x = 21.85f, y = 17.97f)
                // a 0.524 0.524 0 0 0 -0.54 -0.01
                arcToRelative(
                    a = 0.524f,
                    b = 0.524f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.54f,
                    dy1 = -0.01f,
                )
                // c -0.01 0.01 -1.12 0.66 -3.29 0.66
                curveToRelative(
                    dx1 = -0.01f,
                    dy1 = 0.01f,
                    dx2 = -1.12f,
                    dy2 = 0.66f,
                    dx3 = -3.29f,
                    dy3 = 0.66f,
                )
                // s -3.28 -0.65 -3.28 -0.66
                reflectiveCurveToRelative(
                    dx1 = -3.28f,
                    dy1 = -0.65f,
                    dx2 = -3.28f,
                    dy2 = -0.66f,
                )
                // c -0.16 -0.1 -0.39 -0.1 -0.54 0.01
                curveToRelative(
                    dx1 = -0.16f,
                    dy1 = -0.1f,
                    dx2 = -0.39f,
                    dy2 = -0.1f,
                    dx3 = -0.54f,
                    dy3 = 0.01f,
                )
                // c -0.16 0.1 -0.21 0.28 -0.13 0.43
                curveToRelative(
                    dx1 = -0.16f,
                    dy1 = 0.1f,
                    dx2 = -0.21f,
                    dy2 = 0.28f,
                    dx3 = -0.13f,
                    dy3 = 0.43f,
                )
                // c 0.05 0.1 1.33 2.4 3.96 2.4
                curveToRelative(
                    dx1 = 0.05f,
                    dy1 = 0.1f,
                    dx2 = 1.33f,
                    dy2 = 2.4f,
                    dx3 = 3.96f,
                    dy3 = 2.4f,
                )
                // s 3.9 -2.3 3.96 -2.4
                reflectiveCurveToRelative(
                    dx1 = 3.9f,
                    dy1 = -2.3f,
                    dx2 = 3.96f,
                    dy2 = -2.4f,
                )
                // c 0.07 -0.15 0.01 -0.33 -0.14 -0.43z
                curveToRelative(
                    dx1 = 0.07f,
                    dy1 = -0.15f,
                    dx2 = 0.01f,
                    dy2 = -0.33f,
                    dx3 = -0.14f,
                    dy3 = -0.43f,
                )
                close()
                // M 9.27 17.96
                moveTo(x = 9.27f, y = 17.96f)
                // c -0.01 0.01 -1.12 0.66 -3.29 0.66
                curveToRelative(
                    dx1 = -0.01f,
                    dy1 = 0.01f,
                    dx2 = -1.12f,
                    dy2 = 0.66f,
                    dx3 = -3.29f,
                    dy3 = 0.66f,
                )
                // s -3.28 -0.65 -3.28 -0.66
                reflectiveCurveToRelative(
                    dx1 = -3.28f,
                    dy1 = -0.65f,
                    dx2 = -3.28f,
                    dy2 = -0.66f,
                )
                // c -0.16 -0.1 -0.39 -0.1 -0.54 0.01
                curveToRelative(
                    dx1 = -0.16f,
                    dy1 = -0.1f,
                    dx2 = -0.39f,
                    dy2 = -0.1f,
                    dx3 = -0.54f,
                    dy3 = 0.01f,
                )
                // c -0.16 0.1 -0.22 0.28 -0.14 0.43
                curveToRelative(
                    dx1 = -0.16f,
                    dy1 = 0.1f,
                    dx2 = -0.22f,
                    dy2 = 0.28f,
                    dx3 = -0.14f,
                    dy3 = 0.43f,
                )
                // c 0.05 0.1 1.33 2.4 3.96 2.4
                curveToRelative(
                    dx1 = 0.05f,
                    dy1 = 0.1f,
                    dx2 = 1.33f,
                    dy2 = 2.4f,
                    dx3 = 3.96f,
                    dy3 = 2.4f,
                )
                // s 3.9 -2.3 3.96 -2.4
                reflectiveCurveToRelative(
                    dx1 = 3.9f,
                    dy1 = -2.3f,
                    dx2 = 3.96f,
                    dy2 = -2.4f,
                )
                // c 0.08 -0.15 0.03 -0.33 -0.13 -0.43
                curveToRelative(
                    dx1 = 0.08f,
                    dy1 = -0.15f,
                    dx2 = 0.03f,
                    dy2 = -0.33f,
                    dx3 = -0.13f,
                    dy3 = -0.43f,
                )
                // a 0.524 0.524 0 0 0 -0.54 -0.01z
                arcToRelative(
                    a = 0.524f,
                    b = 0.524f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.54f,
                    dy1 = -0.01f,
                )
                close()
                // M 6.4 24.53
                moveTo(x = 6.4f, y = 24.53f)
                // c 0.03 0.14 0.89 3.33 5.69 3.33
                curveToRelative(
                    dx1 = 0.03f,
                    dy1 = 0.14f,
                    dx2 = 0.89f,
                    dy2 = 3.33f,
                    dx3 = 5.69f,
                    dy3 = 3.33f,
                )
                // c 4.81 0 5.66 -3.19 5.69 -3.33
                curveToRelative(
                    dx1 = 4.81f,
                    dy1 = 0.0f,
                    dx2 = 5.66f,
                    dy2 = -3.19f,
                    dx3 = 5.69f,
                    dy3 = -3.33f,
                )
                // a 0.37 0.37 0 0 0 -0.18 -0.42
                arcToRelative(
                    a = 0.37f,
                    b = 0.37f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.18f,
                    dy1 = -0.42f,
                )
                // a 0.395 0.395 0 0 0 -0.46 0.06
                arcToRelative(
                    a = 0.395f,
                    b = 0.395f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.46f,
                    dy1 = 0.06f,
                )
                // c -0.01 0.01 -1.49 1.41 -5.06 1.41
                curveToRelative(
                    dx1 = -0.01f,
                    dy1 = 0.01f,
                    dx2 = -1.49f,
                    dy2 = 1.41f,
                    dx3 = -5.06f,
                    dy3 = 1.41f,
                )
                // c -3.57 0 -5.04 -1.4 -5.06 -1.41
                curveToRelative(
                    dx1 = -3.57f,
                    dy1 = 0.0f,
                    dx2 = -5.04f,
                    dy2 = -1.4f,
                    dx3 = -5.06f,
                    dy3 = -1.41f,
                )
                // a 0.386 0.386 0 0 0 -0.46 -0.06
                arcToRelative(
                    a = 0.386f,
                    b = 0.386f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.46f,
                    dy1 = -0.06f,
                )
                // c -0.13 0.08 -0.2 0.25 -0.16 0.42z
                curveToRelative(
                    dx1 = -0.13f,
                    dy1 = 0.08f,
                    dx2 = -0.2f,
                    dy2 = 0.25f,
                    dx3 = -0.16f,
                    dy3 = 0.42f,
                )
                close()
            }
            // M25.23 25.88 c0.03 0.53 0.47 0.95 1 0.95 h0.04 c1.84 -0.09 6.4 -0.48 8.94 -2.18 0.46 -0.3 0.59 -0.92 0.28 -1.38 a0.987 0.987 0 0 0 -1.38 -0.28 c-2.19 1.46 -6.62 1.78 -7.93 1.84 -0.55 0.03 -0.98 0.5 -0.95 1.05Z M33.88 15.38 c-0.4 -0.16 -0.83 -0.25 -1.27 -0.25 h-1.2 c-0.1 0 -0.19 0.03 -0.27 0.06 0.2 0.63 0.36 1.28 0.48 1.94 h0.99 c0.18 0 0.35 0.03 0.52 0.1 0.65 0.26 0.88 0.85 0.87 1.32 0 0.22 -0.07 0.95 -0.87 1.25 -0.39 0.15 -0.81 0.28 -1.24 0.4 -2.19 0.61 -4.97 0.93 -8.31 0.93 -0.55 0 -1 0.45 -1 1 s0.45 1 1 1 c3.17 0 5.9 -0.27 8.14 -0.81 0.76 -0.18 1.47 -0.4 2.12 -0.64 a3.32 3.32 0 0 0 2.16 -3.1 c0.02 -1.42 -0.82 -2.67 -2.12 -3.2Z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 25.23 25.88
                moveTo(x = 25.23f, y = 25.88f)
                // c 0.03 0.53 0.47 0.95 1 0.95
                curveToRelative(
                    dx1 = 0.03f,
                    dy1 = 0.53f,
                    dx2 = 0.47f,
                    dy2 = 0.95f,
                    dx3 = 1.0f,
                    dy3 = 0.95f,
                )
                // h 0.04
                horizontalLineToRelative(dx = 0.04f)
                // c 1.84 -0.09 6.4 -0.48 8.94 -2.18
                curveToRelative(
                    dx1 = 1.84f,
                    dy1 = -0.09f,
                    dx2 = 6.4f,
                    dy2 = -0.48f,
                    dx3 = 8.94f,
                    dy3 = -2.18f,
                )
                // c 0.46 -0.3 0.59 -0.92 0.28 -1.38
                curveToRelative(
                    dx1 = 0.46f,
                    dy1 = -0.3f,
                    dx2 = 0.59f,
                    dy2 = -0.92f,
                    dx3 = 0.28f,
                    dy3 = -1.38f,
                )
                // a 0.987 0.987 0 0 0 -1.38 -0.28
                arcToRelative(
                    a = 0.987f,
                    b = 0.987f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.38f,
                    dy1 = -0.28f,
                )
                // c -2.19 1.46 -6.62 1.78 -7.93 1.84
                curveToRelative(
                    dx1 = -2.19f,
                    dy1 = 1.46f,
                    dx2 = -6.62f,
                    dy2 = 1.78f,
                    dx3 = -7.93f,
                    dy3 = 1.84f,
                )
                // c -0.55 0.03 -0.98 0.5 -0.95 1.05z
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.03f,
                    dx2 = -0.98f,
                    dy2 = 0.5f,
                    dx3 = -0.95f,
                    dy3 = 1.05f,
                )
                close()
                // M 33.88 15.38
                moveTo(x = 33.88f, y = 15.38f)
                // c -0.4 -0.16 -0.83 -0.25 -1.27 -0.25
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = -0.16f,
                    dx2 = -0.83f,
                    dy2 = -0.25f,
                    dx3 = -1.27f,
                    dy3 = -0.25f,
                )
                // h -1.2
                horizontalLineToRelative(dx = -1.2f)
                // c -0.1 0 -0.19 0.03 -0.27 0.06
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.0f,
                    dx2 = -0.19f,
                    dy2 = 0.03f,
                    dx3 = -0.27f,
                    dy3 = 0.06f,
                )
                // c 0.2 0.63 0.36 1.28 0.48 1.94
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = 0.63f,
                    dx2 = 0.36f,
                    dy2 = 1.28f,
                    dx3 = 0.48f,
                    dy3 = 1.94f,
                )
                // h 0.99
                horizontalLineToRelative(dx = 0.99f)
                // c 0.18 0 0.35 0.03 0.52 0.1
                curveToRelative(
                    dx1 = 0.18f,
                    dy1 = 0.0f,
                    dx2 = 0.35f,
                    dy2 = 0.03f,
                    dx3 = 0.52f,
                    dy3 = 0.1f,
                )
                // c 0.65 0.26 0.88 0.85 0.87 1.32
                curveToRelative(
                    dx1 = 0.65f,
                    dy1 = 0.26f,
                    dx2 = 0.88f,
                    dy2 = 0.85f,
                    dx3 = 0.87f,
                    dy3 = 1.32f,
                )
                // c 0 0.22 -0.07 0.95 -0.87 1.25
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.22f,
                    dx2 = -0.07f,
                    dy2 = 0.95f,
                    dx3 = -0.87f,
                    dy3 = 1.25f,
                )
                // c -0.39 0.15 -0.81 0.28 -1.24 0.4
                curveToRelative(
                    dx1 = -0.39f,
                    dy1 = 0.15f,
                    dx2 = -0.81f,
                    dy2 = 0.28f,
                    dx3 = -1.24f,
                    dy3 = 0.4f,
                )
                // c -2.19 0.61 -4.97 0.93 -8.31 0.93
                curveToRelative(
                    dx1 = -2.19f,
                    dy1 = 0.61f,
                    dx2 = -4.97f,
                    dy2 = 0.93f,
                    dx3 = -8.31f,
                    dy3 = 0.93f,
                )
                // c -0.55 0 -1 0.45 -1 1
                curveToRelative(
                    dx1 = -0.55f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.45f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s 0.45 1 1 1
                reflectiveCurveToRelative(
                    dx1 = 0.45f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // c 3.17 0 5.9 -0.27 8.14 -0.81
                curveToRelative(
                    dx1 = 3.17f,
                    dy1 = 0.0f,
                    dx2 = 5.9f,
                    dy2 = -0.27f,
                    dx3 = 8.14f,
                    dy3 = -0.81f,
                )
                // c 0.76 -0.18 1.47 -0.4 2.12 -0.64
                curveToRelative(
                    dx1 = 0.76f,
                    dy1 = -0.18f,
                    dx2 = 1.47f,
                    dy2 = -0.4f,
                    dx3 = 2.12f,
                    dy3 = -0.64f,
                )
                // a 3.32 3.32 0 0 0 2.16 -3.1
                arcToRelative(
                    a = 3.32f,
                    b = 3.32f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.16f,
                    dy1 = -3.1f,
                )
                // c 0.02 -1.42 -0.82 -2.67 -2.12 -3.2z
                curveToRelative(
                    dx1 = 0.02f,
                    dy1 = -1.42f,
                    dx2 = -0.82f,
                    dy2 = -2.67f,
                    dx3 = -2.12f,
                    dy3 = -3.2f,
                )
                close()
            }
        }.build().also { _emoji1f642200d2194Fe0f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f642200d2194Fe0f: ImageVector? = null
