package com.github.netsugo.twemoji

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Emoji2699: ImageVector
    get() {
        val current = _emoji2699
        if (current != null) return current

        return ImageVector.Builder(
            name = ".Emoji2699",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            // M34 15 h-3.362 c-0.324 -1.369 -0.864 -2.651 -1.582 -3.814 l2.379 -2.379 c0.781 -0.781 0.781 -2.048 0 -2.829 l-1.414 -1.414 c-0.781 -0.781 -2.047 -0.781 -2.828 0 l-2.379 2.379 C23.65 6.225 22.369 5.686 21 5.362 V2 c0 -1.104 -0.896 -2 -2 -2 h-2 c-1.104 0 -2 0.896 -2 2 v3.362 c-1.369 0.324 -2.651 0.864 -3.814 1.582 L8.808 4.565 c-0.781 -0.781 -2.048 -0.781 -2.828 0 L4.565 5.979 c-0.781 0.781 -0.781 2.048 -0.001 2.829 l2.379 2.379 C6.225 12.35 5.686 13.632 5.362 15 H2 c-1.104 0 -2 0.896 -2 2 v2 c0 1.104 0.896 2 2 2 h3.362 c0.324 1.368 0.864 2.65 1.582 3.813 l-2.379 2.379 c-0.78 0.78 -0.78 2.048 0.001 2.829 l1.414 1.414 c0.78 0.78 2.047 0.78 2.828 0 l2.379 -2.379 c1.163 0.719 2.445 1.258 3.814 1.582 V34 c0 1.104 0.896 2 2 2 h2 c1.104 0 2 -0.896 2 -2 v-3.362 c1.368 -0.324 2.65 -0.864 3.813 -1.582 l2.379 2.379 c0.781 0.781 2.047 0.781 2.828 0 l1.414 -1.414 c0.781 -0.781 0.781 -2.048 0 -2.829 l-2.379 -2.379 c0.719 -1.163 1.258 -2.445 1.582 -3.814 H34 c1.104 0 2 -0.896 2 -2 v-2 C36 15.896 35.104 15 34 15z M18 26 c-4.418 0 -8 -3.582 -8 -8 s3.582 -8 8 -8 8 3.582 8 8 -3.582 8 -8 8z
            path(
                fill = SolidColor(Color(0xFF66757F)),
            ) {
                // M 34 15
                moveTo(x = 34.0f, y = 15.0f)
                // h -3.362
                horizontalLineToRelative(dx = -3.362f)
                // c -0.324 -1.369 -0.864 -2.651 -1.582 -3.814
                curveToRelative(
                    dx1 = -0.324f,
                    dy1 = -1.369f,
                    dx2 = -0.864f,
                    dy2 = -2.651f,
                    dx3 = -1.582f,
                    dy3 = -3.814f,
                )
                // l 2.379 -2.379
                lineToRelative(dx = 2.379f, dy = -2.379f)
                // c 0.781 -0.781 0.781 -2.048 0 -2.829
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 0.781f,
                    dy2 = -2.048f,
                    dx3 = 0.0f,
                    dy3 = -2.829f,
                )
                // l -1.414 -1.414
                lineToRelative(dx = -1.414f, dy = -1.414f)
                // c -0.781 -0.781 -2.047 -0.781 -2.828 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -2.047f,
                    dy2 = -0.781f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // l -2.379 2.379
                lineToRelative(dx = -2.379f, dy = 2.379f)
                // C 23.65 6.225 22.369 5.686 21 5.362
                curveTo(
                    x1 = 23.65f,
                    y1 = 6.225f,
                    x2 = 22.369f,
                    y2 = 5.686f,
                    x3 = 21.0f,
                    y3 = 5.362f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // c 0 -1.104 -0.896 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.104f,
                    dx2 = -0.896f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 3.362
                verticalLineToRelative(dy = 3.362f)
                // c -1.369 0.324 -2.651 0.864 -3.814 1.582
                curveToRelative(
                    dx1 = -1.369f,
                    dy1 = 0.324f,
                    dx2 = -2.651f,
                    dy2 = 0.864f,
                    dx3 = -3.814f,
                    dy3 = 1.582f,
                )
                // L 8.808 4.565
                lineTo(x = 8.808f, y = 4.565f)
                // c -0.781 -0.781 -2.048 -0.781 -2.828 0
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = -0.781f,
                    dx2 = -2.048f,
                    dy2 = -0.781f,
                    dx3 = -2.828f,
                    dy3 = 0.0f,
                )
                // L 4.565 5.979
                lineTo(x = 4.565f, y = 5.979f)
                // c -0.781 0.781 -0.781 2.048 -0.001 2.829
                curveToRelative(
                    dx1 = -0.781f,
                    dy1 = 0.781f,
                    dx2 = -0.781f,
                    dy2 = 2.048f,
                    dx3 = -0.001f,
                    dy3 = 2.829f,
                )
                // l 2.379 2.379
                lineToRelative(dx = 2.379f, dy = 2.379f)
                // C 6.225 12.35 5.686 13.632 5.362 15
                curveTo(
                    x1 = 6.225f,
                    y1 = 12.35f,
                    x2 = 5.686f,
                    y2 = 13.632f,
                    x3 = 5.362f,
                    y3 = 15.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // c -1.104 0 -2 0.896 -2 2
                curveToRelative(
                    dx1 = -1.104f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = 0.896f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 3.362
                horizontalLineToRelative(dx = 3.362f)
                // c 0.324 1.368 0.864 2.65 1.582 3.813
                curveToRelative(
                    dx1 = 0.324f,
                    dy1 = 1.368f,
                    dx2 = 0.864f,
                    dy2 = 2.65f,
                    dx3 = 1.582f,
                    dy3 = 3.813f,
                )
                // l -2.379 2.379
                lineToRelative(dx = -2.379f, dy = 2.379f)
                // c -0.78 0.78 -0.78 2.048 0.001 2.829
                curveToRelative(
                    dx1 = -0.78f,
                    dy1 = 0.78f,
                    dx2 = -0.78f,
                    dy2 = 2.048f,
                    dx3 = 0.001f,
                    dy3 = 2.829f,
                )
                // l 1.414 1.414
                lineToRelative(dx = 1.414f, dy = 1.414f)
                // c 0.78 0.78 2.047 0.78 2.828 0
                curveToRelative(
                    dx1 = 0.78f,
                    dy1 = 0.78f,
                    dx2 = 2.047f,
                    dy2 = 0.78f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                // l 2.379 -2.379
                lineToRelative(dx = 2.379f, dy = -2.379f)
                // c 1.163 0.719 2.445 1.258 3.814 1.582
                curveToRelative(
                    dx1 = 1.163f,
                    dy1 = 0.719f,
                    dx2 = 2.445f,
                    dy2 = 1.258f,
                    dx3 = 3.814f,
                    dy3 = 1.582f,
                )
                // V 34
                verticalLineTo(y = 34.0f)
                // c 0 1.104 0.896 2 2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.104f,
                    dx2 = 0.896f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -3.362
                verticalLineToRelative(dy = -3.362f)
                // c 1.368 -0.324 2.65 -0.864 3.813 -1.582
                curveToRelative(
                    dx1 = 1.368f,
                    dy1 = -0.324f,
                    dx2 = 2.65f,
                    dy2 = -0.864f,
                    dx3 = 3.813f,
                    dy3 = -1.582f,
                )
                // l 2.379 2.379
                lineToRelative(dx = 2.379f, dy = 2.379f)
                // c 0.781 0.781 2.047 0.781 2.828 0
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = 0.781f,
                    dx2 = 2.047f,
                    dy2 = 0.781f,
                    dx3 = 2.828f,
                    dy3 = 0.0f,
                )
                // l 1.414 -1.414
                lineToRelative(dx = 1.414f, dy = -1.414f)
                // c 0.781 -0.781 0.781 -2.048 0 -2.829
                curveToRelative(
                    dx1 = 0.781f,
                    dy1 = -0.781f,
                    dx2 = 0.781f,
                    dy2 = -2.048f,
                    dx3 = 0.0f,
                    dy3 = -2.829f,
                )
                // l -2.379 -2.379
                lineToRelative(dx = -2.379f, dy = -2.379f)
                // c 0.719 -1.163 1.258 -2.445 1.582 -3.814
                curveToRelative(
                    dx1 = 0.719f,
                    dy1 = -1.163f,
                    dx2 = 1.258f,
                    dy2 = -2.445f,
                    dx3 = 1.582f,
                    dy3 = -3.814f,
                )
                // H 34
                horizontalLineTo(x = 34.0f)
                // c 1.104 0 2 -0.896 2 -2
                curveToRelative(
                    dx1 = 1.104f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.896f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // C 36 15.896 35.104 15 34 15z
                curveTo(
                    x1 = 36.0f,
                    y1 = 15.896f,
                    x2 = 35.104f,
                    y2 = 15.0f,
                    x3 = 34.0f,
                    y3 = 15.0f,
                )
                close()
                // M 18 26
                moveTo(x = 18.0f, y = 26.0f)
                // c -4.418 0 -8 -3.582 -8 -8
                curveToRelative(
                    dx1 = -4.418f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = -3.582f,
                    dx3 = -8.0f,
                    dy3 = -8.0f,
                )
                // s 3.582 -8 8 -8
                reflectiveCurveToRelative(
                    dx1 = 3.582f,
                    dy1 = -8.0f,
                    dx2 = 8.0f,
                    dy2 = -8.0f,
                )
                // s 8 3.582 8 8
                reflectiveCurveToRelative(
                    dx1 = 8.0f,
                    dy1 = 3.582f,
                    dx2 = 8.0f,
                    dy2 = 8.0f,
                )
                // s -3.582 8 -8 8z
                reflectiveCurveToRelative(
                    dx1 = -3.582f,
                    dy1 = 8.0f,
                    dx2 = -8.0f,
                    dy2 = 8.0f,
                )
                close()
            }
        }.build().also { _emoji2699 = it }
    }

@Suppress("ObjectPropertyName")
private var _emoji2699: ImageVector? = null
