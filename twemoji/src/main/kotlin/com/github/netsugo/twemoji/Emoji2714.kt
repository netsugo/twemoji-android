package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2714: ImageVector
    get() {
        val current = _emoji2714
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2714",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34.459 1.375 c-1.391 -0.902 -3.248 -0.506 -4.149 0.884 L13.5 28.17 l-8.198 -7.58 c-1.217 -1.125 -3.114 -1.051 -4.239 0.166 -1.125 1.216 -1.051 3.115 0.166 4.239 l10.764 9.952 s0.309 0.266 0.452 0.359 c0.504 0.328 1.07 0.484 1.63 0.484 0.982 0 1.945 -0.482 2.52 -1.368 L35.343 5.524 c0.902 -1.39 0.506 -3.248 -0.884 -4.149z
            path(
                fill = SolidColor(Color(0xFF31373D)),
            ) {
                // M 34.459 1.375
                moveTo(x = 34.459f, y = 1.375f)
                // c -1.391 -0.902 -3.248 -0.506 -4.149 0.884
                curveToRelative(
                    dx1 = -1.391f,
                    dy1 = -0.902f,
                    dx2 = -3.248f,
                    dy2 = -0.506f,
                    dx3 = -4.149f,
                    dy3 = 0.884f,
                )
                // L 13.5 28.17
                lineTo(x = 13.5f, y = 28.17f)
                // l -8.198 -7.58
                lineToRelative(dx = -8.198f, dy = -7.58f)
                // c -1.217 -1.125 -3.114 -1.051 -4.239 0.166
                curveToRelative(
                    dx1 = -1.217f,
                    dy1 = -1.125f,
                    dx2 = -3.114f,
                    dy2 = -1.051f,
                    dx3 = -4.239f,
                    dy3 = 0.166f,
                )
                // c -1.125 1.216 -1.051 3.115 0.166 4.239
                curveToRelative(
                    dx1 = -1.125f,
                    dy1 = 1.216f,
                    dx2 = -1.051f,
                    dy2 = 3.115f,
                    dx3 = 0.166f,
                    dy3 = 4.239f,
                )
                // l 10.764 9.952
                lineToRelative(dx = 10.764f, dy = 9.952f)
                // s 0.309 0.266 0.452 0.359
                reflectiveCurveToRelative(
                    dx1 = 0.309f,
                    dy1 = 0.266f,
                    dx2 = 0.452f,
                    dy2 = 0.359f,
                )
                // c 0.504 0.328 1.07 0.484 1.63 0.484
                curveToRelative(
                    dx1 = 0.504f,
                    dy1 = 0.328f,
                    dx2 = 1.07f,
                    dy2 = 0.484f,
                    dx3 = 1.63f,
                    dy3 = 0.484f,
                )
                // c 0.982 0 1.945 -0.482 2.52 -1.368
                curveToRelative(
                    dx1 = 0.982f,
                    dy1 = 0.0f,
                    dx2 = 1.945f,
                    dy2 = -0.482f,
                    dx3 = 2.52f,
                    dy3 = -1.368f,
                )
                // L 35.343 5.524
                lineTo(x = 35.343f, y = 5.524f)
                // c 0.902 -1.39 0.506 -3.248 -0.884 -4.149z
                curveToRelative(
                    dx1 = 0.902f,
                    dy1 = -1.39f,
                    dx2 = 0.506f,
                    dy2 = -3.248f,
                    dx3 = -0.884f,
                    dy3 = -4.149f,
                )
                close()
            }
        }.build().also { _emoji2714 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2714: ImageVector? = null
