package com.ascomany.huscan.engine.patterns

import com.ascomany.huscan.engine.Grouping
import com.ascomany.huscan.engine.Tile

val pattern16 = listOf(
    Pattern(
        id = 28,
        name = "Pure Straight",
        description = "A hand using one each of all the numbers 1 through 9 from any one suit, forming three consecutive chows.",
        points = 16,
        excludedPatternIds = listOf(71, 72, 69), // Short Straight, Two Terminal Chows, Pure Double Chow [cite: 729]
        check = { hand ->
            val chows = hand.groupings.filterIsInstance<Grouping.Chow>()
            val bySuit = chows.groupBy { it.tiles[0].type }
            val hasStraight = bySuit.any { (_, suitChows) ->
                val starts = suitChows.map { it.tiles.minOf { t -> t.value } }.toSet()
                starts.containsAll(listOf(1, 4, 7))
            }
            if (hasStraight) 1 else 0
        }
    ),
    Pattern(
        id = 29,
        name = "Three-Suited Terminal Chows",
        description = "A hand consisting of 1-2-3 and 7-8-9 in one suit, 1-2-3 and 7-8-9 in another suit, and a pair of fives in the remaining suit.",
        points = 16,
        excludedPatternIds = listOf(63, 69, 72, 76), // All Chows, Pure Double Chow, Two Terminal Chows, No Honors
        check = { hand ->
            val chows = hand.groupings.filterIsInstance<Grouping.Chow>()
            if (chows.size != 4) return@Pattern 0
            val pair = hand.groupings.find { it is Grouping.Pair } ?: return@Pattern 0
            val pairTile = pair.firstTile()
            if (pairTile !is Tile.Numbered || pairTile.value != 5) return@Pattern 0
            val chowsBySuit = chows.groupBy { (it.firstTile() as Tile.Numbered).type }
            if (chowsBySuit.size != 2) return@Pattern 0
            val validChows = chowsBySuit.values.all { suitChows ->
                val starts = suitChows.map { it.tiles.minOf { t -> t.value } }.sorted()
                starts == listOf(1, 7)
            }
            if (validChows && chowsBySuit.keys.none { it == pairTile.type }) 1 else 0
        }
    ),
    Pattern(
        id = 30,
        name = "Pure Shifted Chows",
        description = "Three chows in one suit each shifted either one or two numbers up from the last, but not a combination of both.",
        points = 16,
        excludedPatternIds = emptyList(),
        check = { hand ->
            val chows = hand.groupings.filterIsInstance<Grouping.Chow>()
            val bySuit = chows.groupBy { (it.firstTile() as Tile.Numbered).type }
            val hasShifted = bySuit.any { (_, suitChows) ->
                if (suitChows.size < 3) return@any false
                val starts = suitChows.map { it.tiles.minOf { t -> t.value } }.sorted().distinct()
                if (starts.size < 3) return@any false
                starts.windowed(3).any { window ->
                    val diff1 = window[1] - window[0]
                    val diff2 = window[2] - window[1]
                    diff1 == diff2 && (diff1 == 1 || diff1 == 2)
                }
            }
            if (hasShifted) 1 else 0
        }
    ),
    Pattern(
        id = 31,
        name = "All Fives",
        description = "A hand in which every set (chow, pung, kong, pair) includes the number \"5\"",
        points = 16,
        excludedPatternIds = listOf(68), // All Simples
        check = { hand ->
            val valid = hand.groupings.all { g ->
                g.tiles.any { t -> t is Tile.Numbered && t.value == 5 }
            }
            if (valid) 1 else 0
        }
    ),
    Pattern(
        id = 32,
        name = "Triple Pung",
        description = "Three Pungs (or Kongs) of the same number in each suit.",
        points = 16,
        excludedPatternIds = listOf(65), // Double Pung
        check = { hand ->
            val triplets = hand.groupings.filter { it.isTriplet() && it.firstTile() is Tile.Numbered }
            val groupedByValue = triplets.groupBy { (it.firstTile() as Tile.Numbered).value }
            val hasTriple = groupedByValue.any { (_, group) ->
                group.map { (it.firstTile() as Tile.Numbered).type }.distinct().size == 3
            }
            if (hasTriple) 1 else 0
        }
    ),
    Pattern(
        id = 33,
        name = "Three Concealed Pungs",
        description = "Three Concealed Pungs or Kongs (achieved without melding).",
        points = 16,
        excludedPatternIds = listOf(66), // Two Concealed Pungs
        check = { hand ->
            if (hand.groupings.count { it.isTriplet() && !it.isExposed } >= 3) 1 else 0
        }
    )
)