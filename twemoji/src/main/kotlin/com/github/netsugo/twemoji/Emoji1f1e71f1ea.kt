package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f1e71f1ea: ImageVector
    get() {
        val current = _emoji1f1e71f1ea
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f1e71f1ea",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M7 5 a4 4 0 0 0 -4 4 v18 a4 4 0 0 0 4 4 h6 V5 H7z
            path(
                fill = SolidColor(Color(0xFF141414)),
            ) {
                // M 7 5
                moveTo(x = 7.0f, y = 5.0f)
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
                // v 18
                verticalLineToRelative(dy = 18.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
            }
            // M13 5 h10 v26 H13z
            path(
                fill = SolidColor(Color(0xFFFDDA24)),
            ) {
                // M 13 5
                moveTo(x = 13.0f, y = 5.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // H 13z
                horizontalLineTo(x = 13.0f)
                close()
            }
            // M29 5 h-6 v26 h6 a4 4 0 0 0 4 -4 V9 a4 4 0 0 0 -4 -4z
            path(
                fill = SolidColor(Color(0xFFEF3340)),
            ) {
                // M 29 5
                moveTo(x = 29.0f, y = 5.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
                // a 4 4 0 0 0 -4 -4z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                close()
            }
        }.build().also { _emoji1f1e71f1ea = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f1e71f1ea: ImageVector? = null
