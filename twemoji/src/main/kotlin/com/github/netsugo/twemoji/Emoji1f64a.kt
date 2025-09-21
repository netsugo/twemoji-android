package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f64a: ImageVector
    get() {
        val current = _emoji1f64a
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f64a",
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
            // M22.242 0.17 s-5.303 -1.061 -7.424 2.121 4.242 1.061 4.242 1.061 S20.121 0.17 22.242 0.17z M36 36 l-14 -4 3 -6 11 2z M0 36 l14 -4 -3 -6 -11 2z
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
                // M 36 36
                moveTo(x = 36.0f, y = 36.0f)
                // l -14 -4
                lineToRelative(dx = -14.0f, dy = -4.0f)
                // l 3 -6
                lineToRelative(dx = 3.0f, dy = -6.0f)
                // l 11 2z
                lineToRelative(dx = 11.0f, dy = 2.0f)
                close()
                // M 0 36
                moveTo(x = 0.0f, y = 36.0f)
                // l 14 -4
                lineToRelative(dx = 14.0f, dy = -4.0f)
                // l -3 -6
                lineToRelative(dx = -3.0f, dy = -6.0f)
                // l -11 2z
                lineToRelative(dx = -11.0f, dy = 2.0f)
                close()
            }
            // M12.369 25.001 s0.118 -1.26 0.094 -2.719 c-0.031 -1.906 -2.582 -2.852 -3.375 -1.062 -0.969 2.188 -2.188 7.438 -1.469 9.656 s2.531 3.969 6.594 3.844 7.594 -0.906 8.688 -1.594 0.845 -2.378 -0.406 -2.656 c-1.125 -0.25 -4.219 0.25 -4.219 0.25 s3.253 -0.694 4.156 -1.281 c1.25 -0.812 0.562 -2.594 -0.656 -2.625 -1.202 -0.031 -4.188 0.469 -4.188 0.469 s2.844 -0.75 3.75 -1.531 c0.895 -0.771 0.562 -2.469 -1.031 -2.531 s-6.438 0.967 -7.938 1.78z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 12.369 25.001
                moveTo(x = 12.369f, y = 25.001f)
                // s 0.118 -1.26 0.094 -2.719
                reflectiveCurveToRelative(
                    dx1 = 0.118f,
                    dy1 = -1.26f,
                    dx2 = 0.094f,
                    dy2 = -2.719f,
                )
                // c -0.031 -1.906 -2.582 -2.852 -3.375 -1.062
                curveToRelative(
                    dx1 = -0.031f,
                    dy1 = -1.906f,
                    dx2 = -2.582f,
                    dy2 = -2.852f,
                    dx3 = -3.375f,
                    dy3 = -1.062f,
                )
                // c -0.969 2.188 -2.188 7.438 -1.469 9.656
                curveToRelative(
                    dx1 = -0.969f,
                    dy1 = 2.188f,
                    dx2 = -2.188f,
                    dy2 = 7.438f,
                    dx3 = -1.469f,
                    dy3 = 9.656f,
                )
                // s 2.531 3.969 6.594 3.844
                reflectiveCurveToRelative(
                    dx1 = 2.531f,
                    dy1 = 3.969f,
                    dx2 = 6.594f,
                    dy2 = 3.844f,
                )
                // s 7.594 -0.906 8.688 -1.594
                reflectiveCurveToRelative(
                    dx1 = 7.594f,
                    dy1 = -0.906f,
                    dx2 = 8.688f,
                    dy2 = -1.594f,
                )
                // s 0.845 -2.378 -0.406 -2.656
                reflectiveCurveToRelative(
                    dx1 = 0.845f,
                    dy1 = -2.378f,
                    dx2 = -0.406f,
                    dy2 = -2.656f,
                )
                // c -1.125 -0.25 -4.219 0.25 -4.219 0.25
                curveToRelative(
                    dx1 = -1.125f,
                    dy1 = -0.25f,
                    dx2 = -4.219f,
                    dy2 = 0.25f,
                    dx3 = -4.219f,
                    dy3 = 0.25f,
                )
                // s 3.253 -0.694 4.156 -1.281
                reflectiveCurveToRelative(
                    dx1 = 3.253f,
                    dy1 = -0.694f,
                    dx2 = 4.156f,
                    dy2 = -1.281f,
                )
                // c 1.25 -0.812 0.562 -2.594 -0.656 -2.625
                curveToRelative(
                    dx1 = 1.25f,
                    dy1 = -0.812f,
                    dx2 = 0.562f,
                    dy2 = -2.594f,
                    dx3 = -0.656f,
                    dy3 = -2.625f,
                )
                // c -1.202 -0.031 -4.188 0.469 -4.188 0.469
                curveToRelative(
                    dx1 = -1.202f,
                    dy1 = -0.031f,
                    dx2 = -4.188f,
                    dy2 = 0.469f,
                    dx3 = -4.188f,
                    dy3 = 0.469f,
                )
                // s 2.844 -0.75 3.75 -1.531
                reflectiveCurveToRelative(
                    dx1 = 2.844f,
                    dy1 = -0.75f,
                    dx2 = 3.75f,
                    dy2 = -1.531f,
                )
                // c 0.895 -0.771 0.562 -2.469 -1.031 -2.531
                curveToRelative(
                    dx1 = 0.895f,
                    dy1 = -0.771f,
                    dx2 = 0.562f,
                    dy2 = -2.469f,
                    dx3 = -1.031f,
                    dy3 = -2.531f,
                )
                // s -6.438 0.967 -7.938 1.78z
                reflectiveCurveToRelative(
                    dx1 = -6.438f,
                    dy1 = 0.967f,
                    dx2 = -7.938f,
                    dy2 = 1.78f,
                )
                close()
            }
            // M13.806 35.227 c-3.52 0 -5.76 -1.411 -6.662 -4.196 -0.806 -2.487 0.56 -7.919 1.487 -10.013 0.418 -0.946 1.3 -1.411 2.297 -1.205 0.995 0.201 2.013 1.111 2.035 2.462 0.012 0.744 -0.011 1.432 -0.038 1.937 2.056 -0.774 5.966 -1.559 7.401 -1.491 0.911 0.036 1.618 0.522 1.89 1.302 0.263 0.75 0.041 1.598 -0.552 2.108 -0.073 0.062 -0.156 0.125 -0.247 0.187 0.135 -0.004 0.261 -0.005 0.371 -0.003 0.803 0.021 1.498 0.589 1.731 1.414 0.235 0.834 -0.077 1.65 -0.815 2.13 -0.055 0.036 -0.116 0.071 -0.185 0.107 l0.083 0.017 c0.767 0.171 1.326 0.763 1.462 1.546 0.138 0.799 -0.215 1.593 -0.898 2.021 -1.131 0.712 -4.648 1.539 -8.938 1.671 -0.143 0.003 -0.284 0.006 -0.422 0.006z M10.488 20.768 c-0.294 0 -0.703 0.111 -0.943 0.654 -1.014 2.29 -2.093 7.314 -1.45 9.3 0.796 2.456 2.794 3.616 6.103 3.498 3.912 -0.12 7.424 -0.881 8.437 -1.517 0.41 -0.259 0.499 -0.689 0.444 -1.006 -0.066 -0.381 -0.325 -0.657 -0.693 -0.739 -0.848 -0.188 -3.196 0.121 -4.031 0.255 -0.266 0.05 -0.521 -0.134 -0.571 -0.401 -0.05 -0.267 0.122 -0.524 0.387 -0.581 0.88 -0.188 3.312 -0.771 3.988 -1.211 0.523 -0.34 0.452 -0.827 0.397 -1.021 -0.091 -0.322 -0.378 -0.675 -0.794 -0.686 -1.174 -0.049 -4.063 0.457 -4.092 0.462 -0.266 0.046 -0.515 -0.127 -0.571 -0.388 -0.056 -0.262 0.103 -0.521 0.361 -0.589 0.76 -0.201 2.88 -0.849 3.551 -1.427 0.283 -0.244 0.389 -0.655 0.261 -1.021 -0.079 -0.225 -0.312 -0.605 -0.985 -0.632 -1.452 -0.06 -6.245 0.944 -7.68 1.721 -0.164 0.087 -0.361 0.08 -0.514 -0.022 -0.154 -0.102 -0.24 -0.279 -0.223 -0.464 0.001 -0.012 0.115 -1.251 0.092 -2.664 -0.013 -0.821 -0.631 -1.376 -1.234 -1.498 -0.061 -0.012 -0.144 -0.023 -0.24 -0.023z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 13.806 35.227
                moveTo(x = 13.806f, y = 35.227f)
                // c -3.52 0 -5.76 -1.411 -6.662 -4.196
                curveToRelative(
                    dx1 = -3.52f,
                    dy1 = 0.0f,
                    dx2 = -5.76f,
                    dy2 = -1.411f,
                    dx3 = -6.662f,
                    dy3 = -4.196f,
                )
                // c -0.806 -2.487 0.56 -7.919 1.487 -10.013
                curveToRelative(
                    dx1 = -0.806f,
                    dy1 = -2.487f,
                    dx2 = 0.56f,
                    dy2 = -7.919f,
                    dx3 = 1.487f,
                    dy3 = -10.013f,
                )
                // c 0.418 -0.946 1.3 -1.411 2.297 -1.205
                curveToRelative(
                    dx1 = 0.418f,
                    dy1 = -0.946f,
                    dx2 = 1.3f,
                    dy2 = -1.411f,
                    dx3 = 2.297f,
                    dy3 = -1.205f,
                )
                // c 0.995 0.201 2.013 1.111 2.035 2.462
                curveToRelative(
                    dx1 = 0.995f,
                    dy1 = 0.201f,
                    dx2 = 2.013f,
                    dy2 = 1.111f,
                    dx3 = 2.035f,
                    dy3 = 2.462f,
                )
                // c 0.012 0.744 -0.011 1.432 -0.038 1.937
                curveToRelative(
                    dx1 = 0.012f,
                    dy1 = 0.744f,
                    dx2 = -0.011f,
                    dy2 = 1.432f,
                    dx3 = -0.038f,
                    dy3 = 1.937f,
                )
                // c 2.056 -0.774 5.966 -1.559 7.401 -1.491
                curveToRelative(
                    dx1 = 2.056f,
                    dy1 = -0.774f,
                    dx2 = 5.966f,
                    dy2 = -1.559f,
                    dx3 = 7.401f,
                    dy3 = -1.491f,
                )
                // c 0.911 0.036 1.618 0.522 1.89 1.302
                curveToRelative(
                    dx1 = 0.911f,
                    dy1 = 0.036f,
                    dx2 = 1.618f,
                    dy2 = 0.522f,
                    dx3 = 1.89f,
                    dy3 = 1.302f,
                )
                // c 0.263 0.75 0.041 1.598 -0.552 2.108
                curveToRelative(
                    dx1 = 0.263f,
                    dy1 = 0.75f,
                    dx2 = 0.041f,
                    dy2 = 1.598f,
                    dx3 = -0.552f,
                    dy3 = 2.108f,
                )
                // c -0.073 0.062 -0.156 0.125 -0.247 0.187
                curveToRelative(
                    dx1 = -0.073f,
                    dy1 = 0.062f,
                    dx2 = -0.156f,
                    dy2 = 0.125f,
                    dx3 = -0.247f,
                    dy3 = 0.187f,
                )
                // c 0.135 -0.004 0.261 -0.005 0.371 -0.003
                curveToRelative(
                    dx1 = 0.135f,
                    dy1 = -0.004f,
                    dx2 = 0.261f,
                    dy2 = -0.005f,
                    dx3 = 0.371f,
                    dy3 = -0.003f,
                )
                // c 0.803 0.021 1.498 0.589 1.731 1.414
                curveToRelative(
                    dx1 = 0.803f,
                    dy1 = 0.021f,
                    dx2 = 1.498f,
                    dy2 = 0.589f,
                    dx3 = 1.731f,
                    dy3 = 1.414f,
                )
                // c 0.235 0.834 -0.077 1.65 -0.815 2.13
                curveToRelative(
                    dx1 = 0.235f,
                    dy1 = 0.834f,
                    dx2 = -0.077f,
                    dy2 = 1.65f,
                    dx3 = -0.815f,
                    dy3 = 2.13f,
                )
                // c -0.055 0.036 -0.116 0.071 -0.185 0.107
                curveToRelative(
                    dx1 = -0.055f,
                    dy1 = 0.036f,
                    dx2 = -0.116f,
                    dy2 = 0.071f,
                    dx3 = -0.185f,
                    dy3 = 0.107f,
                )
                // l 0.083 0.017
                lineToRelative(dx = 0.083f, dy = 0.017f)
                // c 0.767 0.171 1.326 0.763 1.462 1.546
                curveToRelative(
                    dx1 = 0.767f,
                    dy1 = 0.171f,
                    dx2 = 1.326f,
                    dy2 = 0.763f,
                    dx3 = 1.462f,
                    dy3 = 1.546f,
                )
                // c 0.138 0.799 -0.215 1.593 -0.898 2.021
                curveToRelative(
                    dx1 = 0.138f,
                    dy1 = 0.799f,
                    dx2 = -0.215f,
                    dy2 = 1.593f,
                    dx3 = -0.898f,
                    dy3 = 2.021f,
                )
                // c -1.131 0.712 -4.648 1.539 -8.938 1.671
                curveToRelative(
                    dx1 = -1.131f,
                    dy1 = 0.712f,
                    dx2 = -4.648f,
                    dy2 = 1.539f,
                    dx3 = -8.938f,
                    dy3 = 1.671f,
                )
                // c -0.143 0.003 -0.284 0.006 -0.422 0.006z
                curveToRelative(
                    dx1 = -0.143f,
                    dy1 = 0.003f,
                    dx2 = -0.284f,
                    dy2 = 0.006f,
                    dx3 = -0.422f,
                    dy3 = 0.006f,
                )
                close()
                // M 10.488 20.768
                moveTo(x = 10.488f, y = 20.768f)
                // c -0.294 0 -0.703 0.111 -0.943 0.654
                curveToRelative(
                    dx1 = -0.294f,
                    dy1 = 0.0f,
                    dx2 = -0.703f,
                    dy2 = 0.111f,
                    dx3 = -0.943f,
                    dy3 = 0.654f,
                )
                // c -1.014 2.29 -2.093 7.314 -1.45 9.3
                curveToRelative(
                    dx1 = -1.014f,
                    dy1 = 2.29f,
                    dx2 = -2.093f,
                    dy2 = 7.314f,
                    dx3 = -1.45f,
                    dy3 = 9.3f,
                )
                // c 0.796 2.456 2.794 3.616 6.103 3.498
                curveToRelative(
                    dx1 = 0.796f,
                    dy1 = 2.456f,
                    dx2 = 2.794f,
                    dy2 = 3.616f,
                    dx3 = 6.103f,
                    dy3 = 3.498f,
                )
                // c 3.912 -0.12 7.424 -0.881 8.437 -1.517
                curveToRelative(
                    dx1 = 3.912f,
                    dy1 = -0.12f,
                    dx2 = 7.424f,
                    dy2 = -0.881f,
                    dx3 = 8.437f,
                    dy3 = -1.517f,
                )
                // c 0.41 -0.259 0.499 -0.689 0.444 -1.006
                curveToRelative(
                    dx1 = 0.41f,
                    dy1 = -0.259f,
                    dx2 = 0.499f,
                    dy2 = -0.689f,
                    dx3 = 0.444f,
                    dy3 = -1.006f,
                )
                // c -0.066 -0.381 -0.325 -0.657 -0.693 -0.739
                curveToRelative(
                    dx1 = -0.066f,
                    dy1 = -0.381f,
                    dx2 = -0.325f,
                    dy2 = -0.657f,
                    dx3 = -0.693f,
                    dy3 = -0.739f,
                )
                // c -0.848 -0.188 -3.196 0.121 -4.031 0.255
                curveToRelative(
                    dx1 = -0.848f,
                    dy1 = -0.188f,
                    dx2 = -3.196f,
                    dy2 = 0.121f,
                    dx3 = -4.031f,
                    dy3 = 0.255f,
                )
                // c -0.266 0.05 -0.521 -0.134 -0.571 -0.401
                curveToRelative(
                    dx1 = -0.266f,
                    dy1 = 0.05f,
                    dx2 = -0.521f,
                    dy2 = -0.134f,
                    dx3 = -0.571f,
                    dy3 = -0.401f,
                )
                // c -0.05 -0.267 0.122 -0.524 0.387 -0.581
                curveToRelative(
                    dx1 = -0.05f,
                    dy1 = -0.267f,
                    dx2 = 0.122f,
                    dy2 = -0.524f,
                    dx3 = 0.387f,
                    dy3 = -0.581f,
                )
                // c 0.88 -0.188 3.312 -0.771 3.988 -1.211
                curveToRelative(
                    dx1 = 0.88f,
                    dy1 = -0.188f,
                    dx2 = 3.312f,
                    dy2 = -0.771f,
                    dx3 = 3.988f,
                    dy3 = -1.211f,
                )
                // c 0.523 -0.34 0.452 -0.827 0.397 -1.021
                curveToRelative(
                    dx1 = 0.523f,
                    dy1 = -0.34f,
                    dx2 = 0.452f,
                    dy2 = -0.827f,
                    dx3 = 0.397f,
                    dy3 = -1.021f,
                )
                // c -0.091 -0.322 -0.378 -0.675 -0.794 -0.686
                curveToRelative(
                    dx1 = -0.091f,
                    dy1 = -0.322f,
                    dx2 = -0.378f,
                    dy2 = -0.675f,
                    dx3 = -0.794f,
                    dy3 = -0.686f,
                )
                // c -1.174 -0.049 -4.063 0.457 -4.092 0.462
                curveToRelative(
                    dx1 = -1.174f,
                    dy1 = -0.049f,
                    dx2 = -4.063f,
                    dy2 = 0.457f,
                    dx3 = -4.092f,
                    dy3 = 0.462f,
                )
                // c -0.266 0.046 -0.515 -0.127 -0.571 -0.388
                curveToRelative(
                    dx1 = -0.266f,
                    dy1 = 0.046f,
                    dx2 = -0.515f,
                    dy2 = -0.127f,
                    dx3 = -0.571f,
                    dy3 = -0.388f,
                )
                // c -0.056 -0.262 0.103 -0.521 0.361 -0.589
                curveToRelative(
                    dx1 = -0.056f,
                    dy1 = -0.262f,
                    dx2 = 0.103f,
                    dy2 = -0.521f,
                    dx3 = 0.361f,
                    dy3 = -0.589f,
                )
                // c 0.76 -0.201 2.88 -0.849 3.551 -1.427
                curveToRelative(
                    dx1 = 0.76f,
                    dy1 = -0.201f,
                    dx2 = 2.88f,
                    dy2 = -0.849f,
                    dx3 = 3.551f,
                    dy3 = -1.427f,
                )
                // c 0.283 -0.244 0.389 -0.655 0.261 -1.021
                curveToRelative(
                    dx1 = 0.283f,
                    dy1 = -0.244f,
                    dx2 = 0.389f,
                    dy2 = -0.655f,
                    dx3 = 0.261f,
                    dy3 = -1.021f,
                )
                // c -0.079 -0.225 -0.312 -0.605 -0.985 -0.632
                curveToRelative(
                    dx1 = -0.079f,
                    dy1 = -0.225f,
                    dx2 = -0.312f,
                    dy2 = -0.605f,
                    dx3 = -0.985f,
                    dy3 = -0.632f,
                )
                // c -1.452 -0.06 -6.245 0.944 -7.68 1.721
                curveToRelative(
                    dx1 = -1.452f,
                    dy1 = -0.06f,
                    dx2 = -6.245f,
                    dy2 = 0.944f,
                    dx3 = -7.68f,
                    dy3 = 1.721f,
                )
                // c -0.164 0.087 -0.361 0.08 -0.514 -0.022
                curveToRelative(
                    dx1 = -0.164f,
                    dy1 = 0.087f,
                    dx2 = -0.361f,
                    dy2 = 0.08f,
                    dx3 = -0.514f,
                    dy3 = -0.022f,
                )
                // c -0.154 -0.102 -0.24 -0.279 -0.223 -0.464
                curveToRelative(
                    dx1 = -0.154f,
                    dy1 = -0.102f,
                    dx2 = -0.24f,
                    dy2 = -0.279f,
                    dx3 = -0.223f,
                    dy3 = -0.464f,
                )
                // c 0.001 -0.012 0.115 -1.251 0.092 -2.664
                curveToRelative(
                    dx1 = 0.001f,
                    dy1 = -0.012f,
                    dx2 = 0.115f,
                    dy2 = -1.251f,
                    dx3 = 0.092f,
                    dy3 = -2.664f,
                )
                // c -0.013 -0.821 -0.631 -1.376 -1.234 -1.498
                curveToRelative(
                    dx1 = -0.013f,
                    dy1 = -0.821f,
                    dx2 = -0.631f,
                    dy2 = -1.376f,
                    dx3 = -1.234f,
                    dy3 = -1.498f,
                )
                // c -0.061 -0.012 -0.144 -0.023 -0.24 -0.023z
                curveToRelative(
                    dx1 = -0.061f,
                    dy1 = -0.012f,
                    dx2 = -0.144f,
                    dy2 = -0.023f,
                    dx3 = -0.24f,
                    dy3 = -0.023f,
                )
                close()
            }
            // M23.631 25.001 s-0.118 -1.26 -0.094 -2.719 c0.031 -1.906 2.582 -2.852 3.375 -1.062 0.969 2.188 2.188 7.438 1.469 9.656 s-2.531 3.969 -6.594 3.844 -7.594 -0.906 -8.688 -1.594 -0.845 -2.378 0.406 -2.656 c1.125 -0.25 4.219 0.25 4.219 0.25 s-3.253 -0.694 -4.156 -1.281 c-1.25 -0.812 -0.562 -2.594 0.656 -2.625 1.202 -0.031 4.188 0.469 4.188 0.469 s-2.844 -0.75 -3.75 -1.531 c-0.895 -0.771 -0.562 -2.469 1.031 -2.531 s6.438 0.967 7.938 1.78z
            path(
                fill = SolidColor(Color(0xFFD79E84)),
            ) {
                // M 23.631 25.001
                moveTo(x = 23.631f, y = 25.001f)
                // s -0.118 -1.26 -0.094 -2.719
                reflectiveCurveToRelative(
                    dx1 = -0.118f,
                    dy1 = -1.26f,
                    dx2 = -0.094f,
                    dy2 = -2.719f,
                )
                // c 0.031 -1.906 2.582 -2.852 3.375 -1.062
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = -1.906f,
                    dx2 = 2.582f,
                    dy2 = -2.852f,
                    dx3 = 3.375f,
                    dy3 = -1.062f,
                )
                // c 0.969 2.188 2.188 7.438 1.469 9.656
                curveToRelative(
                    dx1 = 0.969f,
                    dy1 = 2.188f,
                    dx2 = 2.188f,
                    dy2 = 7.438f,
                    dx3 = 1.469f,
                    dy3 = 9.656f,
                )
                // s -2.531 3.969 -6.594 3.844
                reflectiveCurveToRelative(
                    dx1 = -2.531f,
                    dy1 = 3.969f,
                    dx2 = -6.594f,
                    dy2 = 3.844f,
                )
                // s -7.594 -0.906 -8.688 -1.594
                reflectiveCurveToRelative(
                    dx1 = -7.594f,
                    dy1 = -0.906f,
                    dx2 = -8.688f,
                    dy2 = -1.594f,
                )
                // s -0.845 -2.378 0.406 -2.656
                reflectiveCurveToRelative(
                    dx1 = -0.845f,
                    dy1 = -2.378f,
                    dx2 = 0.406f,
                    dy2 = -2.656f,
                )
                // c 1.125 -0.25 4.219 0.25 4.219 0.25
                curveToRelative(
                    dx1 = 1.125f,
                    dy1 = -0.25f,
                    dx2 = 4.219f,
                    dy2 = 0.25f,
                    dx3 = 4.219f,
                    dy3 = 0.25f,
                )
                // s -3.253 -0.694 -4.156 -1.281
                reflectiveCurveToRelative(
                    dx1 = -3.253f,
                    dy1 = -0.694f,
                    dx2 = -4.156f,
                    dy2 = -1.281f,
                )
                // c -1.25 -0.812 -0.562 -2.594 0.656 -2.625
                curveToRelative(
                    dx1 = -1.25f,
                    dy1 = -0.812f,
                    dx2 = -0.562f,
                    dy2 = -2.594f,
                    dx3 = 0.656f,
                    dy3 = -2.625f,
                )
                // c 1.202 -0.031 4.188 0.469 4.188 0.469
                curveToRelative(
                    dx1 = 1.202f,
                    dy1 = -0.031f,
                    dx2 = 4.188f,
                    dy2 = 0.469f,
                    dx3 = 4.188f,
                    dy3 = 0.469f,
                )
                // s -2.844 -0.75 -3.75 -1.531
                reflectiveCurveToRelative(
                    dx1 = -2.844f,
                    dy1 = -0.75f,
                    dx2 = -3.75f,
                    dy2 = -1.531f,
                )
                // c -0.895 -0.771 -0.562 -2.469 1.031 -2.531
                curveToRelative(
                    dx1 = -0.895f,
                    dy1 = -0.771f,
                    dx2 = -0.562f,
                    dy2 = -2.469f,
                    dx3 = 1.031f,
                    dy3 = -2.531f,
                )
                // s 6.438 0.967 7.938 1.78z
                reflectiveCurveToRelative(
                    dx1 = 6.438f,
                    dy1 = 0.967f,
                    dx2 = 7.938f,
                    dy2 = 1.78f,
                )
                close()
            }
            // M22.194 35.227 c-0.139 0 -0.279 -0.003 -0.423 -0.007 -4.29 -0.132 -7.807 -0.959 -8.938 -1.671 -0.683 -0.429 -1.036 -1.223 -0.897 -2.021 0.135 -0.783 0.695 -1.375 1.461 -1.546 l0.083 -0.017 c-0.067 -0.036 -0.129 -0.071 -0.184 -0.107 -0.739 -0.479 -1.051 -1.296 -0.815 -2.13 0.233 -0.825 0.929 -1.394 1.731 -1.414 0.111 -0.002 0.236 -0.001 0.371 0.003 -0.091 -0.062 -0.174 -0.124 -0.248 -0.187 -0.592 -0.511 -0.814 -1.358 -0.552 -2.108 0.272 -0.779 0.979 -1.266 1.89 -1.302 1.433 -0.049 5.346 0.718 7.401 1.491 -0.026 -0.505 -0.05 -1.192 -0.038 -1.937 0.022 -1.35 1.04 -2.261 2.034 -2.462 1.004 -0.206 1.879 0.259 2.298 1.205 0.928 2.094 2.293 7.525 1.487 10.013 -0.901 2.785 -3.141 4.196 -6.661 4.197z M14.37 30.898 c-0.304 0 -0.567 0.018 -0.755 0.06 -0.368 0.082 -0.627 0.358 -0.693 0.739 -0.055 0.316 0.033 0.747 0.444 1.006 1.012 0.636 4.525 1.396 8.437 1.517 3.3 0.101 5.308 -1.042 6.103 -3.498 0.644 -1.985 -0.437 -7.01 -1.45 -9.3 -0.319 -0.72 -0.933 -0.681 -1.185 -0.63 -0.603 0.122 -1.22 0.677 -1.233 1.498 -0.022 1.413 0.091 2.652 0.092 2.665 0.017 0.184 -0.068 0.361 -0.223 0.463 -0.154 0.103 -0.353 0.11 -0.514 0.022 -1.435 -0.776 -6.187 -1.786 -7.68 -1.721 -0.674 0.026 -0.907 0.407 -0.985 0.632 -0.127 0.365 -0.023 0.776 0.261 1.021 0.671 0.579 2.791 1.227 3.551 1.427 0.258 0.068 0.417 0.327 0.361 0.589 -0.057 0.261 -0.312 0.43 -0.572 0.388 -0.03 -0.005 -2.962 -0.493 -4.092 -0.462 -0.416 0.011 -0.704 0.363 -0.795 0.686 -0.055 0.193 -0.125 0.681 0.398 1.021 0.677 0.439 3.108 1.023 3.988 1.211 0.265 0.057 0.437 0.314 0.387 0.581 s-0.306 0.447 -0.571 0.401 c-0.648 -0.106 -2.213 -0.316 -3.274 -0.316z
            path(
                fill = SolidColor(Color(0xFFBF6952)),
            ) {
                // M 22.194 35.227
                moveTo(x = 22.194f, y = 35.227f)
                // c -0.139 0 -0.279 -0.003 -0.423 -0.007
                curveToRelative(
                    dx1 = -0.139f,
                    dy1 = 0.0f,
                    dx2 = -0.279f,
                    dy2 = -0.003f,
                    dx3 = -0.423f,
                    dy3 = -0.007f,
                )
                // c -4.29 -0.132 -7.807 -0.959 -8.938 -1.671
                curveToRelative(
                    dx1 = -4.29f,
                    dy1 = -0.132f,
                    dx2 = -7.807f,
                    dy2 = -0.959f,
                    dx3 = -8.938f,
                    dy3 = -1.671f,
                )
                // c -0.683 -0.429 -1.036 -1.223 -0.897 -2.021
                curveToRelative(
                    dx1 = -0.683f,
                    dy1 = -0.429f,
                    dx2 = -1.036f,
                    dy2 = -1.223f,
                    dx3 = -0.897f,
                    dy3 = -2.021f,
                )
                // c 0.135 -0.783 0.695 -1.375 1.461 -1.546
                curveToRelative(
                    dx1 = 0.135f,
                    dy1 = -0.783f,
                    dx2 = 0.695f,
                    dy2 = -1.375f,
                    dx3 = 1.461f,
                    dy3 = -1.546f,
                )
                // l 0.083 -0.017
                lineToRelative(dx = 0.083f, dy = -0.017f)
                // c -0.067 -0.036 -0.129 -0.071 -0.184 -0.107
                curveToRelative(
                    dx1 = -0.067f,
                    dy1 = -0.036f,
                    dx2 = -0.129f,
                    dy2 = -0.071f,
                    dx3 = -0.184f,
                    dy3 = -0.107f,
                )
                // c -0.739 -0.479 -1.051 -1.296 -0.815 -2.13
                curveToRelative(
                    dx1 = -0.739f,
                    dy1 = -0.479f,
                    dx2 = -1.051f,
                    dy2 = -1.296f,
                    dx3 = -0.815f,
                    dy3 = -2.13f,
                )
                // c 0.233 -0.825 0.929 -1.394 1.731 -1.414
                curveToRelative(
                    dx1 = 0.233f,
                    dy1 = -0.825f,
                    dx2 = 0.929f,
                    dy2 = -1.394f,
                    dx3 = 1.731f,
                    dy3 = -1.414f,
                )
                // c 0.111 -0.002 0.236 -0.001 0.371 0.003
                curveToRelative(
                    dx1 = 0.111f,
                    dy1 = -0.002f,
                    dx2 = 0.236f,
                    dy2 = -0.001f,
                    dx3 = 0.371f,
                    dy3 = 0.003f,
                )
                // c -0.091 -0.062 -0.174 -0.124 -0.248 -0.187
                curveToRelative(
                    dx1 = -0.091f,
                    dy1 = -0.062f,
                    dx2 = -0.174f,
                    dy2 = -0.124f,
                    dx3 = -0.248f,
                    dy3 = -0.187f,
                )
                // c -0.592 -0.511 -0.814 -1.358 -0.552 -2.108
                curveToRelative(
                    dx1 = -0.592f,
                    dy1 = -0.511f,
                    dx2 = -0.814f,
                    dy2 = -1.358f,
                    dx3 = -0.552f,
                    dy3 = -2.108f,
                )
                // c 0.272 -0.779 0.979 -1.266 1.89 -1.302
                curveToRelative(
                    dx1 = 0.272f,
                    dy1 = -0.779f,
                    dx2 = 0.979f,
                    dy2 = -1.266f,
                    dx3 = 1.89f,
                    dy3 = -1.302f,
                )
                // c 1.433 -0.049 5.346 0.718 7.401 1.491
                curveToRelative(
                    dx1 = 1.433f,
                    dy1 = -0.049f,
                    dx2 = 5.346f,
                    dy2 = 0.718f,
                    dx3 = 7.401f,
                    dy3 = 1.491f,
                )
                // c -0.026 -0.505 -0.05 -1.192 -0.038 -1.937
                curveToRelative(
                    dx1 = -0.026f,
                    dy1 = -0.505f,
                    dx2 = -0.05f,
                    dy2 = -1.192f,
                    dx3 = -0.038f,
                    dy3 = -1.937f,
                )
                // c 0.022 -1.35 1.04 -2.261 2.034 -2.462
                curveToRelative(
                    dx1 = 0.022f,
                    dy1 = -1.35f,
                    dx2 = 1.04f,
                    dy2 = -2.261f,
                    dx3 = 2.034f,
                    dy3 = -2.462f,
                )
                // c 1.004 -0.206 1.879 0.259 2.298 1.205
                curveToRelative(
                    dx1 = 1.004f,
                    dy1 = -0.206f,
                    dx2 = 1.879f,
                    dy2 = 0.259f,
                    dx3 = 2.298f,
                    dy3 = 1.205f,
                )
                // c 0.928 2.094 2.293 7.525 1.487 10.013
                curveToRelative(
                    dx1 = 0.928f,
                    dy1 = 2.094f,
                    dx2 = 2.293f,
                    dy2 = 7.525f,
                    dx3 = 1.487f,
                    dy3 = 10.013f,
                )
                // c -0.901 2.785 -3.141 4.196 -6.661 4.197z
                curveToRelative(
                    dx1 = -0.901f,
                    dy1 = 2.785f,
                    dx2 = -3.141f,
                    dy2 = 4.196f,
                    dx3 = -6.661f,
                    dy3 = 4.197f,
                )
                close()
                // M 14.37 30.898
                moveTo(x = 14.37f, y = 30.898f)
                // c -0.304 0 -0.567 0.018 -0.755 0.06
                curveToRelative(
                    dx1 = -0.304f,
                    dy1 = 0.0f,
                    dx2 = -0.567f,
                    dy2 = 0.018f,
                    dx3 = -0.755f,
                    dy3 = 0.06f,
                )
                // c -0.368 0.082 -0.627 0.358 -0.693 0.739
                curveToRelative(
                    dx1 = -0.368f,
                    dy1 = 0.082f,
                    dx2 = -0.627f,
                    dy2 = 0.358f,
                    dx3 = -0.693f,
                    dy3 = 0.739f,
                )
                // c -0.055 0.316 0.033 0.747 0.444 1.006
                curveToRelative(
                    dx1 = -0.055f,
                    dy1 = 0.316f,
                    dx2 = 0.033f,
                    dy2 = 0.747f,
                    dx3 = 0.444f,
                    dy3 = 1.006f,
                )
                // c 1.012 0.636 4.525 1.396 8.437 1.517
                curveToRelative(
                    dx1 = 1.012f,
                    dy1 = 0.636f,
                    dx2 = 4.525f,
                    dy2 = 1.396f,
                    dx3 = 8.437f,
                    dy3 = 1.517f,
                )
                // c 3.3 0.101 5.308 -1.042 6.103 -3.498
                curveToRelative(
                    dx1 = 3.3f,
                    dy1 = 0.101f,
                    dx2 = 5.308f,
                    dy2 = -1.042f,
                    dx3 = 6.103f,
                    dy3 = -3.498f,
                )
                // c 0.644 -1.985 -0.437 -7.01 -1.45 -9.3
                curveToRelative(
                    dx1 = 0.644f,
                    dy1 = -1.985f,
                    dx2 = -0.437f,
                    dy2 = -7.01f,
                    dx3 = -1.45f,
                    dy3 = -9.3f,
                )
                // c -0.319 -0.72 -0.933 -0.681 -1.185 -0.63
                curveToRelative(
                    dx1 = -0.319f,
                    dy1 = -0.72f,
                    dx2 = -0.933f,
                    dy2 = -0.681f,
                    dx3 = -1.185f,
                    dy3 = -0.63f,
                )
                // c -0.603 0.122 -1.22 0.677 -1.233 1.498
                curveToRelative(
                    dx1 = -0.603f,
                    dy1 = 0.122f,
                    dx2 = -1.22f,
                    dy2 = 0.677f,
                    dx3 = -1.233f,
                    dy3 = 1.498f,
                )
                // c -0.022 1.413 0.091 2.652 0.092 2.665
                curveToRelative(
                    dx1 = -0.022f,
                    dy1 = 1.413f,
                    dx2 = 0.091f,
                    dy2 = 2.652f,
                    dx3 = 0.092f,
                    dy3 = 2.665f,
                )
                // c 0.017 0.184 -0.068 0.361 -0.223 0.463
                curveToRelative(
                    dx1 = 0.017f,
                    dy1 = 0.184f,
                    dx2 = -0.068f,
                    dy2 = 0.361f,
                    dx3 = -0.223f,
                    dy3 = 0.463f,
                )
                // c -0.154 0.103 -0.353 0.11 -0.514 0.022
                curveToRelative(
                    dx1 = -0.154f,
                    dy1 = 0.103f,
                    dx2 = -0.353f,
                    dy2 = 0.11f,
                    dx3 = -0.514f,
                    dy3 = 0.022f,
                )
                // c -1.435 -0.776 -6.187 -1.786 -7.68 -1.721
                curveToRelative(
                    dx1 = -1.435f,
                    dy1 = -0.776f,
                    dx2 = -6.187f,
                    dy2 = -1.786f,
                    dx3 = -7.68f,
                    dy3 = -1.721f,
                )
                // c -0.674 0.026 -0.907 0.407 -0.985 0.632
                curveToRelative(
                    dx1 = -0.674f,
                    dy1 = 0.026f,
                    dx2 = -0.907f,
                    dy2 = 0.407f,
                    dx3 = -0.985f,
                    dy3 = 0.632f,
                )
                // c -0.127 0.365 -0.023 0.776 0.261 1.021
                curveToRelative(
                    dx1 = -0.127f,
                    dy1 = 0.365f,
                    dx2 = -0.023f,
                    dy2 = 0.776f,
                    dx3 = 0.261f,
                    dy3 = 1.021f,
                )
                // c 0.671 0.579 2.791 1.227 3.551 1.427
                curveToRelative(
                    dx1 = 0.671f,
                    dy1 = 0.579f,
                    dx2 = 2.791f,
                    dy2 = 1.227f,
                    dx3 = 3.551f,
                    dy3 = 1.427f,
                )
                // c 0.258 0.068 0.417 0.327 0.361 0.589
                curveToRelative(
                    dx1 = 0.258f,
                    dy1 = 0.068f,
                    dx2 = 0.417f,
                    dy2 = 0.327f,
                    dx3 = 0.361f,
                    dy3 = 0.589f,
                )
                // c -0.057 0.261 -0.312 0.43 -0.572 0.388
                curveToRelative(
                    dx1 = -0.057f,
                    dy1 = 0.261f,
                    dx2 = -0.312f,
                    dy2 = 0.43f,
                    dx3 = -0.572f,
                    dy3 = 0.388f,
                )
                // c -0.03 -0.005 -2.962 -0.493 -4.092 -0.462
                curveToRelative(
                    dx1 = -0.03f,
                    dy1 = -0.005f,
                    dx2 = -2.962f,
                    dy2 = -0.493f,
                    dx3 = -4.092f,
                    dy3 = -0.462f,
                )
                // c -0.416 0.011 -0.704 0.363 -0.795 0.686
                curveToRelative(
                    dx1 = -0.416f,
                    dy1 = 0.011f,
                    dx2 = -0.704f,
                    dy2 = 0.363f,
                    dx3 = -0.795f,
                    dy3 = 0.686f,
                )
                // c -0.055 0.193 -0.125 0.681 0.398 1.021
                curveToRelative(
                    dx1 = -0.055f,
                    dy1 = 0.193f,
                    dx2 = -0.125f,
                    dy2 = 0.681f,
                    dx3 = 0.398f,
                    dy3 = 1.021f,
                )
                // c 0.677 0.439 3.108 1.023 3.988 1.211
                curveToRelative(
                    dx1 = 0.677f,
                    dy1 = 0.439f,
                    dx2 = 3.108f,
                    dy2 = 1.023f,
                    dx3 = 3.988f,
                    dy3 = 1.211f,
                )
                // c 0.265 0.057 0.437 0.314 0.387 0.581
                curveToRelative(
                    dx1 = 0.265f,
                    dy1 = 0.057f,
                    dx2 = 0.437f,
                    dy2 = 0.314f,
                    dx3 = 0.387f,
                    dy3 = 0.581f,
                )
                // s -0.306 0.447 -0.571 0.401
                reflectiveCurveToRelative(
                    dx1 = -0.306f,
                    dy1 = 0.447f,
                    dx2 = -0.571f,
                    dy2 = 0.401f,
                )
                // c -0.648 -0.106 -2.213 -0.316 -3.274 -0.316z
                curveToRelative(
                    dx1 = -0.648f,
                    dy1 = -0.106f,
                    dx2 = -2.213f,
                    dy2 = -0.316f,
                    dx3 = -3.274f,
                    dy3 = -0.316f,
                )
                close()
            }
            // M9.643 21.265 c-0.29 -0.199 -0.561 -0.403 -0.809 -0.613 -0.076 0.113 -0.145 0.233 -0.204 0.366 -0.532 1.201 -1.203 3.497 -1.531 5.708 l-2.148 0.45 2.998 0.879 0.155 -1.268 c0.296 -1.973 0.875 -4.091 1.439 -5.365 0.03 -0.065 0.068 -0.104 0.1 -0.157z M28.916 26.823 c-0.322 -2.24 -1.007 -4.587 -1.547 -5.805 -0.061 -0.139 -0.135 -0.264 -0.216 -0.381 -0.254 0.216 -0.516 0.424 -0.789 0.624 0.031 0.051 0.063 0.1 0.091 0.161 0.688 1.554 1.405 4.366 1.594 6.634 l3.021 -0.88 -2.154 -0.353z
            path(
                fill = SolidColor(Color(0xFF9B3C07)),
            ) {
                // M 9.643 21.265
                moveTo(x = 9.643f, y = 21.265f)
                // c -0.29 -0.199 -0.561 -0.403 -0.809 -0.613
                curveToRelative(
                    dx1 = -0.29f,
                    dy1 = -0.199f,
                    dx2 = -0.561f,
                    dy2 = -0.403f,
                    dx3 = -0.809f,
                    dy3 = -0.613f,
                )
                // c -0.076 0.113 -0.145 0.233 -0.204 0.366
                curveToRelative(
                    dx1 = -0.076f,
                    dy1 = 0.113f,
                    dx2 = -0.145f,
                    dy2 = 0.233f,
                    dx3 = -0.204f,
                    dy3 = 0.366f,
                )
                // c -0.532 1.201 -1.203 3.497 -1.531 5.708
                curveToRelative(
                    dx1 = -0.532f,
                    dy1 = 1.201f,
                    dx2 = -1.203f,
                    dy2 = 3.497f,
                    dx3 = -1.531f,
                    dy3 = 5.708f,
                )
                // l -2.148 0.45
                lineToRelative(dx = -2.148f, dy = 0.45f)
                // l 2.998 0.879
                lineToRelative(dx = 2.998f, dy = 0.879f)
                // l 0.155 -1.268
                lineToRelative(dx = 0.155f, dy = -1.268f)
                // c 0.296 -1.973 0.875 -4.091 1.439 -5.365
                curveToRelative(
                    dx1 = 0.296f,
                    dy1 = -1.973f,
                    dx2 = 0.875f,
                    dy2 = -4.091f,
                    dx3 = 1.439f,
                    dy3 = -5.365f,
                )
                // c 0.03 -0.065 0.068 -0.104 0.1 -0.157z
                curveToRelative(
                    dx1 = 0.03f,
                    dy1 = -0.065f,
                    dx2 = 0.068f,
                    dy2 = -0.104f,
                    dx3 = 0.1f,
                    dy3 = -0.157f,
                )
                close()
                // M 28.916 26.823
                moveTo(x = 28.916f, y = 26.823f)
                // c -0.322 -2.24 -1.007 -4.587 -1.547 -5.805
                curveToRelative(
                    dx1 = -0.322f,
                    dy1 = -2.24f,
                    dx2 = -1.007f,
                    dy2 = -4.587f,
                    dx3 = -1.547f,
                    dy3 = -5.805f,
                )
                // c -0.061 -0.139 -0.135 -0.264 -0.216 -0.381
                curveToRelative(
                    dx1 = -0.061f,
                    dy1 = -0.139f,
                    dx2 = -0.135f,
                    dy2 = -0.264f,
                    dx3 = -0.216f,
                    dy3 = -0.381f,
                )
                // c -0.254 0.216 -0.516 0.424 -0.789 0.624
                curveToRelative(
                    dx1 = -0.254f,
                    dy1 = 0.216f,
                    dx2 = -0.516f,
                    dy2 = 0.424f,
                    dx3 = -0.789f,
                    dy3 = 0.624f,
                )
                // c 0.031 0.051 0.063 0.1 0.091 0.161
                curveToRelative(
                    dx1 = 0.031f,
                    dy1 = 0.051f,
                    dx2 = 0.063f,
                    dy2 = 0.1f,
                    dx3 = 0.091f,
                    dy3 = 0.161f,
                )
                // c 0.688 1.554 1.405 4.366 1.594 6.634
                curveToRelative(
                    dx1 = 0.688f,
                    dy1 = 1.554f,
                    dx2 = 1.405f,
                    dy2 = 4.366f,
                    dx3 = 1.594f,
                    dy3 = 6.634f,
                )
                // l 3.021 -0.88
                lineToRelative(dx = 3.021f, dy = -0.88f)
                // l -2.154 -0.353z
                lineToRelative(dx = -2.154f, dy = -0.353f)
                close()
            }
        }.build().also { _emoji1f64a = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f64a: ImageVector? = null
