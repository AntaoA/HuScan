// Utilitary functions to check the validity of groupings
package com.ascomany.camerajong.engine

fun isValidChow(tiles: List<Tile.Numbered>): Boolean {
    if (tiles.size != 3) return false

    val suit = tiles[0].type
    if (!tiles.all { it.type == suit }) return false

    val sortedValues = tiles.map { it.value }.sorted()
    return sortedValues[1] == sortedValues[0] + 1 && sortedValues[2] == sortedValues[1] + 1
}

fun areTilesIdentical(tiles: List<Tile>): Boolean {
    if (tiles.isEmpty()) return false
    val firstTile = tiles[0]
    return tiles.all { it == firstTile }
}

fun Tile.isTerminalOrHonor(): Boolean {
    return when (this) {
        is Tile.Numbered -> this.value == 1 || this.value == 9
        is Tile.Honor -> true
        else -> false
    }
}