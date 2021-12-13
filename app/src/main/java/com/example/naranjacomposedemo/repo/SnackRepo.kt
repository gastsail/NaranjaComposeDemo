package com.example.naranjacomposedemo.repo

import androidx.compose.runtime.Immutable
import com.example.naranjacomposedemo.model.Snack
import com.example.naranjacomposedemo.model.snacks

@Immutable
data class SnackCollection(
    val id: Long,
    val name: String,
    val snacks: List<Snack>,
    val type: CollectionType = CollectionType.Normal
)

enum class CollectionType { Normal, Highlight }

/**
 * A fake repo
 */
object SnackRepo {
    fun getInspiredByCart() = inspiredByCart
    fun getCart() = cart
}

/**
 * Static data
 */

private val tastyTreats = SnackCollection(
    id = 1L,
    name = "Android's picks",
    type = CollectionType.Highlight,
    snacks = snacks.subList(0, 13)
)

private val inspiredByCart = tastyTreats.copy(
    id = 7L,
    name = "Inspired by your cart"
)

private val cart = listOf(
    OrderLine(snacks[4], 2),
    OrderLine(snacks[6], 3),
    OrderLine(snacks[8], 1)
)

@Immutable
data class OrderLine(
    val snack: Snack,
    val count: Int
)
