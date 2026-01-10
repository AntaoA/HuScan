package com.ascomany.camerajong.engine

data class WinningHand(
    val groupings: List<Grouping>,
    val winningTile: Tile,
    val isLastOfKind: Boolean,
    val waitType: WaitType,
    val winType: WinType,
    val seatWind: Wind,
    val prevalentWind: Wind,
    val flowerTiles: List<Tile.Flower>,
    val isLastTile: Boolean
)