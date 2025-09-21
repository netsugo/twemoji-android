package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f440: ImageVector
    get() {
        val current = _emoji1f440
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f440",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0.875 18 a7.953 13.281 0 1 0 15.906 0 a7.953 13.281 0 1 0 -15.906 0z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 0.875 18
                moveTo(x = 0.875f, y = 18.0f)
                // a 7.953 13.281 0 1 0 15.906 0
                arcToRelative(
                    a = 7.953f,
                    b = 13.281f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 15.906f,
                    dy1 = 0.0f,
                )
                // a 7.953 13.281 0 1 0 -15.906 0z
                arcToRelative(
                    a = 7.953f,
                    b = 13.281f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -15.906f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M8.828 32.031 C3.948 32.031 0.125 25.868 0.125 18 S3.948 3.969 8.828 3.969 17.531 10.132 17.531 18 s-3.823 14.031 -8.703 14.031z M8.828 5.469 C4.856 5.469 1.625 11.09 1.625 18 s3.231 12.531 7.203 12.531 S16.031 24.91 16.031 18 12.8 5.469 8.828 5.469z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 8.828 32.031
                moveTo(x = 8.828f, y = 32.031f)
                // C 3.948 32.031 0.125 25.868 0.125 18
                curveTo(
                    x1 = 3.948f,
                    y1 = 32.031f,
                    x2 = 0.125f,
                    y2 = 25.868f,
                    x3 = 0.125f,
                    y3 = 18.0f,
                )
                // S 3.948 3.969 8.828 3.969
                reflectiveCurveTo(
                    x1 = 3.948f,
                    y1 = 3.969f,
                    x2 = 8.828f,
                    y2 = 3.969f,
                )
                // S 17.531 10.132 17.531 18
                reflectiveCurveTo(
                    x1 = 17.531f,
                    y1 = 10.132f,
                    x2 = 17.531f,
                    y2 = 18.0f,
                )
                // s -3.823 14.031 -8.703 14.031z
                reflectiveCurveToRelative(
                    dx1 = -3.823f,
                    dy1 = 14.031f,
                    dx2 = -8.703f,
                    dy2 = 14.031f,
                )
                close()
                // M 8.828 5.469
                moveTo(x = 8.828f, y = 5.469f)
                // C 4.856 5.469 1.625 11.09 1.625 18
                curveTo(
                    x1 = 4.856f,
                    y1 = 5.469f,
                    x2 = 1.625f,
                    y2 = 11.09f,
                    x3 = 1.625f,
                    y3 = 18.0f,
                )
                // s 3.231 12.531 7.203 12.531
                reflectiveCurveToRelative(
                    dx1 = 3.231f,
                    dy1 = 12.531f,
                    dx2 = 7.203f,
                    dy2 = 12.531f,
                )
                // S 16.031 24.91 16.031 18
                reflectiveCurveTo(
                    x1 = 16.031f,
                    y1 = 24.91f,
                    x2 = 16.031f,
                    y2 = 18.0f,
                )
                // S 12.8 5.469 8.828 5.469z
                reflectiveCurveTo(
                    x1 = 12.8f,
                    y1 = 5.469f,
                    x2 = 8.828f,
                    y2 = 5.469f,
                )
                close()
            }
            // M6.594 18 m-4.96 0 a4.96 4.96 0 1 1 9.92 0 a4.96 4.96 0 1 1 -9.92 0
            path(
                fill = SolidColor(Color(0xFF8899A6)),
            ) {
                // M 6.594 18
                moveTo(x = 6.594f, y = 18.0f)
                // m -4.96 0
                moveToRelative(dx = -4.96f, dy = 0.0f)
                // a 4.96 4.96 0 1 1 9.92 0
                arcToRelative(
                    a = 4.96f,
                    b = 4.96f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.92f,
                    dy1 = 0.0f,
                )
                // a 4.96 4.96 0 1 1 -9.92 0
                arcToRelative(
                    a = 4.96f,
                    b = 4.96f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -9.92f,
                    dy1 = 0.0f,
                )
            }
            // M6.594 18 m-3.565 0 a3.565 3.565 0 1 1 7.13 0 a3.565 3.565 0 1 1 -7.13 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 6.594 18
                moveTo(x = 6.594f, y = 18.0f)
                // m -3.565 0
                moveToRelative(dx = -3.565f, dy = 0.0f)
                // a 3.565 3.565 0 1 1 7.13 0
                arcToRelative(
                    a = 3.565f,
                    b = 3.565f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.13f,
                    dy1 = 0.0f,
                )
                // a 3.565 3.565 0 1 1 -7.13 0
                arcToRelative(
                    a = 3.565f,
                    b = 3.565f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.13f,
                    dy1 = 0.0f,
                )
            }
            // M7.911 15.443 m-1.426 0 a1.426 1.426 0 1 1 2.852 0 a1.426 1.426 0 1 1 -2.852 0
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 7.911 15.443
                moveTo(x = 7.911f, y = 15.443f)
                // m -1.426 0
                moveToRelative(dx = -1.426f, dy = 0.0f)
                // a 1.426 1.426 0 1 1 2.852 0
                arcToRelative(
                    a = 1.426f,
                    b = 1.426f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.852f,
                    dy1 = 0.0f,
                )
                // a 1.426 1.426 0 1 1 -2.852 0
                arcToRelative(
                    a = 1.426f,
                    b = 1.426f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.852f,
                    dy1 = 0.0f,
                )
            }
            // M19.281 18 a7.953 13.281 0 1 0 15.906 0 a7.953 13.281 0 1 0 -15.906 0z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 19.281 18
                moveTo(x = 19.281f, y = 18.0f)
                // a 7.953 13.281 0 1 0 15.906 0
                arcToRelative(
                    a = 7.953f,
                    b = 13.281f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 15.906f,
                    dy1 = 0.0f,
                )
                // a 7.953 13.281 0 1 0 -15.906 0z
                arcToRelative(
                    a = 7.953f,
                    b = 13.281f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -15.906f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M27.234 32.031 c-4.88 0 -8.703 -6.163 -8.703 -14.031 s3.823 -14.031 8.703 -14.031 S35.938 10.132 35.938 18 s-3.824 14.031 -8.704 14.031z M27.234 5.469 c-3.972 0 -7.203 5.622 -7.203 12.531 0 6.91 3.231 12.531 7.203 12.531 S34.438 24.91 34.438 18 31.206 5.469 27.234 5.469z
            path(
                fill = SolidColor(Color(0xFFE1E8ED)),
            ) {
                // M 27.234 32.031
                moveTo(x = 27.234f, y = 32.031f)
                // c -4.88 0 -8.703 -6.163 -8.703 -14.031
                curveToRelative(
                    dx1 = -4.88f,
                    dy1 = 0.0f,
                    dx2 = -8.703f,
                    dy2 = -6.163f,
                    dx3 = -8.703f,
                    dy3 = -14.031f,
                )
                // s 3.823 -14.031 8.703 -14.031
                reflectiveCurveToRelative(
                    dx1 = 3.823f,
                    dy1 = -14.031f,
                    dx2 = 8.703f,
                    dy2 = -14.031f,
                )
                // S 35.938 10.132 35.938 18
                reflectiveCurveTo(
                    x1 = 35.938f,
                    y1 = 10.132f,
                    x2 = 35.938f,
                    y2 = 18.0f,
                )
                // s -3.824 14.031 -8.704 14.031z
                reflectiveCurveToRelative(
                    dx1 = -3.824f,
                    dy1 = 14.031f,
                    dx2 = -8.704f,
                    dy2 = 14.031f,
                )
                close()
                // M 27.234 5.469
                moveTo(x = 27.234f, y = 5.469f)
                // c -3.972 0 -7.203 5.622 -7.203 12.531
                curveToRelative(
                    dx1 = -3.972f,
                    dy1 = 0.0f,
                    dx2 = -7.203f,
                    dy2 = 5.622f,
                    dx3 = -7.203f,
                    dy3 = 12.531f,
                )
                // c 0 6.91 3.231 12.531 7.203 12.531
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.91f,
                    dx2 = 3.231f,
                    dy2 = 12.531f,
                    dx3 = 7.203f,
                    dy3 = 12.531f,
                )
                // S 34.438 24.91 34.438 18
                reflectiveCurveTo(
                    x1 = 34.438f,
                    y1 = 24.91f,
                    x2 = 34.438f,
                    y2 = 18.0f,
                )
                // S 31.206 5.469 27.234 5.469z
                reflectiveCurveTo(
                    x1 = 31.206f,
                    y1 = 5.469f,
                    x2 = 27.234f,
                    y2 = 5.469f,
                )
                close()
            }
            // M25 18 m-4.96 0 a4.96 4.96 0 1 1 9.92 0 a4.96 4.96 0 1 1 -9.92 0
            path(
                fill = SolidColor(Color(0xFF8899A6)),
            ) {
                // M 25 18
                moveTo(x = 25.0f, y = 18.0f)
                // m -4.96 0
                moveToRelative(dx = -4.96f, dy = 0.0f)
                // a 4.96 4.96 0 1 1 9.92 0
                arcToRelative(
                    a = 4.96f,
                    b = 4.96f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.92f,
                    dy1 = 0.0f,
                )
                // a 4.96 4.96 0 1 1 -9.92 0
                arcToRelative(
                    a = 4.96f,
                    b = 4.96f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -9.92f,
                    dy1 = 0.0f,
                )
            }
            // M25 18 m-3.565 0 a3.565 3.565 0 1 1 7.13 0 a3.565 3.565 0 1 1 -7.13 0
            path(
                fill = SolidColor(Color(0xFF292F33)),
            ) {
                // M 25 18
                moveTo(x = 25.0f, y = 18.0f)
                // m -3.565 0
                moveToRelative(dx = -3.565f, dy = 0.0f)
                // a 3.565 3.565 0 1 1 7.13 0
                arcToRelative(
                    a = 3.565f,
                    b = 3.565f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.13f,
                    dy1 = 0.0f,
                )
                // a 3.565 3.565 0 1 1 -7.13 0
                arcToRelative(
                    a = 3.565f,
                    b = 3.565f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.13f,
                    dy1 = 0.0f,
                )
            }
            // M26.317 15.443 m-1.426 0 a1.426 1.426 0 1 1 2.852 0 a1.426 1.426 0 1 1 -2.852 0
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 26.317 15.443
                moveTo(x = 26.317f, y = 15.443f)
                // m -1.426 0
                moveToRelative(dx = -1.426f, dy = 0.0f)
                // a 1.426 1.426 0 1 1 2.852 0
                arcToRelative(
                    a = 1.426f,
                    b = 1.426f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.852f,
                    dy1 = 0.0f,
                )
                // a 1.426 1.426 0 1 1 -2.852 0
                arcToRelative(
                    a = 1.426f,
                    b = 1.426f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.852f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f440 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f440: ImageVector? = null
