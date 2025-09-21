package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f4c5: ImageVector
    get() {
        val current = _emoji1f4c5
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f4c5",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M36 32 c0 2.209 -1.791 4 -4 4 H4 c-2.209 0 -4 -1.791 -4 -4 V9 c0 -2.209 1.791 -4 4 -4 h28 c2.209 0 4 1.791 4 4 v23z
            path(
                fill = SolidColor(Color(0xFFE0E7EC)),
            ) {
                // M 36 32
                moveTo(x = 36.0f, y = 32.0f)
                // c 0 2.209 -1.791 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.209f,
                    dx2 = -1.791f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c -2.209 0 -4 -1.791 -4 -4
                curveToRelative(
                    dx1 = -2.209f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.791f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // c 0 -2.209 1.791 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.209f,
                    dx2 = 1.791f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // c 2.209 0 4 1.791 4 4
                curveToRelative(
                    dx1 = 2.209f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.791f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                // v 23z
                verticalLineToRelative(dy = 23.0f)
                close()
            }
            // M23.657 19.12 H17.87 c-1.22 0 -1.673 -0.791 -1.673 -1.56 0 -0.791 0.429 -1.56 1.673 -1.56 h8.184 c1.154 0 1.628 1.04 1.628 1.628 0 0.452 -0.249 0.927 -0.52 1.492 l-5.607 11.395 c-0.633 1.266 -0.882 1.717 -1.899 1.717 -1.244 0 -1.877 -0.949 -1.877 -1.605 0 -0.271 0.068 -0.474 0.226 -0.791 l5.652 -10.716z M10.889 19 h-0.5 c-1.085 0 -1.538 -0.731 -1.538 -1.5 0 -0.792 0.565 -1.5 1.538 -1.5 h2.015 c0.972 0 1.515 0.701 1.515 1.605 V30.47 c0 1.13 -0.558 1.763 -1.53 1.763 s-1.5 -0.633 -1.5 -1.763 V19z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 23.657 19.12
                moveTo(x = 23.657f, y = 19.12f)
                // H 17.87
                horizontalLineTo(x = 17.87f)
                // c -1.22 0 -1.673 -0.791 -1.673 -1.56
                curveToRelative(
                    dx1 = -1.22f,
                    dy1 = 0.0f,
                    dx2 = -1.673f,
                    dy2 = -0.791f,
                    dx3 = -1.673f,
                    dy3 = -1.56f,
                )
                // c 0 -0.791 0.429 -1.56 1.673 -1.56
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.791f,
                    dx2 = 0.429f,
                    dy2 = -1.56f,
                    dx3 = 1.673f,
                    dy3 = -1.56f,
                )
                // h 8.184
                horizontalLineToRelative(dx = 8.184f)
                // c 1.154 0 1.628 1.04 1.628 1.628
                curveToRelative(
                    dx1 = 1.154f,
                    dy1 = 0.0f,
                    dx2 = 1.628f,
                    dy2 = 1.04f,
                    dx3 = 1.628f,
                    dy3 = 1.628f,
                )
                // c 0 0.452 -0.249 0.927 -0.52 1.492
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.452f,
                    dx2 = -0.249f,
                    dy2 = 0.927f,
                    dx3 = -0.52f,
                    dy3 = 1.492f,
                )
                // l -5.607 11.395
                lineToRelative(dx = -5.607f, dy = 11.395f)
                // c -0.633 1.266 -0.882 1.717 -1.899 1.717
                curveToRelative(
                    dx1 = -0.633f,
                    dy1 = 1.266f,
                    dx2 = -0.882f,
                    dy2 = 1.717f,
                    dx3 = -1.899f,
                    dy3 = 1.717f,
                )
                // c -1.244 0 -1.877 -0.949 -1.877 -1.605
                curveToRelative(
                    dx1 = -1.244f,
                    dy1 = 0.0f,
                    dx2 = -1.877f,
                    dy2 = -0.949f,
                    dx3 = -1.877f,
                    dy3 = -1.605f,
                )
                // c 0 -0.271 0.068 -0.474 0.226 -0.791
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.271f,
                    dx2 = 0.068f,
                    dy2 = -0.474f,
                    dx3 = 0.226f,
                    dy3 = -0.791f,
                )
                // l 5.652 -10.716z
                lineToRelative(dx = 5.652f, dy = -10.716f)
                close()
                // M 10.889 19
                moveTo(x = 10.889f, y = 19.0f)
                // h -0.5
                horizontalLineToRelative(dx = -0.5f)
                // c -1.085 0 -1.538 -0.731 -1.538 -1.5
                curveToRelative(
                    dx1 = -1.085f,
                    dy1 = 0.0f,
                    dx2 = -1.538f,
                    dy2 = -0.731f,
                    dx3 = -1.538f,
                    dy3 = -1.5f,
                )
                // c 0 -0.792 0.565 -1.5 1.538 -1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.792f,
                    dx2 = 0.565f,
                    dy2 = -1.5f,
                    dx3 = 1.538f,
                    dy3 = -1.5f,
                )
                // h 2.015
                horizontalLineToRelative(dx = 2.015f)
                // c 0.972 0 1.515 0.701 1.515 1.605
                curveToRelative(
                    dx1 = 0.972f,
                    dy1 = 0.0f,
                    dx2 = 1.515f,
                    dy2 = 0.701f,
                    dx3 = 1.515f,
                    dy3 = 1.605f,
                )
                // V 30.47
                verticalLineTo(y = 30.47f)
                // c 0 1.13 -0.558 1.763 -1.53 1.763
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.13f,
                    dx2 = -0.558f,
                    dy2 = 1.763f,
                    dx3 = -1.53f,
                    dy3 = 1.763f,
                )
                // s -1.5 -0.633 -1.5 -1.763
                reflectiveCurveToRelative(
                    dx1 = -1.5f,
                    dy1 = -0.633f,
                    dx2 = -1.5f,
                    dy2 = -1.763f,
                )
                // V 19z
                verticalLineTo(y = 19.0f)
                close()
            }
            // M34 0 h-3.277 c0.172 0.295 0.277 0.634 0.277 1 0 1.104 -0.896 2 -2 2 s-2 -0.896 -2 -2 c0 -0.366 0.105 -0.705 0.277 -1 H8.723 C8.895 0.295 9 0.634 9 1 c0 1.104 -0.896 2 -2 2 s-2 -0.896 -2 -2 c0 -0.366 0.105 -0.705 0.277 -1 H2 C0.896 0 0 0.896 0 2 v11 h36 V2 c0 -1.104 -0.896 -2 -2 -2z
            path(
                fill = SolidColor(Color(0xFFDD2F45)),
            ) {
                // M 34 0
                moveTo(x = 34.0f, y = 0.0f)
                // h -3.277
                horizontalLineToRelative(dx = -3.277f)
                // c 0.172 0.295 0.277 0.634 0.277 1
                curveToRelative(
                    dx1 = 0.172f,
                    dy1 = 0.295f,
                    dx2 = 0.277f,
                    dy2 = 0.634f,
                    dx3 = 0.277f,
                    dy3 = 1.0f,
                )
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s -2 -0.896 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -0.896f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // c 0 -0.366 0.105 -0.705 0.277 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.366f,
                    dx2 = 0.105f,
                    dy2 = -0.705f,
                    dx3 = 0.277f,
                    dy3 = -1.0f,
                )
                // H 8.723
                horizontalLineTo(x = 8.723f)
                // C 8.895 0.295 9 0.634 9 1
                curveTo(
                    x1 = 8.895f,
                    y1 = 0.295f,
                    x2 = 9.0f,
                    y2 = 0.634f,
                    x3 = 9.0f,
                    y3 = 1.0f,
                )
                // c 0 1.104 -0.896 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = -0.896f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s -2 -0.896 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -0.896f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // c 0 -0.366 0.105 -0.705 0.277 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.366f,
                    dx2 = 0.105f,
                    dy2 = -0.705f,
                    dx3 = 0.277f,
                    dy3 = -1.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // C 0.896 0 0 0.896 0 2
                curveTo(
                    x1 = 0.896f,
                    y1 = 0.0f,
                    x2 = 0.0f,
                    y2 = 0.896f,
                    x3 = 0.0f,
                    y3 = 2.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h 36
                horizontalLineToRelative(dx = 36.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // c 0 -1.104 -0.896 -2 -2 -2z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                close()
            }
            // M13.182 4.604 c0 -0.5 0.32 -0.78 0.75 -0.78 0.429 0 0.749 0.28 0.749 0.78 v5.017 h1.779 c0.51 0 0.73 0.38 0.72 0.72 -0.02 0.33 -0.28 0.659 -0.72 0.659 h-2.498 c-0.49 0 -0.78 -0.319 -0.78 -0.819 L13.182 4.604z M6.272 4.604 c0 -0.5 0.32 -0.78 0.75 -0.78 s0.75 0.28 0.75 0.78 v3.488 c0 0.92 0.589 1.649 1.539 1.649 0.909 0 1.529 -0.769 1.529 -1.649 L10.84 4.604 c0 -0.5 0.319 -0.78 0.749 -0.78 s0.75 0.28 0.75 0.78 v3.568 c0 1.679 -1.38 2.949 -3.028 2.949 -1.669 0 -3.039 -1.25 -3.039 -2.949 L6.272 4.604z M5.49 9.001 c0 1.679 -1.069 2.119 -1.979 2.119 -0.689 0 -1.839 -0.27 -1.839 -1.14 0 -0.269 0.23 -0.609 0.56 -0.609 0.4 0 0.75 0.37 1.199 0.37 0.56 0 0.56 -0.52 0.56 -0.84 L3.991 4.604 c0 -0.5 0.32 -0.78 0.749 -0.78 0.431 0 0.75 0.28 0.75 0.78 v4.397z
            path(
                fill = SolidColor(Color(0xFFF5F8FA)),
            ) {
                // M 13.182 4.604
                moveTo(x = 13.182f, y = 4.604f)
                // c 0 -0.5 0.32 -0.78 0.75 -0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.5f,
                    dx2 = 0.32f,
                    dy2 = -0.78f,
                    dx3 = 0.75f,
                    dy3 = -0.78f,
                )
                // c 0.429 0 0.749 0.28 0.749 0.78
                curveToRelative(
                    dx1 = 0.429f,
                    dy1 = 0.0f,
                    dx2 = 0.749f,
                    dy2 = 0.28f,
                    dx3 = 0.749f,
                    dy3 = 0.78f,
                )
                // v 5.017
                verticalLineToRelative(dy = 5.017f)
                // h 1.779
                horizontalLineToRelative(dx = 1.779f)
                // c 0.51 0 0.73 0.38 0.72 0.72
                curveToRelative(
                    dx1 = 0.51f,
                    dy1 = 0.0f,
                    dx2 = 0.73f,
                    dy2 = 0.38f,
                    dx3 = 0.72f,
                    dy3 = 0.72f,
                )
                // c -0.02 0.33 -0.28 0.659 -0.72 0.659
                curveToRelative(
                    dx1 = -0.02f,
                    dy1 = 0.33f,
                    dx2 = -0.28f,
                    dy2 = 0.659f,
                    dx3 = -0.72f,
                    dy3 = 0.659f,
                )
                // h -2.498
                horizontalLineToRelative(dx = -2.498f)
                // c -0.49 0 -0.78 -0.319 -0.78 -0.819
                curveToRelative(
                    dx1 = -0.49f,
                    dy1 = 0.0f,
                    dx2 = -0.78f,
                    dy2 = -0.319f,
                    dx3 = -0.78f,
                    dy3 = -0.819f,
                )
                // L 13.182 4.604z
                lineTo(x = 13.182f, y = 4.604f)
                close()
                // M 6.272 4.604
                moveTo(x = 6.272f, y = 4.604f)
                // c 0 -0.5 0.32 -0.78 0.75 -0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.5f,
                    dx2 = 0.32f,
                    dy2 = -0.78f,
                    dx3 = 0.75f,
                    dy3 = -0.78f,
                )
                // s 0.75 0.28 0.75 0.78
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = 0.28f,
                    dx2 = 0.75f,
                    dy2 = 0.78f,
                )
                // v 3.488
                verticalLineToRelative(dy = 3.488f)
                // c 0 0.92 0.589 1.649 1.539 1.649
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.92f,
                    dx2 = 0.589f,
                    dy2 = 1.649f,
                    dx3 = 1.539f,
                    dy3 = 1.649f,
                )
                // c 0.909 0 1.529 -0.769 1.529 -1.649
                curveToRelative(
                    dx1 = 0.909f,
                    dy1 = 0.0f,
                    dx2 = 1.529f,
                    dy2 = -0.769f,
                    dx3 = 1.529f,
                    dy3 = -1.649f,
                )
                // L 10.84 4.604
                lineTo(x = 10.84f, y = 4.604f)
                // c 0 -0.5 0.319 -0.78 0.749 -0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.5f,
                    dx2 = 0.319f,
                    dy2 = -0.78f,
                    dx3 = 0.749f,
                    dy3 = -0.78f,
                )
                // s 0.75 0.28 0.75 0.78
                reflectiveCurveToRelative(
                    dx1 = 0.75f,
                    dy1 = 0.28f,
                    dx2 = 0.75f,
                    dy2 = 0.78f,
                )
                // v 3.568
                verticalLineToRelative(dy = 3.568f)
                // c 0 1.679 -1.38 2.949 -3.028 2.949
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.679f,
                    dx2 = -1.38f,
                    dy2 = 2.949f,
                    dx3 = -3.028f,
                    dy3 = 2.949f,
                )
                // c -1.669 0 -3.039 -1.25 -3.039 -2.949
                curveToRelative(
                    dx1 = -1.669f,
                    dy1 = 0.0f,
                    dx2 = -3.039f,
                    dy2 = -1.25f,
                    dx3 = -3.039f,
                    dy3 = -2.949f,
                )
                // L 6.272 4.604z
                lineTo(x = 6.272f, y = 4.604f)
                close()
                // M 5.49 9.001
                moveTo(x = 5.49f, y = 9.001f)
                // c 0 1.679 -1.069 2.119 -1.979 2.119
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.679f,
                    dx2 = -1.069f,
                    dy2 = 2.119f,
                    dx3 = -1.979f,
                    dy3 = 2.119f,
                )
                // c -0.689 0 -1.839 -0.27 -1.839 -1.14
                curveToRelative(
                    dx1 = -0.689f,
                    dy1 = 0.0f,
                    dx2 = -1.839f,
                    dy2 = -0.27f,
                    dx3 = -1.839f,
                    dy3 = -1.14f,
                )
                // c 0 -0.269 0.23 -0.609 0.56 -0.609
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.269f,
                    dx2 = 0.23f,
                    dy2 = -0.609f,
                    dx3 = 0.56f,
                    dy3 = -0.609f,
                )
                // c 0.4 0 0.75 0.37 1.199 0.37
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                    dx2 = 0.75f,
                    dy2 = 0.37f,
                    dx3 = 1.199f,
                    dy3 = 0.37f,
                )
                // c 0.56 0 0.56 -0.52 0.56 -0.84
                curveToRelative(
                    dx1 = 0.56f,
                    dy1 = 0.0f,
                    dx2 = 0.56f,
                    dy2 = -0.52f,
                    dx3 = 0.56f,
                    dy3 = -0.84f,
                )
                // L 3.991 4.604
                lineTo(x = 3.991f, y = 4.604f)
                // c 0 -0.5 0.32 -0.78 0.749 -0.78
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.5f,
                    dx2 = 0.32f,
                    dy2 = -0.78f,
                    dx3 = 0.749f,
                    dy3 = -0.78f,
                )
                // c 0.431 0 0.75 0.28 0.75 0.78
                curveToRelative(
                    dx1 = 0.431f,
                    dy1 = 0.0f,
                    dx2 = 0.75f,
                    dy2 = 0.28f,
                    dx3 = 0.75f,
                    dy3 = 0.78f,
                )
                // v 4.397z
                verticalLineToRelative(dy = 4.397f)
                close()
            }
            // M32 10 c0 0.552 0.447 1 1 1 s1 -0.448 1 -1 -0.447 -1 -1 -1 -1 0.448 -1 1 m0 -3 c0 0.552 0.447 1 1 1 s1 -0.448 1 -1 -0.447 -1 -1 -1 -1 0.448 -1 1 m-3 3 c0 0.552 0.447 1 1 1 s1 -0.448 1 -1 -0.447 -1 -1 -1 -1 0.448 -1 1 m0 -3 c0 0.552 0.447 1 1 1 s1 -0.448 1 -1 -0.447 -1 -1 -1 -1 0.448 -1 1 m-3 3 c0 0.552 0.447 1 1 1 s1 -0.448 1 -1 -0.447 -1 -1 -1 -1 0.448 -1 1 m0 -3 c0 0.552 0.447 1 1 1 s1 -0.448 1 -1 -0.447 -1 -1 -1 -1 0.448 -1 1 m-3 0 c0 0.552 0.447 1 1 1 s1 -0.448 1 -1 -0.447 -1 -1 -1 -1 0.448 -1 1 m0 3 c0 0.552 0.447 1 1 1 s1 -0.448 1 -1 -0.447 -1 -1 -1 -1 0.448 -1 1
            path(
                fill = SolidColor(Color(0xFFF4ABBA)),
            ) {
                // M 32 10
                moveTo(x = 32.0f, y = 10.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s -0.447 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // m 0 -3
                moveToRelative(dx = 0.0f, dy = -3.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s -0.447 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // m -3 3
                moveToRelative(dx = -3.0f, dy = 3.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s -0.447 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // m 0 -3
                moveToRelative(dx = 0.0f, dy = -3.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s -0.447 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // m -3 3
                moveToRelative(dx = -3.0f, dy = 3.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s -0.447 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // m 0 -3
                moveToRelative(dx = 0.0f, dy = -3.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s -0.447 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s -0.447 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
                // m 0 3
                moveToRelative(dx = 0.0f, dy = 3.0f)
                // c 0 0.552 0.447 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.552f,
                    dx2 = 0.447f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // s 1 -0.448 1 -1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.448f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s -0.447 -1 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.447f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s -1 0.448 -1 1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.448f,
                    dx2 = -1.0f,
                    dy2 = 1.0f,
                )
            }
        }.build().also { _emoji1f4c5 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f4c5: ImageVector? = null
