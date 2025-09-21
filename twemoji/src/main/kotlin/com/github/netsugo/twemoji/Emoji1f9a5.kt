package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f9a5: ImageVector
    get() {
        val current = _emoji1f9a5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f9a5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M6 21 c-1.105 0 -2 -0.895 -2 -2 L4 4 c0 -1.105 0.895 -1 2 -1 s2 -0.105 2 1 c0 0 -0.606 6.424 0 11.997 C8.54 20.971 12 22 12 22 c0 1.105 -4.895 -1 -6 -1z M20 25.999 c-1.105 0 -2 -0.895 -2 -2 v-21 c0 -1.105 0.895 -1 2 -1 s2 -0.105 2 1 c0 0 -0.446 5.108 -0.125 9.297 0.32 4.187 0.125 11.703 0.125 11.703 0 1.104 -0.895 2 -2 2z
            path(
                fill = SolidColor(Color(0xFF7A5C44)),
            ) {
                // M 6 21
                moveTo(x = 6.0f, y = 21.0f)
                // c -1.105 0 -2 -0.895 -2 -2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.895f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // L 4 4
                lineTo(x = 4.0f, y = 4.0f)
                // c 0 -1.105 0.895 -1 2 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.105f,
                    dx2 = 0.895f,
                    dy2 = -1.0f,
                    dx3 = 2.0f,
                    dy3 = -1.0f,
                )
                // s 2 -0.105 2 1
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.105f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                )
                // c 0 0 -0.606 6.424 0 11.997
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.606f,
                    dy2 = 6.424f,
                    dx3 = 0.0f,
                    dy3 = 11.997f,
                )
                // C 8.54 20.971 12 22 12 22
                curveTo(
                    x1 = 8.54f,
                    y1 = 20.971f,
                    x2 = 12.0f,
                    y2 = 22.0f,
                    x3 = 12.0f,
                    y3 = 22.0f,
                )
                // c 0 1.105 -4.895 -1 -6 -1z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.105f,
                    dx2 = -4.895f,
                    dy2 = -1.0f,
                    dx3 = -6.0f,
                    dy3 = -1.0f,
                )
                close()
                // M 20 25.999
                moveTo(x = 20.0f, y = 25.999f)
                // c -1.105 0 -2 -0.895 -2 -2
                curveToRelative(
                    dx1 = -1.105f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.895f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -21
                verticalLineToRelative(dy = -21.0f)
                // c 0 -1.105 0.895 -1 2 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.105f,
                    dx2 = 0.895f,
                    dy2 = -1.0f,
                    dx3 = 2.0f,
                    dy3 = -1.0f,
                )
                // s 2 -0.105 2 1
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -0.105f,
                    dx2 = 2.0f,
                    dy2 = 1.0f,
                )
                // c 0 0 -0.446 5.108 -0.125 9.297
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.446f,
                    dy2 = 5.108f,
                    dx3 = -0.125f,
                    dy3 = 9.297f,
                )
                // c 0.32 4.187 0.125 11.703 0.125 11.703
                curveToRelative(
                    dx1 = 0.32f,
                    dy1 = 4.187f,
                    dx2 = 0.125f,
                    dy2 = 11.703f,
                    dx3 = 0.125f,
                    dy3 = 11.703f,
                )
                // c 0 1.104 -0.895 2 -2 2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.895f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                close()
            }
            // M36 4 L0 8 V4 l36 -2z
            path(
                fill = SolidColor(Color(0xFF662113)),
            ) {
                // M 36 4
                moveTo(x = 36.0f, y = 4.0f)
                // L 0 8
                lineTo(x = 0.0f, y = 8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // l 36 -2z
                lineToRelative(dx = 36.0f, dy = -2.0f)
                close()
            }
            // M22.644 18.406 c-0.633 1.126 -1.363 1.809 -2.16 2.193 -0.402 0.041 -1.132 -0.085 -1.417 -1.443 -0.332 -1.587 -0.668 -3.833 -0.668 -6.594 0 -4.144 0.601 -8.742 0.601 -8.742 0 -0.929 1.412 -0.936 2.086 -0.991 -0.156 -0.832 -1.749 -0.83 -3.684 -0.83 -1.453 0 -2.256 1.074 -2.402 2.301 -0.147 1.228 -0.789 6.347 -0.744 10 0.024 1.984 0.154 4.161 0.315 6.016 -0.792 -0.201 -1.585 -0.393 -2.364 -0.491 -2.807 -0.356 -6.505 -0.535 -7.129 -5.881 C4.584 9.712 5 4.82 5 4.82 c0 -0.929 1.412 -1.158 2.086 -1.213 -0.156 -0.832 -1.678 -0.911 -3.61 -0.783 C2.026 2.92 1.235 3.668 1 5.3 0.622 7.929 0.578 13.988 0.8 18.176 c0.124 2.338 0.49 10.76 4.099 14.035 C7.007 34.123 10.587 35.253 15 35 c4.185 -0.24 7.623 -1.796 9.548 -3.413 3.342 -2.807 4.09 -4.837 4.229 -7.035 C29 21 24.02 15.959 22.644 18.406z
            path(
                fill = SolidColor(Color(0xFFA78E81)),
            ) {
                // M 22.644 18.406
                moveTo(x = 22.644f, y = 18.406f)
                // c -0.633 1.126 -1.363 1.809 -2.16 2.193
                curveToRelative(
                    dx1 = -0.633f,
                    dy1 = 1.126f,
                    dx2 = -1.363f,
                    dy2 = 1.809f,
                    dx3 = -2.16f,
                    dy3 = 2.193f,
                )
                // c -0.402 0.041 -1.132 -0.085 -1.417 -1.443
                curveToRelative(
                    dx1 = -0.402f,
                    dy1 = 0.041f,
                    dx2 = -1.132f,
                    dy2 = -0.085f,
                    dx3 = -1.417f,
                    dy3 = -1.443f,
                )
                // c -0.332 -1.587 -0.668 -3.833 -0.668 -6.594
                curveToRelative(
                    dx1 = -0.332f,
                    dy1 = -1.587f,
                    dx2 = -0.668f,
                    dy2 = -3.833f,
                    dx3 = -0.668f,
                    dy3 = -6.594f,
                )
                // c 0 -4.144 0.601 -8.742 0.601 -8.742
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.144f,
                    dx2 = 0.601f,
                    dy2 = -8.742f,
                    dx3 = 0.601f,
                    dy3 = -8.742f,
                )
                // c 0 -0.929 1.412 -0.936 2.086 -0.991
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.929f,
                    dx2 = 1.412f,
                    dy2 = -0.936f,
                    dx3 = 2.086f,
                    dy3 = -0.991f,
                )
                // c -0.156 -0.832 -1.749 -0.83 -3.684 -0.83
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = -0.832f,
                    dx2 = -1.749f,
                    dy2 = -0.83f,
                    dx3 = -3.684f,
                    dy3 = -0.83f,
                )
                // c -1.453 0 -2.256 1.074 -2.402 2.301
                curveToRelative(
                    dx1 = -1.453f,
                    dy1 = 0.0f,
                    dx2 = -2.256f,
                    dy2 = 1.074f,
                    dx3 = -2.402f,
                    dy3 = 2.301f,
                )
                // c -0.147 1.228 -0.789 6.347 -0.744 10
                curveToRelative(
                    dx1 = -0.147f,
                    dy1 = 1.228f,
                    dx2 = -0.789f,
                    dy2 = 6.347f,
                    dx3 = -0.744f,
                    dy3 = 10.0f,
                )
                // c 0.024 1.984 0.154 4.161 0.315 6.016
                curveToRelative(
                    dx1 = 0.024f,
                    dy1 = 1.984f,
                    dx2 = 0.154f,
                    dy2 = 4.161f,
                    dx3 = 0.315f,
                    dy3 = 6.016f,
                )
                // c -0.792 -0.201 -1.585 -0.393 -2.364 -0.491
                curveToRelative(
                    dx1 = -0.792f,
                    dy1 = -0.201f,
                    dx2 = -1.585f,
                    dy2 = -0.393f,
                    dx3 = -2.364f,
                    dy3 = -0.491f,
                )
                // c -2.807 -0.356 -6.505 -0.535 -7.129 -5.881
                curveToRelative(
                    dx1 = -2.807f,
                    dy1 = -0.356f,
                    dx2 = -6.505f,
                    dy2 = -0.535f,
                    dx3 = -7.129f,
                    dy3 = -5.881f,
                )
                // C 4.584 9.712 5 4.82 5 4.82
                curveTo(
                    x1 = 4.584f,
                    y1 = 9.712f,
                    x2 = 5.0f,
                    y2 = 4.82f,
                    x3 = 5.0f,
                    y3 = 4.82f,
                )
                // c 0 -0.929 1.412 -1.158 2.086 -1.213
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.929f,
                    dx2 = 1.412f,
                    dy2 = -1.158f,
                    dx3 = 2.086f,
                    dy3 = -1.213f,
                )
                // c -0.156 -0.832 -1.678 -0.911 -3.61 -0.783
                curveToRelative(
                    dx1 = -0.156f,
                    dy1 = -0.832f,
                    dx2 = -1.678f,
                    dy2 = -0.911f,
                    dx3 = -3.61f,
                    dy3 = -0.783f,
                )
                // C 2.026 2.92 1.235 3.668 1 5.3
                curveTo(
                    x1 = 2.026f,
                    y1 = 2.92f,
                    x2 = 1.235f,
                    y2 = 3.668f,
                    x3 = 1.0f,
                    y3 = 5.3f,
                )
                // C 0.622 7.929 0.578 13.988 0.8 18.176
                curveTo(
                    x1 = 0.622f,
                    y1 = 7.929f,
                    x2 = 0.578f,
                    y2 = 13.988f,
                    x3 = 0.8f,
                    y3 = 18.176f,
                )
                // c 0.124 2.338 0.49 10.76 4.099 14.035
                curveToRelative(
                    dx1 = 0.124f,
                    dy1 = 2.338f,
                    dx2 = 0.49f,
                    dy2 = 10.76f,
                    dx3 = 4.099f,
                    dy3 = 14.035f,
                )
                // C 7.007 34.123 10.587 35.253 15 35
                curveTo(
                    x1 = 7.007f,
                    y1 = 34.123f,
                    x2 = 10.587f,
                    y2 = 35.253f,
                    x3 = 15.0f,
                    y3 = 35.0f,
                )
                // c 4.185 -0.24 7.623 -1.796 9.548 -3.413
                curveToRelative(
                    dx1 = 4.185f,
                    dy1 = -0.24f,
                    dx2 = 7.623f,
                    dy2 = -1.796f,
                    dx3 = 9.548f,
                    dy3 = -3.413f,
                )
                // c 3.342 -2.807 4.09 -4.837 4.229 -7.035
                curveToRelative(
                    dx1 = 3.342f,
                    dy1 = -2.807f,
                    dx2 = 4.09f,
                    dy2 = -4.837f,
                    dx3 = 4.229f,
                    dy3 = -7.035f,
                )
                // C 29 21 24.02 15.959 22.644 18.406z
                curveTo(
                    x1 = 29.0f,
                    y1 = 21.0f,
                    x2 = 24.02f,
                    y2 = 15.959f,
                    x3 = 22.644f,
                    y3 = 18.406f,
                )
                close()
            }
            // M35.025 22.671 c-2.101 3.201 -6.277 4.173 -10.759 1.232 s-5.253 -7.159 -3.152 -10.36 7.488 -2.584 10.384 -0.624 5.628 6.551 3.527 9.752z
            path(
                fill = SolidColor(Color(0xFFA78E81)),
            ) {
                // M 35.025 22.671
                moveTo(x = 35.025f, y = 22.671f)
                // c -2.101 3.201 -6.277 4.173 -10.759 1.232
                curveToRelative(
                    dx1 = -2.101f,
                    dy1 = 3.201f,
                    dx2 = -6.277f,
                    dy2 = 4.173f,
                    dx3 = -10.759f,
                    dy3 = 1.232f,
                )
                // s -5.253 -7.159 -3.152 -10.36
                reflectiveCurveToRelative(
                    dx1 = -5.253f,
                    dy1 = -7.159f,
                    dx2 = -3.152f,
                    dy2 = -10.36f,
                )
                // s 7.488 -2.584 10.384 -0.624
                reflectiveCurveToRelative(
                    dx1 = 7.488f,
                    dy1 = -2.584f,
                    dx2 = 10.384f,
                    dy2 = -0.624f,
                )
                // s 5.628 6.551 3.527 9.752z
                reflectiveCurveToRelative(
                    dx1 = 5.628f,
                    dy1 = 6.551f,
                    dx2 = 3.527f,
                    dy2 = 9.752f,
                )
                close()
            }
            // M33.271 23.178 c-1.5 2.287 -5.164 2.984 -9.005 0.464 s-4.419 -6.001 -2.918 -8.288 c1.5 -2.287 4.294 -1.921 8.135 0.6 s5.288 4.938 3.788 7.224z
            path(
                fill = SolidColor(Color(0xFFE2D2C7)),
            ) {
                // M 33.271 23.178
                moveTo(x = 33.271f, y = 23.178f)
                // c -1.5 2.287 -5.164 2.984 -9.005 0.464
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 2.287f,
                    dx2 = -5.164f,
                    dy2 = 2.984f,
                    dx3 = -9.005f,
                    dy3 = 0.464f,
                )
                // s -4.419 -6.001 -2.918 -8.288
                reflectiveCurveToRelative(
                    dx1 = -4.419f,
                    dy1 = -6.001f,
                    dx2 = -2.918f,
                    dy2 = -8.288f,
                )
                // c 1.5 -2.287 4.294 -1.921 8.135 0.6
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = -2.287f,
                    dx2 = 4.294f,
                    dy2 = -1.921f,
                    dx3 = 8.135f,
                    dy3 = 0.6f,
                )
                // s 5.288 4.938 3.788 7.224z
                reflectiveCurveToRelative(
                    dx1 = 5.288f,
                    dy1 = 4.938f,
                    dx2 = 3.788f,
                    dy2 = 7.224f,
                )
                close()
            }
            // M20.565 14.564 c-0.499 1.126 -0.677 2.336 -0.491 3.55 1.498 0.439 3.637 0.97 4.65 0.759 1.646 -0.342 2.198 -1.817 1.956 -2.981 -0.335 -1.616 -3.191 -2.544 -6.115 -1.328z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 20.565 14.564
                moveTo(x = 20.565f, y = 14.564f)
                // c -0.499 1.126 -0.677 2.336 -0.491 3.55
                curveToRelative(
                    dx1 = -0.499f,
                    dy1 = 1.126f,
                    dx2 = -0.677f,
                    dy2 = 2.336f,
                    dx3 = -0.491f,
                    dy3 = 3.55f,
                )
                // c 1.498 0.439 3.637 0.97 4.65 0.759
                curveToRelative(
                    dx1 = 1.498f,
                    dy1 = 0.439f,
                    dx2 = 3.637f,
                    dy2 = 0.97f,
                    dx3 = 4.65f,
                    dy3 = 0.759f,
                )
                // c 1.646 -0.342 2.198 -1.817 1.956 -2.981
                curveToRelative(
                    dx1 = 1.646f,
                    dy1 = -0.342f,
                    dx2 = 2.198f,
                    dy2 = -1.817f,
                    dx3 = 1.956f,
                    dy3 = -2.981f,
                )
                // c -0.335 -1.616 -3.191 -2.544 -6.115 -1.328z
                curveToRelative(
                    dx1 = -0.335f,
                    dy1 = -1.616f,
                    dx2 = -3.191f,
                    dy2 = -2.544f,
                    dx3 = -6.115f,
                    dy3 = -1.328f,
                )
                close()
            }
            // M23.389 16.576 m-1.188 0 a1.188 1.188 0 1 1 2.376 0 a1.188 1.188 0 1 1 -2.376 0
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 23.389 16.576
                moveTo(x = 23.389f, y = 16.576f)
                // m -1.188 0
                moveToRelative(dx = -1.188f, dy = 0.0f)
                // a 1.188 1.188 0 1 1 2.376 0
                arcToRelative(
                    a = 1.188f,
                    b = 1.188f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.376f,
                    dy1 = 0.0f,
                )
                // a 1.188 1.188 0 1 1 -2.376 0
                arcToRelative(
                    a = 1.188f,
                    b = 1.188f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.376f,
                    dy1 = 0.0f,
                )
            }
            // M34.307 23.581 c-0.834 0.906 -1.873 1.551 -3.061 1.864 -0.999 -1.199 -2.337 -2.951 -2.548 -3.964 -0.342 -1.646 0.792 -2.739 1.956 -2.981 1.617 -0.335 3.605 1.915 3.653 5.081z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 34.307 23.581
                moveTo(x = 34.307f, y = 23.581f)
                // c -0.834 0.906 -1.873 1.551 -3.061 1.864
                curveToRelative(
                    dx1 = -0.834f,
                    dy1 = 0.906f,
                    dx2 = -1.873f,
                    dy2 = 1.551f,
                    dx3 = -3.061f,
                    dy3 = 1.864f,
                )
                // c -0.999 -1.199 -2.337 -2.951 -2.548 -3.964
                curveToRelative(
                    dx1 = -0.999f,
                    dy1 = -1.199f,
                    dx2 = -2.337f,
                    dy2 = -2.951f,
                    dx3 = -2.548f,
                    dy3 = -3.964f,
                )
                // c -0.342 -1.646 0.792 -2.739 1.956 -2.981
                curveToRelative(
                    dx1 = -0.342f,
                    dy1 = -1.646f,
                    dx2 = 0.792f,
                    dy2 = -2.739f,
                    dx3 = 1.956f,
                    dy3 = -2.981f,
                )
                // c 1.617 -0.335 3.605 1.915 3.653 5.081z
                curveToRelative(
                    dx1 = 1.617f,
                    dy1 = -0.335f,
                    dx2 = 3.605f,
                    dy2 = 1.915f,
                    dx3 = 3.653f,
                    dy3 = 5.081f,
                )
                close()
            }
            // M31.338 21.792 m-1.188 0 a1.188 1.188 0 1 1 2.376 0 a1.188 1.188 0 1 1 -2.376 0
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 31.338 21.792
                moveTo(x = 31.338f, y = 21.792f)
                // m -1.188 0
                moveToRelative(dx = -1.188f, dy = 0.0f)
                // a 1.188 1.188 0 1 1 2.376 0
                arcToRelative(
                    a = 1.188f,
                    b = 1.188f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.376f,
                    dy1 = 0.0f,
                )
                // a 1.188 1.188 0 1 1 -2.376 0
                arcToRelative(
                    a = 1.188f,
                    b = 1.188f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.376f,
                    dy1 = 0.0f,
                )
            }
            // M28.047 22.475 c-0.72 1.098 -2.194 1.403 -3.291 0.683 -1.098 -0.72 -1.403 -2.194 -0.683 -3.291 0.72 -1.098 1.542 -0.41 2.639 0.31 1.097 0.72 2.055 1.2 1.335 2.298z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 28.047 22.475
                moveTo(x = 28.047f, y = 22.475f)
                // c -0.72 1.098 -2.194 1.403 -3.291 0.683
                curveToRelative(
                    dx1 = -0.72f,
                    dy1 = 1.098f,
                    dx2 = -2.194f,
                    dy2 = 1.403f,
                    dx3 = -3.291f,
                    dy3 = 0.683f,
                )
                // c -1.098 -0.72 -1.403 -2.194 -0.683 -3.291
                curveToRelative(
                    dx1 = -1.098f,
                    dy1 = -0.72f,
                    dx2 = -1.403f,
                    dy2 = -2.194f,
                    dx3 = -0.683f,
                    dy3 = -3.291f,
                )
                // c 0.72 -1.098 1.542 -0.41 2.639 0.31
                curveToRelative(
                    dx1 = 0.72f,
                    dy1 = -1.098f,
                    dx2 = 1.542f,
                    dy2 = -0.41f,
                    dx3 = 2.639f,
                    dy3 = 0.31f,
                )
                // c 1.097 0.72 2.055 1.2 1.335 2.298z
                curveToRelative(
                    dx1 = 1.097f,
                    dy1 = 0.72f,
                    dx2 = 2.055f,
                    dy2 = 1.2f,
                    dx3 = 1.335f,
                    dy3 = 2.298f,
                )
                close()
            }
            // M27.979 25.122 c-0.024 0 -0.049 -0.002 -0.073 -0.005 -4.479 -0.654 -6.297 -4.07 -6.372 -4.216 -0.126 -0.244 -0.031 -0.545 0.214 -0.672 0.246 -0.13 0.546 -0.031 0.674 0.211 0.017 0.031 1.673 3.109 5.629 3.687 0.273 0.04 0.462 0.294 0.423 0.567 -0.037 0.249 -0.25 0.428 -0.495 0.428z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 27.979 25.122
                moveTo(x = 27.979f, y = 25.122f)
                // c -0.024 0 -0.049 -0.002 -0.073 -0.005
                curveToRelative(
                    dx1 = -0.024f,
                    dy1 = 0.0f,
                    dx2 = -0.049f,
                    dy2 = -0.002f,
                    dx3 = -0.073f,
                    dy3 = -0.005f,
                )
                // c -4.479 -0.654 -6.297 -4.07 -6.372 -4.216
                curveToRelative(
                    dx1 = -4.479f,
                    dy1 = -0.654f,
                    dx2 = -6.297f,
                    dy2 = -4.07f,
                    dx3 = -6.372f,
                    dy3 = -4.216f,
                )
                // c -0.126 -0.244 -0.031 -0.545 0.214 -0.672
                curveToRelative(
                    dx1 = -0.126f,
                    dy1 = -0.244f,
                    dx2 = -0.031f,
                    dy2 = -0.545f,
                    dx3 = 0.214f,
                    dy3 = -0.672f,
                )
                // c 0.246 -0.13 0.546 -0.031 0.674 0.211
                curveToRelative(
                    dx1 = 0.246f,
                    dy1 = -0.13f,
                    dx2 = 0.546f,
                    dy2 = -0.031f,
                    dx3 = 0.674f,
                    dy3 = 0.211f,
                )
                // c 0.017 0.031 1.673 3.109 5.629 3.687
                curveToRelative(
                    dx1 = 0.017f,
                    dy1 = 0.031f,
                    dx2 = 1.673f,
                    dy2 = 3.109f,
                    dx3 = 5.629f,
                    dy3 = 3.687f,
                )
                // c 0.273 0.04 0.462 0.294 0.423 0.567
                curveToRelative(
                    dx1 = 0.273f,
                    dy1 = 0.04f,
                    dx2 = 0.462f,
                    dy2 = 0.294f,
                    dx3 = 0.423f,
                    dy3 = 0.567f,
                )
                // c -0.037 0.249 -0.25 0.428 -0.495 0.428z
                curveToRelative(
                    dx1 = -0.037f,
                    dy1 = 0.249f,
                    dx2 = -0.25f,
                    dy2 = 0.428f,
                    dx3 = -0.495f,
                    dy3 = 0.428f,
                )
                close()
            }
        }.build().also { _emoji1f9a5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f9a5: ImageVector? = null
