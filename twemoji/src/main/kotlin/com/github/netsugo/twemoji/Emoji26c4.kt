package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji26c4: ImageVector
    get() {
        val current = _emoji26c4
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji26c4",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M18 26 m-10 0 a10 10 0 1 1 20 0 a10 10 0 1 1 -20 0
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 18 26
                moveTo(x = 18.0f, y = 26.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
            }
            // M12 11 c0 -3.314 2.686 -6 6 -6 3.313 0 6 2.686 6 6 s-2.687 6 -6 6 c-3.314 0 -6 -2.686 -6 -6z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 12 11
                moveTo(x = 12.0f, y = 11.0f)
                // c 0 -3.314 2.686 -6 6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.314f,
                    dx2 = 2.686f,
                    dy2 = -6.0f,
                    dx3 = 6.0f,
                    dy3 = -6.0f,
                )
                // c 3.313 0 6 2.686 6 6
                curveToRelative(
                    dx1 = 3.313f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 2.686f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                // s -2.687 6 -6 6
                reflectiveCurveToRelative(
                    dx1 = -2.687f,
                    dy1 = 6.0f,
                    dx2 = -6.0f,
                    dy2 = 6.0f,
                )
                // c -3.314 0 -6 -2.686 -6 -6z
                curveToRelative(
                    dx1 = -3.314f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = -2.686f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                close()
            }
            // M23 6 c0 1.104 -0.896 2 -2 2 h-6 c-1.104 0 -2 -0.896 -2 -2 V2 c0 -1.104 0.896 -2 2 -2 h6 c1.104 0 2 0.896 2 2 v4z
            path(
                fill = SolidColor(Color(0xFF414042)),
            ) {
                // M 23 6
                moveTo(x = 23.0f, y = 6.0f)
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -1.104 0 -2 -0.896 -2 -2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.896f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // c 0 -1.104 0.896 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = 0.896f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 1.104 0 2 0.896 2 2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.896f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // v 4z
                verticalLineToRelative(dy = 4.0f)
                close()
            }
            // M25 7 c0 0.552 -0.447 1 -1 1 H12 c-0.552 0 -1 -0.448 -1 -1 s0.448 -1 1 -1 h12 c0.553 0 1 0.448 1 1z
            path(
                fill = SolidColor(Color(0xFF231F20)),
            ) {
                // M 25 7
                moveTo(x = 25.0f, y = 7.0f)
                // c 0 0.552 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // c -0.552 0 -1 -0.448 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.448f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // s 0.448 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.448f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // c 0.553 0 1 0.448 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.448f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M22.5 15 h-9 c-0.829 0 -1.5 0.671 -1.5 1.5 0 0.652 0.419 1.202 1 1.408 V25 c0 0.553 0.448 1 1 1 h1 c0.552 0 1 -0.447 1 -1 v-7 h6.5 c0.828 0 1.5 -0.671 1.5 -1.5 s-0.672 -1.5 -1.5 -1.5z
            path(
                fill = SolidColor(Color(0xFFDD2E44)),
            ) {
                // M 22.5 15
                moveTo(x = 22.5f, y = 15.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // c -0.829 0 -1.5 0.671 -1.5 1.5
                curveToRelative(
                    dx1 = -0.829f,
                    dy1 = 0.0f,
                    dx2 = -1.5f,
                    dy2 = 0.671f,
                    dx3 = -1.5f,
                    dy3 = 1.5f,
                )
                // c 0 0.652 0.419 1.202 1 1.408
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.652f,
                    dx2 = 0.419f,
                    dy2 = 1.202f,
                    dx3 = 1.0f,
                    dy3 = 1.408f,
                )
                // V 25
                verticalLineTo(y = 25.0f)
                // c 0 0.553 0.448 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = 0.448f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 0.552 0 1 -0.447 1 -1
                curveToRelative(
                    dx1 = 0.552f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.447f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 6.5
                horizontalLineToRelative(dx = 6.5f)
                // c 0.828 0 1.5 -0.671 1.5 -1.5
                curveToRelative(
                    dx1 = 0.828f,
                    dy1 = 0.0f,
                    dx2 = 1.5f,
                    dy2 = -0.671f,
                    dx3 = 1.5f,
                    dy3 = -1.5f,
                )
                // s -0.672 -1.5 -1.5 -1.5z
                reflectiveCurveToRelative(
                    dx1 = -0.672f,
                    dy1 = -1.5f,
                    dx2 = -1.5f,
                    dy2 = -1.5f,
                )
                close()
            }
            // M19 24 c0 0.553 -0.447 1 -1 1 -0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 0.553 0 1 0.447 1 1z M19 29 c0 0.553 -0.447 1 -1 1 -0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFF414042)),
            ) {
                // M 19 24
                moveTo(x = 19.0f, y = 24.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
                // M 19 29
                moveTo(x = 19.0f, y = 29.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M19 12 c0 0.553 -0.447 1 -1 1 -0.552 0 -1 -0.447 -1 -1 0 -0.553 0.448 -1 1 -1 0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 19 12
                moveTo(x = 19.0f, y = 12.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c -0.552 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.552f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M16 10 c0 0.553 -0.448 1 -1 1 s-1 -0.447 -1 -1 c0 -0.553 0.448 -1 1 -1 s1 0.447 1 1z M22 10 c0 0.553 -0.447 1 -1 1 -0.553 0 -1 -0.447 -1 -1 0 -0.553 0.447 -1 1 -1 0.553 0 1 0.447 1 1z
            path(
                fill = SolidColor(Color(0xFF414042)),
            ) {
                // M 16 10
                moveTo(x = 16.0f, y = 10.0f)
                // c 0 0.553 -0.448 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.448f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s -1 -0.447 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.447f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // c 0 -0.553 0.448 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.448f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // s 1 0.447 1 1z
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.447f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                close()
                // M 22 10
                moveTo(x = 22.0f, y = 10.0f)
                // c 0 0.553 -0.447 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.553f,
                    dx2 = -0.447f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // c -0.553 0 -1 -0.447 -1 -1
                curveToRelative(
                    dx1 = -0.553f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.447f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // c 0 -0.553 0.447 -1 1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.553f,
                    dx2 = 0.447f,
                    dy2 = -1.0f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                // c 0.553 0 1 0.447 1 1z
                curveToRelative(
                    dx1 = 0.553f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.447f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                close()
            }
            // M10.394 20.081 l-3.452 -1.479 -0.547 -2.866 c-0.104 -0.542 -0.624 -0.897 -1.17 -0.795 -0.542 0.104 -0.898 0.627 -0.795 1.17 l0.294 1.54 -1.33 -0.57 c-0.508 -0.219 -1.096 0.018 -1.313 0.525 -0.218 0.508 0.018 1.096 0.525 1.313 l0.743 0.318 -1.056 1.056 c-0.391 0.391 -0.391 1.023 0 1.414 0.195 0.195 0.451 0.293 0.707 0.293 s0.512 -0.098 0.707 -0.293 l1.621 -1.621 4.278 1.833 c0.128 0.056 0.262 0.081 0.394 0.081 0.388 0 0.757 -0.227 0.919 -0.606 0.218 -0.508 -0.018 -1.095 -0.525 -1.313z M33.316 17.051 l-1.465 -0.488 0.855 -0.855 c0.391 -0.391 0.391 -1.023 0 -1.414 s-1.023 -0.391 -1.414 0 l-0.751 0.751 -0.572 -2.287 c-0.134 -0.535 -0.678 -0.865 -1.212 -0.727 -0.536 0.134 -0.862 0.677 -0.727 1.213 l0.862 3.45 -3.6 3.6 c-0.391 0.391 -0.391 1.023 0 1.414 0.196 0.194 0.452 0.292 0.708 0.292 s0.512 -0.098 0.707 -0.293 l3.563 -3.563 2.413 0.805 c0.106 0.035 0.213 0.051 0.317 0.051 0.419 0 0.809 -0.265 0.948 -0.684 0.175 -0.524 -0.108 -1.09 -0.632 -1.265z
            path(
                fill = SolidColor(Color(0xFFFFAC33)),
            ) {
                // M 10.394 20.081
                moveTo(x = 10.394f, y = 20.081f)
                // l -3.452 -1.479
                lineToRelative(dx = -3.452f, dy = -1.479f)
                // l -0.547 -2.866
                lineToRelative(dx = -0.547f, dy = -2.866f)
                // c -0.104 -0.542 -0.624 -0.897 -1.17 -0.795
                curveToRelative(
                    dx1 = -0.104f,
                    dy1 = -0.542f,
                    dx2 = -0.624f,
                    dy2 = -0.897f,
                    dx3 = -1.17f,
                    dy3 = -0.795f,
                )
                // c -0.542 0.104 -0.898 0.627 -0.795 1.17
                curveToRelative(
                    dx1 = -0.542f,
                    dy1 = 0.104f,
                    dx2 = -0.898f,
                    dy2 = 0.627f,
                    dx3 = -0.795f,
                    dy3 = 1.17f,
                )
                // l 0.294 1.54
                lineToRelative(dx = 0.294f, dy = 1.54f)
                // l -1.33 -0.57
                lineToRelative(dx = -1.33f, dy = -0.57f)
                // c -0.508 -0.219 -1.096 0.018 -1.313 0.525
                curveToRelative(
                    dx1 = -0.508f,
                    dy1 = -0.219f,
                    dx2 = -1.096f,
                    dy2 = 0.018f,
                    dx3 = -1.313f,
                    dy3 = 0.525f,
                )
                // c -0.218 0.508 0.018 1.096 0.525 1.313
                curveToRelative(
                    dx1 = -0.218f,
                    dy1 = 0.508f,
                    dx2 = 0.018f,
                    dy2 = 1.096f,
                    dx3 = 0.525f,
                    dy3 = 1.313f,
                )
                // l 0.743 0.318
                lineToRelative(dx = 0.743f, dy = 0.318f)
                // l -1.056 1.056
                lineToRelative(dx = -1.056f, dy = 1.056f)
                // c -0.391 0.391 -0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c 0.195 0.195 0.451 0.293 0.707 0.293
                curveToRelative(
                    dx1 = 0.195f,
                    dy1 = 0.195f,
                    dx2 = 0.451f,
                    dy2 = 0.293f,
                    dx3 = 0.707f,
                    dy3 = 0.293f,
                )
                // s 0.512 -0.098 0.707 -0.293
                reflectiveCurveToRelative(
                    dx1 = 0.512f,
                    dy1 = -0.098f,
                    dx2 = 0.707f,
                    dy2 = -0.293f,
                )
                // l 1.621 -1.621
                lineToRelative(dx = 1.621f, dy = -1.621f)
                // l 4.278 1.833
                lineToRelative(dx = 4.278f, dy = 1.833f)
                // c 0.128 0.056 0.262 0.081 0.394 0.081
                curveToRelative(
                    dx1 = 0.128f,
                    dy1 = 0.056f,
                    dx2 = 0.262f,
                    dy2 = 0.081f,
                    dx3 = 0.394f,
                    dy3 = 0.081f,
                )
                // c 0.388 0 0.757 -0.227 0.919 -0.606
                curveToRelative(
                    dx1 = 0.388f,
                    dy1 = 0.0f,
                    dx2 = 0.757f,
                    dy2 = -0.227f,
                    dx3 = 0.919f,
                    dy3 = -0.606f,
                )
                // c 0.218 -0.508 -0.018 -1.095 -0.525 -1.313z
                curveToRelative(
                    dx1 = 0.218f,
                    dy1 = -0.508f,
                    dx2 = -0.018f,
                    dy2 = -1.095f,
                    dx3 = -0.525f,
                    dy3 = -1.313f,
                )
                close()
                // M 33.316 17.051
                moveTo(x = 33.316f, y = 17.051f)
                // l -1.465 -0.488
                lineToRelative(dx = -1.465f, dy = -0.488f)
                // l 0.855 -0.855
                lineToRelative(dx = 0.855f, dy = -0.855f)
                // c 0.391 -0.391 0.391 -1.023 0 -1.414
                curveToRelative(
                    dx1 = 0.391f,
                    dy1 = -0.391f,
                    dx2 = 0.391f,
                    dy2 = -1.023f,
                    dx3 = 0.0f,
                    dy3 = -1.414f,
                )
                // s -1.023 -0.391 -1.414 0
                reflectiveCurveToRelative(
                    dx1 = -1.023f,
                    dy1 = -0.391f,
                    dx2 = -1.414f,
                    dy2 = 0.0f,
                )
                // l -0.751 0.751
                lineToRelative(dx = -0.751f, dy = 0.751f)
                // l -0.572 -2.287
                lineToRelative(dx = -0.572f, dy = -2.287f)
                // c -0.134 -0.535 -0.678 -0.865 -1.212 -0.727
                curveToRelative(
                    dx1 = -0.134f,
                    dy1 = -0.535f,
                    dx2 = -0.678f,
                    dy2 = -0.865f,
                    dx3 = -1.212f,
                    dy3 = -0.727f,
                )
                // c -0.536 0.134 -0.862 0.677 -0.727 1.213
                curveToRelative(
                    dx1 = -0.536f,
                    dy1 = 0.134f,
                    dx2 = -0.862f,
                    dy2 = 0.677f,
                    dx3 = -0.727f,
                    dy3 = 1.213f,
                )
                // l 0.862 3.45
                lineToRelative(dx = 0.862f, dy = 3.45f)
                // l -3.6 3.6
                lineToRelative(dx = -3.6f, dy = 3.6f)
                // c -0.391 0.391 -0.391 1.023 0 1.414
                curveToRelative(
                    dx1 = -0.391f,
                    dy1 = 0.391f,
                    dx2 = -0.391f,
                    dy2 = 1.023f,
                    dx3 = 0.0f,
                    dy3 = 1.414f,
                )
                // c 0.196 0.194 0.452 0.292 0.708 0.292
                curveToRelative(
                    dx1 = 0.196f,
                    dy1 = 0.194f,
                    dx2 = 0.452f,
                    dy2 = 0.292f,
                    dx3 = 0.708f,
                    dy3 = 0.292f,
                )
                // s 0.512 -0.098 0.707 -0.293
                reflectiveCurveToRelative(
                    dx1 = 0.512f,
                    dy1 = -0.098f,
                    dx2 = 0.707f,
                    dy2 = -0.293f,
                )
                // l 3.563 -3.563
                lineToRelative(dx = 3.563f, dy = -3.563f)
                // l 2.413 0.805
                lineToRelative(dx = 2.413f, dy = 0.805f)
                // c 0.106 0.035 0.213 0.051 0.317 0.051
                curveToRelative(
                    dx1 = 0.106f,
                    dy1 = 0.035f,
                    dx2 = 0.213f,
                    dy2 = 0.051f,
                    dx3 = 0.317f,
                    dy3 = 0.051f,
                )
                // c 0.419 0 0.809 -0.265 0.948 -0.684
                curveToRelative(
                    dx1 = 0.419f,
                    dy1 = 0.0f,
                    dx2 = 0.809f,
                    dy2 = -0.265f,
                    dx3 = 0.948f,
                    dy3 = -0.684f,
                )
                // c 0.175 -0.524 -0.108 -1.09 -0.632 -1.265z
                curveToRelative(
                    dx1 = 0.175f,
                    dy1 = -0.524f,
                    dx2 = -0.108f,
                    dy2 = -1.09f,
                    dx3 = -0.632f,
                    dy3 = -1.265f,
                )
                close()
            }
        }.build().also { _emoji26c4 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji26c4: ImageVector? = null
