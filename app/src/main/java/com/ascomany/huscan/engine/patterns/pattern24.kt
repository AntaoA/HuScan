package com.ascomany.huscan.engine.patterns

import com.ascomany.huscan.engine.Grouping
import com.ascomany.huscan.engine.Tile

val pattern24 = listOf(
    Pattern(
        id = 19,
        name = "Seven Pairs",
        description = "A hand formed by seven pairs.",
        points = 24,
        excludedPatternIds = listOf(62, 79), // Concealed Hand, Single Wait
        check = { hand -> if (hand.groupings.size == 7 && hand.groupings.all { it is Grouping.Pair }) 1 else 0 }
    ),
    Pattern(
        id = 20,
        name = "Greater Honors and Knitted Tiles",
        description = "Seven single honors and singles of suit tiles belonging to separate Knitted sequences.",
        points = 24,
        excludedPatternIds = listOf(52, 62), // All Types, Concealed Hand
        check = { hand ->
            val special = hand.groupings.filterIsInstance<Grouping.KnittedHonor>().firstOrNull() ?: return@Pattern 0
            if (special.tiles.count { it is Tile.Honor } == 7) 1 else 0
        }
    ),
    Pattern(
        id = 21,
        name = "All Even Pungs",
        description = "A hand formed with Pungs or Kongs of 2, 4, 6, and 8 tiles, with a pair of the same.",
        points = 24,
        excludedPatternIds = listOf(49, 68), // All Pungs, All Simples
        check = { hand ->
            if (hand.groupings.countChows() != 0 || hand.groupings.size != 5) return@Pattern 0
            val numbered = hand.groupings.allNumbered()
            val allEven = numbered.size == 14 && numbered.all { it.value % 2 == 0 }
            if (allEven) 1 else 0
        }
    ),
    Pattern(
        id = 22,
        name = "Full Flush",
        description = "A hand formed entirely of a single suit.",
        points = 24,
        excludedPatternIds = listOf(76), // No Honors
        check = { hand ->
            val allNumbered = hand.groupings.flatMap { it.tiles }.all { it is Tile.Numbered }
            if (allNumbered && hand.groupings.isSingleSuit()) 1 else 0
        }
    ),
    Pattern(
        id = 23,
        name = "Pure Triple Chow",
        description = "Three chows of the same numerical sequence and in the same suit.",
        points = 24,
        excludedPatternIds = listOf(24, 69), // Pure Shifted Pungs, Pure Double Chow
        check = { hand ->
            val chows = hand.groupings.filterIsInstance<Grouping.Chow>()
            val grouped = chows.groupBy { (it.firstTile() as Tile.Numbered).value to (it.firstTile() as Tile.Numbered).type }
            if (grouped.any { it.value.size >= 3 }) 1 else 0
        }
    ),
    Pattern(
        id = 24,
        name = "Pure Shifted Pungs",
        description = "Three Pungs or Kongs of the same suit, each shifted one up from the last.",
        points = 24,
        excludedPatternIds = listOf(23), // Pure Triple Chow
        check = { hand ->
            val triplets = hand.groupings.filter { it.isTriplet() && it.firstTile() is Tile.Numbered }
            val bySuit = triplets.groupBy { (it.firstTile() as Tile.Numbered).type }
            val hasShiftedThree = bySuit.any { (_, suitTriplets) ->
                val values = suitTriplets.map { (it.firstTile() as Tile.Numbered).value }.sorted().distinct()
                values.windowed(3).any { it[2] == it[0] + 2 && it[1] == it[0] + 1 }
            }
            if (hasShiftedThree) 1 else 0
        }
    ),
    Pattern(
        id = 25,
        name = "Upper Tiles",
        description = "A hand consisting entirely of 7, 8, and 9 tiles.",
        points = 24,
        excludedPatternIds = listOf(76), // No Honors
        check = { hand ->
            val numbered = hand.groupings.allNumbered()
            if (numbered.size == 14 && numbered.all { it.value in 7..9 }) 1 else 0
        }
    ),
    Pattern(
        id = 26,
        name = "Middle Tiles",
        description = "A hand consisting entirely of 4, 5, and 6 tiles.",
        points = 24,
        excludedPatternIds = listOf(68, 76), // All Simples, No Honors
        check = { hand ->
            val numbered = hand.groupings.allNumbered()
            if (numbered.size == 14 && numbered.all { it.value in 4..6 }) 1 else 0
        }
    ),
    Pattern(
        id = 27,
        name = "Lower Tiles",
        description = "A hand consisting entirely of 1, 2, and 3 tiles.",
        points = 24,
        excludedPatternIds = listOf(76), // No Honors
        check = { hand ->
            val numbered = hand.groupings.allNumbered()
            if (numbered.size == 14 && numbered.all { it.value in 1..3 }) 1 else 0
        }
    )
)