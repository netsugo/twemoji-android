package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f64f: ImageVector
    get() {
        val current = _emoji1f64f
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f64f",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M30 22 c-3 0 -6.688 7.094 -7 10 -0.421 3.915 2 4 2 4 h11 V26 s-3.438 -4 -6 -4z
            path(
                fill = SolidColor(Color(0xFF50A5E6)),
            ) {
                // M 30 22
                moveTo(x = 30.0f, y = 22.0f)
                // c -3 0 -6.688 7.094 -7 10
                curveToRelative(
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                    dx2 = -6.688f,
                    dy2 = 7.094f,
                    dx3 = -7.0f,
                    dy3 = 10.0f,
                )
                // c -0.421 3.915 2 4 2 4
                curveToRelative(
                    dx1 = -0.421f,
                    dy1 = 3.915f,
                    dx2 = 2.0f,
                    dy2 = 4.0f,
                    dx3 = 2.0f,
                    dy3 = 4.0f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // V 26
                verticalLineTo(y = 26.0f)
                // s -3.438 -4 -6 -4z
                reflectiveCurveToRelative(
                    dx1 = -3.438f,
                    dy1 = -4.0f,
                    dx2 = -6.0f,
                    dy2 = -4.0f,
                )
                close()
            }
            // M24.6491 33.554 a5.848 1.638 120 1 0 5.848 -10.129 a5.848 1.638 120 1 0 -5.848 10.129z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 24.6491 33.554
                moveTo(x = 24.6491f, y = 33.554f)
                // a 5.848 1.638 120 1 0 5.848 -10.129
                arcToRelative(
                    a = 5.848f,
                    b = 1.638f,
                    theta = 120.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.848f,
                    dy1 = -10.129f,
                )
                // a 5.848 1.638 120 1 0 -5.848 10.129z
                arcToRelative(
                    a = 5.848f,
                    b = 1.638f,
                    theta = 120.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.848f,
                    dy1 = 10.129f,
                )
                close()
            }
            // M20.086 0 c1.181 0 2.138 0.957 2.138 2.138 0 0.789 0.668 10.824 0.668 10.824 L17.948 18 V2.138 C17.948 0.957 18.905 0 20.086 0z
            path(
                fill = SolidColor(Color(0xFFF9CA55)),
            ) {
                // M 20.086 0
                moveTo(x = 20.086f, y = 0.0f)
                // c 1.181 0 2.138 0.957 2.138 2.138
                curveToRelative(
                    dx1 = 1.181f,
                    dy1 = 0.0f,
                    dx2 = 2.138f,
                    dy2 = 0.957f,
                    dx3 = 2.138f,
                    dy3 = 2.138f,
                )
                // c 0 0.789 0.668 10.824 0.668 10.824
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.789f,
                    dx2 = 0.668f,
                    dy2 = 10.824f,
                    dx3 = 0.668f,
                    dy3 = 10.824f,
                )
                // L 17.948 18
                lineTo(x = 17.948f, y = 18.0f)
                // V 2.138
                verticalLineTo(y = 2.138f)
                // C 17.948 0.957 18.905 0 20.086 0z
                curveTo(
                    x1 = 17.948f,
                    y1 = 0.957f,
                    x2 = 18.905f,
                    y2 = 0.0f,
                    x3 = 20.086f,
                    y3 = 0.0f,
                )
                close()
            }
            // M18.875 4.323 c0 -1.099 0.852 -1.989 1.903 -1.989 1.051 0 1.903 0.891 1.903 1.989 0 0 0.535 5.942 1.192 9.37 0.878 1.866 1.369 4.682 1.261 6.248 0.054 0.398 5.625 5.006 5.625 5.006 -0.281 1.813 -2.259 6.155 -4.759 8.159 l-3.521 -2.924 c-2.885 -0.404 -4.458 -3.331 -4.458 -4.264 0 -2.984 0.854 -21.595 0.854 -21.595z
            path(
                fill = SolidColor(Color(0xFFFFDC5D)),
            ) {
                // M 18.875 4.323
                moveTo(x = 18.875f, y = 4.323f)
                // c 0 -1.099 0.852 -1.989 1.903 -1.989
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.099f,
                    dx2 = 0.852f,
                    dy2 = -1.989f,
                    dx3 = 1.903f,
                    dy3 = -1.989f,
                )
                // c 1.051 0 1.903 0.891 1.903 1.989
                curveToRelative(
                    dx1 = 1.051f,
                    dy1 = 0.0f,
                    dx2 = 1.903f,
                    dy2 = 0.891f,
                    dx3 = 1.903f,
                    dy3 = 1.989f,
                )
                // c 0 0 0.535 5.942 1.192 9.37
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.535f,
                    dy2 = 5.942f,
                    dx3 = 1.192f,
                    dy3 = 9.37f,
                )
                // c 0.878 1.866 1.369 4.682 1.261 6.248
                curveToRelative(
                    dx1 = 0.878f,
                    dy1 = 1.866f,
                    dx2 = 1.369f,
                    dy2 = 4.682f,
                    dx3 = 1.261f,
                    dy3 = 6.248f,
                )
                // c 0.054 0.398 5.625 5.006 5.625 5.006
                curveToRelative(
                    dx1 = 0.054f,
                    dy1 = 0.398f,
                    dx2 = 5.625f,
                    dy2 = 5.006f,
                    dx3 = 5.625f,
                    dy3 = 5.006f,
                )
                // c -0.281 1.813 -2.259 6.155 -4.759 8.159
                curveToRelative(
                    dx1 = -0.281f,
                    dy1 = 1.813f,
                    dx2 = -2.259f,
                    dy2 = 6.155f,
                    dx3 = -4.759f,
                    dy3 = 8.159f,
                )
                // l -3.521 -2.924
                lineToRelative(dx = -3.521f, dy = -2.924f)
                // c -2.885 -0.404 -4.458 -3.331 -4.458 -4.264
                curveToRelative(
                    dx1 = -2.885f,
                    dy1 = -0.404f,
                    dx2 = -4.458f,
                    dy2 = -3.331f,
                    dx3 = -4.458f,
                    dy3 = -4.264f,
                )
                // c 0 -2.984 0.854 -21.595 0.854 -21.595z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.984f,
                    dx2 = 0.854f,
                    dy2 = -21.595f,
                    dx3 = 0.854f,
                    dy3 = -21.595f,
                )
                close()
            }
            // M6 22 c3 0 6.688 7.094 7 10 0.421 3.915 -2 4 -2 4 H0 V26 s3.438 -4 6 -4z
            path(
                fill = SolidColor(Color(0xFF50A5E6)),
            ) {
                // M 6 22
                moveTo(x = 6.0f, y = 22.0f)
                // c 3 0 6.688 7.094 7 10
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 6.688f,
                    dy2 = 7.094f,
                    dx3 = 7.0f,
                    dy3 = 10.0f,
                )
                // c 0.421 3.915 -2 4 -2 4
                curveToRelative(
                    dx1 = 0.421f,
                    dy1 = 3.915f,
                    dx2 = -2.0f,
                    dy2 = 4.0f,
                    dx3 = -2.0f,
                    dy3 = 4.0f,
                )
                // H 0
                horizontalLineTo(x = 0.0f)
                // V 26
                verticalLineTo(y = 26.0f)
                // s 3.438 -4 6 -4z
                reflectiveCurveToRelative(
                    dx1 = 3.438f,
                    dy1 = -4.0f,
                    dx2 = 6.0f,
                    dy2 = -4.0f,
                )
                close()
            }
            // M7.0072 29.307 a5.848 1.638 60 1 0 2.8371 -1.638 a5.848 1.638 60 1 0 -2.8371 1.638z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 7.0072 29.307
                moveTo(x = 7.0072f, y = 29.307f)
                // a 5.848 1.638 60 1 0 2.8371 -1.638
                arcToRelative(
                    a = 5.848f,
                    b = 1.638f,
                    theta = 60.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.8371f,
                    dy1 = -1.638f,
                )
                // a 5.848 1.638 60 1 0 -2.8371 1.638z
                arcToRelative(
                    a = 5.848f,
                    b = 1.638f,
                    theta = 60.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.8371f,
                    dy1 = 1.638f,
                )
                close()
            }
            // M16.061 0.011 c-1.266 -0.127 -2.333 0.864 -2.333 2.103 0 0.78 -0.184 10.319 -0.184 10.319 L17.895 18 l0.062 -15.765 c0 -1.106 -0.795 -2.114 -1.896 -2.224z
            path(
                fill = SolidColor(Color(0xFFF9CA55)),
            ) {
                // M 16.061 0.011
                moveTo(x = 16.061f, y = 0.011f)
                // c -1.266 -0.127 -2.333 0.864 -2.333 2.103
                curveToRelative(
                    dx1 = -1.266f,
                    dy1 = -0.127f,
                    dx2 = -2.333f,
                    dy2 = 0.864f,
                    dx3 = -2.333f,
                    dy3 = 2.103f,
                )
                // c 0 0.78 -0.184 10.319 -0.184 10.319
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.78f,
                    dx2 = -0.184f,
                    dy2 = 10.319f,
                    dx3 = -0.184f,
                    dy3 = 10.319f,
                )
                // L 17.895 18
                lineTo(x = 17.895f, y = 18.0f)
                // l 0.062 -15.765
                lineToRelative(dx = 0.062f, dy = -15.765f)
                // c 0 -1.106 -0.795 -2.114 -1.896 -2.224z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.106f,
                    dx2 = -0.795f,
                    dy2 = -2.114f,
                    dx3 = -1.896f,
                    dy3 = -2.224f,
                )
                close()
            }
            // M17.125 4.323 c0 -1.099 -0.852 -1.989 -1.903 -1.989 -1.051 0 -1.903 0.891 -1.903 1.989 0 0 -0.535 5.942 -1.192 9.37 -0.878 1.866 -1.369 4.682 -1.261 6.248 -0.054 0.398 -5.625 5.006 -5.625 5.006 C5.522 26.76 7.5 31.102 10 33.106 l3.521 -2.924 c2.885 -0.404 4.458 -3.331 4.458 -4.264 0 -2.984 -0.854 -21.595 -0.854 -21.595z
            path(
                fill = SolidColor(Color(0xFFFFDC5D)),
            ) {
                // M 17.125 4.323
                moveTo(x = 17.125f, y = 4.323f)
                // c 0 -1.099 -0.852 -1.989 -1.903 -1.989
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.099f,
                    dx2 = -0.852f,
                    dy2 = -1.989f,
                    dx3 = -1.903f,
                    dy3 = -1.989f,
                )
                // c -1.051 0 -1.903 0.891 -1.903 1.989
                curveToRelative(
                    dx1 = -1.051f,
                    dy1 = 0.0f,
                    dx2 = -1.903f,
                    dy2 = 0.891f,
                    dx3 = -1.903f,
                    dy3 = 1.989f,
                )
                // c 0 0 -0.535 5.942 -1.192 9.37
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.535f,
                    dy2 = 5.942f,
                    dx3 = -1.192f,
                    dy3 = 9.37f,
                )
                // c -0.878 1.866 -1.369 4.682 -1.261 6.248
                curveToRelative(
                    dx1 = -0.878f,
                    dy1 = 1.866f,
                    dx2 = -1.369f,
                    dy2 = 4.682f,
                    dx3 = -1.261f,
                    dy3 = 6.248f,
                )
                // c -0.054 0.398 -5.625 5.006 -5.625 5.006
                curveToRelative(
                    dx1 = -0.054f,
                    dy1 = 0.398f,
                    dx2 = -5.625f,
                    dy2 = 5.006f,
                    dx3 = -5.625f,
                    dy3 = 5.006f,
                )
                // C 5.522 26.76 7.5 31.102 10 33.106
                curveTo(
                    x1 = 5.522f,
                    y1 = 26.76f,
                    x2 = 7.5f,
                    y2 = 31.102f,
                    x3 = 10.0f,
                    y3 = 33.106f,
                )
                // l 3.521 -2.924
                lineToRelative(dx = 3.521f, dy = -2.924f)
                // c 2.885 -0.404 4.458 -3.331 4.458 -4.264
                curveToRelative(
                    dx1 = 2.885f,
                    dy1 = -0.404f,
                    dx2 = 4.458f,
                    dy2 = -3.331f,
                    dx3 = 4.458f,
                    dy3 = -4.264f,
                )
                // c 0 -2.984 -0.854 -21.595 -0.854 -21.595z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.984f,
                    dx2 = -0.854f,
                    dy2 = -21.595f,
                    dx3 = -0.854f,
                    dy3 = -21.595f,
                )
                close()
            }
            // M17.958 25.823 c-0.414 0 -0.75 -0.336 -0.75 -0.75 V2.792 c0 -0.414 0.336 -0.75 0.75 -0.75 s0.75 0.336 0.75 0.75 v22.282 c0.001 0.413 -0.335 0.749 -0.75 0.749z
            path(
                fill = SolidColor(Color(0xFFF9CA55)),
            ) {
                // M 17.958 25.823
                moveTo(x = 17.958f, y = 25.823f)
                // c -0.414 0 -0.75 -0.336 -0.75 -0.75
                curveToRelative(
                    dx1 = -0.414f,
                    dy1 = 0.0f,
                    dx2 = -0.75f,
                    dy2 = -0.336f,
                    dx3 = -0.75f,
                    dy3 = -0.75f,
                )
                // V 2.792
                verticalLineTo(y = 2.792f)
                // c 0 -0.414 0.336 -0.75 0.75 -0.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.414f,
                    dx2 = 0.336f,
                    dy2 = -0.75f,
                    dx3 = 0.75f,
                    dy3 = -0.75f,
                )
                // s 0.75 0.336 0.75 0.75
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = 0.336f,
                    dx2 = 0.75f,
                    dy2 = 0.75f,
                )
                // v 22.282
                verticalLineToRelative(dy = 22.282f)
                // c 0.001 0.413 -0.335 0.749 -0.75 0.749z
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = 0.413f,
                    dx2 = -0.335f,
                    dy2 = 0.749f,
                    dx3 = -0.75f,
                    dy3 = 0.749f,
                )
                close()
            }
        }.build().also { _emoji1f64f = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f64f: ImageVector? = null
