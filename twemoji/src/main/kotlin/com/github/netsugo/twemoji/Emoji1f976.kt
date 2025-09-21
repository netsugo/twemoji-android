package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f976: ImageVector
    get() {
        val current = _emoji1f976
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f976",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 18 m-18 0 a18 18 0 1 1 36 0 a18 18 0 1 1 -36 0
            path(
                fill = SolidColor(Color(0xFF50A5E6)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -18 0
                moveToRelative(dx = -18.0f, dy = 0.0f)
                // a 18 18 0 1 1 36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 36.0f,
                    dy1 = 0.0f,
                )
                // a 18 18 0 1 1 -36 0
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -36.0f,
                    dy1 = 0.0f,
                )
            }
            // M9.485 15.188 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 9.485 15.188
                moveTo(x = 9.485f, y = 15.188f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21.485 15.188 a2.5 3.5 0 1 0 5 0 a2.5 3.5 0 1 0 -5 0z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 21.485 15.188
                moveTo(x = 21.485f, y = 15.188f)
                // a 2.5 3.5 0 1 0 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 3.5 0 1 0 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M24.985 21.833 c2.209 0 4 1.791 4 4 s-1.791 4 -4 4 h-14 c-2.209 0 -4 -1.791 -4 -4 s1.791 -4 4 -4 h14z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 24.985 21.833
                moveTo(x = 24.985f, y = 21.833f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // s -1.791 4 -4 4
                reflectiveCurveToRelative(
                    dx1 = -1.791f,
                    dy1 = 4.0f,
                    dx2 = -4.0f,
                    dy2 = 4.0f,
                )
                // h -14
                horizontalLineToRelative(dx = -14.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // s 1.791 -4 4 -4
                reflectiveCurveToRelative(
                    dx1 = 1.791f,
                    dy1 = -4.0f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // h 14z
                horizontalLineToRelative(dx = 14.0f)
                close()
            }
            // M24.985 20.812 h-14 c-2.757 0 -5 2.243 -5 5 s2.243 5 5 5 h14 c2.757 0 5 -2.243 5 -5 s-2.243 -5 -5 -5z M24.985 22.812 c1.483 0 2.71 1.084 2.949 2.5 h-3.449 v-2.5 h0.5z M23.485 22.812 v2.5 h-3 v-2.5 h3z M19.485 22.812 v2.5 h-3 v-2.5 h3z M15.485 22.812 v2.5 h-3 v-2.5 h3z M10.985 22.812 h0.5 v2.5 h-3.45 c0.24 -1.415 1.467 -2.5 2.95 -2.5z M10.985 28.812 c-1.483 0 -2.71 -1.084 -2.949 -2.5 h3.449 v2.5 h-0.5z M12.485 28.812 v-2.5 h3 v2.5 h-3z M16.485 28.812 v-2.5 h3 v2.5 h-3z M20.485 28.812 v-2.5 h3 v2.5 h-3z M24.985 28.812 h-0.5 v-2.5 h3.449 c-0.239 1.416 -1.466 2.5 -2.949 2.5z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 24.985 20.812
                moveTo(x = 24.985f, y = 20.812f)
                // h -14
                horizontalLineToRelative(dx = -14.0f)
                // c -2.757 0 -5 2.243 -5 5
                curveToRelative(
                    dx1 = -2.757f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = 2.243f,
                    dx3 = -5.0f,
                    dy3 = 5.0f,
                )
                // s 2.243 5 5 5
                reflectiveCurveToRelative(
                    dx1 = 2.243f,
                    dy1 = 5.0f,
                    dx2 = 5.0f,
                    dy2 = 5.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // c 2.757 0 5 -2.243 5 -5
                curveToRelative(
                    dx1 = 2.757f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -2.243f,
                    dx3 = 5.0f,
                    dy3 = -5.0f,
                )
                // s -2.243 -5 -5 -5z
                reflectiveCurveToRelative(
                    dx1 = -2.243f,
                    dy1 = -5.0f,
                    dx2 = -5.0f,
                    dy2 = -5.0f,
                )
                close()
                // M 24.985 22.812
                moveTo(x = 24.985f, y = 22.812f)
                // c 1.483 0 2.71 1.084 2.949 2.5
                curveToRelative(
                    dx1 = 1.483f,
                    dy1 = 0.0f,
                    dx2 = 2.71f,
                    dy2 = 1.084f,
                    dx3 = 2.949f,
                    dy3 = 2.5f,
                )
                // h -3.449
                horizontalLineToRelative(dx = -3.449f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 0.5z
                horizontalLineToRelative(dx = 0.5f)
                close()
                // M 23.485 22.812
                moveTo(x = 23.485f, y = 22.812f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
                // M 19.485 22.812
                moveTo(x = 19.485f, y = 22.812f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
                // M 15.485 22.812
                moveTo(x = 15.485f, y = 22.812f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
                // M 10.985 22.812
                moveTo(x = 10.985f, y = 22.812f)
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3.45
                horizontalLineToRelative(dx = -3.45f)
                // c 0.24 -1.415 1.467 -2.5 2.95 -2.5z
                curveToRelative(
                    dx1 = 0.24f,
                    dy1 = -1.415f,
                    dx2 = 1.467f,
                    dy2 = -2.5f,
                    dx3 = 2.95f,
                    dy3 = -2.5f,
                )
                close()
                // M 10.985 28.812
                moveTo(x = 10.985f, y = 28.812f)
                // c -1.483 0 -2.71 -1.084 -2.949 -2.5
                curveToRelative(
                    dx1 = -1.483f,
                    dy1 = 0.0f,
                    dx2 = -2.71f,
                    dy2 = -1.084f,
                    dx3 = -2.949f,
                    dy3 = -2.5f,
                )
                // h 3.449
                horizontalLineToRelative(dx = 3.449f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -0.5z
                horizontalLineToRelative(dx = -0.5f)
                close()
                // M 12.485 28.812
                moveTo(x = 12.485f, y = 28.812f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 16.485 28.812
                moveTo(x = 16.485f, y = 28.812f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 20.485 28.812
                moveTo(x = 20.485f, y = 28.812f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // M 24.985 28.812
                moveTo(x = 24.985f, y = 28.812f)
                // h -0.5
                horizontalLineToRelative(dx = -0.5f)
                // v -2.5
                verticalLineToRelative(dy = -2.5f)
                // h 3.449
                horizontalLineToRelative(dx = 3.449f)
                // c -0.239 1.416 -1.466 2.5 -2.949 2.5z
                curveToRelative(
                    dx1 = -0.239f,
                    dy1 = 1.416f,
                    dx2 = -1.466f,
                    dy2 = 2.5f,
                    dx3 = -2.949f,
                    dy3 = 2.5f,
                )
                close()
            }
            // M35.756 15.188 c0 -0.445 -0.046 2.24 -3.752 3.394 -1.461 0.455 -1.288 2.58 -1.265 3.152 0.08 1.975 0.398 3.892 0.497 4.392 0.1 0.507 0.507 2.106 0.602 2.589 0.105 0.532 0.241 2.406 0.333 2.873 0.111 0.563 0.215 0.968 0.3 1.398 0.184 0.929 0.424 1.598 0.832 1.598 0.409 0 0.416 -1.125 0.599 -2.053 0.085 -0.429 0.107 -0.787 0.218 -1.349 0.092 -0.464 0.363 -3.641 0.465 -4.156 0.097 -0.491 0.636 -2.568 0.734 -3.067 0.1 -0.507 0.399 -2.494 0.479 -2.979 0.478 -2.897 -0.042 -5.791 -0.042 -5.792z M0.313 21.375 c0 -0.29 0.613 1.164 1.148 1.488 0.69 0.418 1.23 1.2 2.04 1.887 s0.808 1.974 0.776 2.594 c-0.136 2.656 -0.486 5.299 -0.562 5.625 -0.076 0.331 -0.358 2.823 -0.73 2.823 s-0.553 -0.878 -0.693 -1.484 l-0.225 -0.977 c-0.07 -0.302 -0.12 -0.631 -0.2 -0.976 -0.072 -0.314 -0.421 -2.587 -0.496 -2.913 -0.076 -0.331 -0.406 -1.643 -0.479 -1.958 -0.08 -0.347 -0.114 -0.684 -0.19 -0.987 -0.327 -1.3 -0.389 -5.121 -0.389 -5.122z
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 35.756 15.188
                moveTo(x = 35.756f, y = 15.188f)
                // c 0 -0.445 -0.046 2.24 -3.752 3.394
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.445f,
                    dx2 = -0.046f,
                    dy2 = 2.24f,
                    dx3 = -3.752f,
                    dy3 = 3.394f,
                )
                // c -1.461 0.455 -1.288 2.58 -1.265 3.152
                curveToRelative(
                    dx1 = -1.461f,
                    dy1 = 0.455f,
                    dx2 = -1.288f,
                    dy2 = 2.58f,
                    dx3 = -1.265f,
                    dy3 = 3.152f,
                )
                // c 0.08 1.975 0.398 3.892 0.497 4.392
                curveToRelative(
                    dx1 = 0.08f,
                    dy1 = 1.975f,
                    dx2 = 0.398f,
                    dy2 = 3.892f,
                    dx3 = 0.497f,
                    dy3 = 4.392f,
                )
                // c 0.1 0.507 0.507 2.106 0.602 2.589
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = 0.507f,
                    dx2 = 0.507f,
                    dy2 = 2.106f,
                    dx3 = 0.602f,
                    dy3 = 2.589f,
                )
                // c 0.105 0.532 0.241 2.406 0.333 2.873
                curveToRelative(
                    dx1 = 0.105f,
                    dy1 = 0.532f,
                    dx2 = 0.241f,
                    dy2 = 2.406f,
                    dx3 = 0.333f,
                    dy3 = 2.873f,
                )
                // c 0.111 0.563 0.215 0.968 0.3 1.398
                curveToRelative(
                    dx1 = 0.111f,
                    dy1 = 0.563f,
                    dx2 = 0.215f,
                    dy2 = 0.968f,
                    dx3 = 0.3f,
                    dy3 = 1.398f,
                )
                // c 0.184 0.929 0.424 1.598 0.832 1.598
                curveToRelative(
                    dx1 = 0.184f,
                    dy1 = 0.929f,
                    dx2 = 0.424f,
                    dy2 = 1.598f,
                    dx3 = 0.832f,
                    dy3 = 1.598f,
                )
                // c 0.409 0 0.416 -1.125 0.599 -2.053
                curveToRelative(
                    dx1 = 0.409f,
                    dy1 = 0.0f,
                    dx2 = 0.416f,
                    dy2 = -1.125f,
                    dx3 = 0.599f,
                    dy3 = -2.053f,
                )
                // c 0.085 -0.429 0.107 -0.787 0.218 -1.349
                curveToRelative(
                    dx1 = 0.085f,
                    dy1 = -0.429f,
                    dx2 = 0.107f,
                    dy2 = -0.787f,
                    dx3 = 0.218f,
                    dy3 = -1.349f,
                )
                // c 0.092 -0.464 0.363 -3.641 0.465 -4.156
                curveToRelative(
                    dx1 = 0.092f,
                    dy1 = -0.464f,
                    dx2 = 0.363f,
                    dy2 = -3.641f,
                    dx3 = 0.465f,
                    dy3 = -4.156f,
                )
                // c 0.097 -0.491 0.636 -2.568 0.734 -3.067
                curveToRelative(
                    dx1 = 0.097f,
                    dy1 = -0.491f,
                    dx2 = 0.636f,
                    dy2 = -2.568f,
                    dx3 = 0.734f,
                    dy3 = -3.067f,
                )
                // c 0.1 -0.507 0.399 -2.494 0.479 -2.979
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = -0.507f,
                    dx2 = 0.399f,
                    dy2 = -2.494f,
                    dx3 = 0.479f,
                    dy3 = -2.979f,
                )
                // c 0.478 -2.897 -0.042 -5.791 -0.042 -5.792z
                curveToRelative(
                    dx1 = 0.478f,
                    dy1 = -2.897f,
                    dx2 = -0.042f,
                    dy2 = -5.791f,
                    dx3 = -0.042f,
                    dy3 = -5.792f,
                )
                close()
                // M 0.313 21.375
                moveTo(x = 0.313f, y = 21.375f)
                // c 0 -0.29 0.613 1.164 1.148 1.488
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.29f,
                    dx2 = 0.613f,
                    dy2 = 1.164f,
                    dx3 = 1.148f,
                    dy3 = 1.488f,
                )
                // c 0.69 0.418 1.23 1.2 2.04 1.887
                curveToRelative(
                    dx1 = 0.69f,
                    dy1 = 0.418f,
                    dx2 = 1.23f,
                    dy2 = 1.2f,
                    dx3 = 2.04f,
                    dy3 = 1.887f,
                )
                // s 0.808 1.974 0.776 2.594
                reflectiveCurveToRelative(
                    dx1 = 0.808f,
                    dy1 = 1.974f,
                    dx2 = 0.776f,
                    dy2 = 2.594f,
                )
                // c -0.136 2.656 -0.486 5.299 -0.562 5.625
                curveToRelative(
                    dx1 = -0.136f,
                    dy1 = 2.656f,
                    dx2 = -0.486f,
                    dy2 = 5.299f,
                    dx3 = -0.562f,
                    dy3 = 5.625f,
                )
                // c -0.076 0.331 -0.358 2.823 -0.73 2.823
                curveToRelative(
                    dx1 = -0.076f,
                    dy1 = 0.331f,
                    dx2 = -0.358f,
                    dy2 = 2.823f,
                    dx3 = -0.73f,
                    dy3 = 2.823f,
                )
                // s -0.553 -0.878 -0.693 -1.484
                reflectiveCurveToRelative(
                    dx1 = -0.553f,
                    dy1 = -0.878f,
                    dx2 = -0.693f,
                    dy2 = -1.484f,
                )
                // l -0.225 -0.977
                lineToRelative(dx = -0.225f, dy = -0.977f)
                // c -0.07 -0.302 -0.12 -0.631 -0.2 -0.976
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = -0.302f,
                    dx2 = -0.12f,
                    dy2 = -0.631f,
                    dx3 = -0.2f,
                    dy3 = -0.976f,
                )
                // c -0.072 -0.314 -0.421 -2.587 -0.496 -2.913
                curveToRelative(
                    dx1 = -0.072f,
                    dy1 = -0.314f,
                    dx2 = -0.421f,
                    dy2 = -2.587f,
                    dx3 = -0.496f,
                    dy3 = -2.913f,
                )
                // c -0.076 -0.331 -0.406 -1.643 -0.479 -1.958
                curveToRelative(
                    dx1 = -0.076f,
                    dy1 = -0.331f,
                    dx2 = -0.406f,
                    dy2 = -1.643f,
                    dx3 = -0.479f,
                    dy3 = -1.958f,
                )
                // c -0.08 -0.347 -0.114 -0.684 -0.19 -0.987
                curveToRelative(
                    dx1 = -0.08f,
                    dy1 = -0.347f,
                    dx2 = -0.114f,
                    dy2 = -0.684f,
                    dx3 = -0.19f,
                    dy3 = -0.987f,
                )
                // c -0.327 -1.3 -0.389 -5.121 -0.389 -5.122z
                curveToRelative(
                    dx1 = -0.327f,
                    dy1 = -1.3f,
                    dx2 = -0.389f,
                    dy2 = -5.121f,
                    dx3 = -0.389f,
                    dy3 = -5.122f,
                )
                close()
            }
            // M5.986 11.375 c-0.552 0 -1 -0.448 -1 -1 0 -0.551 0.445 -0.998 0.996 -1 0.156 -0.002 3.569 -0.086 6.205 -3.6 0.331 -0.44 0.957 -0.532 1.4 -0.2 0.442 0.331 0.531 0.958 0.2 1.4 -3.263 4.35 -7.617 4.4 -7.801 4.4z M29.986 11.375 c-0.184 0 -4.537 -0.05 -7.8 -4.4 -0.332 -0.442 -0.242 -1.069 0.2 -1.4 0.441 -0.333 1.067 -0.242 1.399 0.2 2.641 3.521 6.062 3.599 6.206 3.6 0.55 0.006 0.994 0.456 0.991 1.005 -0.002 0.551 -0.446 0.995 -0.996 0.995z
            path(
                fill = SolidColor(Color(0xFF1C6399)),
            ) {
                // M 5.986 11.375
                moveTo(x = 5.986f, y = 11.375f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.551 0.445 -0.998 0.996 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.551f,
                    dx2 = 0.445f,
                    dy2 = -0.998f,
                    dx3 = 0.996f,
                    dy3 = -1.0f,
                )
                // c 0.156 -0.002 3.569 -0.086 6.205 -3.6
                curveToRelative(
                    dx1 = 0.156f,
                    dy1 = -0.002f,
                    dx2 = 3.569f,
                    dy2 = -0.086f,
                    dx3 = 6.205f,
                    dy3 = -3.6f,
                )
                // c 0.331 -0.44 0.957 -0.532 1.4 -0.2
                curveToRelative(
                    dx1 = 0.331f,
                    dy1 = -0.44f,
                    dx2 = 0.957f,
                    dy2 = -0.532f,
                    dx3 = 1.4f,
                    dy3 = -0.2f,
                )
                // c 0.442 0.331 0.531 0.958 0.2 1.4
                curveToRelative(
                    dx1 = 0.442f,
                    dy1 = 0.331f,
                    dx2 = 0.531f,
                    dy2 = 0.958f,
                    dx3 = 0.2f,
                    dy3 = 1.4f,
                )
                // c -3.263 4.35 -7.617 4.4 -7.801 4.4z
                curveToRelative(
                    dx1 = -3.263f,
                    dy1 = 4.35f,
                    dx2 = -7.617f,
                    dy2 = 4.4f,
                    dx3 = -7.801f,
                    dy3 = 4.4f,
                )
                close()
                // M 29.986 11.375
                moveTo(x = 29.986f, y = 11.375f)
                // c -0.184 0 -4.537 -0.05 -7.8 -4.4
                curveToRelative(
                    dx1 = -0.184f,
                    dy1 = 0.0f,
                    dx2 = -4.537f,
                    dy2 = -0.05f,
                    dx3 = -7.8f,
                    dy3 = -4.4f,
                )
                // c -0.332 -0.442 -0.242 -1.069 0.2 -1.4
                curveToRelative(
                    dx1 = -0.332f,
                    dy1 = -0.442f,
                    dx2 = -0.242f,
                    dy2 = -1.069f,
                    dx3 = 0.2f,
                    dy3 = -1.4f,
                )
                // c 0.441 -0.333 1.067 -0.242 1.399 0.2
                curveToRelative(
                    dx1 = 0.441f,
                    dy1 = -0.333f,
                    dx2 = 1.067f,
                    dy2 = -0.242f,
                    dx3 = 1.399f,
                    dy3 = 0.2f,
                )
                // c 2.641 3.521 6.062 3.599 6.206 3.6
                curveToRelative(
                    dx1 = 2.641f,
                    dy1 = 3.521f,
                    dx2 = 6.062f,
                    dy2 = 3.599f,
                    dx3 = 6.206f,
                    dy3 = 3.6f,
                )
                // c 0.55 0.006 0.994 0.456 0.991 1.005
                curveToRelative(
                    dx1 = 0.55f,
                    dy1 = 0.006f,
                    dx2 = 0.994f,
                    dy2 = 0.456f,
                    dx3 = 0.991f,
                    dy3 = 1.005f,
                )
                // c -0.002 0.551 -0.446 0.995 -0.996 0.995z
                curveToRelative(
                    dx1 = -0.002f,
                    dy1 = 0.551f,
                    dx2 = -0.446f,
                    dy2 = 0.995f,
                    dx3 = -0.996f,
                    dy3 = 0.995f,
                )
                close()
            }
            // M24.266 1.125 s-0.991 -0.421 -1.317 -0.521 C22.662 0.516 21.756 0.328 21.196 0.22 c-0.625 -0.121 -1.294 -0.115 -1.294 -0.115 s-0.03 0.402 0.114 1.025 c0.116 0.502 0.404 1.198 0.458 1.559 0.059 0.391 0.068 0.855 0.141 1.348 0.064 0.426 0.128 0.88 0.197 1.342 0.067 0.446 0.182 0.894 0.249 1.341 0.07 0.464 0.102 0.925 0.167 1.353 0.074 0.496 -0.01 0.978 0.049 1.371 0.121 0.806 0.333 1.932 0.562 1.932 0.229 0 0.431 -1.019 0.552 -1.828 0.059 -0.391 -0.027 -0.695 0.047 -1.188 0.064 -0.426 0.118 -0.85 0.188 -1.312 0.067 -0.446 0.121 -0.882 0.188 -1.328 0.07 -0.464 0.061 -0.916 0.125 -1.344 0.074 -0.496 0.363 -1.107 0.422 -1.5 0.119 -0.806 0.905 -1.751 0.905 -1.751z M5.875 9.379 s0.731 -0.164 1.427 -0.309 c0.453 -0.094 0.812 -0.459 1.553 -0.729 0.771 -0.281 1.267 -0.524 1.267 -0.524 s0.063 1.305 -0.109 1.956 c-0.139 0.525 -0.212 1.203 -0.276 1.58 -0.07 0.408 -0.109 0.889 -0.197 1.404 -0.076 0.445 -0.216 0.91 -0.299 1.394 -0.08 0.467 -0.144 1.014 -0.224 1.481 -0.083 0.485 -0.105 0.902 -0.182 1.349 -0.089 0.518 -0.022 0.57 -0.093 0.98 -0.145 0.843 -0.165 0.727 -0.212 1.186 -0.047 0.459 -0.394 0.516 -0.544 0.18 -0.15 -0.336 0.009 -0.521 -0.136 -1.367 -0.07 -0.408 -0.327 -1.487 -0.41 -1.97 -0.08 -0.467 -0.188 -1.199 -0.268 -1.666 -0.083 -0.485 -0.104 -1.267 -0.181 -1.715 -0.089 -0.518 -0.225 -0.838 -0.295 -1.248 -0.145 -0.841 -0.821 -1.982 -0.821 -1.982z
            path(
                fill = SolidColor(Color(0xFFBBDDF5)),
            ) {
                // M 24.266 1.125
                moveTo(x = 24.266f, y = 1.125f)
                // s -0.991 -0.421 -1.317 -0.521
                reflectiveCurveToRelative(
                    dx1 = -0.991f,
                    dy1 = -0.421f,
                    dx2 = -1.317f,
                    dy2 = -0.521f,
                )
                // C 22.662 0.516 21.756 0.328 21.196 0.22
                curveTo(
                    x1 = 22.662f,
                    y1 = 0.516f,
                    x2 = 21.756f,
                    y2 = 0.328f,
                    x3 = 21.196f,
                    y3 = 0.22f,
                )
                // c -0.625 -0.121 -1.294 -0.115 -1.294 -0.115
                curveToRelative(
                    dx1 = -0.625f,
                    dy1 = -0.121f,
                    dx2 = -1.294f,
                    dy2 = -0.115f,
                    dx3 = -1.294f,
                    dy3 = -0.115f,
                )
                // s -0.03 0.402 0.114 1.025
                reflectiveCurveToRelative(
                    dx1 = -0.03f,
                    dy1 = 0.402f,
                    dx2 = 0.114f,
                    dy2 = 1.025f,
                )
                // c 0.116 0.502 0.404 1.198 0.458 1.559
                curveToRelative(
                    dx1 = 0.116f,
                    dy1 = 0.502f,
                    dx2 = 0.404f,
                    dy2 = 1.198f,
                    dx3 = 0.458f,
                    dy3 = 1.559f,
                )
                // c 0.059 0.391 0.068 0.855 0.141 1.348
                curveToRelative(
                    dx1 = 0.059f,
                    dy1 = 0.391f,
                    dx2 = 0.068f,
                    dy2 = 0.855f,
                    dx3 = 0.141f,
                    dy3 = 1.348f,
                )
                // c 0.064 0.426 0.128 0.88 0.197 1.342
                curveToRelative(
                    dx1 = 0.064f,
                    dy1 = 0.426f,
                    dx2 = 0.128f,
                    dy2 = 0.88f,
                    dx3 = 0.197f,
                    dy3 = 1.342f,
                )
                // c 0.067 0.446 0.182 0.894 0.249 1.341
                curveToRelative(
                    dx1 = 0.067f,
                    dy1 = 0.446f,
                    dx2 = 0.182f,
                    dy2 = 0.894f,
                    dx3 = 0.249f,
                    dy3 = 1.341f,
                )
                // c 0.07 0.464 0.102 0.925 0.167 1.353
                curveToRelative(
                    dx1 = 0.07f,
                    dy1 = 0.464f,
                    dx2 = 0.102f,
                    dy2 = 0.925f,
                    dx3 = 0.167f,
                    dy3 = 1.353f,
                )
                // c 0.074 0.496 -0.01 0.978 0.049 1.371
                curveToRelative(
                    dx1 = 0.074f,
                    dy1 = 0.496f,
                    dx2 = -0.01f,
                    dy2 = 0.978f,
                    dx3 = 0.049f,
                    dy3 = 1.371f,
                )
                // c 0.121 0.806 0.333 1.932 0.562 1.932
                curveToRelative(
                    dx1 = 0.121f,
                    dy1 = 0.806f,
                    dx2 = 0.333f,
                    dy2 = 1.932f,
                    dx3 = 0.562f,
                    dy3 = 1.932f,
                )
                // c 0.229 0 0.431 -1.019 0.552 -1.828
                curveToRelative(
                    dx1 = 0.229f,
                    dy1 = 0.0f,
                    dx2 = 0.431f,
                    dy2 = -1.019f,
                    dx3 = 0.552f,
                    dy3 = -1.828f,
                )
                // c 0.059 -0.391 -0.027 -0.695 0.047 -1.188
                curveToRelative(
                    dx1 = 0.059f,
                    dy1 = -0.391f,
                    dx2 = -0.027f,
                    dy2 = -0.695f,
                    dx3 = 0.047f,
                    dy3 = -1.188f,
                )
                // c 0.064 -0.426 0.118 -0.85 0.188 -1.312
                curveToRelative(
                    dx1 = 0.064f,
                    dy1 = -0.426f,
                    dx2 = 0.118f,
                    dy2 = -0.85f,
                    dx3 = 0.188f,
                    dy3 = -1.312f,
                )
                // c 0.067 -0.446 0.121 -0.882 0.188 -1.328
                curveToRelative(
                    dx1 = 0.067f,
                    dy1 = -0.446f,
                    dx2 = 0.121f,
                    dy2 = -0.882f,
                    dx3 = 0.188f,
                    dy3 = -1.328f,
                )
                // c 0.07 -0.464 0.061 -0.916 0.125 -1.344
                curveToRelative(
                    dx1 = 0.07f,
                    dy1 = -0.464f,
                    dx2 = 0.061f,
                    dy2 = -0.916f,
                    dx3 = 0.125f,
                    dy3 = -1.344f,
                )
                // c 0.074 -0.496 0.363 -1.107 0.422 -1.5
                curveToRelative(
                    dx1 = 0.074f,
                    dy1 = -0.496f,
                    dx2 = 0.363f,
                    dy2 = -1.107f,
                    dx3 = 0.422f,
                    dy3 = -1.5f,
                )
                // c 0.119 -0.806 0.905 -1.751 0.905 -1.751z
                curveToRelative(
                    dx1 = 0.119f,
                    dy1 = -0.806f,
                    dx2 = 0.905f,
                    dy2 = -1.751f,
                    dx3 = 0.905f,
                    dy3 = -1.751f,
                )
                close()
                // M 5.875 9.379
                moveTo(x = 5.875f, y = 9.379f)
                // s 0.731 -0.164 1.427 -0.309
                reflectiveCurveToRelative(
                    dx1 = 0.731f,
                    dy1 = -0.164f,
                    dx2 = 1.427f,
                    dy2 = -0.309f,
                )
                // c 0.453 -0.094 0.812 -0.459 1.553 -0.729
                curveToRelative(
                    dx1 = 0.453f,
                    dy1 = -0.094f,
                    dx2 = 0.812f,
                    dy2 = -0.459f,
                    dx3 = 1.553f,
                    dy3 = -0.729f,
                )
                // c 0.771 -0.281 1.267 -0.524 1.267 -0.524
                curveToRelative(
                    dx1 = 0.771f,
                    dy1 = -0.281f,
                    dx2 = 1.267f,
                    dy2 = -0.524f,
                    dx3 = 1.267f,
                    dy3 = -0.524f,
                )
                // s 0.063 1.305 -0.109 1.956
                reflectiveCurveToRelative(
                    dx1 = 0.063f,
                    dy1 = 1.305f,
                    dx2 = -0.109f,
                    dy2 = 1.956f,
                )
                // c -0.139 0.525 -0.212 1.203 -0.276 1.58
                curveToRelative(
                    dx1 = -0.139f,
                    dy1 = 0.525f,
                    dx2 = -0.212f,
                    dy2 = 1.203f,
                    dx3 = -0.276f,
                    dy3 = 1.58f,
                )
                // c -0.07 0.408 -0.109 0.889 -0.197 1.404
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = 0.408f,
                    dx2 = -0.109f,
                    dy2 = 0.889f,
                    dx3 = -0.197f,
                    dy3 = 1.404f,
                )
                // c -0.076 0.445 -0.216 0.91 -0.299 1.394
                curveToRelative(
                    dx1 = -0.076f,
                    dy1 = 0.445f,
                    dx2 = -0.216f,
                    dy2 = 0.91f,
                    dx3 = -0.299f,
                    dy3 = 1.394f,
                )
                // c -0.08 0.467 -0.144 1.014 -0.224 1.481
                curveToRelative(
                    dx1 = -0.08f,
                    dy1 = 0.467f,
                    dx2 = -0.144f,
                    dy2 = 1.014f,
                    dx3 = -0.224f,
                    dy3 = 1.481f,
                )
                // c -0.083 0.485 -0.105 0.902 -0.182 1.349
                curveToRelative(
                    dx1 = -0.083f,
                    dy1 = 0.485f,
                    dx2 = -0.105f,
                    dy2 = 0.902f,
                    dx3 = -0.182f,
                    dy3 = 1.349f,
                )
                // c -0.089 0.518 -0.022 0.57 -0.093 0.98
                curveToRelative(
                    dx1 = -0.089f,
                    dy1 = 0.518f,
                    dx2 = -0.022f,
                    dy2 = 0.57f,
                    dx3 = -0.093f,
                    dy3 = 0.98f,
                )
                // c -0.145 0.843 -0.165 0.727 -0.212 1.186
                curveToRelative(
                    dx1 = -0.145f,
                    dy1 = 0.843f,
                    dx2 = -0.165f,
                    dy2 = 0.727f,
                    dx3 = -0.212f,
                    dy3 = 1.186f,
                )
                // c -0.047 0.459 -0.394 0.516 -0.544 0.18
                curveToRelative(
                    dx1 = -0.047f,
                    dy1 = 0.459f,
                    dx2 = -0.394f,
                    dy2 = 0.516f,
                    dx3 = -0.544f,
                    dy3 = 0.18f,
                )
                // c -0.15 -0.336 0.009 -0.521 -0.136 -1.367
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = -0.336f,
                    dx2 = 0.009f,
                    dy2 = -0.521f,
                    dx3 = -0.136f,
                    dy3 = -1.367f,
                )
                // c -0.07 -0.408 -0.327 -1.487 -0.41 -1.97
                curveToRelative(
                    dx1 = -0.07f,
                    dy1 = -0.408f,
                    dx2 = -0.327f,
                    dy2 = -1.487f,
                    dx3 = -0.41f,
                    dy3 = -1.97f,
                )
                // c -0.08 -0.467 -0.188 -1.199 -0.268 -1.666
                curveToRelative(
                    dx1 = -0.08f,
                    dy1 = -0.467f,
                    dx2 = -0.188f,
                    dy2 = -1.199f,
                    dx3 = -0.268f,
                    dy3 = -1.666f,
                )
                // c -0.083 -0.485 -0.104 -1.267 -0.181 -1.715
                curveToRelative(
                    dx1 = -0.083f,
                    dy1 = -0.485f,
                    dx2 = -0.104f,
                    dy2 = -1.267f,
                    dx3 = -0.181f,
                    dy3 = -1.715f,
                )
                // c -0.089 -0.518 -0.225 -0.838 -0.295 -1.248
                curveToRelative(
                    dx1 = -0.089f,
                    dy1 = -0.518f,
                    dx2 = -0.225f,
                    dy2 = -0.838f,
                    dx3 = -0.295f,
                    dy3 = -1.248f,
                )
                // c -0.145 -0.841 -0.821 -1.982 -0.821 -1.982z
                curveToRelative(
                    dx1 = -0.145f,
                    dy1 = -0.841f,
                    dx2 = -0.821f,
                    dy2 = -1.982f,
                    dx3 = -0.821f,
                    dy3 = -1.982f,
                )
                close()
            }
        }.build().also { _emoji1f976 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f976: ImageVector? = null
