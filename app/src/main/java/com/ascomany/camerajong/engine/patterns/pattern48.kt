package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile

val pattern48 = listOf(
    Pattern(
        id = 14,
        name = "Quadruple Chow",
        description = "Four chows of the same numerical sequence in the same suit.",
        points = 48,
        excludedPatternIds = listOf(15, 64, 69), // Four Pure Shifted Pungs, Tile Hog, Pure Double Chow
        check = { hand ->
            val chows = hand.groupings.filterIsInstance<Grouping.Chow>()
            if (chows.size < 4) return@Pattern 0
            val grouped = chows.groupBy {
                val firstTile = it.tiles.minByOrNull { t -> t.value }!!
                firstTile.type to firstTile.value
            }
            if (grouped.any { it.value.size == 4 }) 1 else 0
        }
    ),
    Pattern(
        id = 15,
        name = "Four Pure Shifted Pungs",
        description = "Four Pungs (or Kongs) in the same suit, each shifted one up from the last.",
        points = 48,
        excludedPatternIds = listOf(23, 49), // Pure Triple Chow, All Pungs
        check = { hand ->
            val tripletsBySuit = hand.groupings
                .filter { it.isTriplet() && it.firstTile() is Tile.Numbered }
                .groupBy { (it.firstTile() as Tile.Numbered).type }
            val hasPattern = tripletsBySuit.any { (_, triplets) ->
                val values = triplets.map { (it.firstTile() as Tile.Numbered).value }.sorted()
                values.windowed(4).any { it[3] == it[0] + 3 }
            }
            if (hasPattern) 1 else 0
        }
    )
)