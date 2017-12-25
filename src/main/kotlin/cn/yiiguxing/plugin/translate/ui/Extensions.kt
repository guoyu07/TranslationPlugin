/*
 * Extensions
 * 
 * Created by Yii.Guxing on 2017/11/20
 */
package cn.yiiguxing.plugin.translate.ui

import java.awt.Color
import java.awt.Dimension
import javax.swing.JComboBox


/**
 * 当前选中项
 */
inline var <reified E> JComboBox<E>.selected: E?
    get() = selectedItem as? E
    set(value) {
        selectedItem = value
    }

/**
 * Returns the width of the [Dimension].
 */
operator fun Dimension.component1() = width

/**
 * Returns the height of the [Dimension].
 */
operator fun Dimension.component2() = height

/**
 * Returns a new color with [alpha].
 *
 * @param alpha the alpha(0.0f ~ 1.0f).
 */
fun Color.withAlpha(alpha: Float) = Color(red, green, blue, (0xFF * alpha).toInt())