package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1ee1f1f3: ImageVector
    get() {
        val current = _emoji1f1ee1f1f3
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1ee1f1f3",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M0 27 a4 4 0 0 0 4 4 h28 a4 4 0 0 0 4 -4 v-5 H0 v5z
            path(
                fill = SolidColor(Color(0xFF138808)),
            ) {
                // M 0 27
                moveTo(x = 0.0f, y = 27.0f)
                // a 4 4 0 0 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 5z
                verticalLineToRelative(dy = 5.0f)
                close()
            }
            // M36 14 V9 a4 4 0 0 0 -4 -4 H4 a4 4 0 0 0 -4 4 v5 h36z
            path(
                fill = SolidColor(Color(0xFFFF9933)),
            ) {
                // M 36 14
                moveTo(x = 36.0f, y = 14.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 36z
                horizontalLineToRelative(dx = 36.0f)
                close()
            }
            // M0 13.667 h36 v8.667 H0z
            path(
                fill = SolidColor(Color(0xFFF7F7F7)),
            ) {
                // M 0 13.667
                moveTo(x = 0.0f, y = 13.667f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // v 8.667
                verticalLineToRelative(dy = 8.667f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
            // M18 18 m-4 0 a4 4 0 1 1 8 0 a4 4 0 1 1 -8 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M18 18 m-3.375 0 a3.375 3.375 0 1 1 6.75 0 a3.375 3.375 0 1 1 -6.75 0
            path(
                fill = SolidColor(Color(0xFFF7F7F7)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -3.375 0
                moveToRelative(dx = -3.375f, dy = 0.0f)
                // a 3.375 3.375 0 1 1 6.75 0
                arcToRelative(
                    a = 3.375f,
                    b = 3.375f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.75f,
                    dy1 = 0.0f,
                )
                // a 3.375 3.375 0 1 1 -6.75 0
                arcToRelative(
                    a = 3.375f,
                    b = 3.375f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.75f,
                    dy1 = 0.0f,
                )
            }
            // m18.1 16.75  l-0.1 0.65 -0.1 -0.65 0.1 -1.95z M17.172 14.909  L17.58 16.818 17.845 17.42 17.773 16.767z M16.4 15.229  L17.288 16.967 17.7 17.48 17.462 16.867z M15.737 15.737  L17.045 17.187 17.576 17.576 17.187 17.045z M15.229 16.4  L16.867 17.462 17.48 17.7 16.967 17.288z M14.909 17.172  L16.767 17.773 17.42 17.845 16.818 17.58z M14.8 18 l1.95 0.1 0.65 -0.1 -0.65 -0.1z M14.909 18.828  L16.818 18.42 17.42 18.155 16.767 18.227z M15.229 19.6  L16.967 18.712 17.48 18.3 16.867 18.538z M15.737 20.263  L17.187 18.955 17.576 18.424 17.045 18.813z M16.4 20.771  L17.462 19.133 17.7 18.52 17.288 19.033z M17.172 21.091  L17.773 19.233 17.845 18.58 17.58 19.182z M18 21.2 l0.1 -1.95 -0.1 -0.65 -0.1 0.65z M18.828 21.091  L18.42 19.182 18.155 18.58 18.227 19.233z M19.6 20.771  L18.712 19.033 18.3 18.52 18.538 19.133z M20.263 20.263  L18.955 18.813 18.424 18.424 18.813 18.955z M20.771 19.6  L19.133 18.538 18.52 18.3 19.033 18.712z M21.091 18.828  L19.233 18.227 18.58 18.155 19.182 18.42z M21.2 18 l-1.95 -0.1 -0.65 0.1 0.65 0.1z M21.091 17.172  L19.182 17.58 18.58 17.845 19.233 17.773z M20.771 16.4  L19.033 17.288 18.52 17.7 19.133 17.462z M20.263 15.737  L18.813 17.045 18.424 17.576 18.955 17.187z M19.6 15.229  L18.538 16.867 18.3 17.48 18.712 16.967z M18.828 14.909  L18.227 16.767 18.155 17.42 18.42 16.818z
            path(
                fill = SolidColor(Color(0xFF6666B3)),
            ) {
                // M 18.1 16.75
                moveTo(x = 18.1f, y = 16.75f)
                // l -0.1 0.65
                lineToRelative(dx = -0.1f, dy = 0.65f)
                // l -0.1 -0.65
                lineToRelative(dx = -0.1f, dy = -0.65f)
                // l 0.1 -1.95z
                lineToRelative(dx = 0.1f, dy = -1.95f)
                close()
                // M 17.172 14.909
                moveTo(x = 17.172f, y = 14.909f)
                // L 17.58 16.818
                lineTo(x = 17.58f, y = 16.818f)
                // L 17.845 17.42
                lineTo(x = 17.845f, y = 17.42f)
                // L 17.773 16.767z
                lineTo(x = 17.773f, y = 16.767f)
                close()
                // M 16.4 15.229
                moveTo(x = 16.4f, y = 15.229f)
                // L 17.288 16.967
                lineTo(x = 17.288f, y = 16.967f)
                // L 17.7 17.48
                lineTo(x = 17.7f, y = 17.48f)
                // L 17.462 16.867z
                lineTo(x = 17.462f, y = 16.867f)
                close()
                // M 15.737 15.737
                moveTo(x = 15.737f, y = 15.737f)
                // L 17.045 17.187
                lineTo(x = 17.045f, y = 17.187f)
                // L 17.576 17.576
                lineTo(x = 17.576f, y = 17.576f)
                // L 17.187 17.045z
                lineTo(x = 17.187f, y = 17.045f)
                close()
                // M 15.229 16.4
                moveTo(x = 15.229f, y = 16.4f)
                // L 16.867 17.462
                lineTo(x = 16.867f, y = 17.462f)
                // L 17.48 17.7
                lineTo(x = 17.48f, y = 17.7f)
                // L 16.967 17.288z
                lineTo(x = 16.967f, y = 17.288f)
                close()
                // M 14.909 17.172
                moveTo(x = 14.909f, y = 17.172f)
                // L 16.767 17.773
                lineTo(x = 16.767f, y = 17.773f)
                // L 17.42 17.845
                lineTo(x = 17.42f, y = 17.845f)
                // L 16.818 17.58z
                lineTo(x = 16.818f, y = 17.58f)
                close()
                // M 14.8 18
                moveTo(x = 14.8f, y = 18.0f)
                // l 1.95 0.1
                lineToRelative(dx = 1.95f, dy = 0.1f)
                // l 0.65 -0.1
                lineToRelative(dx = 0.65f, dy = -0.1f)
                // l -0.65 -0.1z
                lineToRelative(dx = -0.65f, dy = -0.1f)
                close()
                // M 14.909 18.828
                moveTo(x = 14.909f, y = 18.828f)
                // L 16.818 18.42
                lineTo(x = 16.818f, y = 18.42f)
                // L 17.42 18.155
                lineTo(x = 17.42f, y = 18.155f)
                // L 16.767 18.227z
                lineTo(x = 16.767f, y = 18.227f)
                close()
                // M 15.229 19.6
                moveTo(x = 15.229f, y = 19.6f)
                // L 16.967 18.712
                lineTo(x = 16.967f, y = 18.712f)
                // L 17.48 18.3
                lineTo(x = 17.48f, y = 18.3f)
                // L 16.867 18.538z
                lineTo(x = 16.867f, y = 18.538f)
                close()
                // M 15.737 20.263
                moveTo(x = 15.737f, y = 20.263f)
                // L 17.187 18.955
                lineTo(x = 17.187f, y = 18.955f)
                // L 17.576 18.424
                lineTo(x = 17.576f, y = 18.424f)
                // L 17.045 18.813z
                lineTo(x = 17.045f, y = 18.813f)
                close()
                // M 16.4 20.771
                moveTo(x = 16.4f, y = 20.771f)
                // L 17.462 19.133
                lineTo(x = 17.462f, y = 19.133f)
                // L 17.7 18.52
                lineTo(x = 17.7f, y = 18.52f)
                // L 17.288 19.033z
                lineTo(x = 17.288f, y = 19.033f)
                close()
                // M 17.172 21.091
                moveTo(x = 17.172f, y = 21.091f)
                // L 17.773 19.233
                lineTo(x = 17.773f, y = 19.233f)
                // L 17.845 18.58
                lineTo(x = 17.845f, y = 18.58f)
                // L 17.58 19.182z
                lineTo(x = 17.58f, y = 19.182f)
                close()
                // M 18 21.2
                moveTo(x = 18.0f, y = 21.2f)
                // l 0.1 -1.95
                lineToRelative(dx = 0.1f, dy = -1.95f)
                // l -0.1 -0.65
                lineToRelative(dx = -0.1f, dy = -0.65f)
                // l -0.1 0.65z
                lineToRelative(dx = -0.1f, dy = 0.65f)
                close()
                // M 18.828 21.091
                moveTo(x = 18.828f, y = 21.091f)
                // L 18.42 19.182
                lineTo(x = 18.42f, y = 19.182f)
                // L 18.155 18.58
                lineTo(x = 18.155f, y = 18.58f)
                // L 18.227 19.233z
                lineTo(x = 18.227f, y = 19.233f)
                close()
                // M 19.6 20.771
                moveTo(x = 19.6f, y = 20.771f)
                // L 18.712 19.033
                lineTo(x = 18.712f, y = 19.033f)
                // L 18.3 18.52
                lineTo(x = 18.3f, y = 18.52f)
                // L 18.538 19.133z
                lineTo(x = 18.538f, y = 19.133f)
                close()
                // M 20.263 20.263
                moveTo(x = 20.263f, y = 20.263f)
                // L 18.955 18.813
                lineTo(x = 18.955f, y = 18.813f)
                // L 18.424 18.424
                lineTo(x = 18.424f, y = 18.424f)
                // L 18.813 18.955z
                lineTo(x = 18.813f, y = 18.955f)
                close()
                // M 20.771 19.6
                moveTo(x = 20.771f, y = 19.6f)
                // L 19.133 18.538
                lineTo(x = 19.133f, y = 18.538f)
                // L 18.52 18.3
                lineTo(x = 18.52f, y = 18.3f)
                // L 19.033 18.712z
                lineTo(x = 19.033f, y = 18.712f)
                close()
                // M 21.091 18.828
                moveTo(x = 21.091f, y = 18.828f)
                // L 19.233 18.227
                lineTo(x = 19.233f, y = 18.227f)
                // L 18.58 18.155
                lineTo(x = 18.58f, y = 18.155f)
                // L 19.182 18.42z
                lineTo(x = 19.182f, y = 18.42f)
                close()
                // M 21.2 18
                moveTo(x = 21.2f, y = 18.0f)
                // l -1.95 -0.1
                lineToRelative(dx = -1.95f, dy = -0.1f)
                // l -0.65 0.1
                lineToRelative(dx = -0.65f, dy = 0.1f)
                // l 0.65 0.1z
                lineToRelative(dx = 0.65f, dy = 0.1f)
                close()
                // M 21.091 17.172
                moveTo(x = 21.091f, y = 17.172f)
                // L 19.182 17.58
                lineTo(x = 19.182f, y = 17.58f)
                // L 18.58 17.845
                lineTo(x = 18.58f, y = 17.845f)
                // L 19.233 17.773z
                lineTo(x = 19.233f, y = 17.773f)
                close()
                // M 20.771 16.4
                moveTo(x = 20.771f, y = 16.4f)
                // L 19.033 17.288
                lineTo(x = 19.033f, y = 17.288f)
                // L 18.52 17.7
                lineTo(x = 18.52f, y = 17.7f)
                // L 19.133 17.462z
                lineTo(x = 19.133f, y = 17.462f)
                close()
                // M 20.263 15.737
                moveTo(x = 20.263f, y = 15.737f)
                // L 18.813 17.045
                lineTo(x = 18.813f, y = 17.045f)
                // L 18.424 17.576
                lineTo(x = 18.424f, y = 17.576f)
                // L 18.955 17.187z
                lineTo(x = 18.955f, y = 17.187f)
                close()
                // M 19.6 15.229
                moveTo(x = 19.6f, y = 15.229f)
                // L 18.538 16.867
                lineTo(x = 18.538f, y = 16.867f)
                // L 18.3 17.48
                lineTo(x = 18.3f, y = 17.48f)
                // L 18.712 16.967z
                lineTo(x = 18.712f, y = 16.967f)
                close()
                // M 18.828 14.909
                moveTo(x = 18.828f, y = 14.909f)
                // L 18.227 16.767
                lineTo(x = 18.227f, y = 16.767f)
                // L 18.155 17.42
                lineTo(x = 18.155f, y = 17.42f)
                // L 18.42 16.818z
                lineTo(x = 18.42f, y = 16.818f)
                close()
            }
            // M17.56 14.659 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 17.56 14.659
                moveTo(x = 17.56f, y = 14.659f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M16.71 14.887 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 16.71 14.887
                moveTo(x = 16.71f, y = 14.887f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M15.948 15.326 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 15.948 15.326
                moveTo(x = 15.948f, y = 15.326f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M15.326 15.948 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 15.326 15.948
                moveTo(x = 15.326f, y = 15.948f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M14.887 16.71 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 14.887 16.71
                moveTo(x = 14.887f, y = 16.71f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M14.659 17.56 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 14.659 17.56
                moveTo(x = 14.659f, y = 17.56f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M14.659 18.44 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 14.659 18.44
                moveTo(x = 14.659f, y = 18.44f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M14.887 19.29 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 14.887 19.29
                moveTo(x = 14.887f, y = 19.29f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M15.326 20.052 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 15.326 20.052
                moveTo(x = 15.326f, y = 20.052f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M15.948 20.674 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 15.948 20.674
                moveTo(x = 15.948f, y = 20.674f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M16.71 21.113 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 16.71 21.113
                moveTo(x = 16.71f, y = 21.113f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M17.56 21.341 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 17.56 21.341
                moveTo(x = 17.56f, y = 21.341f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M18.44 21.341 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 18.44 21.341
                moveTo(x = 18.44f, y = 21.341f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M19.29 21.113 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 19.29 21.113
                moveTo(x = 19.29f, y = 21.113f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M20.052 20.674 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 20.052 20.674
                moveTo(x = 20.052f, y = 20.674f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M20.674 20.052 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 20.674 20.052
                moveTo(x = 20.674f, y = 20.052f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M21.113 19.29 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 21.113 19.29
                moveTo(x = 21.113f, y = 19.29f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M21.341 18.44 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 21.341 18.44
                moveTo(x = 21.341f, y = 18.44f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M21.341 17.56 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 21.341 17.56
                moveTo(x = 21.341f, y = 17.56f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M21.113 16.71 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 21.113 16.71
                moveTo(x = 21.113f, y = 16.71f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M20.674 15.948 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 20.674 15.948
                moveTo(x = 20.674f, y = 15.948f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M20.052 15.326 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 20.052 15.326
                moveTo(x = 20.052f, y = 15.326f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M19.29 14.887 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 19.29 14.887
                moveTo(x = 19.29f, y = 14.887f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M18.44 14.659 m-0.2 0 a0.2 0.2 0 1 1 0.4 0 a0.2 0.2 0 1 1 -0.4 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 18.44 14.659
                moveTo(x = 18.44f, y = 14.659f)
                // m -0.2 0
                moveToRelative(dx = -0.2f, dy = 0.0f)
                // a 0.2 0.2 0 1 1 0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                )
                // a 0.2 0.2 0 1 1 -0.4 0
                arcToRelative(
                    a = 0.2f,
                    b = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 0.0f,
                )
            }
            // M18 18 m-0.9 0 a0.9 0.9 0 1 1 1.8 0 a0.9 0.9 0 1 1 -1.8 0
            path(
                fill = SolidColor(Color(0xFF000080)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // m -0.9 0
                moveToRelative(dx = -0.9f, dy = 0.0f)
                // a 0.9 0.9 0 1 1 1.8 0
                arcToRelative(
                    a = 0.9f,
                    b = 0.9f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.8f,
                    dy1 = 0.0f,
                )
                // a 0.9 0.9 0 1 1 -1.8 0
                arcToRelative(
                    a = 0.9f,
                    b = 0.9f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.8f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _emoji1f1ee1f1f3 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1ee1f1f3: ImageVector? = null
