package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern8 = listOf(
    Pattern(
        id = 48,
        name = "Two Concealed Kongs",
        description = "A hand that includes two Concealed Kongs.",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 47,
        name = "Robbing The Kong",
        description = "Winning off the tile that somebody adds to a melded pung (to create a Kong). (The points for Last Tile may not be combined.)",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 46,
        name = "Out With Replacement Tile",
        description = "Going out (making mahjong) off the discard which is the last tile in the game. Going out (making mahjong) on the replacement tile drawn after achieving a kong (not on a Flower replacement). When a Flower Tile is taken after Kong and upon winning on the Flower replacement, points for Self-Drawn may be added (but Out With Replacement Tile does not apply in this case).",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 45,
        name = "Last Tile Claim",
        description = "The last tile (of the game) discarded by another player.",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 44,
        name = "Last Tile Draw",
        description = "Going out (making mahjong) on a pick of the very last tile of the wall. (Points for Self-Drawn may not be combined.)",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 43,
        name = "Chicken Hand",
        description = "A hand that would otherwise earn 0 points (excluding the Flower Tiles).",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 42,
        name = "Mixed Shifted Pungs",
        description = "Three pungs (or kongs), one in each suit, each shifted up one number from the last.",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 41,
        name = "Mixed Triple Chows",
        description = "Three chows of the same numerical sequence, one in each suit.",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 40,
        name = "Reversing Tiles",
        description = "A hand created entirely with those tiles which are vertically symmetrical, which means the carved designs look the same if you turn them upside-down. These tiles are the 1, 2, 3,4,5,8, and 9 Dots, the 2, 4,5,6,8, and 9 Bams, and the White Dragon.",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 39,
        name = "Mixed Straight",
        description = "A straight (tiles 1 through 9) formed by chows from all three suits.",
        points = 8,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    )
)