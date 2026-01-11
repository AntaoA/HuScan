package com.ascomany.huscan.engine.patterns

import com.ascomany.huscan.engine.Grouping
import com.ascomany.huscan.engine.Tile

val pattern64 = listOf(
    Pattern(
        id = 8,
        name = "All Terminals",
        description = "The pair(s), Pungs or Kongs are all made up of 1 or 9 Number Tiles, without Honor Tiles.",
        points = 64,
        excludedPatternIds = listOf(49, 55, 73, 76), // All Pungs, Outside Hand, Pung of Terminals, No Honors [cite: 526]
        check = { hand ->
            val allTiles = hand.groupings.flatMap { it.tiles }
            val isAllTerminals = allTiles.all { it is Tile.Numbered && (it.value == 1 || it.value == 9) }
            if (isAllTerminals) 1 else 0
        }
    ),
    Pattern(
        id = 9,
        name = "Little Four Winds",
        description = "A hand that includes three Pungs or Kongs of Wind Tiles and a pair of the fourth Wind.",
        points = 64,
        excludedPatternIds = listOf(38, 73), // Big Three Winds, Pung of Terminals or Honors
        check = { hand ->
            val winds = hand.groupings.filter { it.firstTile().isWind() }
            val triplets = winds.count { it.isTriplet() }
            val pairs = winds.count { it is Grouping.Pair }
            if (triplets == 3 && pairs == 1) 1 else 0
        }
    ),
    Pattern(
        id = 10,
        name = "Little Three Dragons",
        description = "A hand that includes two Pungs or Kongs of the Dragon Tiles and a pair of the third Dragon.",
        points = 64,
        excludedPatternIds = listOf(54, 59), // Two Dragon Pungs, Dragon Pung
        check = { hand ->
            val dragons = hand.groupings.filter { it.firstTile().isDragon() }
            val triplets = dragons.count { it.isTriplet() }
            val pairs = dragons.count { it is Grouping.Pair }
            if (triplets == 2 && pairs == 1) 1 else 0
        }
    ),
    Pattern(
        id = 11,
        name = "All Honor",
        description = "The pair(s), Pungs or Kongs are all made up of Honor Tiles.",
        points = 64,
        excludedPatternIds = listOf(49, 55, 73), // All Pungs, Outside Hand, Pung of Terminals or Honors
        check = { hand ->
            val allTiles = hand.groupings.flatMap { it.tiles }
            if (allTiles.all { it is Tile.Honor }) 1 else 0
        }
    ),
    Pattern(
        id = 12,
        name = "Four Concealed Pungs",
        description = "A hand that includes four Concealed Pungs or Kongs (achieved without melding).",
        points = 64,
        excludedPatternIds = listOf(49, 62), // All Pungs or Concealed Hand
        check = { hand ->
            if (hand.groupings.count { it.isTriplet() && !it.isExposed } == 4) 1 else 0
        }
    ),
    Pattern(
        id = 13,
        name = "Pure Terminal Chows",
        description = "A hand consisting of two each of the lower and upper terminal Chows in one suit only, and a pair of fives in the same suit.",
        points = 64,
        excludedPatternIds = listOf(19, 22, 63, 69, 72), // Seven Pairs, Full Flush, All Chows, Pure Double Chow, Two Terminal Chows
        check = { hand ->
            val chows = hand.groupings.filterIsInstance<Grouping.Chow>()
            if (chows.size != 4) return@Pattern 0
            val pair = hand.groupings.find { it is Grouping.Pair } ?: return@Pattern 0
            val pairTile = pair.firstTile()
            if (pairTile !is Tile.Numbered || pairTile.value != 5) return@Pattern 0
            val suit = pairTile.type
            val allSameSuit = chows.all { (it.firstTile() as Tile.Numbered).type == suit }
            if (!allSameSuit) return@Pattern 0
            val starts = chows.map { it.tiles.minOf { t -> t.value } }.sorted()
            if (starts == listOf(1, 1, 7, 7)) 1 else 0
        }
    )
)