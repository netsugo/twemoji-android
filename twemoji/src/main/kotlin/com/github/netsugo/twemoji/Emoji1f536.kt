package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji1f536: ImageVector
    get() {
        val current = _emoji1f536
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji1f536",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M1.061 19.062 c-0.583 -0.584 -0.583 -1.539 0 -2.122 L16.94 1.061 c0.583 -0.583 1.539 -0.583 2.122 0 L34.94 16.94 c0.583 0.583 0.583 1.538 0 2.121 L19.062 34.939 c-0.583 0.583 -1.539 0.583 -2.122 0 L1.061 19.062z
            path(
                fill = SolidColor(Color(0xFFF4900C)),
            ) {
                // M 1.061 19.062
                moveTo(x = 1.061f, y = 19.062f)
                // c -0.583 -0.584 -0.583 -1.539 0 -2.122
                curveToRelative(
                    dx1 = -0.583f,
                    dy1 = -0.584f,
                    dx2 = -0.583f,
                    dy2 = -1.539f,
                    dx3 = 0.0f,
                    dy3 = -2.122f,
                )
                // L 16.94 1.061
                lineTo(x = 16.94f, y = 1.061f)
                // c 0.583 -0.583 1.539 -0.583 2.122 0
                curveToRelative(
                    dx1 = 0.583f,
                    dy1 = -0.583f,
                    dx2 = 1.539f,
                    dy2 = -0.583f,
                    dx3 = 2.122f,
                    dy3 = 0.0f,
                )
                // L 34.94 16.94
                lineTo(x = 34.94f, y = 16.94f)
                // c 0.583 0.583 0.583 1.538 0 2.121
                curveToRelative(
                    dx1 = 0.583f,
                    dy1 = 0.583f,
                    dx2 = 0.583f,
                    dy2 = 1.538f,
                    dx3 = 0.0f,
                    dy3 = 2.121f,
                )
                // L 19.062 34.939
                lineTo(x = 19.062f, y = 34.939f)
                // c -0.583 0.583 -1.539 0.583 -2.122 0
                curveToRelative(
                    dx1 = -0.583f,
                    dy1 = 0.583f,
                    dx2 = -1.539f,
                    dy2 = 0.583f,
                    dx3 = -2.122f,
                    dy3 = 0.0f,
                )
                // L 1.061 19.062z
                lineTo(x = 1.061f, y = 19.062f)
                close()
            }
        }.build().also { _emoji1f536 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji1f536: ImageVector? = null
