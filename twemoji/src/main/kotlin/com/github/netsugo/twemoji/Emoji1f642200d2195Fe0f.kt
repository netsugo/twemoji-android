package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f642200d2195Fe0f: ImageVector
    get() {
        val current = _emoji1f642200d2195Fe0f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f642200d2195Fe0f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 20 m-16 0 a16 16 0 1 1 32 0 a16 16 0 1 1 -32 0
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 18 20
                moveTo(x = 18.0f, y = 20.0f)
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
            // M27.85 22.97 a0.524 0.524 0 0 0 -0.54 -0.01 c-0.01 0.01 -1.12 0.66 -3.29 0.66 s-3.28 -0.65 -3.28 -0.66 c-0.16 -0.1 -0.39 -0.1 -0.54 0.01 -0.16 0.1 -0.21 0.28 -0.13 0.43 0.05 0.1 1.33 2.4 3.96 2.4 s3.9 -2.3 3.96 -2.4 c0.07 -0.15 0.01 -0.33 -0.14 -0.43Z M15.27 22.96 c-0.01 0.01 -1.12 0.66 -3.29 0.66 s-3.28 -0.65 -3.28 -0.66 c-0.16 -0.1 -0.39 -0.1 -0.54 0.01 -0.16 0.1 -0.22 0.28 -0.14 0.43 0.05 0.1 1.33 2.4 3.96 2.4 s3.9 -2.3 3.96 -2.4 c0.08 -0.15 0.03 -0.33 -0.13 -0.43 a0.524 0.524 0 0 0 -0.54 -0.01Z M12.4 29.53 c0.03 0.14 0.89 3.33 5.69 3.33 4.81 0 5.66 -3.19 5.69 -3.33 a0.37 0.37 0 0 0 -0.18 -0.42 0.395 0.395 0 0 0 -0.46 0.06 c-0.01 0.01 -1.49 1.41 -5.06 1.41 -3.57 0 -5.04 -1.4 -5.06 -1.41 a0.386 0.386 0 0 0 -0.46 -0.06 c-0.13 0.08 -0.2 0.25 -0.16 0.42Z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 27.85 22.97
                moveTo(x = 27.85f, y = 22.97f)
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
                // M 15.27 22.96
                moveTo(x = 15.27f, y = 22.96f)
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
                // M 12.4 29.53
                moveTo(x = 12.4f, y = 29.53f)
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
            // M6.61 15.95 c-0.41 0 -0.79 -0.25 -0.94 -0.66 C2.56 6.74 8.36 0.63 8.61 0.37 9 -0.02 9.63 -0.03 10.03 0.35 c0.4 0.38 0.41 1.02 0.02 1.41 -0.21 0.23 -5.17 5.5 -2.5 12.84 a0.998 0.998 0 0 1 -0.6 1.28 c-0.11 0.05 -0.22 0.07 -0.34 0.07Z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 6.61 15.95
                moveTo(x = 6.61f, y = 15.95f)
                // c -0.41 0 -0.79 -0.25 -0.94 -0.66
                curveToRelative(
                    dx1 = -0.41f,
                    dy1 = 0.0f,
                    dx2 = -0.79f,
                    dy2 = -0.25f,
                    dx3 = -0.94f,
                    dy3 = -0.66f,
                )
                // C 2.56 6.74 8.36 0.63 8.61 0.37
                curveTo(
                    x1 = 2.56f,
                    y1 = 6.74f,
                    x2 = 8.36f,
                    y2 = 0.63f,
                    x3 = 8.61f,
                    y3 = 0.37f,
                )
                // C 9 -0.02 9.63 -0.03 10.03 0.35
                curveTo(
                    x1 = 9.0f,
                    y1 = -0.02f,
                    x2 = 9.63f,
                    y2 = -0.03f,
                    x3 = 10.03f,
                    y3 = 0.35f,
                )
                // c 0.4 0.38 0.41 1.02 0.02 1.41
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.38f,
                    dx2 = 0.41f,
                    dy2 = 1.02f,
                    dx3 = 0.02f,
                    dy3 = 1.41f,
                )
                // c -0.21 0.23 -5.17 5.5 -2.5 12.84
                curveToRelative(
                    dx1 = -0.21f,
                    dy1 = 0.23f,
                    dx2 = -5.17f,
                    dy2 = 5.5f,
                    dx3 = -2.5f,
                    dy3 = 12.84f,
                )
                // a 0.998 0.998 0 0 1 -0.6 1.28
                arcToRelative(
                    a = 0.998f,
                    b = 0.998f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.6f,
                    dy1 = 1.28f,
                )
                // c -0.11 0.05 -0.22 0.07 -0.34 0.07z
                curveToRelative(
                    dx1 = -0.11f,
                    dy1 = 0.05f,
                    dx2 = -0.22f,
                    dy2 = 0.07f,
                    dx3 = -0.34f,
                    dy3 = 0.07f,
                )
                close()
            }
            // M9.578 12.63 c-0.48 0 -0.91 -0.35 -0.99 -0.84 -0.61 -3.83 0.78 -6.84 2.05 -8.69 0.31 -0.45 0.94 -0.57 1.39 -0.26 0.46 0.31 0.57 0.94 0.26 1.39 -1.55 2.25 -2.13 4.69 -1.73 7.24 a0.988 0.988 0 0 1 -0.83 1.14 c-0.04 0.02 -0.09 0.02 -0.15 0.02Z
            path(
                fill = SolidColor(Color(0xFF5DADEC)),
            ) {
                // M 9.578 12.63
                moveTo(x = 9.578f, y = 12.63f)
                // c -0.48 0 -0.91 -0.35 -0.99 -0.84
                curveToRelative(
                    dx1 = -0.48f,
                    dy1 = 0.0f,
                    dx2 = -0.91f,
                    dy2 = -0.35f,
                    dx3 = -0.99f,
                    dy3 = -0.84f,
                )
                // c -0.61 -3.83 0.78 -6.84 2.05 -8.69
                curveToRelative(
                    dx1 = -0.61f,
                    dy1 = -3.83f,
                    dx2 = 0.78f,
                    dy2 = -6.84f,
                    dx3 = 2.05f,
                    dy3 = -8.69f,
                )
                // c 0.31 -0.45 0.94 -0.57 1.39 -0.26
                curveToRelative(
                    dx1 = 0.31f,
                    dy1 = -0.45f,
                    dx2 = 0.94f,
                    dy2 = -0.57f,
                    dx3 = 1.39f,
                    dy3 = -0.26f,
                )
                // c 0.46 0.31 0.57 0.94 0.26 1.39
                curveToRelative(
                    dx1 = 0.46f,
                    dy1 = 0.31f,
                    dx2 = 0.57f,
                    dy2 = 0.94f,
                    dx3 = 0.26f,
                    dy3 = 1.39f,
                )
                // c -1.55 2.25 -2.13 4.69 -1.73 7.24
                curveToRelative(
                    dx1 = -1.55f,
                    dy1 = 2.25f,
                    dx2 = -2.13f,
                    dy2 = 4.69f,
                    dx3 = -1.73f,
                    dy3 = 7.24f,
                )
                // a 0.988 0.988 0 0 1 -0.83 1.14
                arcToRelative(
                    a = 0.988f,
                    b = 0.988f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.83f,
                    dy1 = 1.14f,
                )
                // c -0.04 0.02 -0.09 0.02 -0.15 0.02z
                curveToRelative(
                    dx1 = -0.04f,
                    dy1 = 0.02f,
                    dx2 = -0.09f,
                    dy2 = 0.02f,
                    dx3 = -0.15f,
                    dy3 = 0.02f,
                )
                close()
            }
        }.build().also { _emoji1f642200d2195Fe0f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f642200d2195Fe0f: ImageVector? = null
