package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f649: ImageVector
    get() {
        val current = _emoji1f649
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f649",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M2.2369 17.9082 a5.335 3.678 75.7 1 0 7.1281 -1.8169 a5.335 3.678 75.7 1 0 -7.1281 1.8169z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 2.2369 17.9082
                moveTo(x = 2.2369f, y = 17.9082f)
                // a 5.335 3.678 75.7 1 0 7.1281 -1.8169
                arcToRelative(
                    a = 5.335f,
                    b = 3.678f,
                    theta = 75.7f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 7.1281f,
                    dy1 = -1.8169f,
                )
                // a 5.335 3.678 75.7 1 0 -7.1281 1.8169z
                arcToRelative(
                    a = 5.335f,
                    b = 3.678f,
                    theta = 75.7f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -7.1281f,
                    dy1 = 1.8169f,
                )
                close()
            }
            // M28.882 22.1707 a5.335 3.678 104.3 1 0 2.6355 -10.3394 a5.335 3.678 104.3 1 0 -2.6355 10.3394z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 28.882 22.1707
                moveTo(x = 28.882f, y = 22.1707f)
                // a 5.335 3.678 104.3 1 0 2.6355 -10.3394
                arcToRelative(
                    a = 5.335f,
                    b = 3.678f,
                    theta = 104.3f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.6355f,
                    dy1 = -10.3394f,
                )
                // a 5.335 3.678 104.3 1 0 -2.6355 10.3394z
                arcToRelative(
                    a = 5.335f,
                    b = 3.678f,
                    theta = 104.3f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.6355f,
                    dy1 = 10.3394f,
                )
                close()
            }
            // M18.985 35 h-1.97 c-6.5 0 -12.803 -4.982 -12.803 -11.956 0 -3.985 1.477 -5.978 1.477 -5.978 s-0.492 -1.993 -0.492 -3.985 C5.197 7.103 11.5 2.121 18 2.121 c6.5 0 12.803 5.978 12.803 10.96 0 1.993 -0.492 3.985 -0.492 3.985 s1.477 1.993 1.477 5.978 C31.788 30.018 25.485 35 18.985 35z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 18.985 35
                moveTo(x = 18.985f, y = 35.0f)
                // h -1.97
                horizontalLineToRelative(dx = -1.97f)
                // c -6.5 0 -12.803 -4.982 -12.803 -11.956
                curveToRelative(
                    dx1 = -6.5f,
                    dy1 = 0.0f,
                    dx2 = -12.803f,
                    dy2 = -4.982f,
                    dx3 = -12.803f,
                    dy3 = -11.956f,
                )
                // c 0 -3.985 1.477 -5.978 1.477 -5.978
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.985f,
                    dx2 = 1.477f,
                    dy2 = -5.978f,
                    dx3 = 1.477f,
                    dy3 = -5.978f,
                )
                // s -0.492 -1.993 -0.492 -3.985
                reflectiveCurveToRelative(
                    dx1 = -0.492f,
                    dy1 = -1.993f,
                    dx2 = -0.492f,
                    dy2 = -3.985f,
                )
                // C 5.197 7.103 11.5 2.121 18 2.121
                curveTo(
                    x1 = 5.197f,
                    y1 = 7.103f,
                    x2 = 11.5f,
                    y2 = 2.121f,
                    x3 = 18.0f,
                    y3 = 2.121f,
                )
                // c 6.5 0 12.803 5.978 12.803 10.96
                curveToRelative(
                    dx1 = 6.5f,
                    dy1 = 0.0f,
                    dx2 = 12.803f,
                    dy2 = 5.978f,
                    dx3 = 12.803f,
                    dy3 = 10.96f,
                )
                // c 0 1.993 -0.492 3.985 -0.492 3.985
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.993f,
                    dx2 = -0.492f,
                    dy2 = 3.985f,
                    dx3 = -0.492f,
                    dy3 = 3.985f,
                )
                // s 1.477 1.993 1.477 5.978
                reflectiveCurveToRelative(
                    dx1 = 1.477f,
                    dy1 = 1.993f,
                    dx2 = 1.477f,
                    dy2 = 5.978f,
                )
                // C 31.788 30.018 25.485 35 18.985 35z
                curveTo(
                    x1 = 31.788f,
                    y1 = 30.018f,
                    x2 = 25.485f,
                    y2 = 35.0f,
                    x3 = 18.985f,
                    y3 = 35.0f,
                )
                close()
            }
            // M22.242 0.17 s-5.303 -1.061 -7.424 2.121 4.242 1.061 4.242 1.061 S20.121 0.17 22.242 0.17z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 22.242 0.17
                moveTo(x = 22.242f, y = 0.17f)
                // s -5.303 -1.061 -7.424 2.121
                reflectiveCurveToRelative(
                    dx1 = -5.303f,
                    dy1 = -1.061f,
                    dx2 = -7.424f,
                    dy2 = 2.121f,
                )
                // s 4.242 1.061 4.242 1.061
                reflectiveCurveToRelative(
                    dx1 = 4.242f,
                    dy1 = 1.061f,
                    dx2 = 4.242f,
                    dy2 = 1.061f,
                )
                // S 20.121 0.17 22.242 0.17z
                reflectiveCurveTo(
                    x1 = 20.121f,
                    y1 = 0.17f,
                    x2 = 22.242f,
                    y2 = 0.17f,
                )
                close()
            }
            // M29.667 15.379 c0 -3.807 -3.087 -6.894 -6.894 -6.894 -1.854 0 -3.534 0.736 -4.773 1.926 -1.239 -1.191 -2.919 -1.926 -4.773 -1.926 -3.807 0 -6.894 3.087 -6.894 6.894 0 2.309 1.14 4.348 2.882 5.599 -0.489 1.212 -0.761 2.546 -0.761 3.946 0 5.565 4.274 9.015 9.545 9.015 s9.545 -3.45 9.545 -9.015 c0 -1.401 -0.272 -2.734 -0.761 -3.946 1.744 -1.251 2.884 -3.29 2.884 -5.599z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 29.667 15.379
                moveTo(x = 29.667f, y = 15.379f)
                // c 0 -3.807 -3.087 -6.894 -6.894 -6.894
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.807f,
                    dx2 = -3.087f,
                    dy2 = -6.894f,
                    dx3 = -6.894f,
                    dy3 = -6.894f,
                )
                // c -1.854 0 -3.534 0.736 -4.773 1.926
                curveToRelative(
                    dx1 = -1.854f,
                    dy1 = 0.0f,
                    dx2 = -3.534f,
                    dy2 = 0.736f,
                    dx3 = -4.773f,
                    dy3 = 1.926f,
                )
                // c -1.239 -1.191 -2.919 -1.926 -4.773 -1.926
                curveToRelative(
                    dx1 = -1.239f,
                    dy1 = -1.191f,
                    dx2 = -2.919f,
                    dy2 = -1.926f,
                    dx3 = -4.773f,
                    dy3 = -1.926f,
                )
                // c -3.807 0 -6.894 3.087 -6.894 6.894
                curveToRelative(
                    dx1 = -3.807f,
                    dy1 = 0.0f,
                    dx2 = -6.894f,
                    dy2 = 3.087f,
                    dx3 = -6.894f,
                    dy3 = 6.894f,
                )
                // c 0 2.309 1.14 4.348 2.882 5.599
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.309f,
                    dx2 = 1.14f,
                    dy2 = 4.348f,
                    dx3 = 2.882f,
                    dy3 = 5.599f,
                )
                // c -0.489 1.212 -0.761 2.546 -0.761 3.946
                curveToRelative(
                    dx1 = -0.489f,
                    dy1 = 1.212f,
                    dx2 = -0.761f,
                    dy2 = 2.546f,
                    dx3 = -0.761f,
                    dy3 = 3.946f,
                )
                // c 0 5.565 4.274 9.015 9.545 9.015
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.565f,
                    dx2 = 4.274f,
                    dy2 = 9.015f,
                    dx3 = 9.545f,
                    dy3 = 9.015f,
                )
                // s 9.545 -3.45 9.545 -9.015
                reflectiveCurveToRelative(
                    dx1 = 9.545f,
                    dy1 = -3.45f,
                    dx2 = 9.545f,
                    dy2 = -9.015f,
                )
                // c 0 -1.401 -0.272 -2.734 -0.761 -3.946
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.401f,
                    dx2 = -0.272f,
                    dy2 = -2.734f,
                    dx3 = -0.761f,
                    dy3 = -3.946f,
                )
                // c 1.744 -1.251 2.884 -3.29 2.884 -5.599z
                curveToRelative(
                    dx1 = 1.744f,
                    dy1 = -1.251f,
                    dx2 = 2.884f,
                    dy2 = -3.29f,
                    dx3 = 2.884f,
                    dy3 = -5.599f,
                )
                close()
            }
            // M11 17 a2 3 0 1 0 4 0 a2 3 0 1 0 -4 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 11 17
                moveTo(x = 11.0f, y = 17.0f)
                // a 2 3 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 3 0 1 0 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21 17 a2 3 0 1 0 4 0 a2 3 0 1 0 -4 0z
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 21 17
                moveTo(x = 21.0f, y = 17.0f)
                // a 2 3 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 3 0 1 0 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M18 31.5 c2.715 0 5.027 -1.38 5.895 -3.309 0.359 -0.798 -0.25 -1.691 -1.157 -1.691 h-9.476 c-0.907 0 -1.516 0.893 -1.157 1.691 0.868 1.929 3.18 3.309 5.895 3.309z
            path(
                fill = SolidColor(Color(0xFF642116)),
            ) {
                // M 18 31.5
                moveTo(x = 18.0f, y = 31.5f)
                // c 2.715 0 5.027 -1.38 5.895 -3.309
                curveToRelative(
                    dx1 = 2.715f,
                    dy1 = 0.0f,
                    dx2 = 5.027f,
                    dy2 = -1.38f,
                    dx3 = 5.895f,
                    dy3 = -3.309f,
                )
                // c 0.359 -0.798 -0.25 -1.691 -1.157 -1.691
                curveToRelative(
                    dx1 = 0.359f,
                    dy1 = -0.798f,
                    dx2 = -0.25f,
                    dy2 = -1.691f,
                    dx3 = -1.157f,
                    dy3 = -1.691f,
                )
                // h -9.476
                horizontalLineToRelative(dx = -9.476f)
                // c -0.907 0 -1.516 0.893 -1.157 1.691
                curveToRelative(
                    dx1 = -0.907f,
                    dy1 = 0.0f,
                    dx2 = -1.516f,
                    dy2 = 0.893f,
                    dx3 = -1.157f,
                    dy3 = 1.691f,
                )
                // c 0.868 1.929 3.18 3.309 5.895 3.309z
                curveToRelative(
                    dx1 = 0.868f,
                    dy1 = 1.929f,
                    dx2 = 3.18f,
                    dy2 = 3.309f,
                    dx3 = 5.895f,
                    dy3 = 3.309f,
                )
                close()
            }
            // M15.5 22 a1 1.061 0 1 0 2 0 a1 1.061 0 1 0 -2 0z
            path(
                fill = SolidColor(Color(0xFF642116)),
            ) {
                // M 15.5 22
                moveTo(x = 15.5f, y = 22.0f)
                // a 1 1.061 0 1 0 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.061f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1.061 0 1 0 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.061f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M19.5 22 m-1 0 a1 1 0 1 1 2 0 a1 1 0 1 1 -2 0
            path(
                fill = SolidColor(Color(0xFF642116)),
            ) {
                // M 19.5 22
                moveTo(x = 19.5f, y = 22.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
            }
            // M6.874 23.245 c0.598 -1.293 0.876 -2.323 0.876 -3.245 0 -1.308 -0.604 -2.56 -1.09 -3.566 -0.274 -0.568 -0.557 -1.156 -0.557 -1.434 0 -0.193 0.142 -0.793 0.267 -1.323 0.387 -1.636 0.868 -3.673 0.263 -4.649 -0.15 -0.241 -0.434 -0.528 -0.942 -0.528 C3.74 8.5 0.75 12.756 0.75 18 c0 2.576 0.174 4.177 0.555 5.112 L0.5 36 h7 l-0.837 -12.441 c0.085 -0.093 0.157 -0.197 0.211 -0.314z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 6.874 23.245
                moveTo(x = 6.874f, y = 23.245f)
                // c 0.598 -1.293 0.876 -2.323 0.876 -3.245
                curveToRelative(
                    dx1 = 0.598f,
                    dy1 = -1.293f,
                    dx2 = 0.876f,
                    dy2 = -2.323f,
                    dx3 = 0.876f,
                    dy3 = -3.245f,
                )
                // c 0 -1.308 -0.604 -2.56 -1.09 -3.566
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.308f,
                    dx2 = -0.604f,
                    dy2 = -2.56f,
                    dx3 = -1.09f,
                    dy3 = -3.566f,
                )
                // c -0.274 -0.568 -0.557 -1.156 -0.557 -1.434
                curveToRelative(
                    dx1 = -0.274f,
                    dy1 = -0.568f,
                    dx2 = -0.557f,
                    dy2 = -1.156f,
                    dx3 = -0.557f,
                    dy3 = -1.434f,
                )
                // c 0 -0.193 0.142 -0.793 0.267 -1.323
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.193f,
                    dx2 = 0.142f,
                    dy2 = -0.793f,
                    dx3 = 0.267f,
                    dy3 = -1.323f,
                )
                // c 0.387 -1.636 0.868 -3.673 0.263 -4.649
                curveToRelative(
                    dx1 = 0.387f,
                    dy1 = -1.636f,
                    dx2 = 0.868f,
                    dy2 = -3.673f,
                    dx3 = 0.263f,
                    dy3 = -4.649f,
                )
                // c -0.15 -0.241 -0.434 -0.528 -0.942 -0.528
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = -0.241f,
                    dx2 = -0.434f,
                    dy2 = -0.528f,
                    dx3 = -0.942f,
                    dy3 = -0.528f,
                )
                // C 3.74 8.5 0.75 12.756 0.75 18
                curveTo(
                    x1 = 3.74f,
                    y1 = 8.5f,
                    x2 = 0.75f,
                    y2 = 12.756f,
                    x3 = 0.75f,
                    y3 = 18.0f,
                )
                // c 0 2.576 0.174 4.177 0.555 5.112
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.576f,
                    dx2 = 0.174f,
                    dy2 = 4.177f,
                    dx3 = 0.555f,
                    dy3 = 5.112f,
                )
                // L 0.5 36
                lineTo(x = 0.5f, y = 36.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // l -0.837 -12.441
                lineToRelative(dx = -0.837f, dy = -12.441f)
                // c 0.085 -0.093 0.157 -0.197 0.211 -0.314z
                curveToRelative(
                    dx1 = 0.085f,
                    dy1 = -0.093f,
                    dx2 = 0.157f,
                    dy2 = -0.197f,
                    dx3 = 0.211f,
                    dy3 = -0.314f,
                )
                close()
            }
            // M6.874 23.245 c0.598 -1.293 0.876 -2.323 0.876 -3.245 0 -1.308 -0.604 -2.56 -1.09 -3.566 -0.274 -0.568 -0.557 -1.156 -0.557 -1.434 0 -0.193 0.142 -0.793 0.267 -1.323 0.387 -1.636 0.868 -3.673 0.263 -4.649 -0.064 -0.102 -0.158 -0.209 -0.277 -0.303 -0.734 1.341 -1.159 2.814 -1.159 4.356 0 1.992 -0.197 5.978 -0.197 9.963 C5 23.359 7 36 7 36 h0.5 l-0.839 -12.469 c0.079 -0.089 0.162 -0.175 0.213 -0.286z
            path(
                fill = SolidColor(Color(0xFF9B3C07)),
            ) {
                // M 6.874 23.245
                moveTo(x = 6.874f, y = 23.245f)
                // c 0.598 -1.293 0.876 -2.323 0.876 -3.245
                curveToRelative(
                    dx1 = 0.598f,
                    dy1 = -1.293f,
                    dx2 = 0.876f,
                    dy2 = -2.323f,
                    dx3 = 0.876f,
                    dy3 = -3.245f,
                )
                // c 0 -1.308 -0.604 -2.56 -1.09 -3.566
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.308f,
                    dx2 = -0.604f,
                    dy2 = -2.56f,
                    dx3 = -1.09f,
                    dy3 = -3.566f,
                )
                // c -0.274 -0.568 -0.557 -1.156 -0.557 -1.434
                curveToRelative(
                    dx1 = -0.274f,
                    dy1 = -0.568f,
                    dx2 = -0.557f,
                    dy2 = -1.156f,
                    dx3 = -0.557f,
                    dy3 = -1.434f,
                )
                // c 0 -0.193 0.142 -0.793 0.267 -1.323
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.193f,
                    dx2 = 0.142f,
                    dy2 = -0.793f,
                    dx3 = 0.267f,
                    dy3 = -1.323f,
                )
                // c 0.387 -1.636 0.868 -3.673 0.263 -4.649
                curveToRelative(
                    dx1 = 0.387f,
                    dy1 = -1.636f,
                    dx2 = 0.868f,
                    dy2 = -3.673f,
                    dx3 = 0.263f,
                    dy3 = -4.649f,
                )
                // c -0.064 -0.102 -0.158 -0.209 -0.277 -0.303
                curveToRelative(
                    dx1 = -0.064f,
                    dy1 = -0.102f,
                    dx2 = -0.158f,
                    dy2 = -0.209f,
                    dx3 = -0.277f,
                    dy3 = -0.303f,
                )
                // c -0.734 1.341 -1.159 2.814 -1.159 4.356
                curveToRelative(
                    dx1 = -0.734f,
                    dy1 = 1.341f,
                    dx2 = -1.159f,
                    dy2 = 2.814f,
                    dx3 = -1.159f,
                    dy3 = 4.356f,
                )
                // c 0 1.992 -0.197 5.978 -0.197 9.963
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.992f,
                    dx2 = -0.197f,
                    dy2 = 5.978f,
                    dx3 = -0.197f,
                    dy3 = 9.963f,
                )
                // C 5 23.359 7 36 7 36
                curveTo(
                    x1 = 5.0f,
                    y1 = 23.359f,
                    x2 = 7.0f,
                    y2 = 36.0f,
                    x3 = 7.0f,
                    y3 = 36.0f,
                )
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // l -0.839 -12.469
                lineToRelative(dx = -0.839f, dy = -12.469f)
                // c 0.079 -0.089 0.162 -0.175 0.213 -0.286z
                curveToRelative(
                    dx1 = 0.079f,
                    dy1 = -0.089f,
                    dx2 = 0.162f,
                    dy2 = -0.175f,
                    dx3 = 0.213f,
                    dy3 = -0.286f,
                )
                close()
            }
            // M5.691 9.5 c-1.373 0 -4.118 3.675 -4.118 8.5 0 2.542 0.185 4.174 0.55 4.851 0.255 0.475 0.985 0.47 1.688 0.463 l0.232 -0.001 c1.16 0 1.985 -0.283 2.112 -0.558 0.519 -1.121 0.771 -2.023 0.771 -2.755 0 -1.036 -0.519 -2.112 -0.977 -3.061 -0.374 -0.776 -0.67 -1.389 -0.67 -1.939 0 -0.318 0.108 -0.791 0.299 -1.599 0.264 -1.116 0.755 -3.194 0.396 -3.771 -0.023 -0.039 -0.08 -0.13 -0.283 -0.13z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 5.691 9.5
                moveTo(x = 5.691f, y = 9.5f)
                // c -1.373 0 -4.118 3.675 -4.118 8.5
                curveToRelative(
                    dx1 = -1.373f,
                    dy1 = 0.0f,
                    dx2 = -4.118f,
                    dy2 = 3.675f,
                    dx3 = -4.118f,
                    dy3 = 8.5f,
                )
                // c 0 2.542 0.185 4.174 0.55 4.851
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.542f,
                    dx2 = 0.185f,
                    dy2 = 4.174f,
                    dx3 = 0.55f,
                    dy3 = 4.851f,
                )
                // c 0.255 0.475 0.985 0.47 1.688 0.463
                curveToRelative(
                    dx1 = 0.255f,
                    dy1 = 0.475f,
                    dx2 = 0.985f,
                    dy2 = 0.47f,
                    dx3 = 1.688f,
                    dy3 = 0.463f,
                )
                // l 0.232 -0.001
                lineToRelative(dx = 0.232f, dy = -0.001f)
                // c 1.16 0 1.985 -0.283 2.112 -0.558
                curveToRelative(
                    dx1 = 1.16f,
                    dy1 = 0.0f,
                    dx2 = 1.985f,
                    dy2 = -0.283f,
                    dx3 = 2.112f,
                    dy3 = -0.558f,
                )
                // c 0.519 -1.121 0.771 -2.023 0.771 -2.755
                curveToRelative(
                    dx1 = 0.519f,
                    dy1 = -1.121f,
                    dx2 = 0.771f,
                    dy2 = -2.023f,
                    dx3 = 0.771f,
                    dy3 = -2.755f,
                )
                // c 0 -1.036 -0.519 -2.112 -0.977 -3.061
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.036f,
                    dx2 = -0.519f,
                    dy2 = -2.112f,
                    dx3 = -0.977f,
                    dy3 = -3.061f,
                )
                // c -0.374 -0.776 -0.67 -1.389 -0.67 -1.939
                curveToRelative(
                    dx1 = -0.374f,
                    dy1 = -0.776f,
                    dx2 = -0.67f,
                    dy2 = -1.389f,
                    dx3 = -0.67f,
                    dy3 = -1.939f,
                )
                // c 0 -0.318 0.108 -0.791 0.299 -1.599
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.318f,
                    dx2 = 0.108f,
                    dy2 = -0.791f,
                    dx3 = 0.299f,
                    dy3 = -1.599f,
                )
                // c 0.264 -1.116 0.755 -3.194 0.396 -3.771
                curveToRelative(
                    dx1 = 0.264f,
                    dy1 = -1.116f,
                    dx2 = 0.755f,
                    dy2 = -3.194f,
                    dx3 = 0.396f,
                    dy3 = -3.771f,
                )
                // c -0.023 -0.039 -0.08 -0.13 -0.283 -0.13z
                curveToRelative(
                    dx1 = -0.023f,
                    dy1 = -0.039f,
                    dx2 = -0.08f,
                    dy2 = -0.13f,
                    dx3 = -0.283f,
                    dy3 = -0.13f,
                )
                close()
            }
            // M35.5 36 l-0.805 -12.888 c0.381 -0.935 0.555 -2.535 0.555 -5.112 0 -5.244 -2.99 -9.5 -4.941 -9.5 -0.508 0 -0.792 0.287 -0.942 0.528 -0.606 0.976 -0.124 3.013 0.263 4.649 0.125 0.53 0.267 1.13 0.267 1.323 0 0.278 -0.283 0.866 -0.557 1.434 -0.486 1.006 -1.09 2.259 -1.09 3.566 0 0.922 0.278 1.952 0.877 3.245 0.054 0.117 0.126 0.221 0.211 0.314 L28.5 36 h7z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 35.5 36
                moveTo(x = 35.5f, y = 36.0f)
                // l -0.805 -12.888
                lineToRelative(dx = -0.805f, dy = -12.888f)
                // c 0.381 -0.935 0.555 -2.535 0.555 -5.112
                curveToRelative(
                    dx1 = 0.381f,
                    dy1 = -0.935f,
                    dx2 = 0.555f,
                    dy2 = -2.535f,
                    dx3 = 0.555f,
                    dy3 = -5.112f,
                )
                // c 0 -5.244 -2.99 -9.5 -4.941 -9.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.244f,
                    dx2 = -2.99f,
                    dy2 = -9.5f,
                    dx3 = -4.941f,
                    dy3 = -9.5f,
                )
                // c -0.508 0 -0.792 0.287 -0.942 0.528
                curveToRelative(
                    dx1 = -0.508f,
                    dy1 = 0.0f,
                    dx2 = -0.792f,
                    dy2 = 0.287f,
                    dx3 = -0.942f,
                    dy3 = 0.528f,
                )
                // c -0.606 0.976 -0.124 3.013 0.263 4.649
                curveToRelative(
                    dx1 = -0.606f,
                    dy1 = 0.976f,
                    dx2 = -0.124f,
                    dy2 = 3.013f,
                    dx3 = 0.263f,
                    dy3 = 4.649f,
                )
                // c 0.125 0.53 0.267 1.13 0.267 1.323
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = 0.53f,
                    dx2 = 0.267f,
                    dy2 = 1.13f,
                    dx3 = 0.267f,
                    dy3 = 1.323f,
                )
                // c 0 0.278 -0.283 0.866 -0.557 1.434
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.278f,
                    dx2 = -0.283f,
                    dy2 = 0.866f,
                    dx3 = -0.557f,
                    dy3 = 1.434f,
                )
                // c -0.486 1.006 -1.09 2.259 -1.09 3.566
                curveToRelative(
                    dx1 = -0.486f,
                    dy1 = 1.006f,
                    dx2 = -1.09f,
                    dy2 = 2.259f,
                    dx3 = -1.09f,
                    dy3 = 3.566f,
                )
                // c 0 0.922 0.278 1.952 0.877 3.245
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.922f,
                    dx2 = 0.278f,
                    dy2 = 1.952f,
                    dx3 = 0.877f,
                    dy3 = 3.245f,
                )
                // c 0.054 0.117 0.126 0.221 0.211 0.314
                curveToRelative(
                    dx1 = 0.054f,
                    dy1 = 0.117f,
                    dx2 = 0.126f,
                    dy2 = 0.221f,
                    dx3 = 0.211f,
                    dy3 = 0.314f,
                )
                // L 28.5 36
                lineTo(x = 28.5f, y = 36.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
            }
            // M31 23.044 c0 -3.985 -0.197 -7.971 -0.197 -9.963 0 -1.374 -0.493 -2.822 -1.324 -4.201 -0.042 0.05 -0.082 0.1 -0.112 0.148 -0.606 0.976 -0.124 3.013 0.263 4.649 0.125 0.53 0.267 1.13 0.267 1.323 0 0.278 -0.283 0.866 -0.557 1.434 -0.486 1.006 -1.09 2.259 -1.09 3.566 0 0.922 0.278 1.952 0.877 3.245 0.051 0.11 0.134 0.197 0.213 0.286 L28.5 36 h0.5 s2 -12.641 2 -12.956z
            path(
                fill = SolidColor(Color(0xFF9B3C07)),
            ) {
                // M 31 23.044
                moveTo(x = 31.0f, y = 23.044f)
                // c 0 -3.985 -0.197 -7.971 -0.197 -9.963
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.985f,
                    dx2 = -0.197f,
                    dy2 = -7.971f,
                    dx3 = -0.197f,
                    dy3 = -9.963f,
                )
                // c 0 -1.374 -0.493 -2.822 -1.324 -4.201
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.374f,
                    dx2 = -0.493f,
                    dy2 = -2.822f,
                    dx3 = -1.324f,
                    dy3 = -4.201f,
                )
                // c -0.042 0.05 -0.082 0.1 -0.112 0.148
                curveToRelative(
                    dx1 = -0.042f,
                    dy1 = 0.05f,
                    dx2 = -0.082f,
                    dy2 = 0.1f,
                    dx3 = -0.112f,
                    dy3 = 0.148f,
                )
                // c -0.606 0.976 -0.124 3.013 0.263 4.649
                curveToRelative(
                    dx1 = -0.606f,
                    dy1 = 0.976f,
                    dx2 = -0.124f,
                    dy2 = 3.013f,
                    dx3 = 0.263f,
                    dy3 = 4.649f,
                )
                // c 0.125 0.53 0.267 1.13 0.267 1.323
                curveToRelative(
                    dx1 = 0.125f,
                    dy1 = 0.53f,
                    dx2 = 0.267f,
                    dy2 = 1.13f,
                    dx3 = 0.267f,
                    dy3 = 1.323f,
                )
                // c 0 0.278 -0.283 0.866 -0.557 1.434
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.278f,
                    dx2 = -0.283f,
                    dy2 = 0.866f,
                    dx3 = -0.557f,
                    dy3 = 1.434f,
                )
                // c -0.486 1.006 -1.09 2.259 -1.09 3.566
                curveToRelative(
                    dx1 = -0.486f,
                    dy1 = 1.006f,
                    dx2 = -1.09f,
                    dy2 = 2.259f,
                    dx3 = -1.09f,
                    dy3 = 3.566f,
                )
                // c 0 0.922 0.278 1.952 0.877 3.245
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.922f,
                    dx2 = 0.278f,
                    dy2 = 1.952f,
                    dx3 = 0.877f,
                    dy3 = 3.245f,
                )
                // c 0.051 0.11 0.134 0.197 0.213 0.286
                curveToRelative(
                    dx1 = 0.051f,
                    dy1 = 0.11f,
                    dx2 = 0.134f,
                    dy2 = 0.197f,
                    dx3 = 0.213f,
                    dy3 = 0.286f,
                )
                // L 28.5 36
                lineTo(x = 28.5f, y = 36.0f)
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // s 2 -12.641 2 -12.956z
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = -12.641f,
                    dx2 = 2.0f,
                    dy2 = -12.956f,
                )
                close()
            }
            // M30.309 9.5 c-0.203 0 -0.26 0.091 -0.284 0.13 -0.358 0.577 0.133 2.655 0.396 3.771 0.191 0.808 0.299 1.281 0.299 1.599 0 0.55 -0.296 1.163 -0.67 1.939 -0.458 0.949 -0.977 2.025 -0.977 3.061 0 0.732 0.252 1.634 0.77 2.755 0.127 0.274 0.951 0.558 2.112 0.558 l0.232 0.001 c0.702 0.007 1.432 0.012 1.689 -0.463 0.365 -0.676 0.55 -2.308 0.55 -4.851 0 -4.825 -2.744 -8.5 -4.117 -8.5z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 30.309 9.5
                moveTo(x = 30.309f, y = 9.5f)
                // c -0.203 0 -0.26 0.091 -0.284 0.13
                curveToRelative(
                    dx1 = -0.203f,
                    dy1 = 0.0f,
                    dx2 = -0.26f,
                    dy2 = 0.091f,
                    dx3 = -0.284f,
                    dy3 = 0.13f,
                )
                // c -0.358 0.577 0.133 2.655 0.396 3.771
                curveToRelative(
                    dx1 = -0.358f,
                    dy1 = 0.577f,
                    dx2 = 0.133f,
                    dy2 = 2.655f,
                    dx3 = 0.396f,
                    dy3 = 3.771f,
                )
                // c 0.191 0.808 0.299 1.281 0.299 1.599
                curveToRelative(
                    dx1 = 0.191f,
                    dy1 = 0.808f,
                    dx2 = 0.299f,
                    dy2 = 1.281f,
                    dx3 = 0.299f,
                    dy3 = 1.599f,
                )
                // c 0 0.55 -0.296 1.163 -0.67 1.939
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.55f,
                    dx2 = -0.296f,
                    dy2 = 1.163f,
                    dx3 = -0.67f,
                    dy3 = 1.939f,
                )
                // c -0.458 0.949 -0.977 2.025 -0.977 3.061
                curveToRelative(
                    dx1 = -0.458f,
                    dy1 = 0.949f,
                    dx2 = -0.977f,
                    dy2 = 2.025f,
                    dx3 = -0.977f,
                    dy3 = 3.061f,
                )
                // c 0 0.732 0.252 1.634 0.77 2.755
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.732f,
                    dx2 = 0.252f,
                    dy2 = 1.634f,
                    dx3 = 0.77f,
                    dy3 = 2.755f,
                )
                // c 0.127 0.274 0.951 0.558 2.112 0.558
                curveToRelative(
                    dx1 = 0.127f,
                    dy1 = 0.274f,
                    dx2 = 0.951f,
                    dy2 = 0.558f,
                    dx3 = 2.112f,
                    dy3 = 0.558f,
                )
                // l 0.232 0.001
                lineToRelative(dx = 0.232f, dy = 0.001f)
                // c 0.702 0.007 1.432 0.012 1.689 -0.463
                curveToRelative(
                    dx1 = 0.702f,
                    dy1 = 0.007f,
                    dx2 = 1.432f,
                    dy2 = 0.012f,
                    dx3 = 1.689f,
                    dy3 = -0.463f,
                )
                // c 0.365 -0.676 0.55 -2.308 0.55 -4.851
                curveToRelative(
                    dx1 = 0.365f,
                    dy1 = -0.676f,
                    dx2 = 0.55f,
                    dy2 = -2.308f,
                    dx3 = 0.55f,
                    dy3 = -4.851f,
                )
                // c 0 -4.825 -2.744 -8.5 -4.117 -8.5z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.825f,
                    dx2 = -2.744f,
                    dy2 = -8.5f,
                    dx3 = -4.117f,
                    dy3 = -8.5f,
                )
                close()
            }
        }.build().also { _emoji1f649 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f649: ImageVector? = null
