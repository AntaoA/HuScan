package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern1 = listOf(
    Pattern(
        id = 81,
        name = "Flower Tiles",
        description = "Each flower replaced give you one extra point if you succeed in Hu.",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> hand.flowerTiles.count() }
    ),
    Pattern(
        id = 80,
        name = "Self-Drawn",
        description = "Going out (making mahjong) with a fresh tile picked from the wall.",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 79,
        name = "Single Waiting",
        description = "Waiting solely for a tile to form a pair. Not valid if waiting for more than one tile (for example, holding 1-2-3-4 and waiting on the 1 and 4).",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 78,
        name = "Closed Wait",
        description = "Waiting solely for a tile whose number is \"inside\" (in the middle) to form a chow. Not valid if waiting for more than one tile. Not valid if the closed wait is combined with other waits.",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 77,
        name = "Edge Wait",
        description = "Waiting solely for a 3 to form a 1-2-3 chow, or solely for a 7 to form a 7-8-9 chow. Not valid if waiting for more than one tile. Not valid if the edge wait is combined with any other waits",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 76,
        name = "No Honors",
        description = "A hand formed entirely of suit tiles, without Winds or Dragons.",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 75,
        name = "One Voided Suit",
        description = "A hand that uses tiles from only two of the three suits (it lacks any tiles from one of the three suits).",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 74,
        name = "Melded Kong",
        description = "A kong that was claimed from another player or promoted from a melded pung.",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 73,
        name = "Pung of Terminals or Honors",
        description = "A Pung or Kong of Ones, Nines, or Winds. (A dragon pung scores 2 points.)",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 72,
        name = "Two Terminal Chows",
        description = "Chows of 1-2-3 and 7-8-9 in the same suit.",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 71,
        name = "Short Straight",
        description = "Two chows in the same suit that runs consecutively after one another to make a six-tile straight.",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 70,
        name = "Mixed Double Chow",
        description = "Two chows of the same numbers but in different suits.",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 69,
        name = "Pure Double Chow",
        description = "Two identical chows in the same suit.",
        points = 1,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    )
)