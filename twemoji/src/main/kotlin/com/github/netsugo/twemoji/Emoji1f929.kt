package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f929: ImageVector
    get() {
        val current = _emoji1f929
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f929",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 18 c0 9.941 -8.059 18 -18 18 S0 27.941 0 18 8.059 0 18 0 s18 8.059 18 18
            path(
                fill = SolidColor(Color(0xFFFFCC4D)),
            ) {
                // M 36 18
                moveTo(x = 36.0f, y = 18.0f)
                // c 0 9.941 -8.059 18 -18 18
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.941f,
                    dx2 = -8.059f,
                    dy2 = 18.0f,
                    dx3 = -18.0f,
                    dy3 = 18.0f,
                )
                // S 0 27.941 0 18
                reflectiveCurveTo(
                    x1 = 0.0f,
                    y1 = 27.941f,
                    x2 = 0.0f,
                    y2 = 18.0f,
                )
                // S 8.059 0 18 0
                reflectiveCurveTo(
                    x1 = 8.059f,
                    y1 = 0.0f,
                    x2 = 18.0f,
                    y2 = 0.0f,
                )
                // s 18 8.059 18 18
                reflectiveCurveToRelative(
                    dx1 = 18.0f,
                    dy1 = 8.059f,
                    dx2 = 18.0f,
                    dy2 = 18.0f,
                )
            }
            // M18 21 c-3.623 0 -6.027 -0.422 -9 -1 -0.679 -0.131 -2 0 -2 2 0 4 4.595 9 11 9 6.404 0 11 -5 11 -9 0 -2 -1.321 -2.132 -2 -2 -2.973 0.578 -5.377 1 -9 1z
            path(
                fill = SolidColor(Color(0xFF664500)),
            ) {
                // M 18 21
                moveTo(x = 18.0f, y = 21.0f)
                // c -3.623 0 -6.027 -0.422 -9 -1
                curveToRelative(
                    dx1 = -3.623f,
                    dy1 = 0.0f,
                    dx2 = -6.027f,
                    dy2 = -0.422f,
                    dx3 = -9.0f,
                    dy3 = -1.0f,
                )
                // c -0.679 -0.131 -2 0 -2 2
                curveToRelative(
                    dx1 = -0.679f,
                    dy1 = -0.131f,
                    dx2 = -2.0f,
                    dy2 = 0.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // c 0 4 4.595 9 11 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 4.595f,
                    dy2 = 9.0f,
                    dx3 = 11.0f,
                    dy3 = 9.0f,
                )
                // c 6.404 0 11 -5 11 -9
                curveToRelative(
                    dx1 = 6.404f,
                    dy1 = 0.0f,
                    dx2 = 11.0f,
                    dy2 = -5.0f,
                    dx3 = 11.0f,
                    dy3 = -9.0f,
                )
                // c 0 -2 -1.321 -2.132 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                    dx2 = -1.321f,
                    dy2 = -2.132f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // c -2.973 0.578 -5.377 1 -9 1z
                curveToRelative(
                    dx1 = -2.973f,
                    dy1 = 0.578f,
                    dx2 = -5.377f,
                    dy2 = 1.0f,
                    dx3 = -9.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M9 22 s3 1 9 1 9 -1 9 -1 -2 4 -9 4 -9 -4 -9 -4z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // s 3 1 9 1
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.0f,
                    dx2 = 9.0f,
                    dy2 = 1.0f,
                )
                // s 9 -1 9 -1
                reflectiveCurveToRelative(
                    dx1 = 9.0f,
                    dy1 = -1.0f,
                    dx2 = 9.0f,
                    dy2 = -1.0f,
                )
                // s -2 4 -9 4
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = 4.0f,
                    dx2 = -9.0f,
                    dy2 = 4.0f,
                )
                // s -9 -4 -9 -4z
                reflectiveCurveToRelative(
                    dx1 = -9.0f,
                    dy1 = -4.0f,
                    dx2 = -9.0f,
                    dy2 = -4.0f,
                )
                close()
            }
            // M15.682 4.413 l-4.542 0.801 L8.8 0.961 C8.542 0.492 8.012 0.241 7.488 0.333 c-0.527 0.093 -0.937 0.511 -1.019 1.039 l-0.745 4.797 -4.542 0.801 c-0.535 0.094 -0.948 0.525 -1.021 1.064 s0.211 1.063 0.703 1.297 l4.07 1.932 -0.748 4.812 c-0.083 0.536 0.189 1.064 0.673 1.309 0.179 0.09 0.371 0.133 0.562 0.133 0.327 0 0.65 -0.128 0.891 -0.372 l3.512 -3.561 4.518 2.145 c0.49 0.232 1.074 0.123 1.446 -0.272 0.372 -0.395 0.446 -0.984 0.185 -1.459 L13.625 9.73 l3.165 -3.208 c0.382 -0.387 0.469 -0.977 0.217 -1.459 -0.254 -0.482 -0.793 -0.743 -1.325 -0.65z M20.318 4.413 l4.542 0.801 L27.2 0.961 c0.258 -0.469 0.788 -0.72 1.312 -0.628 0.526 0.093 0.936 0.511 1.018 1.039 l0.745 4.797 4.542 0.801 c0.536 0.094 0.949 0.524 1.021 1.063 s-0.211 1.063 -0.703 1.297 l-4.07 1.932 0.748 4.812 c0.083 0.536 -0.189 1.064 -0.673 1.309 -0.179 0.09 -0.371 0.133 -0.562 0.133 -0.327 0 -0.65 -0.128 -0.891 -0.372 l-3.512 -3.561 -4.518 2.145 c-0.49 0.232 -1.074 0.123 -1.446 -0.272 -0.372 -0.395 -0.446 -0.984 -0.185 -1.459 l2.348 -4.267 -3.165 -3.208 c-0.382 -0.387 -0.469 -0.977 -0.217 -1.459 0.255 -0.482 0.794 -0.743 1.326 -0.65z
            path(
                fill = SolidColor(Color(0xFFE95F28)),
            ) {
                // M 15.682 4.413
                moveTo(x = 15.682f, y = 4.413f)
                // l -4.542 0.801
                lineToRelative(dx = -4.542f, dy = 0.801f)
                // L 8.8 0.961
                lineTo(x = 8.8f, y = 0.961f)
                // C 8.542 0.492 8.012 0.241 7.488 0.333
                curveTo(
                    x1 = 8.542f,
                    y1 = 0.492f,
                    x2 = 8.012f,
                    y2 = 0.241f,
                    x3 = 7.488f,
                    y3 = 0.333f,
                )
                // c -0.527 0.093 -0.937 0.511 -1.019 1.039
                curveToRelative(
                    dx1 = -0.527f,
                    dy1 = 0.093f,
                    dx2 = -0.937f,
                    dy2 = 0.511f,
                    dx3 = -1.019f,
                    dy3 = 1.039f,
                )
                // l -0.745 4.797
                lineToRelative(dx = -0.745f, dy = 4.797f)
                // l -4.542 0.801
                lineToRelative(dx = -4.542f, dy = 0.801f)
                // c -0.535 0.094 -0.948 0.525 -1.021 1.064
                curveToRelative(
                    dx1 = -0.535f,
                    dy1 = 0.094f,
                    dx2 = -0.948f,
                    dy2 = 0.525f,
                    dx3 = -1.021f,
                    dy3 = 1.064f,
                )
                // s 0.211 1.063 0.703 1.297
                reflectiveCurveToRelative(
                    dx1 = 0.211f,
                    dy1 = 1.063f,
                    dx2 = 0.703f,
                    dy2 = 1.297f,
                )
                // l 4.07 1.932
                lineToRelative(dx = 4.07f, dy = 1.932f)
                // l -0.748 4.812
                lineToRelative(dx = -0.748f, dy = 4.812f)
                // c -0.083 0.536 0.189 1.064 0.673 1.309
                curveToRelative(
                    dx1 = -0.083f,
                    dy1 = 0.536f,
                    dx2 = 0.189f,
                    dy2 = 1.064f,
                    dx3 = 0.673f,
                    dy3 = 1.309f,
                )
                // c 0.179 0.09 0.371 0.133 0.562 0.133
                curveToRelative(
                    dx1 = 0.179f,
                    dy1 = 0.09f,
                    dx2 = 0.371f,
                    dy2 = 0.133f,
                    dx3 = 0.562f,
                    dy3 = 0.133f,
                )
                // c 0.327 0 0.65 -0.128 0.891 -0.372
                curveToRelative(
                    dx1 = 0.327f,
                    dy1 = 0.0f,
                    dx2 = 0.65f,
                    dy2 = -0.128f,
                    dx3 = 0.891f,
                    dy3 = -0.372f,
                )
                // l 3.512 -3.561
                lineToRelative(dx = 3.512f, dy = -3.561f)
                // l 4.518 2.145
                lineToRelative(dx = 4.518f, dy = 2.145f)
                // c 0.49 0.232 1.074 0.123 1.446 -0.272
                curveToRelative(
                    dx1 = 0.49f,
                    dy1 = 0.232f,
                    dx2 = 1.074f,
                    dy2 = 0.123f,
                    dx3 = 1.446f,
                    dy3 = -0.272f,
                )
                // c 0.372 -0.395 0.446 -0.984 0.185 -1.459
                curveToRelative(
                    dx1 = 0.372f,
                    dy1 = -0.395f,
                    dx2 = 0.446f,
                    dy2 = -0.984f,
                    dx3 = 0.185f,
                    dy3 = -1.459f,
                )
                // L 13.625 9.73
                lineTo(x = 13.625f, y = 9.73f)
                // l 3.165 -3.208
                lineToRelative(dx = 3.165f, dy = -3.208f)
                // c 0.382 -0.387 0.469 -0.977 0.217 -1.459
                curveToRelative(
                    dx1 = 0.382f,
                    dy1 = -0.387f,
                    dx2 = 0.469f,
                    dy2 = -0.977f,
                    dx3 = 0.217f,
                    dy3 = -1.459f,
                )
                // c -0.254 -0.482 -0.793 -0.743 -1.325 -0.65z
                curveToRelative(
                    dx1 = -0.254f,
                    dy1 = -0.482f,
                    dx2 = -0.793f,
                    dy2 = -0.743f,
                    dx3 = -1.325f,
                    dy3 = -0.65f,
                )
                close()
                // M 20.318 4.413
                moveTo(x = 20.318f, y = 4.413f)
                // l 4.542 0.801
                lineToRelative(dx = 4.542f, dy = 0.801f)
                // L 27.2 0.961
                lineTo(x = 27.2f, y = 0.961f)
                // c 0.258 -0.469 0.788 -0.72 1.312 -0.628
                curveToRelative(
                    dx1 = 0.258f,
                    dy1 = -0.469f,
                    dx2 = 0.788f,
                    dy2 = -0.72f,
                    dx3 = 1.312f,
                    dy3 = -0.628f,
                )
                // c 0.526 0.093 0.936 0.511 1.018 1.039
                curveToRelative(
                    dx1 = 0.526f,
                    dy1 = 0.093f,
                    dx2 = 0.936f,
                    dy2 = 0.511f,
                    dx3 = 1.018f,
                    dy3 = 1.039f,
                )
                // l 0.745 4.797
                lineToRelative(dx = 0.745f, dy = 4.797f)
                // l 4.542 0.801
                lineToRelative(dx = 4.542f, dy = 0.801f)
                // c 0.536 0.094 0.949 0.524 1.021 1.063
                curveToRelative(
                    dx1 = 0.536f,
                    dy1 = 0.094f,
                    dx2 = 0.949f,
                    dy2 = 0.524f,
                    dx3 = 1.021f,
                    dy3 = 1.063f,
                )
                // s -0.211 1.063 -0.703 1.297
                reflectiveCurveToRelative(
                    dx1 = -0.211f,
                    dy1 = 1.063f,
                    dx2 = -0.703f,
                    dy2 = 1.297f,
                )
                // l -4.07 1.932
                lineToRelative(dx = -4.07f, dy = 1.932f)
                // l 0.748 4.812
                lineToRelative(dx = 0.748f, dy = 4.812f)
                // c 0.083 0.536 -0.189 1.064 -0.673 1.309
                curveToRelative(
                    dx1 = 0.083f,
                    dy1 = 0.536f,
                    dx2 = -0.189f,
                    dy2 = 1.064f,
                    dx3 = -0.673f,
                    dy3 = 1.309f,
                )
                // c -0.179 0.09 -0.371 0.133 -0.562 0.133
                curveToRelative(
                    dx1 = -0.179f,
                    dy1 = 0.09f,
                    dx2 = -0.371f,
                    dy2 = 0.133f,
                    dx3 = -0.562f,
                    dy3 = 0.133f,
                )
                // c -0.327 0 -0.65 -0.128 -0.891 -0.372
                curveToRelative(
                    dx1 = -0.327f,
                    dy1 = 0.0f,
                    dx2 = -0.65f,
                    dy2 = -0.128f,
                    dx3 = -0.891f,
                    dy3 = -0.372f,
                )
                // l -3.512 -3.561
                lineToRelative(dx = -3.512f, dy = -3.561f)
                // l -4.518 2.145
                lineToRelative(dx = -4.518f, dy = 2.145f)
                // c -0.49 0.232 -1.074 0.123 -1.446 -0.272
                curveToRelative(
                    dx1 = -0.49f,
                    dy1 = 0.232f,
                    dx2 = -1.074f,
                    dy2 = 0.123f,
                    dx3 = -1.446f,
                    dy3 = -0.272f,
                )
                // c -0.372 -0.395 -0.446 -0.984 -0.185 -1.459
                curveToRelative(
                    dx1 = -0.372f,
                    dy1 = -0.395f,
                    dx2 = -0.446f,
                    dy2 = -0.984f,
                    dx3 = -0.185f,
                    dy3 = -1.459f,
                )
                // l 2.348 -4.267
                lineToRelative(dx = 2.348f, dy = -4.267f)
                // l -3.165 -3.208
                lineToRelative(dx = -3.165f, dy = -3.208f)
                // c -0.382 -0.387 -0.469 -0.977 -0.217 -1.459
                curveToRelative(
                    dx1 = -0.382f,
                    dy1 = -0.387f,
                    dx2 = -0.469f,
                    dy2 = -0.977f,
                    dx3 = -0.217f,
                    dy3 = -1.459f,
                )
                // c 0.255 -0.482 0.794 -0.743 1.326 -0.65z
                curveToRelative(
                    dx1 = 0.255f,
                    dy1 = -0.482f,
                    dx2 = 0.794f,
                    dy2 = -0.743f,
                    dx3 = 1.326f,
                    dy3 = -0.65f,
                )
                close()
            }
        }.build().also { _emoji1f929 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f929: ImageVector? = null
