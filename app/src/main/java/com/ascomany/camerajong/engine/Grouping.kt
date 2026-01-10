// Defining the class of groupings
package com.ascomany.camerajong.engine

sealed class Grouping {
    abstract val tiles: List<Tile>
    abstract val isExposed: Boolean

    data class Chow(override val tiles: List<Tile.Numbered>, override val isExposed: Boolean) : Grouping() {
        init {
            require(isValidChow(tiles)) { "Invalid Chow: tiles must be 3 consecutive of the same suit." }
        }
    }

    data class Pung(override val tiles: List<Tile>, override val isExposed: Boolean) : Grouping() {
        init {
            require(tiles.size == 3) { "A Pung must have exactly 3 tiles." }
            require(areTilesIdentical(tiles)) { "A Pung must consist of 3 identical tiles." }
        }
    }

    data class Kong(override val tiles: List<Tile>, override val isExposed: Boolean) : Grouping() {
        init {
            require(tiles.size == 4) { "A Kong must have exactly 4 tiles." }
            require(areTilesIdentical(tiles)) { "A Kong must consist of 4 identical tiles." }
        }
    }

    data class Pair(override val tiles: List<Tile>) : Grouping() {
        override val isExposed = false
        init {
            require(tiles.size == 2) { "A Pair must have exactly 2 tiles." }
            require(areTilesIdentical(tiles)) { "A Pair must consist of 2 identical tiles." }
        }
    }
}