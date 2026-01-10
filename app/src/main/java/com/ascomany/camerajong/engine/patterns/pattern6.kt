package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern6 = listOf(
    Pattern(
        id = 54,
        name = "Two Dragons Pugs",
        description = "Two pungs (or kongs) of Dragon tiles.",
        points = 6,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 53,
        name = "Melded Hand",
        description = "Every set in the hand (chow, pung, kong, and pair) must be completed with tiles discarded by other players. All sets must be exposed, and the player goes out on a single wait off another player.",
        points = 6,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 52,
        name = "All Types",
        description = "A hand in which each of the five sets (pungs, kongs, chows, pairs) is composed of a different type of tile (Characters, Bamboo, Dots, Winds, and Dragons).",
        points = 6,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 51,
        name = "Mixed Shifted Chows",
        description = "Three chows, one in each suit, each shifted up one number from the last.",
        points = 6,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 50,
        name = "Half Flush",
        description = "A hand formed by tiles from any one of the three suits, in combination with Honor tiles.",
        points = 6,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 49,
        name = "All Pungs",
        description = "A hand formed by four Pungs (or Kongs) and one pair.",
        points = 6,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    )
)